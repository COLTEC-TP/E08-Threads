import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class CorridaSapos {
    private static int distacia;
    private static int numSapos;


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Distância da corrida: ");
        distacia = sc.nextInt();
        System.out.print("Número de sapos participantes: ");
        numSapos = sc.nextInt();

        ArrayList<Thread> sapos = new ArrayList<>();

        for (int i=0; i<numSapos; i++){
            System.out.print("Distância do pulo do sapo " + i + ": ");
            int distanciaPulo = sc.nextInt();
            sapos.add(new Sapo(i, distanciaPulo, distacia));
        }

        System.out.println("A corrida já vai começar!");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i=0; i<numSapos; i++){
            sapos.get(i).start();
        }

    }
}
