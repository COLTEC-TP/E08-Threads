/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e08.threads;

import java.util.Scanner;

/**
 *
 * @author Mateu
 */
public class CorridaSapos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tamanho_pulo = 3;
        System.out.println("O tamanho do pulo é "+tamanho_pulo+"cm.");
        
        System.out.print("Digite o número de sapos: ");
        Scanner reader = new Scanner(System.in);
        int num_sapos = reader.nextInt();

        System.out.print("Digite a distancia da corrida (cm): ");
        int dist_corrida = reader.nextInt();
        
        reader.close();
        
        for(int i=1;i<=num_sapos;i++){
            Sapo s = new Sapo(dist_corrida, tamanho_pulo, i);
            Thread threadSapo = new Thread(s);
            threadSapo.start();
        }
        
    }
    
}
