package ejercicio18;
import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int valor;
        do {
            System.out.print("Ingrese valor entre 0 y 999");
            valor = datos.nextInt();
            if (valor>=100) {
                System.out.println("Es de 3 digitos");
            } else {
                if (valor>=10) {
                    System.out.println("El valor es de 2 digitos");
                } else {
                    System.out.println("es de 1 digito");
                }
            }
        } while (valor!=0) ;
    }
    
}
