package io.xgeeks;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Path("/person")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonResource {

    private List<Person> personList = new ArrayList<>();

    @GET
    public Response getPersons(){
        return Response.ok(personList).build();
    }

    @POST
    @Path("/add")
    public Response addPerson(Person person){
        personList.add(person);
        return Response.ok().build();
    }
}
