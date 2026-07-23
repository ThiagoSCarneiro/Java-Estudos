package com.thiagodasilva.thread;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador();

        Runnable tarefa = () -> {
            for (int i = 0; i < 10000; i++) {
                contador.incrementar();
            }
        };

        Thread t1 = new Thread(tarefa, "Thread-1");
        Thread t2 = new Thread(tarefa, "Thread-2");
        Thread t3 = new Thread(tarefa, "Thread-3");
        Thread t4 = new Thread(tarefa, "Thread-4");

        t1.start(); t2.start(); t3.start(); t4.start();
        t1.join(); t2.join(); t3.join(); t4.join();

        System.out.println("Resultado com synchronized: " + contador.getVal());
    }

}

class Contador {
    private int val = 0;

    public synchronized void incrementar() {
        val++;
    }

    public int getVal() {
        return val;
    }
}
