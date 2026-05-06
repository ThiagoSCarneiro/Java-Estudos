package com.thiagodasilva.estruturadados.collections.stack;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        System.out.println("Pilha CLASS");
        Pilha<Integer> pilha = new Pilha<>();

        pilha.empilhar(2);
        pilha.empilhar(3);
        pilha.empilhar(8);

        System.out.println(pilha);
        System.out.println("Esta vazio: "+pilha.estaVazio());
        System.out.println("Desempilhando: "+pilha.desempilha());
        System.out.println(pilha);
        System.out.println("Topo: "+pilha.topo());

        System.out.println("Stack");
        Stack<Integer> pilhaJava = new Stack<>();

        pilhaJava.push(1);
        pilhaJava.push(2);
        pilhaJava.push(3);

        System.out.println(pilhaJava);
        System.out.println("Esta vazio: "+pilhaJava.isEmpty());
        System.out.println("Desimpilhando: "+pilhaJava.pop());
        System.out.println(pilhaJava);
        System.out.println("Topo: "+pilhaJava.peek());

    }
}
