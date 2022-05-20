package edu.poniperro.quickstart;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;



@ApplicationScoped
public class FloresRepository implements PanacheRepository<Flor> {



}
