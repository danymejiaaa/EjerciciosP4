package ejercicio19;
import java.util.Scanner;
public class Ejercicio19 {
     public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        double nota;
        
        System.out.println("Favor ingresar un valor desde 1 hasta 10");
        nota=ingresar.nextDouble();
        
        while(nota<1 | nota>10)
        {
        System.out.println("Lo sineto pero el valor proporcionado no es valaido");
        nota=ingresar.nextDouble();
        }
        
    }  
}
