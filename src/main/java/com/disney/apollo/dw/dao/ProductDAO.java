package com.disney.apollo.dw.dao;

import java.util.Set;

import com.disney.apollo.dw.domain.Product;

public interface ProductDAO {

	public Set<Product> getAllProducts(); 
	
	public Product getProduct(long id);
	
	
}
