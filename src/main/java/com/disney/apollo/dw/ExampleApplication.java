package com.disney.apollo.dw;



import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import com.disney.apollo.dw.resources.ApplicationResource;

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
    public void run(ExampleConfiguration configuration,
                    Environment environment) {
    	final ApplicationResource resource = new ApplicationResource(
    	        configuration.getTemplate(),
    	        configuration.getDefaultName()
    	    );
    	    environment.jersey().register(resource);
    }

	
	
}
