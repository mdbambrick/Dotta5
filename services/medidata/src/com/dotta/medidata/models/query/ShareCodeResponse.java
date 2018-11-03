/*Copyright (c) 2018-2019 medidesign.co.uk All Rights Reserved.
 This software is the confidential and proprietary information of medidesign.co.uk You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with medidesign.co.uk*/
package com.dotta.medidata.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class ShareCodeResponse implements Serializable {


    @ColumnAlias("sharing_code")
    private Integer sharingCode;

    public Integer getSharingCode() {
        return this.sharingCode;
    }

    public void setSharingCode(Integer sharingCode) {
        this.sharingCode = sharingCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShareCodeResponse)) return false;
        final ShareCodeResponse shareCodeResponse = (ShareCodeResponse) o;
        return Objects.equals(getSharingCode(), shareCodeResponse.getSharingCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSharingCode());
    }
}