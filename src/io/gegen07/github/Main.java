package io.gegen07.github;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        List<Sapo> sapos = new ArrayList<Sapo>();

        System.out.println("Quantos participantes?");
        int participantes = s.nextInt();

        System.out.println("Distancia da corrida?");
        float distancia = s.nextFloat();

        for (int i = 1; i <= participantes; i++) {
            sapos.add(new Sapo(i, 0, random.nextFloat() * (distancia), distancia));
        }

        for (Sapo sapo: sapos) {
            sapo.start();
        }
    }
}
