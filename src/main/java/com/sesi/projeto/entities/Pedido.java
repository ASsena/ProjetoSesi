package com.sesi.projeto.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant momento;
    @Enumerated(EnumType.ORDINAL)
    private StatusDoPedido status;
    @OneToOne
    private Pedido produto;

    public Pedido(Pedido produto, StatusDoPedido status, Instant momento, Long id) {
        this.produto = produto;
        this.status = status;
        this.momento = momento;
        this.id = id;
    }
    public Pedido() {}

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

    public StatusDoPedido getStatus() {
        return status;
    }

    public void setStatus(StatusDoPedido status) {
        this.status = status;
    }

    public Pedido getProduto() {
        return produto;
    }

    public void setProduto(Pedido produto) {
        this.produto = produto;
    }
}
