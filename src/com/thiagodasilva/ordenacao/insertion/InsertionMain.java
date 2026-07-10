package com.thiagodasilva.ordenacao.insertion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionMain {
    public static void main(String[] args) {
        Integer[] array = {5,3,4,6,2,1,8,9,7};

        Integer[] ordenado = insertionSort(array);
        System.out.println(Arrays.toString(ordenado));
    }

    public static <T extends Comparable<T>> T[] insertionSort(T[] array){
        T tempMemory;
        int tamArray = array.length;
        int contador;

        for(int i = 1; i < tamArray; i++){

            tempMemory = array[i];
            contador = i;

            while (array[contador -1].compareTo(array[contador]) >  0){
                array[contador] = array[contador - 1];
                contador--;
                array[contador] = tempMemory;
                if(contador<=0) break;

            }


        }

        return array;
    }

}
