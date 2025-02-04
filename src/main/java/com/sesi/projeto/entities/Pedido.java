package com.sesi.projeto.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant momento;
    @Enumerated(EnumType.ORDINAL)
    private StatusDoPedido status;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Usuario cliente;

    @OneToMany(mappedBy = "id.pedido")
    private Set<ItemDoPedido> items = new HashSet<>();

    @OneToOne(mappedBy = "pedido", cascade = CascadeType.ALL)
    private Pagamento pagamento;

    public Pedido(StatusDoPedido status, Instant momento, Long id) {
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

    public Set<ItemDoPedido> getItems() {
        return items;
    }

    public List<Produto> getProdutos() {
        return items.stream().map(x -> x.getProduto()).toList();
    }
}
