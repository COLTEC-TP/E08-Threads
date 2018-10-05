package io.github.ibryans;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class CorridaDeSapos  {

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        int distanciaCorrida;
        int numSapos;

        List<Sapo> sapos = new ArrayList<>();

        System.out.println("Qual a distância da corrida? ");
        distanciaCorrida = entrada.nextInt();

        System.out.println("Qual a quantidade de sapos? ");
        numSapos = entrada.nextInt();

        for (int i = 0; i < numSapos; i++) {

            int numAleatorio = (int) (Math.random()*10+1);

            sapos.add(new Sapo(i,
                    0,
                    numAleatorio,  // Distancia de pulo: Um valor aleatório de 0 a 5
                    distanciaCorrida));
        }

        // Começando a corrida
        for (int i = 0; i < numSapos; i++)
            sapos.get(i)
                 .start();

    }

}
