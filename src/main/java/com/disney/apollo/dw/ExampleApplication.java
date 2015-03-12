package com.disney.apollo.dw;

import org.skife.jdbi.v2.DBI;

import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import com.disney.apollo.dw.dao.ClientDAO;
import com.disney.apollo.dw.dao.ProductDAO;
import com.disney.apollo.dw.resources.ApplicationResource;
import com.disney.apollo.dw.resources.ClientResource;
import com.disney.apollo.dw.resources.ProductResource;

public class ExampleApplication extends Application<ExampleConfiguration> {

	public static void main(String[] args) throws Exception {
		new ExampleApplication().run(args);
	}

	@Override
	public String getName() {
		return "hello-world";
	}

	@Override
	public void initialize(Bootstrap<ExampleConfiguration> bootstrap) {
		// nothing to do yet
	}

	@Override
	public void run(ExampleConfiguration configuration, Environment environment) {
		final ApplicationResource resource = new ApplicationResource(configuration.getTemplate(), configuration.getDefaultName());
		environment.jersey().register(resource);

		final DBIFactory factory = new DBIFactory();
		final DBI jdbi = factory.build(environment, configuration.getDataSourceFactory(), "apollo-ds");
		final ProductDAO productDao = jdbi.onDemand(ProductDAO.class);
		environment.jersey().register(new ProductResource(productDao));
		
		final ClientDAO clientDao = jdbi.onDemand(ClientDAO.class);
		environment.jersey().register(new ClientResource(clientDao));
		
	}

}
