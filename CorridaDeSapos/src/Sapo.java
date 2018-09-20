
import java.util.Random;

public class Sapo extends Thread {

    private float distanciaPercorrida=0;
    private float distanciaPulo=0;
    private float distanciaCorrida=0;
    private int sapoID;

    public void setDistanciaPulo(float distanciaPulo) {
        this.distanciaPulo = distanciaPulo;
    }

    public void setDistanciaCorrida(float distanciaCorrida) {
        this.distanciaCorrida = distanciaCorrida;
    }

    public void setSapoID(int sapoID) {
        this.sapoID = sapoID;
    }

    public void run(){

        Random geradorDistancia = new Random();
        setDistanciaPulo(geradorDistancia.nextFloat()*3);

        for (int d=0;d<=distanciaCorrida;d++){

            try {
                if(distanciaPercorrida >= distanciaCorrida) {
                    System.out.println("\n\n -----Sapo "+sapoID+" VENCEU A CORRIDA!!!-----");
                    System.exit(0);
                }
                
                sleep(500);

                distanciaPercorrida = distanciaPercorrida + distanciaPulo;
                System.out.println("\n Sapo "+sapoID+" Percorreu:" + distanciaPercorrida);

                
            }catch (InterruptedException e){}
        }
    }
}
