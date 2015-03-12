package com.disney.apollo.dw.dao;

import java.util.Set;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import com.disney.apollo.dw.domain.Product;

public interface ProductDAO {

	public Set<Product> getAllProducts(); 
	
	@SqlQuery("select title from product where product_id = :id ")
	public String getProductTitle(@Bind("id") long id);
	
	@SqlQuery("select product_id, title from product where product_id = :id ")
	@Mapper(ProductMapper.class)
	public Product getProductDetails(@Bind("id") long id);
	
	
}


