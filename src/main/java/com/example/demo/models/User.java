package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_user")
public class User implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    private String fone;

    public User() {}

    // construtor SEM id (id é gerado)
    public User(String name, String email, String fone, String password) {
        this.name = name;
        this.email = email;
        this.fone = fone;
        this.password = password;
    }

    public Long getId() { return id; }
    // opcional: pode até remover o setId, mas se quiser manter:
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getFone() { return fone; }
    public void setFone(String fone) { this.fone = fone; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return id != null && id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return 31;
    }
}