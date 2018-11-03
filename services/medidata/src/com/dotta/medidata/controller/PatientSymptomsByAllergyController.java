/*Copyright (c) 2018-2019 medidesign.co.uk All Rights Reserved.
 This software is the confidential and proprietary information of medidesign.co.uk You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with medidesign.co.uk*/
package com.dotta.medidata.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.sql.Timestamp;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wavemaker.commons.wrapper.StringWrapper;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.manager.ExportedFileManager;
import com.wavemaker.runtime.file.model.Downloadable;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import com.dotta.medidata.PatientSymptomsByAllergy;
import com.dotta.medidata.PatientSymptomsByAllergyId;
import com.dotta.medidata.service.PatientSymptomsByAllergyService;


/**
 * Controller object for domain model class PatientSymptomsByAllergy.
 * @see PatientSymptomsByAllergy
 */
@RestController("medidata.PatientSymptomsByAllergyController")
@Api(value = "PatientSymptomsByAllergyController", description = "Exposes APIs to work with PatientSymptomsByAllergy resource.")
@RequestMapping("/medidata/PatientSymptomsByAllergy")
public class PatientSymptomsByAllergyController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PatientSymptomsByAllergyController.class);

    @Autowired
	@Qualifier("medidata.PatientSymptomsByAllergyService")
	private PatientSymptomsByAllergyService patientSymptomsByAllergyService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new PatientSymptomsByAllergy instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public PatientSymptomsByAllergy createPatientSymptomsByAllergy(@RequestBody PatientSymptomsByAllergy patientSymptomsByAllergy) {
		LOGGER.debug("Create PatientSymptomsByAllergy with information: {}" , patientSymptomsByAllergy);

		patientSymptomsByAllergy = patientSymptomsByAllergyService.create(patientSymptomsByAllergy);
		LOGGER.debug("Created PatientSymptomsByAllergy with information: {}" , patientSymptomsByAllergy);

	    return patientSymptomsByAllergy;
	}

    @ApiOperation(value = "Returns the PatientSymptomsByAllergy instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public PatientSymptomsByAllergy getPatientSymptomsByAllergy(@RequestParam("patientId") Integer patientId, @RequestParam("allergyId") Integer allergyId, @RequestParam("ranking") Integer ranking, @RequestParam("colour") Integer colour, @RequestParam("allergyName") String allergyName, @RequestParam("allergyCategory") Integer allergyCategory, @RequestParam("title") String title, @RequestParam("allergySet") Integer allergySet, @RequestParam("setName") String setName, @RequestParam("symptomId") Integer symptomId, @RequestParam("symptom") String symptom, @RequestParam("result") Integer result, @RequestParam("datetime") Timestamp datetime, @RequestParam("sessionId") Integer sessionId) {

        PatientSymptomsByAllergyId patientsymptomsbyallergyId = new PatientSymptomsByAllergyId();
        patientsymptomsbyallergyId.setPatientId(patientId);
        patientsymptomsbyallergyId.setAllergyId(allergyId);
        patientsymptomsbyallergyId.setRanking(ranking);
        patientsymptomsbyallergyId.setColour(colour);
        patientsymptomsbyallergyId.setAllergyName(allergyName);
        patientsymptomsbyallergyId.setAllergyCategory(allergyCategory);
        patientsymptomsbyallergyId.setTitle(title);
        patientsymptomsbyallergyId.setAllergySet(allergySet);
        patientsymptomsbyallergyId.setSetName(setName);
        patientsymptomsbyallergyId.setSymptomId(symptomId);
        patientsymptomsbyallergyId.setSymptom(symptom);
        patientsymptomsbyallergyId.setResult(result);
        patientsymptomsbyallergyId.setDatetime(datetime);
        patientsymptomsbyallergyId.setSessionId(sessionId);

        LOGGER.debug("Getting PatientSymptomsByAllergy with id: {}" , patientsymptomsbyallergyId);
        PatientSymptomsByAllergy patientSymptomsByAllergy = patientSymptomsByAllergyService.getById(patientsymptomsbyallergyId);
        LOGGER.debug("PatientSymptomsByAllergy details with id: {}" , patientSymptomsByAllergy);

        return patientSymptomsByAllergy;
    }



    @ApiOperation(value = "Updates the PatientSymptomsByAllergy instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public PatientSymptomsByAllergy editPatientSymptomsByAllergy(@RequestParam("patientId") Integer patientId, @RequestParam("allergyId") Integer allergyId, @RequestParam("ranking") Integer ranking, @RequestParam("colour") Integer colour, @RequestParam("allergyName") String allergyName, @RequestParam("allergyCategory") Integer allergyCategory, @RequestParam("title") String title, @RequestParam("allergySet") Integer allergySet, @RequestParam("setName") String setName, @RequestParam("symptomId") Integer symptomId, @RequestParam("symptom") String symptom, @RequestParam("result") Integer result, @RequestParam("datetime") Timestamp datetime, @RequestParam("sessionId") Integer sessionId, @RequestBody PatientSymptomsByAllergy patientSymptomsByAllergy) {

        patientSymptomsByAllergy.setPatientId(patientId);
        patientSymptomsByAllergy.setAllergyId(allergyId);
        patientSymptomsByAllergy.setRanking(ranking);
        patientSymptomsByAllergy.setColour(colour);
        patientSymptomsByAllergy.setAllergyName(allergyName);
        patientSymptomsByAllergy.setAllergyCategory(allergyCategory);
        patientSymptomsByAllergy.setTitle(title);
        patientSymptomsByAllergy.setAllergySet(allergySet);
        patientSymptomsByAllergy.setSetName(setName);
        patientSymptomsByAllergy.setSymptomId(symptomId);
        patientSymptomsByAllergy.setSymptom(symptom);
        patientSymptomsByAllergy.setResult(result);
        patientSymptomsByAllergy.setDatetime(datetime);
        patientSymptomsByAllergy.setSessionId(sessionId);

        LOGGER.debug("PatientSymptomsByAllergy details with id is updated with: {}" , patientSymptomsByAllergy);

        return patientSymptomsByAllergyService.update(patientSymptomsByAllergy);
    }


    @ApiOperation(value = "Deletes the PatientSymptomsByAllergy instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deletePatientSymptomsByAllergy(@RequestParam("patientId") Integer patientId, @RequestParam("allergyId") Integer allergyId, @RequestParam("ranking") Integer ranking, @RequestParam("colour") Integer colour, @RequestParam("allergyName") String allergyName, @RequestParam("allergyCategory") Integer allergyCategory, @RequestParam("title") String title, @RequestParam("allergySet") Integer allergySet, @RequestParam("setName") String setName, @RequestParam("symptomId") Integer symptomId, @RequestParam("symptom") String symptom, @RequestParam("result") Integer result, @RequestParam("datetime") Timestamp datetime, @RequestParam("sessionId") Integer sessionId) {

        PatientSymptomsByAllergyId patientsymptomsbyallergyId = new PatientSymptomsByAllergyId();
        patientsymptomsbyallergyId.setPatientId(patientId);
        patientsymptomsbyallergyId.setAllergyId(allergyId);
        patientsymptomsbyallergyId.setRanking(ranking);
        patientsymptomsbyallergyId.setColour(colour);
        patientsymptomsbyallergyId.setAllergyName(allergyName);
        patientsymptomsbyallergyId.setAllergyCategory(allergyCategory);
        patientsymptomsbyallergyId.setTitle(title);
        patientsymptomsbyallergyId.setAllergySet(allergySet);
        patientsymptomsbyallergyId.setSetName(setName);
        patientsymptomsbyallergyId.setSymptomId(symptomId);
        patientsymptomsbyallergyId.setSymptom(symptom);
        patientsymptomsbyallergyId.setResult(result);
        patientsymptomsbyallergyId.setDatetime(datetime);
        patientsymptomsbyallergyId.setSessionId(sessionId);

        LOGGER.debug("Deleting PatientSymptomsByAllergy with id: {}" , patientsymptomsbyallergyId);
        PatientSymptomsByAllergy patientSymptomsByAllergy = patientSymptomsByAllergyService.delete(patientsymptomsbyallergyId);

        return patientSymptomsByAllergy != null;
    }


    /**
     * @deprecated Use {@link #findPatientSymptomsByAllergies(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of PatientSymptomsByAllergy instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<PatientSymptomsByAllergy> searchPatientSymptomsByAllergiesByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering PatientSymptomsByAllergies list by query filter:{}", (Object) queryFilters);
        return patientSymptomsByAllergyService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of PatientSymptomsByAllergy instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<PatientSymptomsByAllergy> findPatientSymptomsByAllergies(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering PatientSymptomsByAllergies list by filter:", query);
        return patientSymptomsByAllergyService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of PatientSymptomsByAllergy instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<PatientSymptomsByAllergy> filterPatientSymptomsByAllergies(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering PatientSymptomsByAllergies list by filter", query);
        return patientSymptomsByAllergyService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportPatientSymptomsByAllergies(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return patientSymptomsByAllergyService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportPatientSymptomsByAllergiesAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = PatientSymptomsByAllergy.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> patientSymptomsByAllergyService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of PatientSymptomsByAllergy instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countPatientSymptomsByAllergies( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting PatientSymptomsByAllergies");
		return patientSymptomsByAllergyService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getPatientSymptomsByAllergyAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return patientSymptomsByAllergyService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service PatientSymptomsByAllergyService instance
	 */
	protected void setPatientSymptomsByAllergyService(PatientSymptomsByAllergyService service) {
		this.patientSymptomsByAllergyService = service;
	}

}