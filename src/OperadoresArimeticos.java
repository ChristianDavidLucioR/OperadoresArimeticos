import java.util.Scanner;

public class OperadoresArimeticos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float numero1, numero2, resta, suma, multiplicacion, divicion, residuo;

        System.out.println("Ingresa dos numeros para realizar las operaciones: ");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        divicion = numero1 / numero2;
        residuo = numero1 % numero2;

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("                            Probando operadores Arimeticos");
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
        System.out.println("El resultado de la divicion es: "+divicion);
        System.out.println("El resultado del residuo es: "+residuo);
    }
}
