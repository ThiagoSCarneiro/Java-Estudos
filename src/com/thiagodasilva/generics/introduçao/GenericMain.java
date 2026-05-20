package com.thiagodasilva.generics.introduçao;

/*
        Conveção de paramentro Generics
    E - Elemento (utilizado extensivamente pelo Java Collections Framework)
    K-Chave
    N - Número
    T - Tipo
    V - Valor
    S, U, V etc. - 2o, 3o, 4o tipos
    */

import com.thiagodasilva.generics.introduçao.*;
import com.thiagodasilva.generics.introduçao.implementacao.Acesso;
import com.thiagodasilva.generics.introduçao.implementacao.Calculadora;
import com.thiagodasilva.generics.introduçao.implementacao.Organizadora;
import com.thiagodasilva.domain.Box;

import java.util.ArrayDeque;
import java.util.Queue;

public class GenericMain {
    public static void main(String[] args) {

        System.out.println("## Generic com Conveção de paramentro ##");
        Calculadora Calculadora = new Calculadora();
        System.out.println(Calculadora.potencia(5, 4));

        System.out.println("## Generic varios tipos ##");
        Acesso acesso = new Acesso("email@example.com", 123456789);
        System.out.println("Chave: "+acesso.getChave());
        System.out.println("Valor: "+acesso.getValor());

        System.out.println("## Generc parametrizado ##");
        Organizadora<Acesso<Integer, String>, Queue<Acesso<Integer, String>>> org;
        org = new Organizadora<>(new ArrayDeque<>());
        org.addItemt(new Acesso<>(1, "Thiago"));
        org.addItemt(new Acesso<>(2, "Maria"));
        System.out.println(org.toString());


        System.out.println("## Generic Cru ##");
        Box<Integer> box = new Box<>();
        box.setValor(8);
        System.out.println(box.toString());

        System.out.println("## Metodos Generic  ##");
        Acesso<Integer, String> a1 = new Acesso<>(1, "Thiago");
        Acesso<Integer, String> a2 = new Acesso<>(5, "Thiago");
        System.out.println(equals(a1, a2));

        System.out.println("## Parâmetros de tipo delimitado Generic  ##");
        Calculadora Calculo = new Calculadora();
        System.out.println(Calculo.dividir(10, 2));

        System.out.println("## parâmetros de tipo limitado Generic ##");
        Integer[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer maior = 1;
        Integer count = contadorMaioValor(numeros, maior);
        System.out.println(count);



    }//main

    public static <K,V> boolean equals(Acesso<K,V> a1, Acesso<K,V> a2){
        return a1.getChave().equals(a2.getChave()) && a1.getValor().equals(a2.getValor());
    }

    public static <T extends Comparable<T>> int contadorMaioValor(T[] anArray, T elem){
        int count = 0;
        for (T e : anArray) {
            if (e.compareTo(elem) > 0) {
                count++;
            }
        }
        return count;
    }

}
