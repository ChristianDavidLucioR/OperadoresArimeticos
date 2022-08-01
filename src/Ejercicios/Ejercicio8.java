package Ejercicios;

/*
HACER UN PROGRAMA QUE CALCULE Y MUESTRE POR PANTALLA LAS RAICES DE LA ECUACION DE SEGUNDO GRADO DE COEFICIENTES REALES.
 */
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner cuadrado = new Scanner(System.in);

        double a, b, c, resultado1, resultado2;

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("                        Calculando la Raiz Real");

        System.out.print("\nIngresa el valor de A: ");
        a = cuadrado.nextDouble();

        System.out.print("Ingresa el valor de B: ");
        b = cuadrado.nextDouble();

        System.out.print("Ingresa el valor de C: ");
        c = cuadrado.nextDouble();

        resultado1 = (-b + Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2*a);
        resultado2 = (-b - Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2*a);

        System.out.println("\nEl resultado de la raiz 1 es: "+resultado1);
        System.out.println("El resultado de la raiz 2 es: "+resultado2);
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
