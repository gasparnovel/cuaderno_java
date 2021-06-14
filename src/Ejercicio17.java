import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        
        int[] numero = new int[4];
        int inicio = 0;
        int fin;
        boolean capicua = true;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Introduce un número entero");
            numero[i] = sc.nextInt();
        }

        fin = numero.length - 1;
        while (inicio <= fin && capicua) {
            capicua = (numero[inicio++] == numero[fin--]);
        }

        if (capicua)
            System.out.println("¡Es capicua!");
        else
            System.out.println("NO es capicua");
    }
}