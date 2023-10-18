/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_5_operaciones;

/**
 *
 * @author invitado
 */
public class Eva2_5_operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int val1=3 ;
        int val2= 2 ;
        int suma;
        // suma +
        suma = val1 + val2 ;
        System.out.println("suma-------------");
        System.out.println("la suma es =" + suma);
        
        //resta -
        int resta;
        
        resta = val1 - val2;
        System.out.println("resta----------------");
        System.out.println("la resta es =" + resta);
        
        // multiplicación *
        
        int multi;
        
        multi = val1 * val2;
        System.out.println("multiplicación-------------");
        System.out.println("la multplicación es =" + resta );
        
        //division /
        
        int divi ;
        
        int cons1 =20;
        int cons2 = 10;
         
        divi = cons1 / cons2 ;
        System.out.println("division-------------");
        System.out.println("la division es =" + divi);
        
        // potencia 
       double potencia = Math.pow( 3 , 3);
       
        System.out.println("potencia------------");
        System.out.println("3 elevado a la 3 =" + potencia );
        //raiz --> no hay operador
        double raiz = Math.pow(100, 0.5);
        System.out.println("raiz---------------");
        System.out.println("la raiz cuadrada de 100 es =" + raiz);
        
        // procedencia de operadores:
        
        int resuOp, x= 3, y = 2, z = 5;
        resuOp = (x * z) + ( x * y) / 2 - (y - z);
        System.out.println("operadores--------------");
        System.out.println("el resultado es" + resuOp);
        
        //formula general
        double resum, a = 3, b = 9, c = 3;
        
        resum= ((-b) - Math.pow((b*b) - (4 * a * c), 0.5) ) /(2 * a) ;
        System.out.println("el resultado es" + resum);
                
    }
    
}
