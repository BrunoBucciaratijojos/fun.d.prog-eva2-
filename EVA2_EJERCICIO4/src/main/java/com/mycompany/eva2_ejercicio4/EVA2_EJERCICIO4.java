/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_ejercicio4;

import java.util.Scanner;

/**
 *
 * @author gaels
 */
public class EVA2_EJERCICIO4 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
       
        int seguir = 1;
        while (seguir == 1) {
              int num;  
        
        
        Scanner cap = new Scanner (System.in);
        System.out.println("introduce un numero");
        num= cap.nextInt();
        
            
        if (num < 0){
            System.out.println("el numero es negativo");
        
        }else if (num > 0){ 
            System.out.println("el numero es posivito");
        }else {
            System.out.println("el valor es cero");
        }
            System.out.println("¿quieres repetir el programa?");
            System.out.println("presiona 1 para repetir");
            System.out.println("presiona 2 para terminarlo");
            seguir= cap.nextInt();
                
        }  
    
   
        
    
    
    
    
    }
}
