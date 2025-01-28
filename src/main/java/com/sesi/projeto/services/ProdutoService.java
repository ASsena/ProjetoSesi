package com.sesi.projeto.services;

import com.sesi.projeto.entities.Produto;
import com.sesi.projeto.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public List<Produto> verTodos(){
        return repository.findAll();
    }
}
