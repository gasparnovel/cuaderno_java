import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        int n, m, res = 1;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número base: ");
        n = sc.nextInt();

        System.out.print("Introduce el número exponente: ");
        m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            res *= n;
        }

        System.out.println(n + " elevado a " + m + " es " + res);
    }

}