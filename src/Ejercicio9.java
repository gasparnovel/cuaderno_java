import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        
        int num;
        int factorial = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + num + " es: " + factorial);
    }

}