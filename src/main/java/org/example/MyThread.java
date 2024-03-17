package org.example;

class MyThread extends Thread {
    // Surcharge de la méthode run
    public void run() {
        // Code à exécuter dans le thread
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " est en cours d'exécution");
            try {
                // Simule un délai pour voir les threads s'exécuter en parallèle
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
