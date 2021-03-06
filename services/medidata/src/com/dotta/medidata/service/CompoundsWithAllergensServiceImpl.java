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

import com.dotta.medidata.CompoundsWithAllergens;
import com.dotta.medidata.CompoundsWithAllergensId;


/**
 * ServiceImpl object for domain model class CompoundsWithAllergens.
 *
 * @see CompoundsWithAllergens
 */
@Service("medidata.CompoundsWithAllergensService")
@Validated
public class CompoundsWithAllergensServiceImpl implements CompoundsWithAllergensService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompoundsWithAllergensServiceImpl.class);


    @Autowired
    @Qualifier("medidata.CompoundsWithAllergensDao")
    private WMGenericDao<CompoundsWithAllergens, CompoundsWithAllergensId> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<CompoundsWithAllergens, CompoundsWithAllergensId> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "medidataTransactionManager")
    @Override
    public CompoundsWithAllergens create(CompoundsWithAllergens compoundsWithAllergens) {
        LOGGER.debug("Creating a new CompoundsWithAllergens with information: {}", compoundsWithAllergens);

        CompoundsWithAllergens compoundsWithAllergensCreated = this.wmGenericDao.create(compoundsWithAllergens);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(compoundsWithAllergensCreated);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public CompoundsWithAllergens getById(CompoundsWithAllergensId compoundswithallergensId) {
        LOGGER.debug("Finding CompoundsWithAllergens by id: {}", compoundswithallergensId);
        return this.wmGenericDao.findById(compoundswithallergensId);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public CompoundsWithAllergens findById(CompoundsWithAllergensId compoundswithallergensId) {
        LOGGER.debug("Finding CompoundsWithAllergens by id: {}", compoundswithallergensId);
        try {
            return this.wmGenericDao.findById(compoundswithallergensId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No CompoundsWithAllergens found with id: {}", compoundswithallergensId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public List<CompoundsWithAllergens> findByMultipleIds(List<CompoundsWithAllergensId> compoundswithallergensIds, boolean orderedReturn) {
        LOGGER.debug("Finding CompoundsWithAllergens by ids: {}", compoundswithallergensIds);

        return this.wmGenericDao.findByMultipleIds(compoundswithallergensIds, orderedReturn);
    }


    @Transactional(rollbackFor = EntityNotFoundException.class, value = "medidataTransactionManager")
    @Override
    public CompoundsWithAllergens update(CompoundsWithAllergens compoundsWithAllergens) {
        LOGGER.debug("Updating CompoundsWithAllergens with information: {}", compoundsWithAllergens);

        this.wmGenericDao.update(compoundsWithAllergens);
        this.wmGenericDao.refresh(compoundsWithAllergens);

        return compoundsWithAllergens;
    }

    @Transactional(value = "medidataTransactionManager")
    @Override
    public CompoundsWithAllergens delete(CompoundsWithAllergensId compoundswithallergensId) {
        LOGGER.debug("Deleting CompoundsWithAllergens with id: {}", compoundswithallergensId);
        CompoundsWithAllergens deleted = this.wmGenericDao.findById(compoundswithallergensId);
        if (deleted == null) {
            LOGGER.debug("No CompoundsWithAllergens found with id: {}", compoundswithallergensId);
            throw new EntityNotFoundException(String.valueOf(compoundswithallergensId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "medidataTransactionManager")
    @Override
    public void delete(CompoundsWithAllergens compoundsWithAllergens) {
        LOGGER.debug("Deleting CompoundsWithAllergens with {}", compoundsWithAllergens);
        this.wmGenericDao.delete(compoundsWithAllergens);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public Page<CompoundsWithAllergens> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all CompoundsWithAllergens");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public Page<CompoundsWithAllergens> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all CompoundsWithAllergens");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service medidata for table CompoundsWithAllergens to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service medidata for table CompoundsWithAllergens to {} format", options.getExportType());
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