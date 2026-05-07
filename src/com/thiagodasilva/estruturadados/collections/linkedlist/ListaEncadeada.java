package com.thiagodasilva.estruturadados.collections.linkedlist;

public class ListaEncadeada<T> {

    private static final int NAO_ENCONTRADO = -1;
    private static final String POSICAO_NAO_EXISTE = "Posição não existe";
    private static final String LISTA_VAZIA = "Lista Vazia";

    private Node<T> inicio;
    private Node<T> ultimo;
    private int tamanho = 0;

    public void adciona(T elemento) {
        if(this.tamanho == 0) {
            Node<T> novoNo = new Node<>(elemento);
            this.inicio = novoNo;
            this.ultimo = novoNo;
        }else {
            Node<T> novoNo = new Node<>(elemento, this.inicio);
            this.inicio = novoNo;
        }
        this.tamanho++;
    }

    public void adciona(T elemento, int posicao) {
        if(this.posicaoNaoExiste(posicao)) {
            throw new IllegalArgumentException(POSICAO_NAO_EXISTE);
        }

        if(posicao == 0){
            this.adciona(elemento);
        }else if(posicao == this.tamanho){
            this.adciona(elemento);
        }else {
            Node<T> noAnterior = this.buscaNode(posicao-1);
            Node<T> noProximo = noAnterior.getProximo();
            Node<T> novoNo = new Node<>(elemento, noProximo);
            noAnterior.setProximo(novoNo);
            this.tamanho++;
        }
    }

    private Node<T> buscaNode(int posicao) {
        if (this.posicaoNaoExiste(posicao)) {
            throw new IllegalArgumentException(POSICAO_NAO_EXISTE);
            }

        Node<T> nodeAtual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            nodeAtual = nodeAtual.getProximo();
        }
        return nodeAtual;
    }

    public T buscaPorPosição(int posicao) {
        return this.buscaNode(posicao).getElemento();
    }

    public int busca(T elemento) {
        Node<T> nodeAtual = this.inicio;
        int posicao = 0;
        while (nodeAtual != null) {
            if(nodeAtual.getElemento().equals(elemento)){
                return posicao;
            }
            posicao++;
            nodeAtual = nodeAtual.getProximo();
        }

        return NAO_ENCONTRADO;
    }

    public int getTamanho() {
        return tamanho;
    }

    public T removeInicio(){
        if(this.tamanho == 0){
            throw new RuntimeException(LISTA_VAZIA);
        }

        T removid =  this.inicio.getElemento();
        this.inicio = this.inicio.getProximo();
        this.tamanho--;

        if(this.tamanho ==0){
            this.ultimo = null;
        }

        return removid;
    }

    public T removeUltimo(){
        if(this.tamanho == 0){
            throw new RuntimeException(LISTA_VAZIA);
        }

        if(this.tamanho == 1){
           return this.removeInicio();
        }

        Node<T> penultimoNode = this.buscaNode(this.tamanho-2);
        T removido = penultimoNode.getProximo().getElemento();
        penultimoNode.setProximo(null);
        this.ultimo = penultimoNode;
        this.tamanho--;

        return removido;
    }


    public void limpar() {
        for(Node<T> atual = this.inicio; atual != null;) {
            Node<T> proximo =  atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }
        this.inicio = null;
        this.tamanho = 0;
        this.ultimo = null;
    }

    public T remover(int posicao){
        if(this.posicaoNaoExiste(posicao)){
            throw new IllegalArgumentException(POSICAO_NAO_EXISTE);
        }

        if(posicao == 0){
            return this.removeInicio();
        }
        if(posicao == this.tamanho-1){
            return this.removeUltimo();
        }
        Node<T> nodeAnterior = this.buscaNode(posicao-1);
        Node<T> nodeAtualRemovido = this.buscaNode(posicao);
        Node<T> nodeProximo = nodeAtualRemovido.getProximo();
        nodeAnterior.setProximo(nodeProximo);
        nodeAtualRemovido.setProximo(null);
        this.tamanho--;

        return nodeAtualRemovido.getElemento();
    }

    @Override
    public String toString() {
        if(this.tamanho == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        Node<T> atual = this.inicio;
        builder.append(atual.getElemento()).append(",");
        while (atual.getProximo() != null) {
            atual = atual.getProximo();
            builder.append(atual.getElemento()).append(",");
        }

        return builder.toString();
    }

    private boolean posicaoNaoExiste(int posicao){
        return !(posicao >= 0 && posicao <= this.tamanho);
    }
}
