package com.aula.restapi.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contato {
    

   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
   public Contato(Long id, String nome, String telefone, String email, String urlAvatar) {
    this.id = id;
    this.nome = nome;
    this.telefone = telefone;
    this.email = email;
    this.urlAvatar = urlAvatar;
}
 @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    private String email;
    private String urlAvatar;
    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setUrlAvatar(String urlAvatar) {
        this.urlAvatar = urlAvatar;
    }
    public String getEmail() {
        return email;
    }
    public String getUrlAvatar() {
        return urlAvatar;
    }
    
}
