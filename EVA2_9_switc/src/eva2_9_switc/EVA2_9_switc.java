/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_switc;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_9_switc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int mes;
        
        Scanner cap = new Scanner(System.in);
        
        System.out.println("el mes a evaluar");
        mes = cap.nextInt();
        switch (mes){
        case 1 :  // inicio el caso 
        System.out.println("ENERO");
        break; // termina el caso
     case 2 :  // inicio el caso 
        System.out.println("FEBRERO");
        break; // termina el caso
         case 3 :  // inicio el caso 
        System.out.println("MARZO");
        break; // termina el caso
         case 4 :  // inicio el caso 
        System.out.println("ABRIL");
        break; // termina el caso
         case 5 :  // inicio el caso 
        System.out.println("MAYO");
        break; // termina el caso
         case 6 :  // inicio el caso 
        System.out.println("JUNIO");
        break; // termina el caso
         case 7 :  // inicio el caso 
        System.out.println("JULIO");
        break; // termina el caso
         case 8 :  // inicio el caso 
        System.out.println("AGOSTO");
        break; // termina el caso
         case 9 :  // inicio el caso 
        System.out.println("SEPTIEMBRE");
        break; // termina el caso
         case 10 :  // inicio el caso 
        System.out.println("OCTUBRE");
        break; // termina el caso
         case 11 :  // inicio el caso 
        System.out.println("NOVIEMBRE");
        break; // termina el caso
         case 12 :  // inicio el caso 
        System.out.println("DICIEMBRE");
        break; // termina el caso
         default:  // cuando ninguna opcion no es valida y siempre va al final
             System.out.println("el numero"  +mes +  "no es valido");
        }
    }
    
}
