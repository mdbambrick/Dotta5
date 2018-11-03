/*Copyright (c) 2018-2019 medidesign.co.uk All Rights Reserved.
 This software is the confidential and proprietary information of medidesign.co.uk You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with medidesign.co.uk*/
package com.dotta.medidata;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MedicsWithPatients generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`medics with patients`")
public class MedicsWithPatients implements Serializable {

    private Integer userPatientId = 0;
    private int userId;
    private int patientId;
    private String relationship;
    private String title;
    private String firstName;
    private String lastName;
    private int userType;
    private String clinicianTitle;
    private String clinicianFirstName;
    private String clinicianLastName;
    private String address1;
    private String address2;
    private String address3;
    private String address4;
    private String postcode;
    private Date dateOfBirth;
    private String healthNumber;

    @Id
    @Column(name = "`user_patient_id`", nullable = false, scale = 0, precision = 10)
    public Integer getUserPatientId() {
        return this.userPatientId;
    }

    public void setUserPatientId(Integer userPatientId) {
        this.userPatientId = userPatientId;
    }

    @Column(name = "`user_id`", nullable = false, scale = 0, precision = 10)
    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "`patient_id`", nullable = false, scale = 0, precision = 10)
    public int getPatientId() {
        return this.patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    @Column(name = "`relationship`", nullable = true, length = 65535)
    public String getRelationship() {
        return this.relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    @Column(name = "`title`", nullable = true, length = 65535)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "`first_name`", nullable = true, length = 65535)
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "`last_name`", nullable = true, length = 65535)
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "`user_type`", nullable = false, scale = 0, precision = 10)
    public int getUserType() {
        return this.userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    @Column(name = "`clinician_title`", nullable = true, length = 65535)
    public String getClinicianTitle() {
        return this.clinicianTitle;
    }

    public void setClinicianTitle(String clinicianTitle) {
        this.clinicianTitle = clinicianTitle;
    }

    @Column(name = "`clinician_first_name`", nullable = false, length = 65535)
    public String getClinicianFirstName() {
        return this.clinicianFirstName;
    }

    public void setClinicianFirstName(String clinicianFirstName) {
        this.clinicianFirstName = clinicianFirstName;
    }

    @Column(name = "`clinician_last_name`", nullable = false, length = 65535)
    public String getClinicianLastName() {
        return this.clinicianLastName;
    }

    public void setClinicianLastName(String clinicianLastName) {
        this.clinicianLastName = clinicianLastName;
    }

    @Column(name = "`address1`", nullable = true, length = 65535)
    public String getAddress1() {
        return this.address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @Column(name = "`address2`", nullable = true, length = 65535)
    public String getAddress2() {
        return this.address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @Column(name = "`address3`", nullable = true, length = 65535)
    public String getAddress3() {
        return this.address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    @Column(name = "`address4`", nullable = true, length = 65535)
    public String getAddress4() {
        return this.address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    @Column(name = "`postcode`", nullable = true, length = 65535)
    public String getPostcode() {
        return this.postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Column(name = "`date_of_birth`", nullable = true)
    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Column(name = "`health_number`", nullable = true, length = 65535)
    public String getHealthNumber() {
        return this.healthNumber;
    }

    public void setHealthNumber(String healthNumber) {
        this.healthNumber = healthNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MedicsWithPatients)) return false;
        final MedicsWithPatients medicsWithPatients = (MedicsWithPatients) o;
        return Objects.equals(getUserPatientId(), medicsWithPatients.getUserPatientId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserPatientId());
    }
}