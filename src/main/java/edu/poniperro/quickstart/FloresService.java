package edu.poniperro.quickstart;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Optional;
import java.util.Set;

@ApplicationScoped
public class FloresService {

    @Inject
    FloresRepository floresRepository;

    @Inject
    FloristeriaRepository floristeriaRepository;

    @Inject
    PedidoRepository pedidoRepository;

    // GET
    public Set<Flor> getFlores(){
        return floresRepository.getAll();
    }

    public Set<Floristeria> getFloristerias(){
        return floristeriaRepository.getAll();
    }

    public Set<Pedido> getPedidos(){
        return pedidoRepository.getPedidos();
    }

    public Optional<Floristeria> getByIdFloristeria(Long idFloristeria){
        return floristeriaRepository.getByIdFloristeria(idFloristeria);
    }

    public Optional<Flor> getByIdFlor(Long idFlor){
        return floresRepository.getByIdFlor(idFlor);
    }

    public Optional<Pedido> getByIdPedido(Long idPedido){
        return pedidoRepository.getByIdPedido(idPedido);
    }
    // DELETE
    public Set<Flor> deleteFlor(String nombre) {
        floresRepository.deleteFlor(nombre);
        return this.getFlores();
    }

    public Set<Floristeria> deleteFloristeria(String nombre) {
        floristeriaRepository.deleteFloristeria(nombre);
        return this.getFloristerias();
    }

    public Set<Pedido> deletePedido(Long id) {
        pedidoRepository.deletePedido(id);
        return this.getPedidos();
    }

    // POST
    public Set<Flor> postflor(Flor flor){
        floresRepository.postFlor(flor);
        return this.getFlores();
    }

    public Set<Floristeria> postFloristeria(Floristeria floristeria){
        floristeriaRepository.postFloristeria(floristeria);
        return this.getFloristerias();
    }

}




