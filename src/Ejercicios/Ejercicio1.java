package Ejercicios;

/*
*HACER UN PROGRAMA QUE CALCULE E IMPRIMA LA SUMA DE TRES CALIFICACIONES
* Autor: CHRISTIAN DAVID LUCIO
 */

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("                            Calculando Notas");

        Scanner notas = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;

        System.out.println("Ingrese las 3 notas del estudiante: ");
        nota1 = notas.nextDouble();
        nota2 = notas.nextDouble();
        nota3 = notas.nextDouble();

        double resultado = nota1+nota2+nota3;
        System.out.println("la suma de las 3 notas ingresadas son: "+resultado);
        System.out.println("------------------------------------------------------------------------------------------");
    }
}
