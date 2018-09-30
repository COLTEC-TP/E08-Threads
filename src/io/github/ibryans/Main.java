package io.github.ibryans;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int distanciaCorrida;
        int numSapos;

        ArrayList<Sapo> sapos = new ArrayList<>();

        System.out.println("Distância da corrida: ");
        distanciaCorrida = entrada.nextInt();

        System.out.println("Número de sapos: ");
        numSapos = entrada.nextInt();

        for (int i=0; i < numSapos; i++)
            sapos.add(new Sapo());

    }
}
