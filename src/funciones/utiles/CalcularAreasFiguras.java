package funciones.utiles;

/**
 *
 * @author Azergal
 */

public class CalcularAreasFiguras {
    
    public static int areaCuadrado(int lado){
        return lado * 2;  
    }
    
    public static int areaRectangulo(int base, int altura){
        return (base * altura) / 2;
    }
    
    public static int areaTriangulo(int base, int altura){
        return base * altura;
    }
    
     public static double areaCirculo(int radio){
        return Math.PI * (Math.pow(radio, 2));
    }
    
}
