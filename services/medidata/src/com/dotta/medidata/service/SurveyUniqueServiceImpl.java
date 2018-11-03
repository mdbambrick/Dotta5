/*Copyright (c) 2018-2019 medidesign.co.uk All Rights Reserved.
 This software is the confidential and proprietary information of medidesign.co.uk You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with medidesign.co.uk*/
package com.dotta.medidata.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
import com.wavemaker.runtime.file.model.Downloadable;

import com.dotta.medidata.SurveyUnique;
import com.dotta.medidata.SurveyUniqueId;


/**
 * ServiceImpl object for domain model class SurveyUnique.
 *
 * @see SurveyUnique
 */
@Service("medidata.SurveyUniqueService")
@Validated
public class SurveyUniqueServiceImpl implements SurveyUniqueService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SurveyUniqueServiceImpl.class);


    @Autowired
    @Qualifier("medidata.SurveyUniqueDao")
    private WMGenericDao<SurveyUnique, SurveyUniqueId> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<SurveyUnique, SurveyUniqueId> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "medidataTransactionManager")
    @Override
    public SurveyUnique create(SurveyUnique surveyUnique) {
        LOGGER.debug("Creating a new SurveyUnique with information: {}", surveyUnique);

        SurveyUnique surveyUniqueCreated = this.wmGenericDao.create(surveyUnique);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(surveyUniqueCreated);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public SurveyUnique getById(SurveyUniqueId surveyuniqueId) {
        LOGGER.debug("Finding SurveyUnique by id: {}", surveyuniqueId);
        return this.wmGenericDao.findById(surveyuniqueId);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public SurveyUnique findById(SurveyUniqueId surveyuniqueId) {
        LOGGER.debug("Finding SurveyUnique by id: {}", surveyuniqueId);
        try {
            return this.wmGenericDao.findById(surveyuniqueId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No SurveyUnique found with id: {}", surveyuniqueId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public List<SurveyUnique> findByMultipleIds(List<SurveyUniqueId> surveyuniqueIds, boolean orderedReturn) {
        LOGGER.debug("Finding SurveyUniques by ids: {}", surveyuniqueIds);

        return this.wmGenericDao.findByMultipleIds(surveyuniqueIds, orderedReturn);
    }


    @Transactional(rollbackFor = EntityNotFoundException.class, value = "medidataTransactionManager")
    @Override
    public SurveyUnique update(SurveyUnique surveyUnique) {
        LOGGER.debug("Updating SurveyUnique with information: {}", surveyUnique);

        this.wmGenericDao.update(surveyUnique);
        this.wmGenericDao.refresh(surveyUnique);

        return surveyUnique;
    }

    @Transactional(value = "medidataTransactionManager")
    @Override
    public SurveyUnique delete(SurveyUniqueId surveyuniqueId) {
        LOGGER.debug("Deleting SurveyUnique with id: {}", surveyuniqueId);
        SurveyUnique deleted = this.wmGenericDao.findById(surveyuniqueId);
        if (deleted == null) {
            LOGGER.debug("No SurveyUnique found with id: {}", surveyuniqueId);
            throw new EntityNotFoundException(String.valueOf(surveyuniqueId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "medidataTransactionManager")
    @Override
    public void delete(SurveyUnique surveyUnique) {
        LOGGER.debug("Deleting SurveyUnique with {}", surveyUnique);
        this.wmGenericDao.delete(surveyUnique);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public Page<SurveyUnique> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all SurveyUniques");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public Page<SurveyUnique> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all SurveyUniques");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service medidata for table SurveyUnique to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service medidata for table SurveyUnique to {} format", options.getExportType());
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



}