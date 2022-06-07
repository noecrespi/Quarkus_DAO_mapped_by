package edu.poniperro.quickstart;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// NO SE SI ES
@ApplicationScoped
public class PedidoRepository implements PanacheRepository {
//public class PedidoRepository implements PanacheRepository<Flor> {
    public Set<Pedido> getAll() {
        Stream<Pedido> pedido = streamAll();        // LLORA
        return pedido.collect(Collectors.toSet());
    }

    // COMPROBAR QUE NO LA HE LIADO PETUNIA
    public Optional<Pedido> getByIdPedido(Long idPedido) {
        Optional<Pedido> idPedido1 = find("idPedido").stream().findFirst();
        return idPedido1;
    }

    public void deletePedido(String nombre) {
        Pedido pedido = find("nombre", nombre).firstResult();       // LLORA
        delete(pedido);
    }

    //public void postFlor(Flor flor){
    //    persist(flor);
    //}

}
