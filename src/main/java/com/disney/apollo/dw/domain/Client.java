package com.disney.apollo.dw.domain;

import java.sql.Timestamp;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Client {

	private Long organisationId;
	private Integer status;
	private Long agentOrganisationId;
	private Timestamp lastUpdateTs;
	private String clientIssuesContractFlag;
	private String reminderLetterFlag;
	private String provideOnAirFlag;
	private String acceptUsedMaterialsFlag = "0";
	private String fkeLicensorFlag = "0";
	private Date legalEntityReviewDate;
	private Short deliveryLeadDays;
	private Short acceptancePeriodDays;
	private String name;
	private String legalEntityName;
	private String callLetters;
	private String shippingAgentPrimary;
	private String shippingAgentSecondary;
	private String agentAccountPrimary;
	private String agentAccountSecondary;
	private Timestamp createdDateTs;
	private String dataProtectionFlag;
	private String organisationNotes;
	
	public Client( Long organisationId,
				 Integer status,
				 Long agentOrganisationId,
				 Timestamp lastUpdateTs,
				 String clientIssuesContractFlag,
				 String reminderLetterFlag,
				 String provideOnAirFlag,
				 Date legalEntityReviewDate,
				 Short deliveryLeadDays,
				 Short acceptancePeriodDays,
				 String name,
				 String legalEntityName) {
		this.organisationId = organisationId;
		this.status = status;
		this.agentOrganisationId = agentOrganisationId;
		this.lastUpdateTs = lastUpdateTs;
		this.clientIssuesContractFlag = clientIssuesContractFlag;
		this.reminderLetterFlag = reminderLetterFlag;
		this.provideOnAirFlag = provideOnAirFlag;
		this.legalEntityReviewDate = legalEntityReviewDate;
		this.deliveryLeadDays = deliveryLeadDays;
		this.acceptancePeriodDays = acceptancePeriodDays;
		this.name = name;
		this.legalEntityName = legalEntityName;

	}
	
    @JsonProperty
	public Long getOrganisationId() {
		return organisationId;
	}
    @JsonProperty
	public void setOrganisationId(Long organisationId) {
		this.organisationId = organisationId;
	}
    @JsonProperty
	public Integer getStatus() {
		return status;
	}
    @JsonProperty
	public void setStatus(Integer status) {
		this.status = status;
	}
    @JsonProperty
	public Long getAgentOrganisationId() {
		return agentOrganisationId;
	}
    @JsonProperty
	public void setAgentOrganisationId(Long agentOrganisationId) {
		this.agentOrganisationId = agentOrganisationId;
	}
    @JsonProperty
	public Timestamp getLastUpdateTs() {
		return lastUpdateTs;
	}
    @JsonProperty
	public void setLastUpdateTs(Timestamp lastUpdateTs) {
		this.lastUpdateTs = lastUpdateTs;
	}
    @JsonProperty
	public String getClientIssuesContractFlag() {
		return clientIssuesContractFlag;
	}
    @JsonProperty
	public void setClientIssuesContractFlag(String clientIssuesContractFlag) {
		this.clientIssuesContractFlag = clientIssuesContractFlag;
	}
    @JsonProperty
	public String getReminderLetterFlag() {
		return reminderLetterFlag;
	}
    @JsonProperty
	public void setReminderLetterFlag(String reminderLetterFlag) {
		this.reminderLetterFlag = reminderLetterFlag;
	}
    @JsonProperty
	public String getProvideOnAirFlag() {
		return provideOnAirFlag;
	}
    @JsonProperty
	public void setProvideOnAirFlag(String provideOnAirFlag) {
		this.provideOnAirFlag = provideOnAirFlag;
	}
    @JsonProperty
	public String getAcceptUsedMaterialsFlag() {
		return acceptUsedMaterialsFlag;
	}
    @JsonProperty
	public void setAcceptUsedMaterialsFlag(String acceptUsedMaterialsFlag) {
		this.acceptUsedMaterialsFlag = acceptUsedMaterialsFlag;
	}
    @JsonProperty
	public String getFkeLicensorFlag() {
		return fkeLicensorFlag;
	}
    @JsonProperty
	public void setFkeLicensorFlag(String fkeLicensorFlag) {
		this.fkeLicensorFlag = fkeLicensorFlag;
	}
    @JsonProperty
	public Date getLegalEntityReviewDate() {
		return legalEntityReviewDate;
	}
    @JsonProperty
	public void setLegalEntityReviewDate(Date legalEntityReviewDate) {
		this.legalEntityReviewDate = legalEntityReviewDate;
	}
    @JsonProperty
	public Short getDeliveryLeadDays() {
		return deliveryLeadDays;
	}
    @JsonProperty
	public void setDeliveryLeadDays(Short deliveryLeadDays) {
		this.deliveryLeadDays = deliveryLeadDays;
	}
    @JsonProperty
	public Short getAcceptancePeriodDays() {
		return acceptancePeriodDays;
	}
    @JsonProperty
	public void setAcceptancePeriodDays(Short acceptancePeriodDays) {
		this.acceptancePeriodDays = acceptancePeriodDays;
	}
    @JsonProperty
	public String getName() {
		return name;
	}
    @JsonProperty
	public void setName(String name) {
		this.name = name;
	}
    @JsonProperty
	public String getLegalEntityName() {
		return legalEntityName;
	}
    @JsonProperty
	public void setLegalEntityName(String legalEntityName) {
		this.legalEntityName = legalEntityName;
	}
    @JsonProperty
	public String getCallLetters() {
		return callLetters;
	}
    @JsonProperty
	public void setCallLetters(String callLetters) {
		this.callLetters = callLetters;
	}
    @JsonProperty
	public String getShippingAgentPrimary() {
		return shippingAgentPrimary;
	}
    @JsonProperty
	public void setShippingAgentPrimary(String shippingAgentPrimary) {
		this.shippingAgentPrimary = shippingAgentPrimary;
	}
    @JsonProperty
	public String getShippingAgentSecondary() {
		return shippingAgentSecondary;
	}
    @JsonProperty
	public void setShippingAgentSecondary(String shippingAgentSecondary) {
		this.shippingAgentSecondary = shippingAgentSecondary;
	}
    @JsonProperty
	public String getAgentAccountPrimary() {
		return agentAccountPrimary;
	}
    @JsonProperty
	public void setAgentAccountPrimary(String agentAccountPrimary) {
		this.agentAccountPrimary = agentAccountPrimary;
	}
    @JsonProperty
	public String getAgentAccountSecondary() {
		return agentAccountSecondary;
	}
    @JsonProperty
	public void setAgentAccountSecondary(String agentAccountSecondary) {
		this.agentAccountSecondary = agentAccountSecondary;
	}
    @JsonProperty
	public Timestamp getCreatedDateTs() {
		return createdDateTs;
	}
    @JsonProperty
	public void setCreatedDateTs(Timestamp createdDateTs) {
		this.createdDateTs = createdDateTs;
	}
    @JsonProperty
	public String getDataProtectionFlag() {
		return dataProtectionFlag;
	}
    @JsonProperty
	public void setDataProtectionFlag(String dataProtectionFlag) {
		this.dataProtectionFlag = dataProtectionFlag;
	}
    @JsonProperty
	public String getOrganisationNotes() {
		return organisationNotes;
	}
    @JsonProperty
	public void setOrganisationNotes(String organisationNotes) {
		this.organisationNotes = organisationNotes;
	}

	
	
	
}
