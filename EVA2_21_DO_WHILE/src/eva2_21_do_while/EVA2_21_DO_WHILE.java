/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_21_do_while;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_21_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int valor;
        Scanner cap = new Scanner(System.in);
        //ASEGURA AL MENOS UNA VES LA EJECUCION DE LAS 
        //INSTRUCCIONES DENTRO DEL CICLO
      
         do{
             System.out.println("introduce un valor");
               valor = cap.nextInt();
}while(valor != 100);
 
    }
   
}
