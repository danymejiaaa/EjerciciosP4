package ejercicio20;
import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int password;
        do {
            System.out.print("Introduzca su contrasena numerica");
            password = keyboard.nextInt();
            if (password != 12345)
                System.out.println("La contrasena no es validia");
        }
        while (password != 12345);
    }
    
}
