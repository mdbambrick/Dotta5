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

import com.dotta.medidata.Compounds;
import com.dotta.medidata.CompoundsAllergies;
import com.dotta.medidata.service.CompoundsService;


/**
 * Controller object for domain model class Compounds.
 * @see Compounds
 */
@RestController("medidata.CompoundsController")
@Api(value = "CompoundsController", description = "Exposes APIs to work with Compounds resource.")
@RequestMapping("/medidata/Compounds")
public class CompoundsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompoundsController.class);

    @Autowired
	@Qualifier("medidata.CompoundsService")
	private CompoundsService compoundsService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new Compounds instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Compounds createCompounds(@RequestBody Compounds compounds) {
		LOGGER.debug("Create Compounds with information: {}" , compounds);

		compounds = compoundsService.create(compounds);
		LOGGER.debug("Created Compounds with information: {}" , compounds);

	    return compounds;
	}

    @ApiOperation(value = "Returns the Compounds instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Compounds getCompounds(@PathVariable("id") Integer id) {
        LOGGER.debug("Getting Compounds with id: {}" , id);

        Compounds foundCompounds = compoundsService.getById(id);
        LOGGER.debug("Compounds details with id: {}" , foundCompounds);

        return foundCompounds;
    }

    @ApiOperation(value = "Updates the Compounds instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Compounds editCompounds(@PathVariable("id") Integer id, @RequestBody Compounds compounds) {
        LOGGER.debug("Editing Compounds with id: {}" , compounds.getId());

        compounds.setId(id);
        compounds = compoundsService.update(compounds);
        LOGGER.debug("Compounds details with id: {}" , compounds);

        return compounds;
    }

    @ApiOperation(value = "Deletes the Compounds instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteCompounds(@PathVariable("id") Integer id) {
        LOGGER.debug("Deleting Compounds with id: {}" , id);

        Compounds deletedCompounds = compoundsService.delete(id);

        return deletedCompounds != null;
    }

    /**
     * @deprecated Use {@link #findCompounds(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Compounds instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Compounds> searchCompoundsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Compounds list by query filter:{}", (Object) queryFilters);
        return compoundsService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Compounds instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Compounds> findCompounds(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Compounds list by filter:", query);
        return compoundsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Compounds instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Compounds> filterCompounds(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Compounds list by filter", query);
        return compoundsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportCompounds(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return compoundsService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportCompoundsAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = Compounds.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> compoundsService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of Compounds instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countCompounds( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Compounds");
		return compoundsService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getCompoundsAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return compoundsService.getAggregatedValues(aggregationInfo, pageable);
    }

    @RequestMapping(value="/{id:.+}/compoundsAllergieses", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the compoundsAllergieses instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<CompoundsAllergies> findAssociatedCompoundsAllergieses(@PathVariable("id") Integer id, Pageable pageable) {

        LOGGER.debug("Fetching all associated compoundsAllergieses");
        return compoundsService.findAssociatedCompoundsAllergieses(id, pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service CompoundsService instance
	 */
	protected void setCompoundsService(CompoundsService service) {
		this.compoundsService = service;
	}

}