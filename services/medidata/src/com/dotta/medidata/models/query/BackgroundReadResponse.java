/*Copyright (c) 2018-2019 medidesign.co.uk All Rights Reserved.
 This software is the confidential and proprietary information of medidesign.co.uk You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with medidesign.co.uk*/
package com.dotta.medidata.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class BackgroundReadResponse implements Serializable {


    @ColumnAlias("id")
    private Integer id;

    @ColumnAlias("patient_id")
    private Integer patientId;

    @ColumnAlias("session_id")
    private Integer sessionId;

    @ColumnAlias("terms_accepted")
    private String termsAccepted;

    @ColumnAlias("prior_allergy_treatment")
    private String priorAllergyTreatment;

    @ColumnAlias("ethnicity")
    private String ethnicity;

    @ColumnAlias("early_urban_rural")
    private String earlyUrbanRural;

    @ColumnAlias("early_pets_livestock")
    private String earlyPetsLivestock;

    @ColumnAlias("older_siblings")
    private String olderSiblings;

    @ColumnAlias("family_ingestion_allergy")
    private String familyIngestionAllergy;

    @ColumnAlias("family_aero_allergy")
    private String familyAeroAllergy;

    @ColumnAlias("family_contact_allergy")
    private String familyContactAllergy;

    @ColumnAlias("family_eczema")
    private String familyEczema;

    @ColumnAlias("family_celiac")
    private String familyCeliac;

    @ColumnAlias("family_asthma")
    private String familyAsthma;

    @ColumnAlias("ingestion_allergy")
    private String ingestionAllergy;

    @ColumnAlias("aero_allergy")
    private String aeroAllergy;

    @ColumnAlias("contact_allergy")
    private String contactAllergy;

    @ColumnAlias("eczema")
    private String eczema;

    @ColumnAlias("celiac")
    private String celiac;

    @ColumnAlias("asthma")
    private String asthma;

    @ColumnAlias("breastfed")
    private String breastfed;

    @ColumnAlias("weaned")
    private String weaned;

    @ColumnAlias("cesarian")
    private String cesarian;

    @ColumnAlias("weight")
    private BigDecimal weight;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPatientId() {
        return this.patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public String getTermsAccepted() {
        return this.termsAccepted;
    }

    public void setTermsAccepted(String termsAccepted) {
        this.termsAccepted = termsAccepted;
    }

    public String getPriorAllergyTreatment() {
        return this.priorAllergyTreatment;
    }

    public void setPriorAllergyTreatment(String priorAllergyTreatment) {
        this.priorAllergyTreatment = priorAllergyTreatment;
    }

    public String getEthnicity() {
        return this.ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getEarlyUrbanRural() {
        return this.earlyUrbanRural;
    }

    public void setEarlyUrbanRural(String earlyUrbanRural) {
        this.earlyUrbanRural = earlyUrbanRural;
    }

    public String getEarlyPetsLivestock() {
        return this.earlyPetsLivestock;
    }

    public void setEarlyPetsLivestock(String earlyPetsLivestock) {
        this.earlyPetsLivestock = earlyPetsLivestock;
    }

    public String getOlderSiblings() {
        return this.olderSiblings;
    }

    public void setOlderSiblings(String olderSiblings) {
        this.olderSiblings = olderSiblings;
    }

    public String getFamilyIngestionAllergy() {
        return this.familyIngestionAllergy;
    }

    public void setFamilyIngestionAllergy(String familyIngestionAllergy) {
        this.familyIngestionAllergy = familyIngestionAllergy;
    }

    public String getFamilyAeroAllergy() {
        return this.familyAeroAllergy;
    }

    public void setFamilyAeroAllergy(String familyAeroAllergy) {
        this.familyAeroAllergy = familyAeroAllergy;
    }

    public String getFamilyContactAllergy() {
        return this.familyContactAllergy;
    }

    public void setFamilyContactAllergy(String familyContactAllergy) {
        this.familyContactAllergy = familyContactAllergy;
    }

    public String getFamilyEczema() {
        return this.familyEczema;
    }

    public void setFamilyEczema(String familyEczema) {
        this.familyEczema = familyEczema;
    }

    public String getFamilyCeliac() {
        return this.familyCeliac;
    }

    public void setFamilyCeliac(String familyCeliac) {
        this.familyCeliac = familyCeliac;
    }

    public String getFamilyAsthma() {
        return this.familyAsthma;
    }

    public void setFamilyAsthma(String familyAsthma) {
        this.familyAsthma = familyAsthma;
    }

    public String getIngestionAllergy() {
        return this.ingestionAllergy;
    }

    public void setIngestionAllergy(String ingestionAllergy) {
        this.ingestionAllergy = ingestionAllergy;
    }

    public String getAeroAllergy() {
        return this.aeroAllergy;
    }

    public void setAeroAllergy(String aeroAllergy) {
        this.aeroAllergy = aeroAllergy;
    }

    public String getContactAllergy() {
        return this.contactAllergy;
    }

    public void setContactAllergy(String contactAllergy) {
        this.contactAllergy = contactAllergy;
    }

    public String getEczema() {
        return this.eczema;
    }

    public void setEczema(String eczema) {
        this.eczema = eczema;
    }

    public String getCeliac() {
        return this.celiac;
    }

    public void setCeliac(String celiac) {
        this.celiac = celiac;
    }

    public String getAsthma() {
        return this.asthma;
    }

    public void setAsthma(String asthma) {
        this.asthma = asthma;
    }

    public String getBreastfed() {
        return this.breastfed;
    }

    public void setBreastfed(String breastfed) {
        this.breastfed = breastfed;
    }

    public String getWeaned() {
        return this.weaned;
    }

    public void setWeaned(String weaned) {
        this.weaned = weaned;
    }

    public String getCesarian() {
        return this.cesarian;
    }

    public void setCesarian(String cesarian) {
        this.cesarian = cesarian;
    }

    public BigDecimal getWeight() {
        return this.weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BackgroundReadResponse)) return false;
        final BackgroundReadResponse backgroundReadResponse = (BackgroundReadResponse) o;
        return Objects.equals(getId(), backgroundReadResponse.getId()) &&
                Objects.equals(getPatientId(), backgroundReadResponse.getPatientId()) &&
                Objects.equals(getSessionId(), backgroundReadResponse.getSessionId()) &&
                Objects.equals(getTermsAccepted(), backgroundReadResponse.getTermsAccepted()) &&
                Objects.equals(getPriorAllergyTreatment(), backgroundReadResponse.getPriorAllergyTreatment()) &&
                Objects.equals(getEthnicity(), backgroundReadResponse.getEthnicity()) &&
                Objects.equals(getEarlyUrbanRural(), backgroundReadResponse.getEarlyUrbanRural()) &&
                Objects.equals(getEarlyPetsLivestock(), backgroundReadResponse.getEarlyPetsLivestock()) &&
                Objects.equals(getOlderSiblings(), backgroundReadResponse.getOlderSiblings()) &&
                Objects.equals(getFamilyIngestionAllergy(), backgroundReadResponse.getFamilyIngestionAllergy()) &&
                Objects.equals(getFamilyAeroAllergy(), backgroundReadResponse.getFamilyAeroAllergy()) &&
                Objects.equals(getFamilyContactAllergy(), backgroundReadResponse.getFamilyContactAllergy()) &&
                Objects.equals(getFamilyEczema(), backgroundReadResponse.getFamilyEczema()) &&
                Objects.equals(getFamilyCeliac(), backgroundReadResponse.getFamilyCeliac()) &&
                Objects.equals(getFamilyAsthma(), backgroundReadResponse.getFamilyAsthma()) &&
                Objects.equals(getIngestionAllergy(), backgroundReadResponse.getIngestionAllergy()) &&
                Objects.equals(getAeroAllergy(), backgroundReadResponse.getAeroAllergy()) &&
                Objects.equals(getContactAllergy(), backgroundReadResponse.getContactAllergy()) &&
                Objects.equals(getEczema(), backgroundReadResponse.getEczema()) &&
                Objects.equals(getCeliac(), backgroundReadResponse.getCeliac()) &&
                Objects.equals(getAsthma(), backgroundReadResponse.getAsthma()) &&
                Objects.equals(getBreastfed(), backgroundReadResponse.getBreastfed()) &&
                Objects.equals(getWeaned(), backgroundReadResponse.getWeaned()) &&
                Objects.equals(getCesarian(), backgroundReadResponse.getCesarian()) &&
                Objects.equals(getWeight(), backgroundReadResponse.getWeight());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getPatientId(),
                getSessionId(),
                getTermsAccepted(),
                getPriorAllergyTreatment(),
                getEthnicity(),
                getEarlyUrbanRural(),
                getEarlyPetsLivestock(),
                getOlderSiblings(),
                getFamilyIngestionAllergy(),
                getFamilyAeroAllergy(),
                getFamilyContactAllergy(),
                getFamilyEczema(),
                getFamilyCeliac(),
                getFamilyAsthma(),
                getIngestionAllergy(),
                getAeroAllergy(),
                getContactAllergy(),
                getEczema(),
                getCeliac(),
                getAsthma(),
                getBreastfed(),
                getWeaned(),
                getCesarian(),
                getWeight());
    }
}