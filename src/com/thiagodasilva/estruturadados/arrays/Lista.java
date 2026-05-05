package com.thiagodasilva.estruturadados.arrays;

public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean adicionar(T elemento) {
        aumentoCapacidade();
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public void adicionar(int posicao,T elemento) {
        if(!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição Invalida");
        }
        aumentoCapacidade();

        for(int i = this.tamanho-1; i >= posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
    }

    public void aumentoCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] elementoNovos = (T[])  new Object[this.elementos.length * 2];
            for(int i = 0; i < this.elementos.length; i++){
                elementoNovos[i] = this.elementos[i];
            }
            this.elementos = elementoNovos;
        }
    }


    public int getTamanho() {
        return tamanho;
    }

    public T[] getElementos() {
        return elementos;
    }

    public T busca(int posicao) {
        if(!(posicao>=0 && posicao<this.tamanho)) {
            throw new IllegalArgumentException("Posição Invalida");
        }
        return elementos[posicao];
    }

    public int busca(T elemento) {
        for(int i = 0; i < this.tamanho; i++) {
            if(this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public void remover(int posicao){
        if(!(posicao>=0 && posicao<this.tamanho)) {
            throw new IllegalArgumentException("Posição Invalida");
        }
        for(int i = posicao; i < this.tamanho; i++) {
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho-1; i++) {
            s.append(elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");

        return s.toString();
    }
}
