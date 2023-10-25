/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_califas_eua;

import java.util.Scanner;

/**
 *
 * @author gaels
 */
public class EVA2_11_CALIFAS_EUA {

    public static void main(String[] args) {
        
        int califa;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("calificación");
        califa = cap.nextInt();
        
        if((califa>=90) && (califa<=100) ){
            
            System.out.println("tu calificación"+califa+"equivale a una A");
        }else {
            System.out.println("valor no valido");
        }
        
            if((califa>=80) && (califa<=89)){
            System.out.println("tu calificación"+califa+"equivale a una B");
            }else{
                System.out.println("valor no valido");
            }
            if ((califa>=70) && (califa<=79)){
                System.out.println("tu calificación "+califa+"equivale a una C");
            }else
                System.out.println("valor no valido");
            if ((califa>=60) && (califa<=69)){
                System.out.println("tu calificación" +califa+"equivale a una D");
            }else{
                System.out.println("valor no valido");
            }
            if((califa>=0) && (califa<=59)){
                System.out.println("tu calificación" +califa+"equivale a una F");
            }else{
                System.out.println("valor no valido");
            }
            
            
                    
        
    }
}
