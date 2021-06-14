import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        System.out.println("Introduce la letra s para sumar, r para restar, p ó m para multiplicar y d para dividir.");
        Scanner sc = new Scanner(System.in);
        String param1 = sc.nextLine().toUpperCase();// el carácter será minúscula aunque metan una mayúscula
        System.out.println("Introduce el primer operando:");
        Scanner sf = new Scanner(System.in);
        int param2 = sf.nextInt();
        System.out.println("Introduce el segundo operando:");
        Scanner sg = new Scanner(System.in);
        int param3 = sg.nextInt();

        if (param1.equals("S")) {
            System.out.println("La suma de " + param2 + " + " + param3 + " es igual a " + (param2 + param3));
        } else if (param1.equals("R")) {
            System.out.println("La resta de " + param2 + " - " + param3 + " es igual a " + (param2 - param3));
        } else if (param1.equals("P") || param1.equals("M")) {
            System.out.println("La multiplicación de " + param2 + " * " + param3 + " es igual a " + (param2 * param3));
        } else if (param1.equals("D")) {
            System.out.println("La división de " + param2 + " / " + param3 + " es igual a " + (param2 / param3));
        } else
            System.out.println("Alguno de los parámetros introducidos es incorrecto");
    }
}