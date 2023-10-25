/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_12_tallas;

import java.util.Scanner;

/**
 *
 * @author gaels
 */
public class EVA2_12_TALLAS {

    public static void main(String[] args) {
        int talla;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("número de talla");
        talla= cap.nextInt();
        
        switch(talla){
            case 29 -> System.out.println("SMALL");
            case 42 -> System.out.println("MEDIUM");
            case 44 -> System.out.println("LARGE");
            case 48 -> System.out.println("xLARGGE");
            default -> System.out.println("el valor"+talla+"no es valido");
                            
        }
        
    }
}
