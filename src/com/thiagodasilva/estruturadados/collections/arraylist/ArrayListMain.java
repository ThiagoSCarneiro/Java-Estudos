package com.thiagodasilva.estruturadados.collections.arraylist;

import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("moto");
        list.add("carro");
        System.out.println(list);

        list.add(1,"Navio");
        System.out.println(list);


        boolean contains = list.contains("carro");
        if (contains) {
            System.out.println("há carro");
        }else {
            System.out.println("não há carro");
        }


        System.out.println(list.get(2));
        System.out.println(list.indexOf("Carro"));
        list.remove(1);
        System.out.println(list.size());
    }
}
