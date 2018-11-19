import java.util.ArrayList;
        import java.util.Scanner;

        import static java.lang.Thread.sleep;

public class ToadRace {

    private static int distacia;
    private static int numFrog;

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Distancia da corrida>> ");
        distacia = sc.nextInt();
        System.out.print("Numero de frogs>> ");
        numFrog = sc.nextInt();

        ArrayList<Thread> Frogs = new ArrayList<>();

        for (int i=0; i<numFrog; i++){
            System.out.print("Distancia do jump do frog " + i + ">> ");
            int distanciaPulo = sc.nextInt();
            Frogs.add(new Frogs(i, distanciaPulo, distacia));
        }

        System.out.println("A race já vai começar!!!");
        try {
            sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i=0; i<numFrog; i++){
            Frogs.get(i).start();
        }

    }
}