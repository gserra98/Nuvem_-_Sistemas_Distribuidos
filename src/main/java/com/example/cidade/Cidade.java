package com.example.cidade;

public class Cidade {
    private Integer id;
    private String nome;
    public Cidade(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public Cidade() {
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
}
