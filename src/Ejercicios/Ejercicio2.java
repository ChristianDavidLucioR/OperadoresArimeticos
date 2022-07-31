package Ejercicios;

import java.util.Scanner;

/*
*HACER UN PROGRAMA QUE CALCULE E IMPRIMA EL SALARIO SEMANAL DE UN EMPLEADO A PARTIR DE SUS HORAS SEMANALES
TRABAJADAS Y DE SU SALARIO POR HORAS.
*AUTOR: CHRISTIAN DAVID LUCIO
 */

public class Ejercicio2 {

    public static void main(String[] args) {

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("                            Calculando el Salario del trabajador");
        Scanner trabajador = new Scanner(System.in);

        byte semana;
        short horas = 8;
        String nombre;
        double salario = 4.166;

        double operacion = horas *salario;

        System.out.print("Ingrese el nombre del trabajador: ");
        nombre = trabajador.nextLine();
        System.out.print("Ingrese la cantidad de dias trabajados: ");
        semana = trabajador.nextByte();

        double resultado = operacion*semana;
        double redondear = Math.round(resultado);
        System.out.println("\nEl salario del trabajor "+nombre+" en la semana es de: $"+redondear);
        System.out.println("------------------------------------------------------------------------------------------");


    }
}
