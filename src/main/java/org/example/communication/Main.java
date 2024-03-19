package org.example.communication;

public class Main {
    public static void main(String[] args) {
        SharedObject sharedObject = new SharedObject();

        Thread1 thread1 = new Thread1(sharedObject);
        Thread2 thread2 = new Thread2(sharedObject);

        thread1.start();
        thread2.start();
    }
}
