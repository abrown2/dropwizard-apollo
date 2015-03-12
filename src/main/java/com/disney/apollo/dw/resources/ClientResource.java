package com.disney.apollo.dw.resources;

import io.dropwizard.jersey.params.LongParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.disney.apollo.dw.dao.ClientDAO;
import com.disney.apollo.dw.dao.ProductDAO;
import com.disney.apollo.dw.domain.Client;
import com.disney.apollo.dw.domain.Product;

@Path("/client")
@Produces(MediaType.APPLICATION_JSON)
public class ClientResource {


	
	private final ClientDAO clientDAO;
	
	 private static final Logger LOGGER = LoggerFactory.getLogger(ClientResource.class);
	

	 public ClientResource(ClientDAO clientDAO) {
		 this.clientDAO = clientDAO;
	 }
	 

	    
	    @GET
	    @Path("/details/{clientId}")
	    public Client getDetails(@PathParam("clientId") LongParam clientId) {
	        return clientDAO.getDetails(clientId.get());
	    }

	
}
