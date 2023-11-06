/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_26_ciclos_animados;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA_26_CICLOS_ANIMADOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nume;
        Scanner cap = new Scanner (System.in);
        System.out.println("introduce el número");
        nume= cap.nextInt();
        for (int i = 1; i <= nume; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
        }
               
    }
    
}
