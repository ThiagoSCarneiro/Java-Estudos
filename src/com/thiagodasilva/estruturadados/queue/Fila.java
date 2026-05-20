package com.thiagodasilva.estruturadados.queue;

import com.thiagodasilva.estruturadados.collections.EstrutraEstatica;

public class Fila<T> extends EstrutraEstatica<T> {

    public Fila(int capacidade) {
        super(capacidade);
    }

    public Fila() {
        super();
    }

    public void enfileirar(T elemento) {
        this.adiciona(elemento);
    }

    public T espiar(){
        if (estaVazio()){
            return null;
        }
        return this.elementos[0];
    }

    public T desinfileirar(){
        final int POS = 0;

        if (estaVazio()){
            return null;
        }

        T elementoRemovido = this.elementos[POS];
        this.remove(POS);

        return elementoRemovido;
    }





}
