package Ejercicios;

import java.util.Scanner;
/*
Hacer un programa que, dado un número tal de horas, devuelve el número de semanas, dias y horas.
Por ejemplo: dado un total de 1000 horas debe mostrar 5 semanas, 6 dias y 16 horas.
*AUTOR: CHRISTIAN DAVID LUCIO
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner tiempo = new Scanner(System.in);

        int horaT, horas, dias, semanas;

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("                        Calculando las Horas");

        System.out.println("\nBienvenido!");
        System.out.print("Ingrese la cantidad de horas para cualcular: ");
        horaT = tiempo.nextShort();

         semanas = horaT / 168;
         dias = horaT%168 / 24;
         horas = horaT%24;

        System.out.println("La cantidad de semanas son: ("+semanas+") con: ("+dias+ ") dias y ("+horas+") horas");
        System.out.println("-----------------------------------------------------------------------------------------");

    }
}
