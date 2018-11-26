/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e08.threads;

/**
 *
 * @author Mateu
 */
public class Sapo implements Runnable {
    private int distPercorrida;
    private final int distanciaPulo;
    private final int distanciaCorrida;
    private final int id;
    
    public Sapo(int distanciaCorrida, int distanciaPulo, int id) {
        this.distanciaCorrida = distanciaCorrida;
        this.distanciaPulo = distanciaPulo;
        this.id = id;
    }
    
    public void run(){
        for(this.distPercorrida=0; this.distPercorrida<this.distanciaCorrida;this.distPercorrida=this.distPercorrida+this.distanciaPulo){
            System.out.println("Sapo "+id+": "+this.distPercorrida+"cm");
            try {
                Thread.sleep((long)Math.random()*2);
            } catch ( InterruptedException e) {}
        }
        System.out.println("** O sapo "+id+" chegou **");
            
    }
}
