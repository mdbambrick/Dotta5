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

import com.dotta.medidata.QnGroup;
import com.dotta.medidata.service.QnGroupService;


/**
 * Controller object for domain model class QnGroup.
 * @see QnGroup
 */
@RestController("medidata.QnGroupController")
@Api(value = "QnGroupController", description = "Exposes APIs to work with QnGroup resource.")
@RequestMapping("/medidata/QnGroup")
public class QnGroupController {

    private static final Logger LOGGER = LoggerFactory.getLogger(QnGroupController.class);

    @Autowired
	@Qualifier("medidata.QnGroupService")
	private QnGroupService qnGroupService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new QnGroup instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public QnGroup createQnGroup(@RequestBody QnGroup qnGroup) {
		LOGGER.debug("Create QnGroup with information: {}" , qnGroup);

		qnGroup = qnGroupService.create(qnGroup);
		LOGGER.debug("Created QnGroup with information: {}" , qnGroup);

	    return qnGroup;
	}

    @ApiOperation(value = "Returns the QnGroup instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public QnGroup getQnGroup(@PathVariable("id") Integer id) {
        LOGGER.debug("Getting QnGroup with id: {}" , id);

        QnGroup foundQnGroup = qnGroupService.getById(id);
        LOGGER.debug("QnGroup details with id: {}" , foundQnGroup);

        return foundQnGroup;
    }

    @ApiOperation(value = "Updates the QnGroup instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public QnGroup editQnGroup(@PathVariable("id") Integer id, @RequestBody QnGroup qnGroup) {
        LOGGER.debug("Editing QnGroup with id: {}" , qnGroup.getId());

        qnGroup.setId(id);
        qnGroup = qnGroupService.update(qnGroup);
        LOGGER.debug("QnGroup details with id: {}" , qnGroup);

        return qnGroup;
    }

    @ApiOperation(value = "Deletes the QnGroup instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteQnGroup(@PathVariable("id") Integer id) {
        LOGGER.debug("Deleting QnGroup with id: {}" , id);

        QnGroup deletedQnGroup = qnGroupService.delete(id);

        return deletedQnGroup != null;
    }

    /**
     * @deprecated Use {@link #findQnGroups(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of QnGroup instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<QnGroup> searchQnGroupsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering QnGroups list by query filter:{}", (Object) queryFilters);
        return qnGroupService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of QnGroup instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<QnGroup> findQnGroups(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering QnGroups list by filter:", query);
        return qnGroupService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of QnGroup instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<QnGroup> filterQnGroups(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering QnGroups list by filter", query);
        return qnGroupService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportQnGroups(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return qnGroupService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportQnGroupsAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = QnGroup.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> qnGroupService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of QnGroup instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countQnGroups( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting QnGroups");
		return qnGroupService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getQnGroupAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return qnGroupService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service QnGroupService instance
	 */
	protected void setQnGroupService(QnGroupService service) {
		this.qnGroupService = service;
	}

}