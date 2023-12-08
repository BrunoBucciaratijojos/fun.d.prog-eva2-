/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_ejercicio1;

import java.util.Scanner;

/**
 *
 * @author gaels
 */
public class EVA2_EJERCICIO1 {

    public static void main(String[] args) {
        int num;
        int num2;
        Scanner cap = new Scanner (System.in);
        System.out.println("introduce dos valores positivos ");
        num= cap.nextInt();
        num2=cap.nextInt();
        
        
                
        if(num<num2){
            
            
                for (int i = num; i <=num2 ; i++) {
                    System.out.println(i);
                }
                
                
            }else{
        if(num>num2){
            for (int i = num2; i <= num; i++) {
                System.out.println(i);
            }
           
        }
        else{
            System.out.println("tu valor es invalido");
        }
        }
        
                
            
        

        }
    }

