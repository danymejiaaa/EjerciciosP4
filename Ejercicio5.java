package ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int reglas;
    double nota;
    System.out.println( "Usted cumple las reglas de la universidad:");
    System.out.println( "Ingrese el numero \n1. Siempre \n2. A veces \n3.Nunca");
    reglas = entrada.nextInt();
    System.out.println( "Que nota obtuvo en el laboratorio: ");
    nota = entrada.nextDouble();
    if (reglas == 1){
        if (nota >=8 & nota <=10){
            nota = 10;
        } else {
            System.out.println( "Nota invalida");
        }
    } else if (reglas == 2){
        if (nota < 6){
            nota = nota + 0.5;
        } else if (nota >= 6 & nota < 8){
            nota = nota + 0.7;
        }else {
            System.out.println( "Nota invalida");
        }
    } else {
        System.out.println( "Usted debe cumplir las reglas" );
    }
    System.out.println( "La nueva nota es " + nota);
    
    }
}    
    

