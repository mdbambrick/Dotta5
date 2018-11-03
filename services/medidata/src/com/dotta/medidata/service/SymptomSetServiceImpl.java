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

import com.dotta.medidata.SymptomSet;


/**
 * ServiceImpl object for domain model class SymptomSet.
 *
 * @see SymptomSet
 */
@Service("medidata.SymptomSetService")
@Validated
public class SymptomSetServiceImpl implements SymptomSetService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SymptomSetServiceImpl.class);


    @Autowired
    @Qualifier("medidata.SymptomSetDao")
    private WMGenericDao<SymptomSet, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<SymptomSet, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "medidataTransactionManager")
    @Override
    public SymptomSet create(SymptomSet symptomSet) {
        LOGGER.debug("Creating a new SymptomSet with information: {}", symptomSet);

        SymptomSet symptomSetCreated = this.wmGenericDao.create(symptomSet);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(symptomSetCreated);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public SymptomSet getById(Integer symptomsetId) {
        LOGGER.debug("Finding SymptomSet by id: {}", symptomsetId);
        return this.wmGenericDao.findById(symptomsetId);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public SymptomSet findById(Integer symptomsetId) {
        LOGGER.debug("Finding SymptomSet by id: {}", symptomsetId);
        try {
            return this.wmGenericDao.findById(symptomsetId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No SymptomSet found with id: {}", symptomsetId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public List<SymptomSet> findByMultipleIds(List<Integer> symptomsetIds, boolean orderedReturn) {
        LOGGER.debug("Finding SymptomSets by ids: {}", symptomsetIds);

        return this.wmGenericDao.findByMultipleIds(symptomsetIds, orderedReturn);
    }


    @Transactional(rollbackFor = EntityNotFoundException.class, value = "medidataTransactionManager")
    @Override
    public SymptomSet update(SymptomSet symptomSet) {
        LOGGER.debug("Updating SymptomSet with information: {}", symptomSet);

        this.wmGenericDao.update(symptomSet);
        this.wmGenericDao.refresh(symptomSet);

        return symptomSet;
    }

    @Transactional(value = "medidataTransactionManager")
    @Override
    public SymptomSet delete(Integer symptomsetId) {
        LOGGER.debug("Deleting SymptomSet with id: {}", symptomsetId);
        SymptomSet deleted = this.wmGenericDao.findById(symptomsetId);
        if (deleted == null) {
            LOGGER.debug("No SymptomSet found with id: {}", symptomsetId);
            throw new EntityNotFoundException(String.valueOf(symptomsetId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "medidataTransactionManager")
    @Override
    public void delete(SymptomSet symptomSet) {
        LOGGER.debug("Deleting SymptomSet with {}", symptomSet);
        this.wmGenericDao.delete(symptomSet);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public Page<SymptomSet> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all SymptomSets");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public Page<SymptomSet> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all SymptomSets");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service medidata for table SymptomSet to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service medidata for table SymptomSet to {} format", options.getExportType());
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