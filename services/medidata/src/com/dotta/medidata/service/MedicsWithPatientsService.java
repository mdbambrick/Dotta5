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

import com.dotta.medidata.MedicsWithPatients;

/**
 * Service object for domain model class {@link MedicsWithPatients}.
 */
public interface MedicsWithPatientsService {

    /**
     * Creates a new MedicsWithPatients. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on MedicsWithPatients if any.
     *
     * @param medicsWithPatients Details of the MedicsWithPatients to be created; value cannot be null.
     * @return The newly created MedicsWithPatients.
     */
    MedicsWithPatients create(@Valid MedicsWithPatients medicsWithPatients);


	/**
     * Returns MedicsWithPatients by given id if exists.
     *
     * @param medicswithpatientsId The id of the MedicsWithPatients to get; value cannot be null.
     * @return MedicsWithPatients associated with the given medicswithpatientsId.
	 * @throws EntityNotFoundException If no MedicsWithPatients is found.
     */
    MedicsWithPatients getById(Integer medicswithpatientsId);

    /**
     * Find and return the MedicsWithPatients by given id if exists, returns null otherwise.
     *
     * @param medicswithpatientsId The id of the MedicsWithPatients to get; value cannot be null.
     * @return MedicsWithPatients associated with the given medicswithpatientsId.
     */
    MedicsWithPatients findById(Integer medicswithpatientsId);

	/**
     * Find and return the list of MedicsWithPatients by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param medicswithpatientsIds The id's of the MedicsWithPatients to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return MedicsWithPatients associated with the given medicswithpatientsIds.
     */
    List<MedicsWithPatients> findByMultipleIds(List<Integer> medicswithpatientsIds, boolean orderedReturn);


    /**
     * Updates the details of an existing MedicsWithPatients. It replaces all fields of the existing MedicsWithPatients with the given medicsWithPatients.
     *
     * This method overrides the input field values using Server side or database managed properties defined on MedicsWithPatients if any.
     *
     * @param medicsWithPatients The details of the MedicsWithPatients to be updated; value cannot be null.
     * @return The updated MedicsWithPatients.
     * @throws EntityNotFoundException if no MedicsWithPatients is found with given input.
     */
    MedicsWithPatients update(@Valid MedicsWithPatients medicsWithPatients);

    /**
     * Deletes an existing MedicsWithPatients with the given id.
     *
     * @param medicswithpatientsId The id of the MedicsWithPatients to be deleted; value cannot be null.
     * @return The deleted MedicsWithPatients.
     * @throws EntityNotFoundException if no MedicsWithPatients found with the given id.
     */
    MedicsWithPatients delete(Integer medicswithpatientsId);

    /**
     * Deletes an existing MedicsWithPatients with the given object.
     *
     * @param medicsWithPatients The instance of the MedicsWithPatients to be deleted; value cannot be null.
     */
    void delete(MedicsWithPatients medicsWithPatients);

    /**
     * Find all MedicsWithPatients matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching MedicsWithPatients.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<MedicsWithPatients> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all MedicsWithPatients matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching MedicsWithPatients.
     *
     * @see Pageable
     * @see Page
     */
    Page<MedicsWithPatients> findAll(String query, Pageable pageable);

    /**
     * Exports all MedicsWithPatients matching the given input query to the given exportType format.
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
     * Exports all MedicsWithPatients matching the given input query to the given exportType format.
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
     * Retrieve the count of the MedicsWithPatients in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the MedicsWithPatients.
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