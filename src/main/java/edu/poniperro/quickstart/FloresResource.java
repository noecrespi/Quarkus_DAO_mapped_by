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

    @GET
    @Path("/pedidos")
    @Produces(MediaType.APPLICATION_JSON)
    public Set<Pedido> getPedidos() {
        return floresService.getPedidos();
    }

    // Búsqueda por id
    @GET
    @Path("/floristerias/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Optional<Floristeria> getByIdFloristeria(@PathParam("id") Long idFloristeria){
        Optional<Floristeria> florecita = floresService.getByIdFloristeria(idFloristeria);
        return florecita;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Optional<Flor> getByIdFlor(@PathParam("id") Long idFlor){
        Optional<Flor> flor = floresService.getByIdFlor(idFlor);
        return flor;
    }

    @GET
    @Path("/pedidos/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Optional<Pedido> getByIdPedidos(@PathParam("id") Long idPedido){
        Optional<Pedido> pedido = floresService.getByIdPedido(idPedido);
        return pedido;
    }

    // DELETE
    // FALTA UNO, EL DE FLORISTERÍA
    @DELETE
    @Path("/delete/flores/{nombre}")
    @Transactional
    @Consumes(MediaType.TEXT_PLAIN)
        public Set<Flor> deleteFlor(@PathParam("nombre") String nombre){
            Set<Flor> flores = this.floresService.deleteFlor(nombre);
            return flores;
        }

    @DELETE
    @Path("/delete/pedido/{id}")
    @Transactional
    @Consumes(MediaType.TEXT_PLAIN)
    public Set<Pedido> deletePedido(@PathParam("id") Long id){
        Set<Pedido> pedido = floresService.deletePedido(id);
        return pedido;
    }

    @DELETE
    @Path("/delete/floristeria/{nombre}")
    @Transactional
    @Consumes(MediaType.TEXT_PLAIN)
    public Set<Floristeria> deleteFloristeria(@PathParam("nombre") String nombre){
        Set<Floristeria> pedido = floresService.deleteFloristeria(nombre);
        return pedido;
    }

    // POST
    @POST
    @Path("/postflor/{flor}")
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public Set<Flor> postflor(Flor flor){
        Set<Flor> flores = floresService.postflor(flor);
        return flores;
    }

    @POST
    @Path("/postfloristeria/{floristeria}")
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public Set<Floristeria> postFloristeria(Floristeria floristeria){
        Set<Floristeria> tiendas= this.floresService.postFloristeria(floristeria);
        return tiendas;
    }

}
