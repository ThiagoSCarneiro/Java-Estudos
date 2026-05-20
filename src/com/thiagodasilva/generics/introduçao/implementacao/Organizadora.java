package com.thiagodasilva.generics.introduçao.implementacao;

import java.util.Collection;

public class Organizadora<T, E extends Collection<T>>{

    private E organizacao;

    public Organizadora(E org) {
        this.organizacao = org;
    }

    public void addItemt(T item) {
        organizacao.add(item);
    }

    public void removeItem(T item) {
        organizacao.remove(item);
    }

    public E getOrganizacao() {
        return organizacao;
    }

    @Override
    public String toString() {
        return "Organizadora{" +
                "organizacao=" + organizacao.toString() +
                '}';
    }
}
