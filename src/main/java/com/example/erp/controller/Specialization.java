package com.example.erp.controller;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("specialization")

public class Specialization {
    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getSpecialization() {
        List<String> specialization = new ArrayList<>();
        specialization.add("TSCD");
        specialization.add("Artificial Intelligence/Machine Learning");
        specialization.add("Network Communications");
        return Response.ok().entity(specialization).build();
    }
}
