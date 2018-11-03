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

import com.dotta.medidata.SynonymAllergies;

/**
 * Service object for domain model class {@link SynonymAllergies}.
 */
public interface SynonymAllergiesService {

    /**
     * Creates a new SynonymAllergies. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on SynonymAllergies if any.
     *
     * @param synonymAllergies Details of the SynonymAllergies to be created; value cannot be null.
     * @return The newly created SynonymAllergies.
     */
    SynonymAllergies create(@Valid SynonymAllergies synonymAllergies);


	/**
     * Returns SynonymAllergies by given id if exists.
     *
     * @param synonymallergiesId The id of the SynonymAllergies to get; value cannot be null.
     * @return SynonymAllergies associated with the given synonymallergiesId.
	 * @throws EntityNotFoundException If no SynonymAllergies is found.
     */
    SynonymAllergies getById(Integer synonymallergiesId);

    /**
     * Find and return the SynonymAllergies by given id if exists, returns null otherwise.
     *
     * @param synonymallergiesId The id of the SynonymAllergies to get; value cannot be null.
     * @return SynonymAllergies associated with the given synonymallergiesId.
     */
    SynonymAllergies findById(Integer synonymallergiesId);

	/**
     * Find and return the list of SynonymAllergies by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param synonymallergiesIds The id's of the SynonymAllergies to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return SynonymAllergies associated with the given synonymallergiesIds.
     */
    List<SynonymAllergies> findByMultipleIds(List<Integer> synonymallergiesIds, boolean orderedReturn);


    /**
     * Updates the details of an existing SynonymAllergies. It replaces all fields of the existing SynonymAllergies with the given synonymAllergies.
     *
     * This method overrides the input field values using Server side or database managed properties defined on SynonymAllergies if any.
     *
     * @param synonymAllergies The details of the SynonymAllergies to be updated; value cannot be null.
     * @return The updated SynonymAllergies.
     * @throws EntityNotFoundException if no SynonymAllergies is found with given input.
     */
    SynonymAllergies update(@Valid SynonymAllergies synonymAllergies);

    /**
     * Deletes an existing SynonymAllergies with the given id.
     *
     * @param synonymallergiesId The id of the SynonymAllergies to be deleted; value cannot be null.
     * @return The deleted SynonymAllergies.
     * @throws EntityNotFoundException if no SynonymAllergies found with the given id.
     */
    SynonymAllergies delete(Integer synonymallergiesId);

    /**
     * Deletes an existing SynonymAllergies with the given object.
     *
     * @param synonymAllergies The instance of the SynonymAllergies to be deleted; value cannot be null.
     */
    void delete(SynonymAllergies synonymAllergies);

    /**
     * Find all SynonymAllergies matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching SynonymAllergies.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<SynonymAllergies> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all SynonymAllergies matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching SynonymAllergies.
     *
     * @see Pageable
     * @see Page
     */
    Page<SynonymAllergies> findAll(String query, Pageable pageable);

    /**
     * Exports all SynonymAllergies matching the given input query to the given exportType format.
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
     * Exports all SynonymAllergies matching the given input query to the given exportType format.
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
     * Retrieve the count of the SynonymAllergies in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the SynonymAllergies.
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


}