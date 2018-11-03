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

import com.dotta.medidata.SynonymAllergies;


/**
 * ServiceImpl object for domain model class SynonymAllergies.
 *
 * @see SynonymAllergies
 */
@Service("medidata.SynonymAllergiesService")
@Validated
public class SynonymAllergiesServiceImpl implements SynonymAllergiesService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SynonymAllergiesServiceImpl.class);


    @Autowired
    @Qualifier("medidata.SynonymAllergiesDao")
    private WMGenericDao<SynonymAllergies, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<SynonymAllergies, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "medidataTransactionManager")
    @Override
    public SynonymAllergies create(SynonymAllergies synonymAllergies) {
        LOGGER.debug("Creating a new SynonymAllergies with information: {}", synonymAllergies);

        SynonymAllergies synonymAllergiesCreated = this.wmGenericDao.create(synonymAllergies);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(synonymAllergiesCreated);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public SynonymAllergies getById(Integer synonymallergiesId) {
        LOGGER.debug("Finding SynonymAllergies by id: {}", synonymallergiesId);
        return this.wmGenericDao.findById(synonymallergiesId);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public SynonymAllergies findById(Integer synonymallergiesId) {
        LOGGER.debug("Finding SynonymAllergies by id: {}", synonymallergiesId);
        try {
            return this.wmGenericDao.findById(synonymallergiesId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No SynonymAllergies found with id: {}", synonymallergiesId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public List<SynonymAllergies> findByMultipleIds(List<Integer> synonymallergiesIds, boolean orderedReturn) {
        LOGGER.debug("Finding SynonymAllergies by ids: {}", synonymallergiesIds);

        return this.wmGenericDao.findByMultipleIds(synonymallergiesIds, orderedReturn);
    }


    @Transactional(rollbackFor = EntityNotFoundException.class, value = "medidataTransactionManager")
    @Override
    public SynonymAllergies update(SynonymAllergies synonymAllergies) {
        LOGGER.debug("Updating SynonymAllergies with information: {}", synonymAllergies);

        this.wmGenericDao.update(synonymAllergies);
        this.wmGenericDao.refresh(synonymAllergies);

        return synonymAllergies;
    }

    @Transactional(value = "medidataTransactionManager")
    @Override
    public SynonymAllergies delete(Integer synonymallergiesId) {
        LOGGER.debug("Deleting SynonymAllergies with id: {}", synonymallergiesId);
        SynonymAllergies deleted = this.wmGenericDao.findById(synonymallergiesId);
        if (deleted == null) {
            LOGGER.debug("No SynonymAllergies found with id: {}", synonymallergiesId);
            throw new EntityNotFoundException(String.valueOf(synonymallergiesId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "medidataTransactionManager")
    @Override
    public void delete(SynonymAllergies synonymAllergies) {
        LOGGER.debug("Deleting SynonymAllergies with {}", synonymAllergies);
        this.wmGenericDao.delete(synonymAllergies);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public Page<SynonymAllergies> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all SynonymAllergies");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public Page<SynonymAllergies> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all SynonymAllergies");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service medidata for table SynonymAllergies to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service medidata for table SynonymAllergies to {} format", options.getExportType());
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