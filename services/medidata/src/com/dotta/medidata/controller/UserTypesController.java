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

import com.dotta.medidata.UserTypes;
import com.dotta.medidata.Users;
import com.dotta.medidata.service.UserTypesService;


/**
 * Controller object for domain model class UserTypes.
 * @see UserTypes
 */
@RestController("medidata.UserTypesController")
@Api(value = "UserTypesController", description = "Exposes APIs to work with UserTypes resource.")
@RequestMapping("/medidata/UserTypes")
public class UserTypesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserTypesController.class);

    @Autowired
	@Qualifier("medidata.UserTypesService")
	private UserTypesService userTypesService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new UserTypes instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public UserTypes createUserTypes(@RequestBody UserTypes userTypes) {
		LOGGER.debug("Create UserTypes with information: {}" , userTypes);

		userTypes = userTypesService.create(userTypes);
		LOGGER.debug("Created UserTypes with information: {}" , userTypes);

	    return userTypes;
	}

    @ApiOperation(value = "Returns the UserTypes instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public UserTypes getUserTypes(@PathVariable("id") Integer id) {
        LOGGER.debug("Getting UserTypes with id: {}" , id);

        UserTypes foundUserTypes = userTypesService.getById(id);
        LOGGER.debug("UserTypes details with id: {}" , foundUserTypes);

        return foundUserTypes;
    }

    @ApiOperation(value = "Updates the UserTypes instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public UserTypes editUserTypes(@PathVariable("id") Integer id, @RequestBody UserTypes userTypes) {
        LOGGER.debug("Editing UserTypes with id: {}" , userTypes.getId());

        userTypes.setId(id);
        userTypes = userTypesService.update(userTypes);
        LOGGER.debug("UserTypes details with id: {}" , userTypes);

        return userTypes;
    }

    @ApiOperation(value = "Deletes the UserTypes instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteUserTypes(@PathVariable("id") Integer id) {
        LOGGER.debug("Deleting UserTypes with id: {}" , id);

        UserTypes deletedUserTypes = userTypesService.delete(id);

        return deletedUserTypes != null;
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the matching UserTypes with given unique key values.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public UserTypes getByUniqueKeyId(@PathVariable("id") int id) {
        LOGGER.debug("Getting UserTypes with uniques key UniqueKeyId");
        return userTypesService.getByUniqueKeyId(id);
    }

    /**
     * @deprecated Use {@link #findUserTypes(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of UserTypes instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<UserTypes> searchUserTypesByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering UserTypes list by query filter:{}", (Object) queryFilters);
        return userTypesService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of UserTypes instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<UserTypes> findUserTypes(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering UserTypes list by filter:", query);
        return userTypesService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of UserTypes instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<UserTypes> filterUserTypes(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering UserTypes list by filter", query);
        return userTypesService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportUserTypes(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return userTypesService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportUserTypesAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = UserTypes.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> userTypesService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of UserTypes instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countUserTypes( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting UserTypes");
		return userTypesService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getUserTypesAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return userTypesService.getAggregatedValues(aggregationInfo, pageable);
    }

    @RequestMapping(value="/{id:.+}/userses", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the userses instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Users> findAssociatedUserses(@PathVariable("id") Integer id, Pageable pageable) {

        LOGGER.debug("Fetching all associated userses");
        return userTypesService.findAssociatedUserses(id, pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service UserTypesService instance
	 */
	protected void setUserTypesService(UserTypesService service) {
		this.userTypesService = service;
	}

}