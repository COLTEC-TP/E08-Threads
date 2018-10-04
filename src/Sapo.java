public class Sapo extends Thread {
    private int id;
    private int distanciaPulo;
    private int distanciaPercorrida;
    private int distanciaCorrida;

    public Sapo(int id, int distanciaPulo, int distanciaCorrida) {
        this.id = id;
        this.distanciaPulo = distanciaPulo;
        this.distanciaPercorrida = 0;
        this.distanciaCorrida = distanciaCorrida;
    }

    @Override
    public void run(){
        while (this.distanciaPercorrida < this.distanciaCorrida){
            System.out.println("Sapo " + String.valueOf(this.id)+": " + String.valueOf(this.distanciaPercorrida));
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.distanciaPercorrida += this.distanciaPulo;
        }
        System.out.println("Sapo " + String.valueOf(this.id)+": Chegou");
    }
}
