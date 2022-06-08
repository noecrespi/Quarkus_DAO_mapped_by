package edu.poniperro.quickstart;

import javax.persistence.*;
import javax.security.auth.login.FailedLoginException;
import java.util.Set;

@Entity
@Table(name = "pedido")
public class Pedido {

    // columna 1
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public long id;

    @ManyToOne
    @JoinColumn(name = "idFloristeria")
    public Floristeria floristeria;

    @OneToOne
    @JoinColumn(name = "idFlor")
    public Flor flor;
}
