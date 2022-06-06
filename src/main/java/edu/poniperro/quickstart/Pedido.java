package edu.poniperro.quickstart;

import javax.persistence.*;
import javax.security.auth.login.FailedLoginException;

public class Pedido {

    // columna 1
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public long id;

    @OneToMany
    @JoinColumn(name = "idFloristeria")
    public Floristeria floristeria;

    @OneToOne
    @JoinColumn(name = "idFlor")
    public Flor flor;
}
