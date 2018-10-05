package io.github.ibryans;

public class Sapo extends Thread {

    // Atributos necessários
    private int id;
    private int distanciaPercorrida;
    private int distanciaPulo;
    private int distanciaTotal;


    // Construtor
    public Sapo (int id, int distanciaPercorrida, int distanciaPulo, int distanciaTotal) {

        this.id = id;
        this.distanciaPercorrida = distanciaPercorrida;
        this.distanciaPulo  = distanciaPulo;
        this.distanciaTotal= distanciaTotal;

    }


    // Run
    @Override
    public void run() {

        // Enquanto o sapo não chega na largada
       while (distanciaPercorrida < distanciaTotal) {

           System.out.println("Sapo " + this.id + " - Percorrido: " + this.distanciaPercorrida + "m");

           try {
               Thread.sleep(200);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

           distanciaPercorrida += this.distanciaPulo;

       }

        System.out.println("[ Sapo " + this.id + " finalizou a corrida! ]");

    }

    // Getters e setters

    public int getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public int getDistanciaPulo() {
        return distanciaPulo;
    }

    public int getDistanciaTotal() { return distanciaTotal; }

    public void setId(int id) { this.id = id; }

    public void setDistanciaPercorrida(int distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public void setDistanciaPulo(int distanciaPulo) {
        this.distanciaPulo = distanciaPulo;
    }

    public void setDistanciaTotal(int distanciaTotal) { this.distanciaTotal = distanciaTotal; }

}
