package edu.poniperro.quickstart;


import javax.persistence.*;

@Entity
@Table(name="flor")
public class Flor {

    // columna 1
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public long id;

    // columna 2
    @Column(name="nombre")
    public String nombre;

    // columna 3
    @Column(name="color")
    public String color;


    @ManyToOne
    @JoinColumn(name = "floristeria")
    public Floristeria floristeria;

}
