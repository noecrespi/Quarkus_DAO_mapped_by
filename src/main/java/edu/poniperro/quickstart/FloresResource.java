package edu.poniperro.quickstart;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;
import java.util.Set;

@Path("/flores")
public class FloresResource {

    @Inject
    FloresService floresService;

    // GET
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Set<Flor> getFlores() {
        return floresService.getFlores();
    }

    @GET
    @Path("/floristerias")
    @Produces(MediaType.APPLICATION_JSON)
    public Set<Floristeria> getFloristerias() {
        return floresService.getFloristerias();
    }

    // Búsqueda por id
    @GET
    @Path("/floristeria/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Optional<Floristeria> getByIdFloristeria(@PathParam("id") Long idFloristeria){
        Optional<Floristeria> florecita = floresService.getByIdFloristeria(idFloristeria);
        return florecita;
    }

    @GET
    @Path("/flor/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Optional<Flor> getByIdFlor(@PathParam("id") Long idFlor){
        Optional<Flor> flor = floresService.getByIdFlor(idFlor);
        return flor;
    }

    // DELETE
    @DELETE
    @Path("/delete/{nombre}")
    @Transactional
    @Consumes(MediaType.TEXT_PLAIN)
        public Set<Flor> deleteFlor(@PathParam("nombre") String nombre){
            Set<Flor> flores = this.floresService.deleteFlor(nombre);
            return flores;
        }

    // POST
    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public Set<Flor> postflor(Flor flor){
        Set<Flor> flores = this.floresService.postflor(flor);
        return flores;
    }

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public Set<Floristeria> postFloristeria(Floristeria floristeria){
        Set<Floristeria> tiendas= this.floresService.postFloristeria(floristeria);
        return tiendas;
    }

}
