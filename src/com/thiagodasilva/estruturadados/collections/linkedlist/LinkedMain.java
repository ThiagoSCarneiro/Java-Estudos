package com.thiagodasilva.estruturadados.collections.linkedlist;

import java.util.LinkedList;

public class LinkedMain {
    public static void main(String[] args) {
        ListaEncadeada<Integer> list = new ListaEncadeada<>();
        list.adciona(1);
        System.out.println(list.toString());
        list.adciona(4);
        System.out.println(list.toString());
        list.adciona(3);
        System.out.println(list.toString());

        System.out.println(list.buscaPorPosição(0)+ ":na Posiçaõ 0");
        System.out.println(list.buscaPorPosição(1)+ ":na Posiçaõ 1");
        System.out.println(list.buscaPorPosição(2)+ ":na Posiçaõ 2");
        System.out.println(list.busca(4)+ ":posicao Elemento");


        System.out.println("### ### ### Adicona ### ### ###");
        System.out.println(list);
        list.adciona(5, 1);
        System.out.println(list);
        list.adciona(9, 0);
        System.out.println(list);

        list.adciona(97);
        list.adciona(54);
        list.adciona(32);
        System.out.println(list);
        System.out.println("## remover ###");

        System.out.println(list.removeInicio());
        System.out.println(list);

        System.out.println(list.removeUltimo());
        System.out.println(list);

        System.out.println(list.remover(2));
        System.out.println(list);


        System.out.println("\n");
        System.out.println("#### LINKEDLIST API JAVA ####");


        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(6);
        linkedList.addFirst(2);
        linkedList.addLast(5);

        System.out.println(linkedList);
        linkedList.add(1,8);
        System.out.println(linkedList);

        linkedList.remove(2);
        linkedList.remove();
        linkedList.removeFirst();
        linkedList.removeLast();



    }
}

