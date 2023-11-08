/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_28_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_28_USO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        int [] califas;
        Scanner cap = new Scanner (System.in);
        System.out.println("cuantas califas quieres captura");
        cant =cap.nextInt();
        califas = new int [cant];
        
        for (int i = 0; i < cant; i++) {
            System.out.println("introduce la falificación");
            califas[i] = cap.nextInt();
        }
          for (int i = 0; i < cant; i++) {
              System.out.println("["+ califas[i] + "]");
        }
        
    }
    
}
