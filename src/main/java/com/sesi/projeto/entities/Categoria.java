package com.sesi.projeto.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoria_id")
    private Long id;
    private String nome;
    @ManyToMany(mappedBy = "categorias")
    private Set<Produto> produtos = new HashSet<Produto>();

    public Categoria(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public Categoria() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
