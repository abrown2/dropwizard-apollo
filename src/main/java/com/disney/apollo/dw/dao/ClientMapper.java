package com.disney.apollo.dw.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import com.disney.apollo.dw.domain.Client;
import com.disney.apollo.dw.domain.Product;

public class ClientMapper implements ResultSetMapper<Client>{
	
	@Override
	public Client map(int idx, ResultSet rs, StatementContext ctx) throws SQLException {
		
		return new Client(
			rs.getLong("ORGANISATION_ID"),
			rs.getInt("ORGANISATION_STATUS_ID"),
			rs.getLong("AGENT_ORGANISATION_ID"),
			rs.getTimestamp("LAST_UPDATE_TS"),
			rs.getString("CLIENT_ISSUES_CONTRACT_FLAG"),
			rs.getString("REMINDER_LETTER_FLAG"),
			rs.getString("PROVIDE_ON_AIR_FLAG"),
			rs.getDate("LEGAL_ENTITY_REVIEW_DATE"),
			rs.getShort("DELIVERY_LEAD_DAYS"),
			rs.getShort("ACCEPTANCE_PERIOD_DAYS"),
			rs.getString("NAME"),
			rs.getString("LEGAL_ENTITY_NAME")
			
			
		);
	}


	
}
