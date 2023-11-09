/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_30_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_30_USO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] listaprod = new String[10];
        
        listaprod[0] = "tacos";
        listaprod[1] = "tortas";
        listaprod[2] = "tamales";
        listaprod[3] = "tlacoyos";
        listaprod[4] = "tlayudas";
        listaprod[5] = "tampiqueñas";
        listaprod[6] = "tortas ahogadas";
        listaprod[7] = "tchilaquiles";
        listaprod[8] = "t-bone";
        listaprod[9] = "tripas";
        // si tenesmos los datos previamente, se aconseja hacerlo asi:
        // Stirng[] listaprod = {"tacos", "tortas"}; //equivalente
        
        double[] listprecios = {20,40,15,30,54,60,200,400,10};
        
        System.out.println("------menú--------");
        for (int i = 0; i < listaprod.length; i++) {
            System.out.println("-"+ listaprod[i]+":$"+ listprecios[i]);
            
        }
        Scanner cap= new Scanner(System.in);
        int op, cant;
        System.out.println("¿que deseas ordenar?");
        op = cap.nextInt();
        System.out.println("cauntas órdenes");
        cant = cap.nextInt();
        System.out.println("tu total es de: $"+ (cant * listprecios[opc]));
    }
    
}
