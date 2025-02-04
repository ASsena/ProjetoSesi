package com.sesi.projeto.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Embeddable
public class ItemDoPedidoId {

    @OneToOne
    @JoinColumn(name = "produto_id")
    private Produto idProduto;
    @OneToOne
    @JoinColumn(name = "pedido_id")
    private Pedido idPedido;

    public Produto getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Produto idProduto) {
        this.idProduto = idProduto;
    }

    public Pedido getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
    }
}
