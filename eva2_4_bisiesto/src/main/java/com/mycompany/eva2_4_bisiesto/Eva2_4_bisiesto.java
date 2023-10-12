/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_bisiesto;

import java.util.Scanner;

/**
 *
 * @author gaels
 */
public class Eva2_4_bisiesto {

    public static void main(String[] args) {
        int year;
        int residuo = 0;
        Scanner cap= new Scanner (System.in);
        
        System.out.println("introduce el año a evaluar ");
        year = cap.nextInt();
        residuo = year % 4 ;
        if (residuo == 0){
            residuo = year % 100 ;
            if (residuo == 0){
                
                residuo =  year % 400;
                if(residuo == 0){
                    System.out.println("es bisiesto");
                }else{
                    System.out.println("no es bisiesto");
                }
                
                        
                
            
            }else{
                System.out.println("es bisiesto");
            }
            
        
        }else{
            System.out.println("no es año bisiesto");
        
        }
        
        
        
        
    }
}
