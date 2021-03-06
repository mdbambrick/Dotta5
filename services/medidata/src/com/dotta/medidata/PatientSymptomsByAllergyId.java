/*Copyright (c) 2018-2019 medidesign.co.uk All Rights Reserved.
 This software is the confidential and proprietary information of medidesign.co.uk You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with medidesign.co.uk*/
package com.dotta.medidata;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

public class PatientSymptomsByAllergyId implements Serializable {

    private Integer patientId;
    private Integer allergyId;
    private Integer ranking;
    private Integer colour;
    private String allergyName;
    private Integer allergyCategory;
    private String title;
    private Integer allergySet;
    private String setName;
    private Integer symptomId;
    private String symptom;
    private Integer result;
    private Timestamp datetime;
    private Integer sessionId;

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

    public Integer getRanking() {
        return this.ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public Integer getColour() {
        return this.colour;
    }

    public void setColour(Integer colour) {
        this.colour = colour;
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

    public Timestamp getDatetime() {
        return this.datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    public Integer getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PatientSymptomsByAllergy)) return false;
        final PatientSymptomsByAllergy patientSymptomsByAllergy = (PatientSymptomsByAllergy) o;
        return Objects.equals(getPatientId(), patientSymptomsByAllergy.getPatientId()) &&
                Objects.equals(getAllergyId(), patientSymptomsByAllergy.getAllergyId()) &&
                Objects.equals(getRanking(), patientSymptomsByAllergy.getRanking()) &&
                Objects.equals(getColour(), patientSymptomsByAllergy.getColour()) &&
                Objects.equals(getAllergyName(), patientSymptomsByAllergy.getAllergyName()) &&
                Objects.equals(getAllergyCategory(), patientSymptomsByAllergy.getAllergyCategory()) &&
                Objects.equals(getTitle(), patientSymptomsByAllergy.getTitle()) &&
                Objects.equals(getAllergySet(), patientSymptomsByAllergy.getAllergySet()) &&
                Objects.equals(getSetName(), patientSymptomsByAllergy.getSetName()) &&
                Objects.equals(getSymptomId(), patientSymptomsByAllergy.getSymptomId()) &&
                Objects.equals(getSymptom(), patientSymptomsByAllergy.getSymptom()) &&
                Objects.equals(getResult(), patientSymptomsByAllergy.getResult()) &&
                Objects.equals(getDatetime(), patientSymptomsByAllergy.getDatetime()) &&
                Objects.equals(getSessionId(), patientSymptomsByAllergy.getSessionId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPatientId(),
                getAllergyId(),
                getRanking(),
                getColour(),
                getAllergyName(),
                getAllergyCategory(),
                getTitle(),
                getAllergySet(),
                getSetName(),
                getSymptomId(),
                getSymptom(),
                getResult(),
                getDatetime(),
                getSessionId());
    }
}