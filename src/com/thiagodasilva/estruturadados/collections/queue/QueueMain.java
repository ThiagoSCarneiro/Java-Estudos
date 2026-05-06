package com.thiagodasilva.estruturadados.collections.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        System.out.println("## Fila Class ##");

        Fila<Integer> fila = new Fila<>();
        fila.enfileirar(5);
        fila.enfileirar(7);
        fila.enfileirar(8);

        System.out.println(fila);
        System.out.println("Esta vazio: "+fila.estaVazio());
        System.out.println("Desinfileirar: "+fila.desinfileirar());
        System.out.println(fila);
        System.out.println("Primeiro da fila : "+fila.espiar());

        FIlaPrioridade<Integer> filaPrioridade = new FIlaPrioridade<>();
        filaPrioridade.enfileirar(5);
        filaPrioridade.enfileirar(2);
        filaPrioridade.enfileirar(1);

        System.out.println("Fila Prioridade: "+ filaPrioridade);
        System.out.println("Desinfileirar: "+ filaPrioridade.desinfileirar());
        System.out.println("Fila Prioridade: "+ filaPrioridade);

        System.out.println("## Queue javaApi ##");
        Queue<Integer> filaApi = new LinkedList<>();

        filaApi.add(2);
        filaApi.add(6);
        filaApi.add(1);

        System.out.println(filaApi);
        System.out.println("Desinfileirar: "+ filaApi.poll());
        System.out.println(filaApi);
        System.out.println("Primeiro da fila : "+filaApi.peek());

        Queue<Integer> prioridadeApi = new PriorityQueue<>();

        prioridadeApi.add(2);
        prioridadeApi.add(8);
        prioridadeApi.add(9);

        System.out.println("Fila Prioridade: "+ prioridadeApi);
        System.out.println("Desinfileirar: "+ prioridadeApi.poll());
        System.out.println("Fila Prioridade: "+ prioridadeApi);








    }
}
