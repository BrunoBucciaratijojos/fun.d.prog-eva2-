/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_22_do_while;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_22_DO_WHILE {
final static String NOMBRE_USUARIO = "admin";
final static String PASSWORD = "admin";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      String usuario;
      String pwd;
      
         Scanner cap = new Scanner(System.in);
         do{
             System.out.println("introduce el usuario");
             usuario = cap.nextLine();
             System.out.println("introduce contraceña");
             pwd = cap.nextLine();
         }while ((!usuario.equals(NOMBRE_USUARIO )) || (!pwd.equals(PASSWORD)));
              System.out.println("bienvenido al sistema ");
    }
    
}
