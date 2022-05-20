package edu.poniperro.quickstart;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Set;

@Path("/flores")
public class FloresResource {

    @Inject
    FloresService floresService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Set<Flor> getFlores() {
        return null;
    }
}