/*Copyright (c) 2018-2019 medidesign.co.uk All Rights Reserved.
 This software is the confidential and proprietary information of medidesign.co.uk You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with medidesign.co.uk*/
package com.dotta.medidata;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

public class CompoundsWithAllergensId implements Serializable {

    private Integer compoundId;
    private String compoundName;
    private Integer allergyId;
    private String allergyName;

    public Integer getCompoundId() {
        return this.compoundId;
    }

    public void setCompoundId(Integer compoundId) {
        this.compoundId = compoundId;
    }

    public String getCompoundName() {
        return this.compoundName;
    }

    public void setCompoundName(String compoundName) {
        this.compoundName = compoundName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompoundsWithAllergens)) return false;
        final CompoundsWithAllergens compoundsWithAllergens = (CompoundsWithAllergens) o;
        return Objects.equals(getCompoundId(), compoundsWithAllergens.getCompoundId()) &&
                Objects.equals(getCompoundName(), compoundsWithAllergens.getCompoundName()) &&
                Objects.equals(getAllergyId(), compoundsWithAllergens.getAllergyId()) &&
                Objects.equals(getAllergyName(), compoundsWithAllergens.getAllergyName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCompoundId(),
                getCompoundName(),
                getAllergyId(),
                getAllergyName());
    }
}