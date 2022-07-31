package Ejercicios;

/*
GUILLERMO TIENE N DOLARES. LUIS TIENE LA MITAD DE LO QUE POSEE GUILLLERMO.
JUAN TIENE LA MITAD DE LO QUE POSEEN LUIS Y GUILLERMO JUNTOS.
HACER UN PROGRAMA QUE CALCULE E IMPRIMA LA CANTIDAD DE DINERO QUE TIENEN ENTRE LOS TRES.
*AUTOR: CHRISTIAN DAVID LUCIO
 */

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner usd = new Scanner(System.in);

        final short dolar;

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("                            Calculando cantidad de dolares");

        System.out.print("\nIngrese la cantidad de dolares de Guillermo: $");
        dolar = usd.nextShort();
        System.out.println("\nLa cantidad de Guillermo son: " +dolar+ " US");

        int luisD = dolar/2;
        System.out.println("La cantidad que tiene Luis son: " +luisD+ " US");

        int juan = (dolar + luisD) /2;
        System.out.println("La cantidad que tiene Juan son: " +juan+ " US");
        System.out.println("------------------------------------------------------------------------------------------");


    }
}
