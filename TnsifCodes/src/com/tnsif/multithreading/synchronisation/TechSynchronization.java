package com.tnsif.multithreading.synchronisation;

public class TechSynchronization {

    // Static Table class
    static class Table {
        // Synchronized method
        synchronized void printTable(int n) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

    // Thread class 1
    static class MyThread1 extends Thread {
        Table t;

        MyThread1(Table t) {
            this.t = t;
        }

        public void run() {
            t.printTable(5);
        }
    }

    // Thread class 2
    static class MyThread2 extends Thread {
        Table t;

        MyThread2(Table t) {
            this.t = t;
        }

        public void run() {
            t.printTable(100);
        }
    }

    // Main / Executor class
    public static void main(String[] args) {

        Table obj = new Table(); // Shared object

        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();
        t2.start();
    }
}
