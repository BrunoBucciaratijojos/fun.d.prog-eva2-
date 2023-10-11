/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_3_numero_pares;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva3_3_numero_pares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int valor;
        int residuo;
        
        Scanner cap= new Scanner(System.in);
        
        System.out.println("introduce el valor a evaluar");
        valor= cap.nextInt();
        
        residuo = valor % 2; // módulo, calcula el residuo
        
        if(residuo != 0)// verdad --> el número es par
             System.out.println("el número es impar");
        
        else 
            System.out.println("el número es par");
        
            
               
    }
    
}
