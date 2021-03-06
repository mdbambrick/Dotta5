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

import com.dotta.medidata.SynonymAllergies;
import com.dotta.medidata.service.SynonymAllergiesService;


/**
 * Controller object for domain model class SynonymAllergies.
 * @see SynonymAllergies
 */
@RestController("medidata.SynonymAllergiesController")
@Api(value = "SynonymAllergiesController", description = "Exposes APIs to work with SynonymAllergies resource.")
@RequestMapping("/medidata/SynonymAllergies")
public class SynonymAllergiesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SynonymAllergiesController.class);

    @Autowired
	@Qualifier("medidata.SynonymAllergiesService")
	private SynonymAllergiesService synonymAllergiesService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new SynonymAllergies instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public SynonymAllergies createSynonymAllergies(@RequestBody SynonymAllergies synonymAllergies) {
		LOGGER.debug("Create SynonymAllergies with information: {}" , synonymAllergies);

		synonymAllergies = synonymAllergiesService.create(synonymAllergies);
		LOGGER.debug("Created SynonymAllergies with information: {}" , synonymAllergies);

	    return synonymAllergies;
	}

    @ApiOperation(value = "Returns the SynonymAllergies instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public SynonymAllergies getSynonymAllergies(@PathVariable("id") Integer id) {
        LOGGER.debug("Getting SynonymAllergies with id: {}" , id);

        SynonymAllergies foundSynonymAllergies = synonymAllergiesService.getById(id);
        LOGGER.debug("SynonymAllergies details with id: {}" , foundSynonymAllergies);

        return foundSynonymAllergies;
    }

    @ApiOperation(value = "Updates the SynonymAllergies instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public SynonymAllergies editSynonymAllergies(@PathVariable("id") Integer id, @RequestBody SynonymAllergies synonymAllergies) {
        LOGGER.debug("Editing SynonymAllergies with id: {}" , synonymAllergies.getId());

        synonymAllergies.setId(id);
        synonymAllergies = synonymAllergiesService.update(synonymAllergies);
        LOGGER.debug("SynonymAllergies details with id: {}" , synonymAllergies);

        return synonymAllergies;
    }

    @ApiOperation(value = "Deletes the SynonymAllergies instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteSynonymAllergies(@PathVariable("id") Integer id) {
        LOGGER.debug("Deleting SynonymAllergies with id: {}" , id);

        SynonymAllergies deletedSynonymAllergies = synonymAllergiesService.delete(id);

        return deletedSynonymAllergies != null;
    }

    /**
     * @deprecated Use {@link #findSynonymAllergies(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of SynonymAllergies instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<SynonymAllergies> searchSynonymAllergiesByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering SynonymAllergies list by query filter:{}", (Object) queryFilters);
        return synonymAllergiesService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of SynonymAllergies instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<SynonymAllergies> findSynonymAllergies(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering SynonymAllergies list by filter:", query);
        return synonymAllergiesService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of SynonymAllergies instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<SynonymAllergies> filterSynonymAllergies(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering SynonymAllergies list by filter", query);
        return synonymAllergiesService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportSynonymAllergies(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return synonymAllergiesService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportSynonymAllergiesAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = SynonymAllergies.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> synonymAllergiesService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of SynonymAllergies instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countSynonymAllergies( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting SynonymAllergies");
		return synonymAllergiesService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getSynonymAllergiesAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return synonymAllergiesService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service SynonymAllergiesService instance
	 */
	protected void setSynonymAllergiesService(SynonymAllergiesService service) {
		this.synonymAllergiesService = service;
	}

}