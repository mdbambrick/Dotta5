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
import javax.persistence.Table;

/**
 * BackgroundElements generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`background_elements`")
public class BackgroundElements implements Serializable {

    private Integer id;
    private String backgroundElement;

    @Id
    @Column(name = "`id`", nullable = false, scale = 0, precision = 10)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "`background_element`", nullable = false, length = 65535)
    public String getBackgroundElement() {
        return this.backgroundElement;
    }

    public void setBackgroundElement(String backgroundElement) {
        this.backgroundElement = backgroundElement;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BackgroundElements)) return false;
        final BackgroundElements backgroundElements = (BackgroundElements) o;
        return Objects.equals(getId(), backgroundElements.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}