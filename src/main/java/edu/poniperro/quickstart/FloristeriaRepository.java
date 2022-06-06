package edu.poniperro.quickstart;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@ApplicationScoped
public class FloristeriaRepository implements PanacheRepository<Floristeria> {

    public Set<Floristeria> getAll() {
        Stream<Floristeria> tiendas = streamAll();
        return tiendas.collect(Collectors.toSet());
    }

    // COMPROBAR QUE NO LA HE LIADO PETUNIA
    public Optional<Floristeria> getByIdFloristeria(Long idFloristeria) {
        Optional<Floristeria> idTienda = find("idFloristeria").stream().findFirst();         // NO SE SI ESTÁ BIEN
        return idTienda;                                                                           //ME LLORA NO SE PORQUÉ
    }

    public void deleteFloristeria(String nombre) {
       Floristeria tienda = find("nombre", nombre).firstResult();
       delete(tienda);
    }

    public void postFloristeria(Floristeria floristeria){
        persist(floristeria);
    }
}
