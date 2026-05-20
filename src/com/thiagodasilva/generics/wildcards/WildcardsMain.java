package com.thiagodasilva.generics.wildcards;

import java.util.Arrays;
import java.util.List;


public class WildcardsMain {
    public static void main(String[] args) {
        //Wildcards com limite superior


        List<Integer> li = Arrays.asList(1, 2, 3);
        System.out.println("sum = " + sumOfList(li));

        // Wildcards ilimitados
        List<Integer> list = Arrays.asList(1, 2, 3);
        List<String>  ls = Arrays.asList("one", "two", "three");
        printList(list);
        printList(ls);

        //Wildcards com limite inferior

    }


    public static void printList(List<?> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }

    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }

    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return s;
    }
}
