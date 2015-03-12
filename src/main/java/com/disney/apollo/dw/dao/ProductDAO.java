package com.disney.apollo.dw.dao;

import java.util.Set;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;

import com.disney.apollo.dw.domain.Product;

public interface ProductDAO {

	public Set<Product> getAllProducts(); 
	
	@SqlQuery("select title from product where product_id = :id ")
	public String getProductTitle(@Bind("id") long id);
	
	
}


