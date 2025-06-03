package com.example.frete;

import com.example.cidade.Cidade;
import com.example.cliente.Cliente;

public class Frete {
    private Integer id;
    private Cliente cliente;
    private Cidade origem;
    private Cidade destino;
    private Double valor;
    private Double tempoEmHoras;
    public Frete() {
    }
    public Frete(Integer id, Cliente cliente, Cidade origem, Cidade destino, Double valor, Double tempoEmHoras) {
        this.id = id;
        this.cliente = cliente;
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
        this.tempoEmHoras = tempoEmHoras;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Cidade getOrigem() {
        return origem;
    }
    public void setOrigem(Cidade origem) {
        this.origem = origem;
    }
    public Cidade getDestino() {
        return destino;
    }
    public void setDestino(Cidade destino) {
        this.destino = destino;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Double getTempoEmHoras() {
        return tempoEmHoras;
    }
    public void setTempoEmHoras(Double tempoEmHoras) {
        this.tempoEmHoras = tempoEmHoras;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
