/*Copyright (c) 2018-2019 medidesign.co.uk All Rights Reserved.
 This software is the confidential and proprietary information of medidesign.co.uk You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with medidesign.co.uk*/
package com.dotta.medidata;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * ProcessStages generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`process_stages`")
public class ProcessStages implements Serializable {

    private Integer id;
    private String stageTitle;
    private BigDecimal reliabilityRating;
    private List<Diagnoses> diagnoseses;

    @Id
    @Column(name = "`id`", nullable = false, scale = 0, precision = 10)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "`stage_title`", nullable = true, length = 65535)
    public String getStageTitle() {
        return this.stageTitle;
    }

    public void setStageTitle(String stageTitle) {
        this.stageTitle = stageTitle;
    }

    @Column(name = "`reliability_rating`", nullable = true, scale = 9, precision = 22)
    public BigDecimal getReliabilityRating() {
        return this.reliabilityRating;
    }

    public void setReliabilityRating(BigDecimal reliabilityRating) {
        this.reliabilityRating = reliabilityRating;
    }

    @JsonInclude(Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "processStages")
    @Cascade({CascadeType.SAVE_UPDATE})
    public List<Diagnoses> getDiagnoseses() {
        return this.diagnoseses;
    }

    public void setDiagnoseses(List<Diagnoses> diagnoseses) {
        this.diagnoseses = diagnoseses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcessStages)) return false;
        final ProcessStages processStages = (ProcessStages) o;
        return Objects.equals(getId(), processStages.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}