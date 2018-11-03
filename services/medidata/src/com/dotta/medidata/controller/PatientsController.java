/*Copyright (c) 2018-2019 medidesign.co.uk All Rights Reserved.
 This software is the confidential and proprietary information of medidesign.co.uk You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with medidesign.co.uk*/
package com.dotta.medidata.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

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

import com.dotta.medidata.Background;
import com.dotta.medidata.Diagnoses;
import com.dotta.medidata.Patients;
import com.dotta.medidata.SurveyAndTestData;
import com.dotta.medidata.UsersPatients;
import com.dotta.medidata.service.PatientsService;


/**
 * Controller object for domain model class Patients.
 * @see Patients
 */
@RestController("medidata.PatientsController")
@Api(value = "PatientsController", description = "Exposes APIs to work with Patients resource.")
@RequestMapping("/medidata/Patients")
public class PatientsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PatientsController.class);

    @Autowired
	@Qualifier("medidata.PatientsService")
	private PatientsService patientsService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new Patients instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Patients createPatients(@RequestBody Patients patients) {
		LOGGER.debug("Create Patients with information: {}" , patients);

		patients = patientsService.create(patients);
		LOGGER.debug("Created Patients with information: {}" , patients);

	    return patients;
	}

    @ApiOperation(value = "Returns the Patients instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Patients getPatients(@PathVariable("id") Integer id) {
        LOGGER.debug("Getting Patients with id: {}" , id);

        Patients foundPatients = patientsService.getById(id);
        LOGGER.debug("Patients details with id: {}" , foundPatients);

        return foundPatients;
    }

    @ApiOperation(value = "Updates the Patients instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Patients editPatients(@PathVariable("id") Integer id, @RequestBody Patients patients) {
        LOGGER.debug("Editing Patients with id: {}" , patients.getId());

        patients.setId(id);
        patients = patientsService.update(patients);
        LOGGER.debug("Patients details with id: {}" , patients);

        return patients;
    }

    @ApiOperation(value = "Deletes the Patients instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deletePatients(@PathVariable("id") Integer id) {
        LOGGER.debug("Deleting Patients with id: {}" , id);

        Patients deletedPatients = patientsService.delete(id);

        return deletedPatients != null;
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the matching Patients with given unique key values.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Patients getByUniqueKeyId(@PathVariable("id") int id) {
        LOGGER.debug("Getting Patients with uniques key UniqueKeyId");
        return patientsService.getByUniqueKeyId(id);
    }

    /**
     * @deprecated Use {@link #findPatients(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Patients instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Patients> searchPatientsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Patients list by query filter:{}", (Object) queryFilters);
        return patientsService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Patients instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Patients> findPatients(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Patients list by filter:", query);
        return patientsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Patients instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Patients> filterPatients(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Patients list by filter", query);
        return patientsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportPatients(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return patientsService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportPatientsAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = Patients.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> patientsService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of Patients instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countPatients( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Patients");
		return patientsService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getPatientsAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return patientsService.getAggregatedValues(aggregationInfo, pageable);
    }

    @RequestMapping(value="/{id:.+}/backgrounds", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the backgrounds instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Background> findAssociatedBackgrounds(@PathVariable("id") Integer id, Pageable pageable) {

        LOGGER.debug("Fetching all associated backgrounds");
        return patientsService.findAssociatedBackgrounds(id, pageable);
    }

    @RequestMapping(value="/{id:.+}/diagnoseses", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the diagnoseses instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Diagnoses> findAssociatedDiagnoseses(@PathVariable("id") Integer id, Pageable pageable) {

        LOGGER.debug("Fetching all associated diagnoseses");
        return patientsService.findAssociatedDiagnoseses(id, pageable);
    }

    @RequestMapping(value="/{id:.+}/surveyAndTestDatas", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the surveyAndTestDatas instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<SurveyAndTestData> findAssociatedSurveyAndTestDatas(@PathVariable("id") Integer id, Pageable pageable) {

        LOGGER.debug("Fetching all associated surveyAndTestDatas");
        return patientsService.findAssociatedSurveyAndTestDatas(id, pageable);
    }

    @RequestMapping(value="/{id:.+}/usersPatientses", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the usersPatientses instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<UsersPatients> findAssociatedUsersPatientses(@PathVariable("id") Integer id, Pageable pageable) {

        LOGGER.debug("Fetching all associated usersPatientses");
        return patientsService.findAssociatedUsersPatientses(id, pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service PatientsService instance
	 */
	protected void setPatientsService(PatientsService service) {
		this.patientsService = service;
	}

}