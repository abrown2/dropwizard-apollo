package com.disney.apollo.dw.resources;

import io.dropwizard.jersey.caching.CacheControl;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codahale.metrics.annotation.Timed;
import com.disney.apollo.dw.Template;
import com.disney.apollo.dw.domain.Saying;
import com.google.common.base.Optional;


@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class ApplicationResource {

	  private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationResource.class);

	    private final String template;
	    private final AtomicLong counter;
	    private final String defaultName;

	    public ApplicationResource(String template, String defaultName) {
	        this.template = template;
	        this.defaultName = defaultName;
	        this.counter = new AtomicLong();
	    }

	    @GET
	    @Timed(name = "get-requests")
	    @CacheControl(maxAge = 1, maxAgeUnit = TimeUnit.DAYS)
	    public Saying sayHello(@QueryParam("name") Optional<String> name) {
	        return new Saying(counter.incrementAndGet(), template.render(name));
	    }

	    @POST
	    public void receiveHello(@Valid Saying saying) {
	        LOGGER.info("Received a saying: {}", saying);
	    }
	
}
