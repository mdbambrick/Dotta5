/*Copyright (c) 2018-2019 medidesign.co.uk All Rights Reserved.
 This software is the confidential and proprietary information of medidesign.co.uk You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with medidesign.co.uk*/
package com.dotta.medidata.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.dotta.medidata.PatientSymptomsByAllergy;
import com.dotta.medidata.PatientSymptomsByAllergyId;

/**
 * Specifies methods used to obtain and modify PatientSymptomsByAllergy related information
 * which is stored in the database.
 */
@Repository("medidata.PatientSymptomsByAllergyDao")
public class PatientSymptomsByAllergyDao extends WMGenericDaoImpl<PatientSymptomsByAllergy, PatientSymptomsByAllergyId> {

    @Autowired
    @Qualifier("medidataTemplate")
    private HibernateTemplate template;


    @Override
    public HibernateTemplate getTemplate() {
        return this.template;
    }
}