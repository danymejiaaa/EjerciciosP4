package ejercicio_11;
import java.util.Scanner;
public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numlados;
        System.out.print("Numero de lados");
        numlados = entrada.nextInt();
        switch(numlados){
            case 1:
            System.out.println("No es figura");
            break;
            case 2:
            System.out.println("No es figura");
            break;
            case 3:
            System.out.println("Triangulo");
            break;
            case 4:
            System.out.println("Cuadrado o Rectangulo");
            case 5:
            System.out.println("Pentagono");
            break;
            case 6:
            System.out.println("Hexagono");
            break;
            case 8:
            System.out.println("Octagono");
            break;
            default:
            System.out.println("No registrada");
        }
    }
    
}
