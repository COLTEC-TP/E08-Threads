package io.github.ibryans;

public class Sapo extends Thread {

    // Atributos necessários
    int distanciaPercorrida;
    int distanciaPulo;


    // Getters e setters
    public int getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public int getDistanciaPulo() {
        return distanciaPulo;
    }

    public void setDistanciaPercorrida(int distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public void setDistanciaPulo(int distanciaPulo) {
        this.distanciaPulo = distanciaPulo;
    }
}
