import java.util.Scanner;

public class ClaseMath {

    public static void main(String[] args) {

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("                                Probando Metodos de la clase MATH");

        double raiz =  Math.sqrt(256);
        System.out.println("La raiz es: "+raiz);

        double base = 5, exponente = 2;
        double resultado = Math.pow(5,2);
        System.out.println("El resultado de la base es: "+resultado);

        double redondear = 4.56;
        double resultado2 = Math.round(redondear);
        System.out.println("El resultado del numero a redondear es: "+resultado2);

        short aleatorio = (short) (Math.random()*10000); //MULTIPLICAR PARA QUE RECORRA HASTA LOS DIGITOS QUE QUERAMOS
        System.out.println("El numero aleatorio es: "+aleatorio);
        System.out.println("------------------------------------------------------------------------------------------");

    }
}
