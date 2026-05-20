package com.thiagodasilva.estruturadados.stack;

import com.thiagodasilva.estruturadados.collections.EstrutraEstatica;

public class Pilha<T> extends EstrutraEstatica<T> {

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public Pilha() {
        super();
    }

    public void empilhar(T elemento) {
        super.adiciona(elemento);
    }

    public T topo(){
        if (estaVazio()){
            return null;
        }
        return this.elementos[this.tamanho-1];
    }

    public T desempilha(){
        if (estaVazio()){
            return null;
        }
        return this.elementos[--tamanho];
    }




}
