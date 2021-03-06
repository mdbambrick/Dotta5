/*Copyright (c) 2018-2019 medidesign.co.uk All Rights Reserved.
 This software is the confidential and proprietary information of medidesign.co.uk You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with medidesign.co.uk*/
package com.dotta.medidata.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
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

import com.dotta.medidata.ActionsDiagnoses;
import com.dotta.medidata.Diagnoses;


/**
 * ServiceImpl object for domain model class Diagnoses.
 *
 * @see Diagnoses
 */
@Service("medidata.DiagnosesService")
@Validated
public class DiagnosesServiceImpl implements DiagnosesService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DiagnosesServiceImpl.class);

    @Lazy
    @Autowired
    @Qualifier("medidata.ActionsDiagnosesService")
    private ActionsDiagnosesService actionsDiagnosesService;

    @Autowired
    @Qualifier("medidata.DiagnosesDao")
    private WMGenericDao<Diagnoses, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Diagnoses, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "medidataTransactionManager")
    @Override
    public Diagnoses create(Diagnoses diagnoses) {
        LOGGER.debug("Creating a new Diagnoses with information: {}", diagnoses);

        Diagnoses diagnosesCreated = this.wmGenericDao.create(diagnoses);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(diagnosesCreated);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public Diagnoses getById(Integer diagnosesId) {
        LOGGER.debug("Finding Diagnoses by id: {}", diagnosesId);
        return this.wmGenericDao.findById(diagnosesId);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public Diagnoses findById(Integer diagnosesId) {
        LOGGER.debug("Finding Diagnoses by id: {}", diagnosesId);
        try {
            return this.wmGenericDao.findById(diagnosesId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No Diagnoses found with id: {}", diagnosesId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public List<Diagnoses> findByMultipleIds(List<Integer> diagnosesIds, boolean orderedReturn) {
        LOGGER.debug("Finding Diagnoses by ids: {}", diagnosesIds);

        return this.wmGenericDao.findByMultipleIds(diagnosesIds, orderedReturn);
    }


    @Transactional(rollbackFor = EntityNotFoundException.class, value = "medidataTransactionManager")
    @Override
    public Diagnoses update(Diagnoses diagnoses) {
        LOGGER.debug("Updating Diagnoses with information: {}", diagnoses);

        List<ActionsDiagnoses> actionsDiagnoseses = diagnoses.getActionsDiagnoseses();
        if(actionsDiagnoseses != null && Hibernate.isInitialized(actionsDiagnoseses)) {
            actionsDiagnoseses.forEach(_actionsDiagnoses -> _actionsDiagnoses.setDiagnoses(diagnoses));
        }

        this.wmGenericDao.update(diagnoses);
        this.wmGenericDao.refresh(diagnoses);

        // Deleting children which are not present in the list.
        if(actionsDiagnoseses != null && Hibernate.isInitialized(actionsDiagnoseses) && !actionsDiagnoseses.isEmpty()) {
            List<ActionsDiagnoses> _remainingChildren = wmGenericDao.execute(
                session -> DaoUtils.findAllRemainingChildren(session, ActionsDiagnoses.class,
                        new DaoUtils.ChildrenFilter<>("diagnoses", diagnoses, actionsDiagnoseses)));
            LOGGER.debug("Found {} detached children, deleting", _remainingChildren.size());
            _remainingChildren.forEach(_actionsDiagnoses -> actionsDiagnosesService.delete(_actionsDiagnoses));
            diagnoses.setActionsDiagnoseses(actionsDiagnoseses);
        }

        return diagnoses;
    }

    @Transactional(value = "medidataTransactionManager")
    @Override
    public Diagnoses delete(Integer diagnosesId) {
        LOGGER.debug("Deleting Diagnoses with id: {}", diagnosesId);
        Diagnoses deleted = this.wmGenericDao.findById(diagnosesId);
        if (deleted == null) {
            LOGGER.debug("No Diagnoses found with id: {}", diagnosesId);
            throw new EntityNotFoundException(String.valueOf(diagnosesId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "medidataTransactionManager")
    @Override
    public void delete(Diagnoses diagnoses) {
        LOGGER.debug("Deleting Diagnoses with {}", diagnoses);
        this.wmGenericDao.delete(diagnoses);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public Page<Diagnoses> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Diagnoses");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public Page<Diagnoses> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Diagnoses");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service medidata for table Diagnoses to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service medidata for table Diagnoses to {} format", options.getExportType());
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
    public Page<ActionsDiagnoses> findAssociatedActionsDiagnoseses(Integer id, Pageable pageable) {
        LOGGER.debug("Fetching all associated actionsDiagnoseses");

        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("diagnoses.id = '" + id + "'");

        return actionsDiagnosesService.findAll(queryBuilder.toString(), pageable);
    }

    /**
     * This setter method should only be used by unit tests
     *
     * @param service ActionsDiagnosesService instance
     */
    protected void setActionsDiagnosesService(ActionsDiagnosesService service) {
        this.actionsDiagnosesService = service;
    }

}