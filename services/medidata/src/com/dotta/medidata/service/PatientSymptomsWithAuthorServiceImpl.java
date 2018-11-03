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

import com.dotta.medidata.PatientSymptomsWithAuthor;
import com.dotta.medidata.PatientSymptomsWithAuthorId;


/**
 * ServiceImpl object for domain model class PatientSymptomsWithAuthor.
 *
 * @see PatientSymptomsWithAuthor
 */
@Service("medidata.PatientSymptomsWithAuthorService")
@Validated
public class PatientSymptomsWithAuthorServiceImpl implements PatientSymptomsWithAuthorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PatientSymptomsWithAuthorServiceImpl.class);


    @Autowired
    @Qualifier("medidata.PatientSymptomsWithAuthorDao")
    private WMGenericDao<PatientSymptomsWithAuthor, PatientSymptomsWithAuthorId> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<PatientSymptomsWithAuthor, PatientSymptomsWithAuthorId> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "medidataTransactionManager")
    @Override
    public PatientSymptomsWithAuthor create(PatientSymptomsWithAuthor patientSymptomsWithAuthor) {
        LOGGER.debug("Creating a new PatientSymptomsWithAuthor with information: {}", patientSymptomsWithAuthor);

        PatientSymptomsWithAuthor patientSymptomsWithAuthorCreated = this.wmGenericDao.create(patientSymptomsWithAuthor);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(patientSymptomsWithAuthorCreated);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public PatientSymptomsWithAuthor getById(PatientSymptomsWithAuthorId patientsymptomswithauthorId) {
        LOGGER.debug("Finding PatientSymptomsWithAuthor by id: {}", patientsymptomswithauthorId);
        return this.wmGenericDao.findById(patientsymptomswithauthorId);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public PatientSymptomsWithAuthor findById(PatientSymptomsWithAuthorId patientsymptomswithauthorId) {
        LOGGER.debug("Finding PatientSymptomsWithAuthor by id: {}", patientsymptomswithauthorId);
        try {
            return this.wmGenericDao.findById(patientsymptomswithauthorId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No PatientSymptomsWithAuthor found with id: {}", patientsymptomswithauthorId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public List<PatientSymptomsWithAuthor> findByMultipleIds(List<PatientSymptomsWithAuthorId> patientsymptomswithauthorIds, boolean orderedReturn) {
        LOGGER.debug("Finding PatientSymptomsWithAuthors by ids: {}", patientsymptomswithauthorIds);

        return this.wmGenericDao.findByMultipleIds(patientsymptomswithauthorIds, orderedReturn);
    }


    @Transactional(rollbackFor = EntityNotFoundException.class, value = "medidataTransactionManager")
    @Override
    public PatientSymptomsWithAuthor update(PatientSymptomsWithAuthor patientSymptomsWithAuthor) {
        LOGGER.debug("Updating PatientSymptomsWithAuthor with information: {}", patientSymptomsWithAuthor);

        this.wmGenericDao.update(patientSymptomsWithAuthor);
        this.wmGenericDao.refresh(patientSymptomsWithAuthor);

        return patientSymptomsWithAuthor;
    }

    @Transactional(value = "medidataTransactionManager")
    @Override
    public PatientSymptomsWithAuthor delete(PatientSymptomsWithAuthorId patientsymptomswithauthorId) {
        LOGGER.debug("Deleting PatientSymptomsWithAuthor with id: {}", patientsymptomswithauthorId);
        PatientSymptomsWithAuthor deleted = this.wmGenericDao.findById(patientsymptomswithauthorId);
        if (deleted == null) {
            LOGGER.debug("No PatientSymptomsWithAuthor found with id: {}", patientsymptomswithauthorId);
            throw new EntityNotFoundException(String.valueOf(patientsymptomswithauthorId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "medidataTransactionManager")
    @Override
    public void delete(PatientSymptomsWithAuthor patientSymptomsWithAuthor) {
        LOGGER.debug("Deleting PatientSymptomsWithAuthor with {}", patientSymptomsWithAuthor);
        this.wmGenericDao.delete(patientSymptomsWithAuthor);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public Page<PatientSymptomsWithAuthor> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all PatientSymptomsWithAuthors");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager")
    @Override
    public Page<PatientSymptomsWithAuthor> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all PatientSymptomsWithAuthors");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service medidata for table PatientSymptomsWithAuthor to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "medidataTransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service medidata for table PatientSymptomsWithAuthor to {} format", options.getExportType());
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