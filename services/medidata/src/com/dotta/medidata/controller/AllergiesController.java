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

import com.dotta.medidata.Allergies;
import com.dotta.medidata.CompoundsAllergies;
import com.dotta.medidata.SubstitutesAllergies;
import com.dotta.medidata.SurveyAndTestData;
import com.dotta.medidata.SynonymAllergies;
import com.dotta.medidata.service.AllergiesService;


/**
 * Controller object for domain model class Allergies.
 * @see Allergies
 */
@RestController("medidata.AllergiesController")
@Api(value = "AllergiesController", description = "Exposes APIs to work with Allergies resource.")
@RequestMapping("/medidata/Allergies")
public class AllergiesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AllergiesController.class);

    @Autowired
	@Qualifier("medidata.AllergiesService")
	private AllergiesService allergiesService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new Allergies instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Allergies createAllergies(@RequestBody Allergies allergies) {
		LOGGER.debug("Create Allergies with information: {}" , allergies);

		allergies = allergiesService.create(allergies);
		LOGGER.debug("Created Allergies with information: {}" , allergies);

	    return allergies;
	}

    @ApiOperation(value = "Returns the Allergies instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Allergies getAllergies(@PathVariable("id") Integer id) {
        LOGGER.debug("Getting Allergies with id: {}" , id);

        Allergies foundAllergies = allergiesService.getById(id);
        LOGGER.debug("Allergies details with id: {}" , foundAllergies);

        return foundAllergies;
    }

    @ApiOperation(value = "Updates the Allergies instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Allergies editAllergies(@PathVariable("id") Integer id, @RequestBody Allergies allergies) {
        LOGGER.debug("Editing Allergies with id: {}" , allergies.getId());

        allergies.setId(id);
        allergies = allergiesService.update(allergies);
        LOGGER.debug("Allergies details with id: {}" , allergies);

        return allergies;
    }

    @ApiOperation(value = "Deletes the Allergies instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteAllergies(@PathVariable("id") Integer id) {
        LOGGER.debug("Deleting Allergies with id: {}" , id);

        Allergies deletedAllergies = allergiesService.delete(id);

        return deletedAllergies != null;
    }

    /**
     * @deprecated Use {@link #findAllergies(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Allergies instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Allergies> searchAllergiesByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Allergies list by query filter:{}", (Object) queryFilters);
        return allergiesService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Allergies instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Allergies> findAllergies(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Allergies list by filter:", query);
        return allergiesService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Allergies instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Allergies> filterAllergies(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Allergies list by filter", query);
        return allergiesService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportAllergies(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return allergiesService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportAllergiesAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = Allergies.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> allergiesService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of Allergies instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countAllergies( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Allergies");
		return allergiesService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getAllergiesAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return allergiesService.getAggregatedValues(aggregationInfo, pageable);
    }

    @RequestMapping(value="/{id:.+}/compoundsAllergieses", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the compoundsAllergieses instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<CompoundsAllergies> findAssociatedCompoundsAllergieses(@PathVariable("id") Integer id, Pageable pageable) {

        LOGGER.debug("Fetching all associated compoundsAllergieses");
        return allergiesService.findAssociatedCompoundsAllergieses(id, pageable);
    }

    @RequestMapping(value="/{id:.+}/substitutesAllergieses", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the substitutesAllergieses instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<SubstitutesAllergies> findAssociatedSubstitutesAllergieses(@PathVariable("id") Integer id, Pageable pageable) {

        LOGGER.debug("Fetching all associated substitutesAllergieses");
        return allergiesService.findAssociatedSubstitutesAllergieses(id, pageable);
    }

    @RequestMapping(value="/{id:.+}/surveyAndTestDatas", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the surveyAndTestDatas instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<SurveyAndTestData> findAssociatedSurveyAndTestDatas(@PathVariable("id") Integer id, Pageable pageable) {

        LOGGER.debug("Fetching all associated surveyAndTestDatas");
        return allergiesService.findAssociatedSurveyAndTestDatas(id, pageable);
    }

    @RequestMapping(value="/{id:.+}/synonymAllergieses", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the synonymAllergieses instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<SynonymAllergies> findAssociatedSynonymAllergieses(@PathVariable("id") Integer id, Pageable pageable) {

        LOGGER.debug("Fetching all associated synonymAllergieses");
        return allergiesService.findAssociatedSynonymAllergieses(id, pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service AllergiesService instance
	 */
	protected void setAllergiesService(AllergiesService service) {
		this.allergiesService = service;
	}

}