/*Copyright (c) 2018-2019 medidesign.co.uk All Rights Reserved.
 This software is the confidential and proprietary information of medidesign.co.uk You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with medidesign.co.uk*/
package com.dotta.medidata;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

public class SurveyUniqueId implements Serializable {

    private Integer id;
    private Integer patientId;
    private Integer allergyId;
    private Integer symptomId;
    private Integer result;
    private Integer sessionId;
    private Integer dataSource;
    private Integer currentStatus;
    private Timestamp datetime;
    private BigDecimal ranking;
    private Integer colour;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Integer getSymptomId() {
        return this.symptomId;
    }

    public void setSymptomId(Integer symptomId) {
        this.symptomId = symptomId;
    }

    public Integer getResult() {
        return this.result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getDataSource() {
        return this.dataSource;
    }

    public void setDataSource(Integer dataSource) {
        this.dataSource = dataSource;
    }

    public Integer getCurrentStatus() {
        return this.currentStatus;
    }

    public void setCurrentStatus(Integer currentStatus) {
        this.currentStatus = currentStatus;
    }

    public Timestamp getDatetime() {
        return this.datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    public BigDecimal getRanking() {
        return this.ranking;
    }

    public void setRanking(BigDecimal ranking) {
        this.ranking = ranking;
    }

    public Integer getColour() {
        return this.colour;
    }

    public void setColour(Integer colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SurveyUnique)) return false;
        final SurveyUnique surveyUnique = (SurveyUnique) o;
        return Objects.equals(getId(), surveyUnique.getId()) &&
                Objects.equals(getPatientId(), surveyUnique.getPatientId()) &&
                Objects.equals(getAllergyId(), surveyUnique.getAllergyId()) &&
                Objects.equals(getSymptomId(), surveyUnique.getSymptomId()) &&
                Objects.equals(getResult(), surveyUnique.getResult()) &&
                Objects.equals(getSessionId(), surveyUnique.getSessionId()) &&
                Objects.equals(getDataSource(), surveyUnique.getDataSource()) &&
                Objects.equals(getCurrentStatus(), surveyUnique.getCurrentStatus()) &&
                Objects.equals(getDatetime(), surveyUnique.getDatetime()) &&
                Objects.equals(getRanking(), surveyUnique.getRanking()) &&
                Objects.equals(getColour(), surveyUnique.getColour());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getPatientId(),
                getAllergyId(),
                getSymptomId(),
                getResult(),
                getSessionId(),
                getDataSource(),
                getCurrentStatus(),
                getDatetime(),
                getRanking(),
                getColour());
    }
}