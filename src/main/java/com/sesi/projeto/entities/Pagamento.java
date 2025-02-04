package com.sesi.projeto.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "pagamentos")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant momento;
    @OneToOne
    @MapsId
    private Pedido pedido;

    public Pagamento(Instant momento, Pedido pedido) {
        this.momento = momento;
        this.pedido = pedido;
    }
    public Pagamento() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMomento() {
        return momento;
    }

    public void setMomento(Instant momento) {
        this.momento = momento;
    }
    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido) {}
}
