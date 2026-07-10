package com.thiagodasilva.ordenacao.bubble;

import java.util.Arrays;

public class BubbleMain {
    public static void main(String[] args) {
        Integer[] array = {5,8,4,6,8,2,1,1,30,3,5,0};

        Integer[] ordenado = bubbleSort(array);
        System.out.println(Arrays.toString(ordenado));
    }

    public static  <T extends Comparable<T>> T[] bubbleSort(T[] array){
        int tamArray = array.length;
        T tempMemory;

        for(int i = 0; i < tamArray; i++){
            for(int j = i + 1; j < tamArray; j++){
                if(array[i].compareTo(array[j]) > -1){
                    tempMemory = array[i];
                    array[i] = array[j];
                    array[j] = tempMemory;
                }
            }

        }
        return array;
    }//metodo


}
