/*Copyright (c) 2018-2019 medidesign.co.uk All Rights Reserved.
 This software is the confidential and proprietary information of medidesign.co.uk You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with medidesign.co.uk*/
package com.dotta.medidata.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class PatientMedicsResponse implements Serializable {


    @ColumnAlias("patient_id")
    private Integer patientId;

    @ColumnAlias("user_id")
    private Integer userId;

    @ColumnAlias("title")
    private String title;

    @ColumnAlias("first_name")
    private String firstName;

    @ColumnAlias("last_name")
    private String lastName;

    public Integer getPatientId() {
        return this.patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PatientMedicsResponse)) return false;
        final PatientMedicsResponse patientMedicsResponse = (PatientMedicsResponse) o;
        return Objects.equals(getPatientId(), patientMedicsResponse.getPatientId()) &&
                Objects.equals(getUserId(), patientMedicsResponse.getUserId()) &&
                Objects.equals(getTitle(), patientMedicsResponse.getTitle()) &&
                Objects.equals(getFirstName(), patientMedicsResponse.getFirstName()) &&
                Objects.equals(getLastName(), patientMedicsResponse.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPatientId(),
                getUserId(),
                getTitle(),
                getFirstName(),
                getLastName());
    }
}