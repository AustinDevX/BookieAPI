package com.bookie.api.hello;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.annotation.security.PermitAll;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/")
public class GreetingController {
	
	private String defaultGreeting = "Hello! Welcome and thanks for using the Bookie API!";
	
	@GET
	@Path("/hello")
	@PermitAll
	public Response getGreeting(@QueryParam("name") String name) {
		return Response.
				ok(new GreetingResponse(defaultGreeting)).
				type(MediaType.APPLICATION_JSON).
				build();
	}

}
