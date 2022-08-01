package Ejercicios;

/*
HACER UN PROGRAMA QUE CALCULE EL CUADRADO DE UNA SUMA (a+b)^2 = a^2 + b^2 +2ab
 */

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner cuadrado = new Scanner(System.in);

        double a,b,resultado;

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("                        Calculando el cuadrado de una suma");

        System.out.println("\nBienvenido! por favor ingresa los datos");
        System.out.print("Ingresa el valor de A: ");
        a = cuadrado.nextDouble();

        System.out.print("Ingresa el valor de B: ");
        b = cuadrado.nextDouble();

        resultado = Math.pow(a,2) + Math.pow(b,2) + (2*a*b);

        System.out.println("El resultado es: "+resultado);
        System.out.println("-----------------------------------------------------------------------------------------");

    }
}
