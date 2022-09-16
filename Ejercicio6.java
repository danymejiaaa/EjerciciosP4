package ejercicio6;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
    String nombre, clave;
    Scanner entrada = new Scanner (System.in);
    System.out.println( "Ingrese el nombre de usuario");
    nombre = entrada.nextLine();
    System.out.println( "Ingrese clave de usuario");
    clave = entrada.nextLine();
    if (nombre.equals("juan")&& clave.equals("123456")){
        System.out.println( "Bienvenido al Sistema");
    }
    else {
        System.out.println( "Nombre de Usuario o contraseña Incorrecto");
    }
    }
    
}
