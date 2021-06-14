import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        System.out.println("Escribe tu peso en kilogramos");
        Scanner entrada = new Scanner(System.in);
        double peso = entrada.nextDouble();

        System.out.println("Escribe tu altura en metros");
        Scanner entrada2 = new Scanner(System.in);
        double altura = entrada2.nextDouble();

        double ims = Math.round(peso / (altura * altura));

        System.out.println("Este es tu IMS: " + ims);
        if (ims < 18) {
            System.out.println("Estas por debajo del IMS recomendado");
        } else if (ims >= 18 && ims <= 25) {
            System.out.println("Estas en el IMS saludable");
        } else
            System.out.println("Estas por encima del IMS recomendado");
    }
}