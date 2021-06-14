import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        boolean acierto = false;
        int intentos = 4;
        int num;
        int x = (int) (100 * Math.random() + 1);
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Intenta adivinar el número");
            System.out.println("Te quedan " + intentos + " intentos");
            System.out.print("Introduce el numero que crees que es: ");

            num = sc.nextInt();
            intentos--;

            if (num == x) {
                acierto = true;
            } else if (x > num) {
                System.out.println("El numero debe ser mayor.");
            } else {
                System.out.println("El numero debe ser menor.");
            }
        } while (!acierto && intentos > 0);
        if (acierto)
            System.out.println("Acertaste!");
        else
            System.out.println("No acertaste. El número era: " + x);
    }
}