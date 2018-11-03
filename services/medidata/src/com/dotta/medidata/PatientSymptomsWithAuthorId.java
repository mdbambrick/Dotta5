/*Copyright (c) 2018-2019 medidesign.co.uk All Rights Reserved.
 This software is the confidential and proprietary information of medidesign.co.uk You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with medidesign.co.uk*/
package com.dotta.medidata;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

public class PatientSymptomsWithAuthorId implements Serializable {

    private Integer patientId;
    private Integer allergyId;
    private String allergyName;
    private Integer allergyCategory;
    private String title;
    private Integer allergySet;
    private String setName;
    private Integer symptomId;
    private String symptom;
    private Integer result;
    private Timestamp timestamp;
    private Integer sessionId;
    private Integer sessionUser;
    private Integer authorId;
    private String authorTitle;
    private String authorFirstName;
    private String authorLastName;
    private String role;

    public Integer getPatientId() {
        return this.patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getAllergyId() {
        return this.allergyId;
    }

    public void setAllergyId(Integer allergyId) {
        this.allergyId = allergyId;
    }

    public String getAllergyName() {
        return this.allergyName;
    }

    public void setAllergyName(String allergyName) {
        this.allergyName = allergyName;
    }

    public Integer getAllergyCategory() {
        return this.allergyCategory;
    }

    public void setAllergyCategory(Integer allergyCategory) {
        this.allergyCategory = allergyCategory;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAllergySet() {
        return this.allergySet;
    }

    public void setAllergySet(Integer allergySet) {
        this.allergySet = allergySet;
    }

    public String getSetName() {
        return this.setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public Integer getSymptomId() {
        return this.symptomId;
    }

    public void setSymptomId(Integer symptomId) {
        this.symptomId = symptomId;
    }

    public String getSymptom() {
        return this.symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public Integer getResult() {
        return this.result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Timestamp getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getSessionUser() {
        return this.sessionUser;
    }

    public void setSessionUser(Integer sessionUser) {
        this.sessionUser = sessionUser;
    }

    public Integer getAuthorId() {
        return this.authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getAuthorTitle() {
        return this.authorTitle;
    }

    public void setAuthorTitle(String authorTitle) {
        this.authorTitle = authorTitle;
    }

    public String getAuthorFirstName() {
        return this.authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return this.authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PatientSymptomsWithAuthor)) return false;
        final PatientSymptomsWithAuthor patientSymptomsWithAuthor = (PatientSymptomsWithAuthor) o;
        return Objects.equals(getPatientId(), patientSymptomsWithAuthor.getPatientId()) &&
                Objects.equals(getAllergyId(), patientSymptomsWithAuthor.getAllergyId()) &&
                Objects.equals(getAllergyName(), patientSymptomsWithAuthor.getAllergyName()) &&
                Objects.equals(getAllergyCategory(), patientSymptomsWithAuthor.getAllergyCategory()) &&
                Objects.equals(getTitle(), patientSymptomsWithAuthor.getTitle()) &&
                Objects.equals(getAllergySet(), patientSymptomsWithAuthor.getAllergySet()) &&
                Objects.equals(getSetName(), patientSymptomsWithAuthor.getSetName()) &&
                Objects.equals(getSymptomId(), patientSymptomsWithAuthor.getSymptomId()) &&
                Objects.equals(getSymptom(), patientSymptomsWithAuthor.getSymptom()) &&
                Objects.equals(getResult(), patientSymptomsWithAuthor.getResult()) &&
                Objects.equals(getTimestamp(), patientSymptomsWithAuthor.getTimestamp()) &&
                Objects.equals(getSessionId(), patientSymptomsWithAuthor.getSessionId()) &&
                Objects.equals(getSessionUser(), patientSymptomsWithAuthor.getSessionUser()) &&
                Objects.equals(getAuthorId(), patientSymptomsWithAuthor.getAuthorId()) &&
                Objects.equals(getAuthorTitle(), patientSymptomsWithAuthor.getAuthorTitle()) &&
                Objects.equals(getAuthorFirstName(), patientSymptomsWithAuthor.getAuthorFirstName()) &&
                Objects.equals(getAuthorLastName(), patientSymptomsWithAuthor.getAuthorLastName()) &&
                Objects.equals(getRole(), patientSymptomsWithAuthor.getRole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPatientId(),
                getAllergyId(),
                getAllergyName(),
                getAllergyCategory(),
                getTitle(),
                getAllergySet(),
                getSetName(),
                getSymptomId(),
                getSymptom(),
                getResult(),
                getTimestamp(),
                getSessionId(),
                getSessionUser(),
                getAuthorId(),
                getAuthorTitle(),
                getAuthorFirstName(),
                getAuthorLastName(),
                getRole());
    }
}