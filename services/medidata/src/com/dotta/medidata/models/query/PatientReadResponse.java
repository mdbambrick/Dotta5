/*Copyright (c) 2018-2019 medidesign.co.uk All Rights Reserved.
 This software is the confidential and proprietary information of medidesign.co.uk You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with medidesign.co.uk*/
package com.dotta.medidata.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class PatientReadResponse implements Serializable {


    @ColumnAlias("id")
    private Integer id;

    @ColumnAlias("first_name")
    private String firstName;

    @ColumnAlias("last_name")
    private String lastName;

    @ColumnAlias("title")
    private String title;

    @ColumnAlias("address1")
    private String address1;

    @ColumnAlias("address2")
    private String address2;

    @ColumnAlias("postcode")
    private String postcode;

    @ColumnAlias("address3")
    private String address3;

    @ColumnAlias("address4")
    private String address4;

    @ColumnAlias("health_number")
    private String healthNumber;

    @ColumnAlias("date_of_birth")
    private Date dateOfBirth;

    @ColumnAlias("sex")
    private String sex;

    @ColumnAlias("user_id")
    private Integer userId;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress1() {
        return this.address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return this.address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPostcode() {
        return this.postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getAddress3() {
        return this.address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getAddress4() {
        return this.address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    public String getHealthNumber() {
        return this.healthNumber;
    }

    public void setHealthNumber(String healthNumber) {
        this.healthNumber = healthNumber;
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PatientReadResponse)) return false;
        final PatientReadResponse patientReadResponse = (PatientReadResponse) o;
        return Objects.equals(getId(), patientReadResponse.getId()) &&
                Objects.equals(getFirstName(), patientReadResponse.getFirstName()) &&
                Objects.equals(getLastName(), patientReadResponse.getLastName()) &&
                Objects.equals(getTitle(), patientReadResponse.getTitle()) &&
                Objects.equals(getAddress1(), patientReadResponse.getAddress1()) &&
                Objects.equals(getAddress2(), patientReadResponse.getAddress2()) &&
                Objects.equals(getPostcode(), patientReadResponse.getPostcode()) &&
                Objects.equals(getAddress3(), patientReadResponse.getAddress3()) &&
                Objects.equals(getAddress4(), patientReadResponse.getAddress4()) &&
                Objects.equals(getHealthNumber(), patientReadResponse.getHealthNumber()) &&
                Objects.equals(getDateOfBirth(), patientReadResponse.getDateOfBirth()) &&
                Objects.equals(getSex(), patientReadResponse.getSex()) &&
                Objects.equals(getUserId(), patientReadResponse.getUserId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getFirstName(),
                getLastName(),
                getTitle(),
                getAddress1(),
                getAddress2(),
                getPostcode(),
                getAddress3(),
                getAddress4(),
                getHealthNumber(),
                getDateOfBirth(),
                getSex(),
                getUserId());
    }
}