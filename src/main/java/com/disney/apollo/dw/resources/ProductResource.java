package com.disney.apollo.dw.resources;

import io.dropwizard.jersey.params.LongParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.disney.apollo.dw.dao.ProductDAO;
import com.disney.apollo.dw.domain.Product;


@Path("/product")
@Produces(MediaType.APPLICATION_JSON)
public class ProductResource {
	
	private final ProductDAO productDAO;
	
	 private static final Logger LOGGER = LoggerFactory.getLogger(ProductResource.class);
	

	 public ProductResource(ProductDAO productDAO) {
		 this.productDAO = productDAO;
	 }
	 
	    @GET
	    @Path("/title/{productId}")
	    @Produces(MediaType.TEXT_HTML)
	    public String getPersonViewFreemarker(@PathParam("productId") LongParam productId) {
	        return productDAO.getProductTitle(productId.get());
	    }
	 
}
