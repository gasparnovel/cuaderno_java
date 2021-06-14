import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] v1 = new int[3];
        int[] v2 = new int[3];
        int[] v3;

        for (int i = 0; i < v1.length; i++) {
            System.out.println("Introduce un número entero");
            v1[i] = sc.nextInt();
        }
        System.out.println("Este es tu primer grupo de numeros");
        for (int i = 0; i < v1.length; i++) {
            System.out.println(v1[i] + " ");
        }

        for (int i = 0; i < v2.length; i++) {
            System.out.println("Introduce un número entero");
            v2[i] = sc.nextInt();
        }
        System.out.println("Este es tu segundo grupo de numeros");
        for (int i = 0; i < v2.length; i++) {
            System.out.println(v2[i] + " ");
        }

        if (v1.length > v2.length) {
            v3 = new int[v1.length];
            for (int i = 0; i < v2.length; i++) {
                v3[i] = v1[i] + v2[i];
            }
            for (int i = v2.length; i < v3.length; i++) {
                v3[i] = v1[i];
            }
        } else {
            v3 = new int[v2.length];
            for (int i = 0; i < v1.length; i++) {
                v3[i] = v1[i] + v2[i];
            }

            for (int i = v1.length; i < v3.length; i++) {
                v3[i] = v2[i];
            }
        }
        System.out.println("Este es el resultado de sumar los dos grupos");
        for (int i = 0; i < v3.length; i++) {
            System.out.print(v3[i] + " ");
        }
    }
}