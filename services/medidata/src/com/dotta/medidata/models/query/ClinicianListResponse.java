/*Copyright (c) 2018-2019 medidesign.co.uk All Rights Reserved.
 This software is the confidential and proprietary information of medidesign.co.uk You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with medidesign.co.uk*/
package com.dotta.medidata.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class ClinicianListResponse implements Serializable {


    @ColumnAlias("id")
    private Integer id;

    @ColumnAlias("username")
    private String username;

    @ColumnAlias("title")
    private String title;

    @ColumnAlias("first_name")
    private String firstName;

    @ColumnAlias("last_name")
    private String lastName;

    @ColumnAlias("email")
    private String email;

    @ColumnAlias("user_type")
    private Integer userType;

    @ColumnAlias("sharing_code")
    private Integer sharingCode;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUserType() {
        return this.userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getSharingCode() {
        return this.sharingCode;
    }

    public void setSharingCode(Integer sharingCode) {
        this.sharingCode = sharingCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClinicianListResponse)) return false;
        final ClinicianListResponse clinicianListResponse = (ClinicianListResponse) o;
        return Objects.equals(getId(), clinicianListResponse.getId()) &&
                Objects.equals(getUsername(), clinicianListResponse.getUsername()) &&
                Objects.equals(getTitle(), clinicianListResponse.getTitle()) &&
                Objects.equals(getFirstName(), clinicianListResponse.getFirstName()) &&
                Objects.equals(getLastName(), clinicianListResponse.getLastName()) &&
                Objects.equals(getEmail(), clinicianListResponse.getEmail()) &&
                Objects.equals(getUserType(), clinicianListResponse.getUserType()) &&
                Objects.equals(getSharingCode(), clinicianListResponse.getSharingCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getUsername(),
                getTitle(),
                getFirstName(),
                getLastName(),
                getEmail(),
                getUserType(),
                getSharingCode());
    }
}