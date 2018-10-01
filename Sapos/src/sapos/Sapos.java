/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapos;

/**
 *
 * @author riversong
 */
class Sapos {
        
    private int id;
    private float distanciaPercorrida;
    private float distanciaPulo;
    private float distanciaTotal;
    
    
    public Sapos(int id, float percorrida, float pulo, float total) {
        this.id = id;
        this.distanciaPercorrida = percorrida;
        this.distanciaPulo = pulo;
        this.distanciaTotal = total;
    }
    
    
    public void run () {
        while (this.distanciaPercorrida < distanciaTotal) {
            distanciaPercorrida += distanciaPulo;
            System.out.println("Id: " + id + " - Pulo " + distanciaPulo + " - Total: " + distanciaPercorrida);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }      
     
}
