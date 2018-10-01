public class Sapo extends Thread{

    private int distanciaPercorrida;
    private int distanciaPulo;
    private int id;

    public Sapo(int distanciaPulo, int id) {
        this.distanciaPulo = distanciaPulo;
        this.id = id;
    }

    public void run() {
        while(this.getDistanciaPercorrida() < 100) {
            this.setDistanciaPercorrida(getDistanciaPercorrida() + this.distanciaPulo);
            System.out.println(this.id + " - " +  this.getDistanciaPercorrida());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.id + "acabou");
    }

    public int getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(int distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }
}
