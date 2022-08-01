package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner notas = new Scanner(System.in);

        float participacion;
        float primerExamen, segundoExamen, examenFinal, notaFinal;
        String nombre;

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("                        Calculando las notas del estudiante");

        System.out.print("\nIngresa el nombre del estudiante: ");
        nombre = notas.nextLine();
        System.out.print("Ingresa la nota de participancion: ");
        participacion = notas.nextFloat();

        System.out.print("Ingresa la nota del primer examen: ");
        primerExamen = notas.nextFloat();

        System.out.print("Ingresa la nota del segundo examen: ");
        segundoExamen = notas.nextFloat();

        System.out.print("Ingresa la nota del examen final: ");
        examenFinal = notas.nextFloat();

        participacion *= 0.10f; //10%
        primerExamen *= 0.25f;  //25%
        segundoExamen *= 0.25f; //25%
        examenFinal *= 0.40f;   //40%

        notaFinal = participacion + primerExamen + segundoExamen + examenFinal;

        System.out.println("El estudiante " +nombre+ " tiene una nota final de: "+notaFinal);
        System.out.println("-----------------------------------------------------------------------------------------");

    }
}
