/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_ejercicio2;

import java.util.Scanner;

/**
 *
 * @author gaels
 */
public class EVA2_EJERCICIO2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
           int num;
        int num2;
        int result;
        Scanner cap = new Scanner (System.in);
        System.out.println("introduce dos valores positivos ");
        num= cap.nextInt();
        num2=cap.nextInt();
        
        for (int i = 2; i < num2; i++) {
            
            
            result = num2/ i;
            
            
            i++;
            System.out.println("del" +num + "al" + num2+ " los numeros pares son los siguientes " +result);
        }
          for (int i = 2; i < num; i++) {
            
            
            result = num/ i;
            
            
            i++;
            System.out.println("del" +num2 + "al" + num+ " los numeros pares son los siguientes " +result);
        }
        
        
    }
}
