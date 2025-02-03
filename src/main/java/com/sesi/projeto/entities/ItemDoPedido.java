package com.sesi.projeto.entities;

import jakarta.persistence.EmbeddedId;

public class ItemDoPedido {

    @EmbeddedId
    private ItemDoPedidoId itemDoPedido;
    private int quantidade;
    private Double preco;

    public ItemDoPedido(int quantidade, Double preco , ItemDoPedidoId itemDoPedido) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.itemDoPedido = itemDoPedido;
    }
    public ItemDoPedido() {}


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public ItemDoPedidoId getItemDoPedido() {
        return itemDoPedido;
    }
    public void setItemDoPedido(ItemDoPedidoId itemDoPedido) {}
}
