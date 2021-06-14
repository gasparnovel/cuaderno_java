import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        int maximo, minimo;
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[4];

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Introduce un número entero");
            numero[i] = sc.nextInt();
        }

        maximo = Integer.MIN_VALUE;

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] > maximo)
                maximo = numero[i];
        }

        minimo = Integer.MAX_VALUE;

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] < minimo)
                minimo = numero[i];
        }

        Arrays.sort(numero);
        System.out.println("El mínimo es: " + numero[0]);
        System.out.println("El máximo es: " + numero[numero.length - 1]);

    }

}