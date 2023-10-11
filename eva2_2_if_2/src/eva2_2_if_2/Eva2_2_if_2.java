/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_if_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_2_if_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor2;
        int valor1;
        
       Scanner input= new Scanner(System.in);
        
        System.out.println("introduce el valor 1");
        valor1= input.nextInt();
        System.out.println("introduce el valor 2");
        valor2 = input.nextInt ();
        
        if(valor1>valor2)  //verdad, siempre es obligatorio
            
            System.out.println("el valor más grande es" +valor1); //contener cadena de text
        else{//caundo el resultado es falso
            if(valor1 == valor2) //verdad ambos valores son iguales
                
                System.out.println("ambos valores son iguales");
            else
                System.out.println("el valor mas grande es" +valor2);
        }
        } 
        
        
        
    }
    
}
