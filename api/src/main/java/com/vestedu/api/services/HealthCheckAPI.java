package com.vestedu.api.services;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by i7 on 27-10-2017.
 */

@Component
@Path("/vestedu/api/health")
public class HealthCheckAPI {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String helloMessage() {
        return "Vest-Edu is active!";
    }
}
