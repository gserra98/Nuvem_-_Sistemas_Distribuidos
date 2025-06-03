package com.example.cliente;

import com.example.cidade.Cidade;

public class Cliente {
    private Integer id;
    private String nome;
    private String email;
    private String celular;
    private Cidade cidade;

    public Cliente() {
    }
    public Cliente(Integer id, String nome, String email, String celular, Cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.celular = celular;
        this.cidade = cidade;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Cidade getCidade() {
        return this.cidade;
    }
}
