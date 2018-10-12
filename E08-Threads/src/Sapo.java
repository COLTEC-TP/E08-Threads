public class Sapo extends Thread{

    private int distanciaPercorrida=0;
    private int distanciaPulo=0;
    private int IdSapo;
    private int distanciaCorrida;

    public Sapo(int distanciaPulo, int IdSapo) {
        this.distanciaPulo = distanciaPulo;
        this.IdSapo = IdSapo;
        this.distanciaCorrida = distanciaCorrida;
        this.distanciaPercorrida= 0;

    }

    public int getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(int distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    
    public void run() {
        while(this.getDistanciaPercorrida() < this.distanciaCorrida) {
            this.setDistanciaPercorrida(getDistanciaPercorrida() + this.distanciaPulo);
            System.out.println( "Sapo : "this.IdSapo + " --- " + "Distância Percorrida : " + this.getDistanciaPercorrida());

            try {
              sleep(500);
            } 
            
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.IdSapo + "--- Corrida finalizada ---");
    }

}
