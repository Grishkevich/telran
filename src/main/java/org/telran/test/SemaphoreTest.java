package org.telran.test;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3, false);
        String users[] = {"Vania", "Oleksandr", "Petia", "Vlada", "Iryna", "Pups", "Jimmy", "Adolf", "lucky"};
        boolean[]  freeTables = new boolean[]{true, true, true, true, true};



        for (String s: users) {
            new Thread(new Person(semaphore, freeTables, s)).start();
        }

    }
}

class Person implements Runnable {
    private static int iter = 0;
    private Semaphore semaphore;
    boolean freeTables[];
    private String name;
    public Person(Semaphore semaphore, boolean[] freeTables, String name) {
        this.semaphore = semaphore;
        this.freeTables = freeTables;
        this.name = name;
    }



    @Override
    public void run() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        synchronized (freeTables) {
            freeTables[iter] = false;
            System.out.println(name + " start eat");
            try {
                Thread.sleep((long) (Math.random() * ( 10000 - 2000 )));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        semaphore.release();

//        }
    }
}