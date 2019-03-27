/*Copyright (c) 2018-2019 medidesign.co.uk All Rights Reserved.
 This software is the confidential and proprietary information of medidesign.co.uk You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with medidesign.co.uk*/
package com.dotta.medidata.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.dotta.medidata.Sessions;
import com.dotta.medidata.SurveyAndTestData;

/**
 * Service object for domain model class {@link Sessions}.
 */
public interface SessionsService {

    /**
     * Creates a new Sessions. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Sessions if any.
     *
     * @param sessions Details of the Sessions to be created; value cannot be null.
     * @return The newly created Sessions.
     */
    Sessions create(@Valid Sessions sessions);


	/**
     * Returns Sessions by given id if exists.
     *
     * @param sessionsId The id of the Sessions to get; value cannot be null.
     * @return Sessions associated with the given sessionsId.
	 * @throws EntityNotFoundException If no Sessions is found.
     */
    Sessions getById(Integer sessionsId);

    /**
     * Find and return the Sessions by given id if exists, returns null otherwise.
     *
     * @param sessionsId The id of the Sessions to get; value cannot be null.
     * @return Sessions associated with the given sessionsId.
     */
    Sessions findById(Integer sessionsId);

	/**
     * Find and return the list of Sessions by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param sessionsIds The id's of the Sessions to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return Sessions associated with the given sessionsIds.
     */
    List<Sessions> findByMultipleIds(List<Integer> sessionsIds, boolean orderedReturn);

    /**
     * Find and return the Sessions for given id  if exists.
     *
     * @param id value of id; value cannot be null.
     * @return Sessions associated with the given inputs.
     * @throws EntityNotFoundException if no matching Sessions found.
     */
    Sessions getByUniqueKeyId(int id);

    /**
     * Updates the details of an existing Sessions. It replaces all fields of the existing Sessions with the given sessions.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Sessions if any.
     *
     * @param sessions The details of the Sessions to be updated; value cannot be null.
     * @return The updated Sessions.
     * @throws EntityNotFoundException if no Sessions is found with given input.
     */
    Sessions update(@Valid Sessions sessions);

    /**
     * Deletes an existing Sessions with the given id.
     *
     * @param sessionsId The id of the Sessions to be deleted; value cannot be null.
     * @return The deleted Sessions.
     * @throws EntityNotFoundException if no Sessions found with the given id.
     */
    Sessions delete(Integer sessionsId);

    /**
     * Deletes an existing Sessions with the given object.
     *
     * @param sessions The instance of the Sessions to be deleted; value cannot be null.
     */
    void delete(Sessions sessions);

    /**
     * Find all Sessions matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Sessions.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<Sessions> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all Sessions matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Sessions.
     *
     * @see Pageable
     * @see Page
     */
    Page<Sessions> findAll(String query, Pageable pageable);

    /**
     * Exports all Sessions matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
     */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

    /**
     * Exports all Sessions matching the given input query to the given exportType format.
     *
     * @param options The export options provided by the user; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @param outputStream The output stream of the file for the exported data to be written to.
     *
     * @see DataExportOptions
     * @see Pageable
     * @see OutputStream
     */
    void export(DataExportOptions options, Pageable pageable, OutputStream outputStream);

    /**
     * Retrieve the count of the Sessions in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the Sessions.
     */
    long count(String query);

    /**
     * Retrieve aggregated values with matching aggregation info.
     *
     * @param aggregationInfo info related to aggregations.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return Paginated data with included fields.
     *
     * @see AggregationInfo
     * @see Pageable
     * @see Page
	 */
    Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable);

    /*
     * Returns the associated surveyAndTestDatas for given Sessions id.
     *
     * @param id value of id; value cannot be null
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of associated SurveyAndTestData instances.
     *
     * @see Pageable
     * @see Page
     */
    Page<SurveyAndTestData> findAssociatedSurveyAndTestDatas(Integer id, Pageable pageable);

}