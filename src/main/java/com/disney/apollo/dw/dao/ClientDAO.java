package com.disney.apollo.dw.dao;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import com.disney.apollo.dw.domain.Client;


public interface ClientDAO {
	
	@SqlQuery("select next value for ORGANISATION_PK_SEQ from SYSIBM.SYSDUMMY1")
	public Long getNextId();

	@SqlQuery("select organisation_id, ORGANISATION_STATUS_ID, AGENT_ORGANISATION_ID, LAST_UPDATE_TS,"
			+ " CLIENT_ISSUES_CONTRACT_FLAG, REMINDER_LETTER_FLAG, PROVIDE_ON_AIR_FLAG,  LEGAL_ENTITY_REVIEW_DATE, "
			+ " DELIVERY_LEAD_DAYS, ACCEPTANCE_PERIOD_DAYS, NAME, LEGAL_ENTITY_NAME "
			+ " from organisation where organisation_id = :id ")
	@Mapper(ClientMapper.class)
	public Client get(@Bind("id") long id);
	
	
	@SqlUpdate("insert into organisation (organisation_id, ORGANISATION_STATUS_ID, AGENT_ORGANISATION_ID, LAST_UPDATE_TS,"
			+ " CLIENT_ISSUES_CONTRACT_FLAG, REMINDER_LETTER_FLAG, PROVIDE_ON_AIR_FLAG,  LEGAL_ENTITY_REVIEW_DATE, "
			+ " DELIVERY_LEAD_DAYS, ACCEPTANCE_PERIOD_DAYS, NAME, LEGAL_ENTITY_NAME) "
			+ " values (:organisationId, :status, :agentOrganisationId, :lastUpdateTs, :clientIssuesContractFlag, :reminderLetterFlag, :provideOnAirFlag,"
			+ " :legalEntityReviewDate, :deliveryLeadDays, :acceptancePeriodDays, :name, :legalEntityName ) ")
	public void insert(@BindBean Client e);
	

	@SqlUpdate("delete from organisation where organisation_id = :organisationId")
	public void deleteByOrgId(@Bind("organisationId") Long organisationId);
	
	
}

