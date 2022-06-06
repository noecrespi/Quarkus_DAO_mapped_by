package edu.poniperro.quickstart;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@ApplicationScoped
public class FloresRepository implements PanacheRepository<Flor> {

    public Set<Flor> getAll() {
        Stream<Flor> florecitas = streamAll();
        return florecitas.collect(Collectors.toSet());
    }

    // COMPROBAR QUE NO LA HE LIADO PETUNIA
    public Optional<Flor> getByIdFlor(Long idFlor) {
        Optional<Flor> idFlorecita = find("idFlor").stream().findFirst();
        return idFlorecita;
    }

    public void deleteFlor(String nombre) {
        Flor planta = find("nombre", nombre).firstResult();
        delete(planta);
    }

    public void postFlor(Flor flor){
        persist(flor);
    }
}
