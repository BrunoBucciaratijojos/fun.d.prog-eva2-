/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_6_and_or_operadores;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_6_and_or_operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner cap = new Scanner (System.in) ;
        System.out.println("introduce la calificación");
        califa = cap.nextInt();
        
        if((califa<=0) && (califa>=0)){
            
            System.out.println("la calicación es" + califa + "es valido"); 
            
            
        }else{
            System.out.println("la calificación" + califa + " no es valida");
        }
        
        
    }
    
}
