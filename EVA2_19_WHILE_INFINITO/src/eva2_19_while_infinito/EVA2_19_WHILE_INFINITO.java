/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_while_infinito;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_19_WHILE_INFINITO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int nume = 100;
        int captu = 0;
        
        Scanner cap = new Scanner (System.in);
        
        while(true){// ciclo infinito, por si solo, nunca se va a detener
            System.out.println("introduce el número");
              captu = cap.nextInt();
        if (captu == nume){
                System.out.println("adivinates");
                break;// romper---> DETIENE LA EJECUCIÓN DEL CICLO
        }
        }
    }
    
}
