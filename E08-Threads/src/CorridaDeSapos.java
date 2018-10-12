import java.util.ArrayList;
import java.util.Scanner;

public class CorridaDeSapos {
    private static int Distacia;
    private static int NumSapos;

    public static void main(String[] args) {

        ArrayList<Thread> threads = new ArrayList();

        Scanner reader = new Scanner(System.in);
        System.out.print("\n Distância corrida : ");
        Distacia = reader.nextInt();

        System.out.print(" \n Número de sapos : ");
        NumSapos = reader.nextInt();

        for(int i = 0; i < NumSapos; i++) {
            System.out.print(" Pulo do sapo : " + i);
            int distanciaPulo = reader.nextInt();
            Thread threadSapo = new Thread(new Sapo(distanciaPulo, Distacia));
            threads.add(threadSapo);
        }

        for(int i = 0; i < NumSapos; i++) {
            threads.get(i).start();
        }

        reader.close();
    }
}
