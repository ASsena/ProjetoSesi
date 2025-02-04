package com.sesi.projeto.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "item_pedido")
public class ItemDoPedido {

    @EmbeddedId
    private ItemDoPedidoId id = new ItemDoPedidoId();
    private int quantidade;
    private Double preco;

    public ItemDoPedido(int quantidade, Double preco ) {
        this.quantidade = quantidade;
        this.preco = preco;
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
        return id;
    }
    public void setItemDoPedido(ItemDoPedidoId itemDoPedido) {
         this.id = itemDoPedido;
    }

    public Produto getProduto() {
        return id.getIdProduto();
    }
}
