/*Copyright (c) 2018-2019 medidesign.co.uk All Rights Reserved.
 This software is the confidential and proprietary information of medidesign.co.uk You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with medidesign.co.uk*/
package com.dotta.medidata.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Hibernate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.wavemaker.runtime.data.dao.WMGenericDao;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.data.util.DaoUtils;
import com.wavemaker.runtime.file.model.Downloadable;

import com.dotta.medidata.Sessions;
import com.dotta.medidata.SurveyAndTestData;


/**
 * ServiceImpl object for domain model class Sessions.
 *
 * @see Sessions
 */
@Service("medidata.SessionsService")
@Validated
public class SessionsServiceImpl implements SessionsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SessionsServiceImpl.class);

    @Lazy
    @Autowired
    @Qualifier("medidata.SurveyAndTestDataService")
    private SurveyAndTestDataService surveyAndTestDataService;

    @Autowired
    @Qualifier("medidata.SessionsDao")
    private WMGenericDao<Sessions, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Sessions, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "medidataTransactionManager")
    @Override
    public Sessions create(Sessions sessions) {
        LOGGER.debug("Creating a new Sessions with information: {}", sessions);

        Sessions sessionsCreated = this.wmGenericDao.create(sessions);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(sessionsCreated);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public Sessions getById(Integer sessionsId) {
        LOGGER.debug("Finding Sessions by id: {}", sessionsId);
        return this.wmGenericDao.findById(sessionsId);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public Sessions findById(Integer sessionsId) {
        LOGGER.debug("Finding Sessions by id: {}", sessionsId);
        try {
            return this.wmGenericDao.findById(sessionsId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No Sessions found with id: {}", sessionsId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public List<Sessions> findByMultipleIds(List<Integer> sessionsIds, boolean orderedReturn) {
        LOGGER.debug("Finding Sessions by ids: {}", sessionsIds);

        return this.wmGenericDao.findByMultipleIds(sessionsIds, orderedReturn);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public Sessions getByUniqueKeyId(int id) {
        Map<String, Object> uniqueKeyIdMap = new HashMap<>();
        uniqueKeyIdMap.put("id", id);

        LOGGER.debug("Finding Sessions by unique keys: {}", uniqueKeyIdMap);
        return this.wmGenericDao.findByUniqueKey(uniqueKeyIdMap);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "medidataTransactionManager")
    @Override
    public Sessions update(Sessions sessions) {
        LOGGER.debug("Updating Sessions with information: {}", sessions);

        List<SurveyAndTestData> surveyAndTestDatas = sessions.getSurveyAndTestDatas();
        if(surveyAndTestDatas != null && Hibernate.isInitialized(surveyAndTestDatas)) {
            surveyAndTestDatas.forEach(_surveyAndTestData -> _surveyAndTestData.setSessions(sessions));
        }

        this.wmGenericDao.update(sessions);
        this.wmGenericDao.refresh(sessions);

        // Deleting children which are not present in the list.
        if(surveyAndTestDatas != null && Hibernate.isInitialized(surveyAndTestDatas) && !surveyAndTestDatas.isEmpty()) {
            List<SurveyAndTestData> _remainingChildren = wmGenericDao.execute(
                session -> DaoUtils.findAllRemainingChildren(session, SurveyAndTestData.class,
                        new DaoUtils.ChildrenFilter<>("sessions", sessions, surveyAndTestDatas)));
            LOGGER.debug("Found {} detached children, deleting", _remainingChildren.size());
            _remainingChildren.forEach(_surveyAndTestData -> surveyAndTestDataService.delete(_surveyAndTestData));
            sessions.setSurveyAndTestDatas(surveyAndTestDatas);
        }

        return sessions;
    }

    @Transactional(value = "medidataTransactionManager")
    @Override
    public Sessions delete(Integer sessionsId) {
        LOGGER.debug("Deleting Sessions with id: {}", sessionsId);
        Sessions deleted = this.wmGenericDao.findById(sessionsId);
        if (deleted == null) {
            LOGGER.debug("No Sessions found with id: {}", sessionsId);
            throw new EntityNotFoundException(String.valueOf(sessionsId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "medidataTransactionManager")
    @Override
    public void delete(Sessions sessions) {
        LOGGER.debug("Deleting Sessions with {}", sessions);
        this.wmGenericDao.delete(sessions);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public Page<Sessions> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Sessions");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public Page<Sessions> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Sessions");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service medidata for table Sessions to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service medidata for table Sessions to {} format", options.getExportType());
        this.wmGenericDao.export(options, pageable, outputStream);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public Page<SurveyAndTestData> findAssociatedSurveyAndTestDatas(Integer id, Pageable pageable) {
        LOGGER.debug("Fetching all associated surveyAndTestDatas");

        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("sessions.id = '" + id + "'");

        return surveyAndTestDataService.findAll(queryBuilder.toString(), pageable);
    }

    /**
     * This setter method should only be used by unit tests
     *
     * @param service SurveyAndTestDataService instance
     */
    protected void setSurveyAndTestDataService(SurveyAndTestDataService service) {
        this.surveyAndTestDataService = service;
    }

}