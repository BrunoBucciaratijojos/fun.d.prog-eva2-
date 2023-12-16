/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author gaels
 */
public class EJERCICIO6 {

    public static void main(String[] args) {
        Scanner cap = new Scanner (System.in);
        int decimal,modulo,aux;
        String binario= "";
        System.out.println("ingresa el numero decimal");
        decimal = cap.nextInt();
        aux= decimal;
        while(decimal > 0){
        modulo = (decimal % 2);
        binario = modulo + binario;
        decimal= decimal/2;
        
        }
        System.out.println("el numero es"+ aux +"base es" +binario);
    }
}
