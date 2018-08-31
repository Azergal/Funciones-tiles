/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones.utiles;

import java.util.Scanner;

/**
 *
 * @author Azergal
 */
public class FuncionesTeclado {
    
    
    public static int readInt(){
     
       int num;
       Scanner leer = new Scanner(System.in);

       num = leer.nextInt();
   
       return num;
   }
   
   public static double readDouble(){
     
       double num;
       Scanner leer = new Scanner(System.in);

       num = leer.nextDouble();
   
       return num;
   }
   
   public static float readFloat(){
     
       float num;
       Scanner leer = new Scanner(System.in);

       num = leer.nextFloat();
   
       return num;
   }
   
   public static String readString(){
     
       String cadena;
       Scanner leer = new Scanner(System.in);
       
       cadena = leer.nextLine();
   
       return cadena;
   }
    
    
}
