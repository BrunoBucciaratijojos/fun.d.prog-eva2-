/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_7_anio_bisiesto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_7_anio_bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int año ,resi4 ,resi100 ,resi400;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("introduce el año a evaluar");
        año = cap.nextInt();
       resi4 = año % 4;
        resi100 = año %100;
        resi400 = año % 400;
        // && operador Y (and)
        // || operador p (or)
        // ! operador negacion (not)
        // != operador diferente a
        if((resi4 == 0) && ((resi100 != 0)||(resi400 == 0)))
            System.out.println("el año" + año + "es bisiesto");
        else
            System.out.println("el año" + año + "no es bosiesto");
    }
    
}
