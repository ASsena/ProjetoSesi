package com.sesi.projeto.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class ItemDoPedidoId {

    private Long idProduto;
    private Long idPedido;

    public ItemDoPedidoId(Long idProduto, Long idPedido) {
        this.idProduto = idProduto;
        this.idPedido = idPedido;
    }

    public ItemDoPedidoId() {
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }
}
