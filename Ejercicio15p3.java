package ejercicio15p3;
import java.util.Scanner;
public class Ejercicio15p3 {
    public static void main(String[] args) {
        Scanner objetoNum = new Scanner(System.in);
        
        int valinicial, valfinal;
        
        valinicial=8;
        System.out.println("Multiplos de 8 hasta 500");
        
        while (valinicial<=500)
            
        {
            System.out.println(valinicial +"x,");
            valinicial=valinicial+8;
        }     
    }
    
}
