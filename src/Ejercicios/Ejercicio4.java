package Ejercicios;

/*
*UNA COMPAÑIA DE VENTA DE CARROS USADOS, PAGA A SU PERSONAL DE VENTAS UN SALARIO DE $1000
MENSUALES, MAS UNA COMISION DE $150 POR CADA CARRO VENDIDO, MAS EL 5% DEL VALOR DE LA VENTA
POR CARRO. CADA MES EL CAPTURISTA DE LA EMPRESA INGRESA EN LA COMPUTADORA LOS DATOS PERTINENTES.
HACER UN PROGRAMA QUE CALCULO E IMPRIMA EL SALARIO MENSUAL DE UN VENDEDOR DADO
* AUTOR: CHRISTIAN DAVID LUCIO
 */

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner calcular = new Scanner(System.in);

        final short salario = 1000;
        short comision = 150;
        int valorCarro, numeroCarros;
        String vendedor;

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("                            Calculando Salario mensual");

        System.out.print("Ingrese el nombre del vendedor: ");
        vendedor = calcular.nextLine();

        System.out.print("Ingrese el numero de los carros vendidos en el mes: ");
        numeroCarros = calcular.nextInt();

        System.out.print("Ingrese el valor de los carros vendidos: $");
        valorCarro = calcular.nextInt();

        int operacion = numeroCarros*comision;
        int ventaTotal = numeroCarros*valorCarro;
        int extra = (ventaTotal *5) /100;
        int salarioTotal = salario+operacion+extra;

        System.out.println("\nLa comisión por carros vendidos es de: $"+operacion+
                "\nCon una venta total de: $"+ventaTotal +
                "\nUn 5% por el valor de la venta de: $"+extra +
                "\nAl Vendedor "+vendedor+" se paga el salario de: $"+salarioTotal);
        System.out.println("------------------------------------------------------------------------------------------");

    }
}
