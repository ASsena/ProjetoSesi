package com.sesi.projeto.dto;

import com.sesi.projeto.entities.Pagamento;
import com.sesi.projeto.entities.Pedido;

import java.time.Instant;

public record PagamentoDTO(Instant momento, Pedido pedido) {

    public Pagamento criarPagamento(){
        Pagamento p = new Pagamento();
        p.setMomento(momento);
        p.setPedido(pedido);
        return p;
    }
}
