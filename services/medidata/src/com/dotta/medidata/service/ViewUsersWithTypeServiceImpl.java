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

import com.dotta.medidata.ViewUsersWithType;
import com.dotta.medidata.ViewUsersWithTypeId;


/**
 * ServiceImpl object for domain model class ViewUsersWithType.
 *
 * @see ViewUsersWithType
 */
@Service("medidata.ViewUsersWithTypeService")
@Validated
public class ViewUsersWithTypeServiceImpl implements ViewUsersWithTypeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ViewUsersWithTypeServiceImpl.class);


    @Autowired
    @Qualifier("medidata.ViewUsersWithTypeDao")
    private WMGenericDao<ViewUsersWithType, ViewUsersWithTypeId> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<ViewUsersWithType, ViewUsersWithTypeId> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "medidataTransactionManager")
    @Override
    public ViewUsersWithType create(ViewUsersWithType viewUsersWithType) {
        LOGGER.debug("Creating a new ViewUsersWithType with information: {}", viewUsersWithType);

        ViewUsersWithType viewUsersWithTypeCreated = this.wmGenericDao.create(viewUsersWithType);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(viewUsersWithTypeCreated);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public ViewUsersWithType getById(ViewUsersWithTypeId viewuserswithtypeId) {
        LOGGER.debug("Finding ViewUsersWithType by id: {}", viewuserswithtypeId);
        return this.wmGenericDao.findById(viewuserswithtypeId);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public ViewUsersWithType findById(ViewUsersWithTypeId viewuserswithtypeId) {
        LOGGER.debug("Finding ViewUsersWithType by id: {}", viewuserswithtypeId);
        try {
            return this.wmGenericDao.findById(viewuserswithtypeId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No ViewUsersWithType found with id: {}", viewuserswithtypeId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public List<ViewUsersWithType> findByMultipleIds(List<ViewUsersWithTypeId> viewuserswithtypeIds, boolean orderedReturn) {
        LOGGER.debug("Finding ViewUsersWithTypes by ids: {}", viewuserswithtypeIds);

        return this.wmGenericDao.findByMultipleIds(viewuserswithtypeIds, orderedReturn);
    }


    @Transactional(rollbackFor = EntityNotFoundException.class, value = "medidataTransactionManager")
    @Override
    public ViewUsersWithType update(ViewUsersWithType viewUsersWithType) {
        LOGGER.debug("Updating ViewUsersWithType with information: {}", viewUsersWithType);

        this.wmGenericDao.update(viewUsersWithType);
        this.wmGenericDao.refresh(viewUsersWithType);

        return viewUsersWithType;
    }

    @Transactional(value = "medidataTransactionManager")
    @Override
    public ViewUsersWithType delete(ViewUsersWithTypeId viewuserswithtypeId) {
        LOGGER.debug("Deleting ViewUsersWithType with id: {}", viewuserswithtypeId);
        ViewUsersWithType deleted = this.wmGenericDao.findById(viewuserswithtypeId);
        if (deleted == null) {
            LOGGER.debug("No ViewUsersWithType found with id: {}", viewuserswithtypeId);
            throw new EntityNotFoundException(String.valueOf(viewuserswithtypeId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "medidataTransactionManager")
    @Override
    public void delete(ViewUsersWithType viewUsersWithType) {
        LOGGER.debug("Deleting ViewUsersWithType with {}", viewUsersWithType);
        this.wmGenericDao.delete(viewUsersWithType);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public Page<ViewUsersWithType> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all ViewUsersWithTypes");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public Page<ViewUsersWithType> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all ViewUsersWithTypes");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service medidata for table ViewUsersWithType to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service medidata for table ViewUsersWithType to {} format", options.getExportType());
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