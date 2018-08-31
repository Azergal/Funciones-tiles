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
       Scanner read = new Scanner(System.in);
       num = read.nextInt();
   
       return num;
   }
   
   public static double readDouble(){
       double num;
       Scanner read = new Scanner(System.in);
       num = read.nextDouble();
   
       return num;
   }
   
   public static float readFloat(){
       float num;
       Scanner read = new Scanner(System.in);
       num = read.nextFloat();
   
       return num;
   }
   
   public static String readString(){
       String string;
       Scanner read = new Scanner(System.in);
       string = read.nextLine();
   
       return string;
   }
    
    
}
