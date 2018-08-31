package funciones.utiles;

/**
 *
 * @author Azergal
 */

public class CalcularAreasFiguras {
    
    public static int areaCuadrado(int side){
        return side * 2;  
    }
    
    public static int areaRectangulo(int base, int height){
        return (base * height) / 2;
    }
    
    public static int areaTriangulo(int base, int height){
        return base * height;
    }
    
     public static double areaCirculo(int radius){
        return Math.PI * (Math.pow(radius, 2));
    }
    
}
