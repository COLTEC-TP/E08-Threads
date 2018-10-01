/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author riversong
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        List<Sapos> sapos = new ArrayList<>();

        System.out.println("Quantos participantes?");
        int participantes = s.nextInt();

        System.out.println("Qual a distancia da corrida?");
        float distancia = s.nextFloat();

        for (int i = 1; i <= participantes; i++) {
            sapos.add(new Sapos(i, 0, random.nextFloat() * (distancia), distancia));
        }

        sapos.forEach((sapo) -> {
            
            sapo.run();
        });
    }
    
}
