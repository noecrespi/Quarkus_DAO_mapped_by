package edu.poniperro.quickstart;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "floristeria")
public class Floristeria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public long id;

    @Column(name="nombre")      //nombre que está en la Base de datos
    public String nombre;       // nombre de la propiedad en java

    // ignorame los JSON, "NO me lo pidas al hacer un POST" 'citado por Victor'
    //mappedBy = nombre de la columna donde se almacena clave foranea (PK)
//    @JsonIgnore
//    @OneToMany(mappedBy = "floristeria")
//    public Set<Flor> stock;

}
