package com.thiagodasilva.lambda.atividades;

import java.util.LinkedList;
import java.util.Queue;

class Produto{
    private String name;
    private Double preco;

    public Produto(String name, Double preco) {
        this.name = name;
        this.preco = preco;
    }

    public Produto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "name='" + name + '\'' +
                ", preco=" + preco +
                '}';
    }
}

public class FiltragemTranformacaoLista {
    public static void main(String[] args) {
        Produto prod = new Produto();
        Queue<Produto> estoque = new LinkedList<>();
        estoque.add(new Produto("Televisão 4K", 2500.00));
        estoque.add(new Produto("Mouse Sem Fio", 80.00));
        estoque.add(new Produto("Fone de Ouvido Bluetooth", 150.00));
        estoque.add(new Produto("Notebook Gamer", 6500.00));
        estoque.add(new Produto("Caneta Touch", 30.00));









    }
}

