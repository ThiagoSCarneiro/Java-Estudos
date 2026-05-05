package com.thiagodasilva.estruturadados.arrays;

public class ArraysMain {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);

        vetor.adicionar("Carro");
        vetor.adicionar("moto");
        vetor.adicionar("aviao");

        System.out.println(vetor.getTamanho());
        System.out.println(vetor.toString());

        System.out.println("Busca por Posição: "+vetor.busca(1));
        System.out.println("Busca pelo elemento: "+vetor.busca("moto"));

        vetor.adicionar("Bike");
        vetor.adicionar(2,"Navio");
        System.out.println(vetor.toString());

        vetor.remover(vetor.busca("moto"));
        System.out.println(vetor.toString());





    }
}
