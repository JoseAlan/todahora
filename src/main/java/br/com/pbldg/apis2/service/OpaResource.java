package br.com.pbldg.apis2.service;

import java.time.Instant;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/opa")
public class OpaResource {
	
    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public String helloResource() {
        return "Opa!!! Hora agora é: " + Instant.now();
    }

}
