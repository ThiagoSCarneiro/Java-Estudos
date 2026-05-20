package com.thiagodasilva.generics.introduçao.implementacao;

import com.thiagodasilva.generics.introduçao.interfaces.*;

    public class Acesso<K,V> implements Pair<K,V> {
    private K chave;
    private V valor;

    public Acesso(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    @Override
    public K getChave() {
        return chave;
    }

    @Override
    public V getValor() {
        return valor;
    }

        @Override
        public String toString() {
            return "Acesso{" +
                    "chave=" + chave +
                    ", valor=" + valor +
                    '}';
        }
    }
