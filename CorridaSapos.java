import java.util.ArrayList;
import java.util.Scanner;

public class CorridaSapos {
    public static void main(String[] args) {

        ArrayList<Thread> threads = new ArrayList();

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = reader.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print(i + " - jump: ");
            int distanciaPulo = reader.nextInt();
            Thread threadSapo = new Thread(new Sapo(distanciaPulo, i));
            threads.add(threadSapo);
        }

        for(int i = 0; i < n; i++) {
            threads.get(i).start();
        }

        reader.close();
    }
}
