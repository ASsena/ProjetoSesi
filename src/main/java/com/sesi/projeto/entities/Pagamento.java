package com.sesi.projeto.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "pagamentos")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant momento;

    public Pagamento(Instant momento, Long id) {
        this.momento = momento;
        this.id = id;
    }
    public Pagamento() {}

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
}
