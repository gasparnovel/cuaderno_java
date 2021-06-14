import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        
        Integer[] primos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        Integer num = sc.nextInt();
        primos = divisoresPrimos(num);
        System.out.println("Estos son los divisores primos:");
        System.out.println(Arrays.toString(Arrays.stream(primos).toArray()));
    }

    public static Integer[] divisoresPrimos(int n) {
        Integer[] array;
        ArrayList<Integer> primos = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++) {
            if (esPrimo(i))
                primos.add(new Integer(i));
        }

        array = new Integer[primos.size()];
        return primos.toArray(array);
    }

    public static boolean esPrimo(int n) {
        int cont = 2;
        boolean primo = true;

        while ((primo) && (cont != n)) {
            if (n % cont == 0)
                primo = false;
            cont++;
        }
        return primo;
    }
}