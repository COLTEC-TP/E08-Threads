package io.gegen07.github;

import java.util.Random;

public class Sapo extends Thread {
    private int id;
    private float distanciaPercorrida;
    private float distanciaPulo;
    private float distanciaTotal;

    public Sapo(int id, float distanciaPercorrida, float distanciaPulo, float distanciaTotal) {
        this.id = id;
        this.distanciaPercorrida = distanciaPercorrida;
        this.distanciaPulo = distanciaPulo;
        this.distanciaTotal = distanciaTotal;
    }

    public void run () {
        while (this.distanciaPercorrida < distanciaTotal) {
            distanciaPercorrida += distanciaPulo;
            System.out.println("ID: " + id + "; Pulei " + distanciaPulo + "; Totalizando: " + distanciaPercorrida);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
