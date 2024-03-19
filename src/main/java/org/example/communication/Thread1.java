package org.example.communication;

public class Thread1 extends Thread {
    private SharedObject sharedObject;

    public Thread1(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }

    @Override
    public void run() {
        System.out.println("Thread1: Waiting for signal...");
        sharedObject.waitForSignal();
        System.out.println("Thread1: Received signal!");
    }
}