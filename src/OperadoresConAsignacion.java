public class OperadoresConAsignacion {

    public static void main(String[] args) {

        int number = 50;
        int number1 = 20;
        int number2 = 50;
        int number3 = 50;
        int number4 = 50;
        int number5 = 50;

        number += 25; // ESTO ES IGUAL A: number + number +25;
        number2 -= 15;
        number3 *= 2;
        number4 /= 3;
        number5 %= 2;

        System.out.println("El resultado es: " +number);
        System.out.println("El resultado es: " +number1);
        System.out.println("El resultado es: " +number2);
        System.out.println("El resultado es: " +number3);
        System.out.println("El resultado es: " +number4);
        System.out.println("El resultado es: " +number5);

    }
}
