package org.example.creation;


public class Main {
    public static void main(String[] args) {
        // Création de deux instances de MyThread (qui hérite de Thread)                     MyThread t1 = new MyThread();
                                                                                   //        MyThread t2 = new MyThread();
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        // Lancement des threads
        thread1.start();
        thread2.start();

        // Attente de la fin des threads
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Les threads ont terminé leur exécution.");
    }
}