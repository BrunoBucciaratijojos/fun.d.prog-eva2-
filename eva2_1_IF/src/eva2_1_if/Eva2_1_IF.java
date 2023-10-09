/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_1_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner input = new Scanner(System.in);
        System.out.println("introduce la calificación");
        califa = input.nextInt();
        
        if(califa >= 70){
            // este bloque siempre es verdad¡¡¡
            //las llaves se usan cuando son más de una instrucción
            // dentro del if. si es una sola, no se usan
            //if(expresion a evaluar)
            System.out.println("aprobado"); // pertenece a if
        
        System.out.println("felicidades"); // no pertenece a if 
        }else //eslse ---> si no. ES OPCIONAL¡¡¡
            // ESTE BLOQUE ES SIEMPRE FALSO
            System.out.println("NO ACREDITADO");
        
        System.out.println("fin del programa ");
    }
    
}
