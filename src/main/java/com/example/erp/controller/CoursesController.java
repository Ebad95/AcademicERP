package com.example.erp.controller;

import com.example.erp.bean.Courses;
import com.example.erp.service.CoursesService;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Path("courses")
    public class CoursesController {

        @POST
        @Path("/register")
        @Consumes(MediaType.MULTIPART_FORM_DATA)
        @Produces(MediaType.TEXT_PLAIN)
        public Response registerCourse(@FormDataParam("course_code") String course_code,
                                       @FormDataParam("name") String name,
                                       @FormDataParam("description") String description,
                                       @FormDataParam("year") Integer year,
                                       @FormDataParam("term") String term,
                                       @FormDataParam("credits") Integer credits,
                                       @FormDataParam("capacity") Integer capacity,
                                       @FormDataParam("faculty") String faculty) throws URISyntaxException {
            System.out.println(course_code);
            System.out.println(name);
            System.out.println(description);
            System.out.println(year);
            System.out.println(term);
            System.out.println(credits);
            System.out.println(capacity);
            System.out.println(faculty);
            CoursesService courseservice = new CoursesService();
            courseservice.addCourse(course_code, name, description, year, term, credits, capacity, faculty);
            return Response.ok().build();

        }
    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPrerequisite() {
            ArrayList<String> b=new ArrayList<String>() ;
       CoursesService courseservice=new CoursesService();
       List<Courses> pre=courseservice.getCourse();
       for(Courses a: pre) {
         b.add(a.getName());
       }
        return Response.ok().entity(b).build();
    }
}
