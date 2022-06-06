package edu.poniperro.quickstart;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@ApplicationScoped
public class FloristeriaRepository implements PanacheRepository<Floristeria> {

    public Set<Floristeria> getAll() {
        Stream<Floristeria> tiendas = streamAll();
        return tiendas.collect(Collectors.toSet());
    }

    //public void deleteFlor(String nombre) {
       // Flor planta = find("nombre", nombre).firstResult();
       // delete(planta);
    //}
}
