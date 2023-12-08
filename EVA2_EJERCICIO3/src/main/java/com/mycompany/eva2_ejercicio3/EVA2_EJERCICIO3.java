/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_ejercicio3;

import java.util.Scanner;

/**
 *
 * @author gaels
 */
public class EVA2_EJERCICIO3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
         int num;  
        
        
        Scanner cap = new Scanner (System.in);
        System.out.println("introduce dos valores positivos ");
        num= cap.nextInt();
        
        
        for (int i = 1; i < num; i++) {
            System.out.print(i);   
        }
    }
}
