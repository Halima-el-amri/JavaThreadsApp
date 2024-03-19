package org.example.communication;

public class SharedObject {
    synchronized void waitForSignal() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void sendSignal() {
        notify();
    }
}