import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número para saber su factorial:");
        Integer resultado = sc.nextInt();
        long fact = 1;
        int i = 1;
        while (i <= resultado) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of " + resultado + " is: " + fact);
    }
}