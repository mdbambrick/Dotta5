/*Copyright (c) 2018-2019 medidesign.co.uk All Rights Reserved.
 This software is the confidential and proprietary information of medidesign.co.uk You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with medidesign.co.uk*/
package com.dotta.medidata;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ConnectedSymptomMultipliers generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`connected_symptom_multipliers`")
public class ConnectedSymptomMultipliers implements Serializable {

    private Integer id;
    private int groupNumber;
    private String groupName;
    private int positiveSymptoms;
    private BigDecimal multiplier;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`id`", nullable = false, scale = 0, precision = 10)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "`group_number`", nullable = false, scale = 0, precision = 10)
    public int getGroupNumber() {
        return this.groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Column(name = "`group_name`", nullable = true, length = 65535)
    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Column(name = "`positive_symptoms`", nullable = false, scale = 0, precision = 10)
    public int getPositiveSymptoms() {
        return this.positiveSymptoms;
    }

    public void setPositiveSymptoms(int positiveSymptoms) {
        this.positiveSymptoms = positiveSymptoms;
    }

    @Column(name = "`multiplier`", nullable = false, scale = 9, precision = 22)
    public BigDecimal getMultiplier() {
        return this.multiplier;
    }

    public void setMultiplier(BigDecimal multiplier) {
        this.multiplier = multiplier;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConnectedSymptomMultipliers)) return false;
        final ConnectedSymptomMultipliers connectedSymptomMultipliers = (ConnectedSymptomMultipliers) o;
        return Objects.equals(getId(), connectedSymptomMultipliers.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}