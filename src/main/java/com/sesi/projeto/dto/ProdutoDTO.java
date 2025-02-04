package com.sesi.projeto.dto;

import com.sesi.projeto.entities.Produto;

public record ProdutoDTO(String nome, String descricao, double preco) {

    public Produto criarProduto(){
        Produto p = new Produto();
        p.setNome(nome);
        p.setDescricao(descricao);
        p.setPreco(preco);
        return p;
    }
}
