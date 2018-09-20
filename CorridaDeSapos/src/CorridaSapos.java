
import java.util.ArrayList;
import java.util.Scanner;

public class CorridaSapos {

    private static float distanciaCorrida;
    private static int numeroSapos;

    public  static ArrayList geraSapos(int numeroSapos){

        ArrayList<Sapo> todosSapos= new ArrayList<>();

        for (int i=0;i<numeroSapos;i++){
            Sapo s = new Sapo();
            s.setSapoID(i);
            s.setDistanciaCorrida(distanciaCorrida);
            todosSapos.add(s);
        }
        return todosSapos;
    }

    public static void main(String[] args){

        float dC=0;
        int nS=0;

        Scanner ler = new Scanner(System.in);

        System.out.println("\nBEM VINDO À CORRIDA DE SAPOS DO COLTEC!!!\n");
        System.out.println("Qual será a extensão total do trajeto?");
        dC = ler.nextFloat();
        System.out.println("\nQuantos sapos estarão participando?");
        nS = ler.nextInt();

        distanciaCorrida = dC;
        numeroSapos = nS;

        ArrayList<Sapo> saposGerados = geraSapos(nS);

        for (Sapo s:saposGerados) {
            s.start();
        }
    }
}
