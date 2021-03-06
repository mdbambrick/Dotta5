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

import com.dotta.medidata.ConnectedSymptomGroups;
import com.dotta.medidata.service.ConnectedSymptomGroupsService;


/**
 * Controller object for domain model class ConnectedSymptomGroups.
 * @see ConnectedSymptomGroups
 */
@RestController("medidata.ConnectedSymptomGroupsController")
@Api(value = "ConnectedSymptomGroupsController", description = "Exposes APIs to work with ConnectedSymptomGroups resource.")
@RequestMapping("/medidata/ConnectedSymptomGroups")
public class ConnectedSymptomGroupsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConnectedSymptomGroupsController.class);

    @Autowired
	@Qualifier("medidata.ConnectedSymptomGroupsService")
	private ConnectedSymptomGroupsService connectedSymptomGroupsService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new ConnectedSymptomGroups instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public ConnectedSymptomGroups createConnectedSymptomGroups(@RequestBody ConnectedSymptomGroups connectedSymptomGroups) {
		LOGGER.debug("Create ConnectedSymptomGroups with information: {}" , connectedSymptomGroups);

		connectedSymptomGroups = connectedSymptomGroupsService.create(connectedSymptomGroups);
		LOGGER.debug("Created ConnectedSymptomGroups with information: {}" , connectedSymptomGroups);

	    return connectedSymptomGroups;
	}

    @ApiOperation(value = "Returns the ConnectedSymptomGroups instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public ConnectedSymptomGroups getConnectedSymptomGroups(@PathVariable("id") Integer id) {
        LOGGER.debug("Getting ConnectedSymptomGroups with id: {}" , id);

        ConnectedSymptomGroups foundConnectedSymptomGroups = connectedSymptomGroupsService.getById(id);
        LOGGER.debug("ConnectedSymptomGroups details with id: {}" , foundConnectedSymptomGroups);

        return foundConnectedSymptomGroups;
    }

    @ApiOperation(value = "Updates the ConnectedSymptomGroups instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public ConnectedSymptomGroups editConnectedSymptomGroups(@PathVariable("id") Integer id, @RequestBody ConnectedSymptomGroups connectedSymptomGroups) {
        LOGGER.debug("Editing ConnectedSymptomGroups with id: {}" , connectedSymptomGroups.getId());

        connectedSymptomGroups.setId(id);
        connectedSymptomGroups = connectedSymptomGroupsService.update(connectedSymptomGroups);
        LOGGER.debug("ConnectedSymptomGroups details with id: {}" , connectedSymptomGroups);

        return connectedSymptomGroups;
    }

    @ApiOperation(value = "Deletes the ConnectedSymptomGroups instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteConnectedSymptomGroups(@PathVariable("id") Integer id) {
        LOGGER.debug("Deleting ConnectedSymptomGroups with id: {}" , id);

        ConnectedSymptomGroups deletedConnectedSymptomGroups = connectedSymptomGroupsService.delete(id);

        return deletedConnectedSymptomGroups != null;
    }

    /**
     * @deprecated Use {@link #findConnectedSymptomGroups(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of ConnectedSymptomGroups instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<ConnectedSymptomGroups> searchConnectedSymptomGroupsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering ConnectedSymptomGroups list by query filter:{}", (Object) queryFilters);
        return connectedSymptomGroupsService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of ConnectedSymptomGroups instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<ConnectedSymptomGroups> findConnectedSymptomGroups(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering ConnectedSymptomGroups list by filter:", query);
        return connectedSymptomGroupsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of ConnectedSymptomGroups instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<ConnectedSymptomGroups> filterConnectedSymptomGroups(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering ConnectedSymptomGroups list by filter", query);
        return connectedSymptomGroupsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportConnectedSymptomGroups(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return connectedSymptomGroupsService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportConnectedSymptomGroupsAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = ConnectedSymptomGroups.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> connectedSymptomGroupsService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of ConnectedSymptomGroups instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countConnectedSymptomGroups( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting ConnectedSymptomGroups");
		return connectedSymptomGroupsService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getConnectedSymptomGroupsAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return connectedSymptomGroupsService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service ConnectedSymptomGroupsService instance
	 */
	protected void setConnectedSymptomGroupsService(ConnectedSymptomGroupsService service) {
		this.connectedSymptomGroupsService = service;
	}

}