public class Frogs extends Thread {
    private int id;
    private int distp;
    private int disride;
    private int distanciaCorrida;

    public Frogs(int id, int distp, int distanciaCorrida) {
        this.id = id;
        this.distp = distp;
        this.disride = 0;
        this.distanciaCorrida = distanciaCorrida;

    }

    @Override
    public void run(){
        while (this.disride < this.distanciaCorrida){

            System.out.println("Frog " + String.valueOf(this.id)+">>" + String.valueOf(this.disride));
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.disride += this.distp;

        }
        System.out.println("Frog " + String.valueOf(this.id)+">> GOTCHA!");
    }
}