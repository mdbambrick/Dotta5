/*Copyright (c) 2018-2019 medidesign.co.uk All Rights Reserved.
 This software is the confidential and proprietary information of medidesign.co.uk You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with medidesign.co.uk*/
package com.dotta.medidata.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class PatientSymptomSummaryResponse implements Serializable {


    @ColumnAlias("Set Name")
    private String setName;

    @ColumnAlias("Allergy Name")
    private String allergyName;

    @ColumnAlias("TOTAL")
    private Long total;

    public String getSetName() {
        return this.setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public String getAllergyName() {
        return this.allergyName;
    }

    public void setAllergyName(String allergyName) {
        this.allergyName = allergyName;
    }

    public Long getTotal() {
        return this.total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PatientSymptomSummaryResponse)) return false;
        final PatientSymptomSummaryResponse patientSymptomSummaryResponse = (PatientSymptomSummaryResponse) o;
        return Objects.equals(getSetName(), patientSymptomSummaryResponse.getSetName()) &&
                Objects.equals(getAllergyName(), patientSymptomSummaryResponse.getAllergyName()) &&
                Objects.equals(getTotal(), patientSymptomSummaryResponse.getTotal());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSetName(),
                getAllergyName(),
                getTotal());
    }
}