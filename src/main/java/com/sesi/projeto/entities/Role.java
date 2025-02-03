package com.sesi.projeto.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private String id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public enum Values{
        ADMIN(1L),
        BASIC(2L);

        private Long value;

        Values(Long value) {
            this.value = value;
        }

        public Long getValue() {
            return value;
        }
        public void setValue(Long value) {

        }

    }
}
