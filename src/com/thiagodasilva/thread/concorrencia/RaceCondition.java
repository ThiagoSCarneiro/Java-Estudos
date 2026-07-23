package com.thiagodasilva.thread.concorrencia;

public class RaceCondition {

    private static Integer val= 0;


    public static void main(String[] args) throws InterruptedException {
        Runnable tarefa = () -> {
            System.out.println("Execuntando tarefa "+ Thread.currentThread().getName());
        };

        Thread t1 = new Thread(tarefa, "Thred-1");

        t1.run();
        t1.start();
        t1.join();

        Runnable teste = () -> {
            for (int i = 0; i < 10000; i++) {
                val++; // Lê, soma e grava. Aqui acontece a colisão!
            }
        };

        Thread t2 = new Thread(teste, "Thread-2");
        Thread t3 = new Thread(teste, "Thread-3");
        Thread t4 = new Thread(teste, "Thread-4");

        t2.start();
        t3.start();
        t4.start();

        t2.join();
        t3.join();
        t4.join();

        System.out.println("Resultado esperado: 40000");
        System.out.println("Resultado real:     " + val);

    }
}
