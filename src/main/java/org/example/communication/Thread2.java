package org.example.communication;

public class Thread2 extends Thread {
    private SharedObject sharedObject;

    public Thread2(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }

    @Override
    public void run() {
        System.out.println("Thread2: Sleeping for 5 seconds...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread2: Sending signal to Thread1...");
        sharedObject.sendSignal();
    }
}