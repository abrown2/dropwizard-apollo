package com.disney.apollo.dw.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import com.disney.apollo.dw.domain.Product;

public class ProductMapper implements ResultSetMapper<Product> {

	@Override
	public Product map(int idx, ResultSet rs, StatementContext ctx) throws SQLException {
		
		return new Product(
			rs.getLong("PRODUCT_ID"),
			rs.getString("TITLE")
		);
	}

}
