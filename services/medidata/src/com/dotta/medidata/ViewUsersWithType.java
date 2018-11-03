/*Copyright (c) 2018-2019 medidesign.co.uk All Rights Reserved.
 This software is the confidential and proprietary information of medidesign.co.uk You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with medidesign.co.uk*/
package com.dotta.medidata;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * ViewUsersWithType generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`view_users_with_type`")
@IdClass(ViewUsersWithTypeId.class)
public class ViewUsersWithType implements Serializable {

    private Integer id = 0;
    private String username;
    private String title;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String salt;
    private Integer userType;
    private String role;

    @Id
    @Column(name = "`id`", nullable = false, scale = 0, precision = 10)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    @Column(name = "`username`", nullable = false, length = 45)
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Id
    @Column(name = "`title`", nullable = true, length = 65535)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Id
    @Column(name = "`first_name`", nullable = false, length = 65535)
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Id
    @Column(name = "`last_name`", nullable = false, length = 65535)
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Id
    @Column(name = "`password`", nullable = false, length = 2147483647)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Id
    @Column(name = "`email`", nullable = false, length = 45)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Id
    @Column(name = "`salt`", nullable = true, length = 2147483647)
    public String getSalt() {
        return this.salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Id
    @Column(name = "`user_type`", nullable = false, scale = 0, precision = 10)
    public Integer getUserType() {
        return this.userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    @Id
    @Column(name = "`role`", nullable = false, length = 65535)
    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ViewUsersWithType)) return false;
        final ViewUsersWithType viewUsersWithType = (ViewUsersWithType) o;
        return Objects.equals(getId(), viewUsersWithType.getId()) &&
                Objects.equals(getUsername(), viewUsersWithType.getUsername()) &&
                Objects.equals(getTitle(), viewUsersWithType.getTitle()) &&
                Objects.equals(getFirstName(), viewUsersWithType.getFirstName()) &&
                Objects.equals(getLastName(), viewUsersWithType.getLastName()) &&
                Objects.equals(getPassword(), viewUsersWithType.getPassword()) &&
                Objects.equals(getEmail(), viewUsersWithType.getEmail()) &&
                Objects.equals(getSalt(), viewUsersWithType.getSalt()) &&
                Objects.equals(getUserType(), viewUsersWithType.getUserType()) &&
                Objects.equals(getRole(), viewUsersWithType.getRole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getUsername(),
                getTitle(),
                getFirstName(),
                getLastName(),
                getPassword(),
                getEmail(),
                getSalt(),
                getUserType(),
                getRole());
    }
}