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
 * SessionIdWithUsers generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`session_id with users`")
@IdClass(SessionIdWithUsersId.class)
public class SessionIdWithUsers implements Serializable {

    private Integer sessionId = 0;
    private Integer userId;
    private Integer user;
    private Integer patientId;
    private Integer patient = 0;
    private String firstName;
    private String lastName;
    private Integer id = 0;
    private String username;
    private String title;
    private String firstNameCol;
    private String lastNameCol;
    private String password;
    private String email;
    private String salt;
    private Integer userType;
    private Integer active;

    @Id
    @Column(name = "`session_id`", nullable = false, scale = 0, precision = 10)
    public Integer getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    @Id
    @Column(name = "`user_id`", nullable = false, scale = 0, precision = 10)
    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "`user`", nullable = false, scale = 0, precision = 10)
    public Integer getUser() {
        return this.user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    @Id
    @Column(name = "`patient_id`", nullable = false, scale = 0, precision = 10)
    public Integer getPatientId() {
        return this.patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    @Id
    @Column(name = "`patient`", nullable = false, scale = 0, precision = 10)
    public Integer getPatient() {
        return this.patient;
    }

    public void setPatient(Integer patient) {
        this.patient = patient;
    }

    @Id
    @Column(name = "`firstName`", nullable = true, length = 65535)
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Id
    @Column(name = "`lastName`", nullable = true, length = 65535)
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

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
    public String getFirstNameCol() {
        return this.firstNameCol;
    }

    public void setFirstNameCol(String firstNameCol) {
        this.firstNameCol = firstNameCol;
    }

    @Id
    @Column(name = "`last_name`", nullable = false, length = 65535)
    public String getLastNameCol() {
        return this.lastNameCol;
    }

    public void setLastNameCol(String lastNameCol) {
        this.lastNameCol = lastNameCol;
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
    @Column(name = "`active`", nullable = true, scale = 0, precision = 10)
    public Integer getActive() {
        return this.active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SessionIdWithUsers)) return false;
        final SessionIdWithUsers sessionIdWithUsers = (SessionIdWithUsers) o;
        return Objects.equals(getSessionId(), sessionIdWithUsers.getSessionId()) &&
                Objects.equals(getUserId(), sessionIdWithUsers.getUserId()) &&
                Objects.equals(getUser(), sessionIdWithUsers.getUser()) &&
                Objects.equals(getPatientId(), sessionIdWithUsers.getPatientId()) &&
                Objects.equals(getPatient(), sessionIdWithUsers.getPatient()) &&
                Objects.equals(getFirstName(), sessionIdWithUsers.getFirstName()) &&
                Objects.equals(getLastName(), sessionIdWithUsers.getLastName()) &&
                Objects.equals(getId(), sessionIdWithUsers.getId()) &&
                Objects.equals(getUsername(), sessionIdWithUsers.getUsername()) &&
                Objects.equals(getTitle(), sessionIdWithUsers.getTitle()) &&
                Objects.equals(getFirstNameCol(), sessionIdWithUsers.getFirstNameCol()) &&
                Objects.equals(getLastNameCol(), sessionIdWithUsers.getLastNameCol()) &&
                Objects.equals(getPassword(), sessionIdWithUsers.getPassword()) &&
                Objects.equals(getEmail(), sessionIdWithUsers.getEmail()) &&
                Objects.equals(getSalt(), sessionIdWithUsers.getSalt()) &&
                Objects.equals(getUserType(), sessionIdWithUsers.getUserType()) &&
                Objects.equals(getActive(), sessionIdWithUsers.getActive());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSessionId(),
                getUserId(),
                getUser(),
                getPatientId(),
                getPatient(),
                getFirstName(),
                getLastName(),
                getId(),
                getUsername(),
                getTitle(),
                getFirstNameCol(),
                getLastNameCol(),
                getPassword(),
                getEmail(),
                getSalt(),
                getUserType(),
                getActive());
    }
}