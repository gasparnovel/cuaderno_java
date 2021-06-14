import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        System.out.println("Escribe un número: ");
        Scanner sc = new Scanner(System.in);
        Integer radio = sc.nextInt();
        double volumen = (4 / 3) * Math.PI * (radio * radio * radio);
        double superficie = 4 * Math.PI * Math.pow(radio, 2);
        System.out.println("El volumen con ese " + radio + " es : " + volumen);
        System.out.println("La superficie con ese " + radio + " es : " + superficie);
    }

}