package com.example;

import com.example.cidade.Cidade;
import com.example.cliente.Cliente;
import com.example.frete.Frete;

public class Main {
    public static void main(String[] args) {
        Cidade cidade = new Cidade(1, "Vitória");
        Cliente cliente = new Cliente(1, "Gabriel", "gabriel@gmail.com", "(27) 9865 0976", cidade);
        Cidade destino = new Cidade(2, "Belo Horizonte");
        Frete frete = new Frete(1, cliente, cidade, destino,  10532.50, 10.5);
        System.out.println("Frete");
        System.out.println("Cidade Origem: "+frete.getOrigem().getNome());
        System.out.println("Cidade Destino: "+frete.getDestino().getNome());
        System.out.println("Cliente: "+frete.getCliente().getNome());
        System.out.println("Valor: "+frete.getValor());
        System.out.println("Tempo estimado em horas: "+frete.getTempoEmHoras());
    }
}