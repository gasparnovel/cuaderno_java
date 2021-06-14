import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe los grados Celsius que quieres convertir en Fahrenheit: ");
        double gradosC = sc.nextDouble();
        System.out.println("Escribe los grados Fahrenheit que quieres convertir en Celsius: ");
        double gradosF = sc.nextDouble();
        System.out.println(gradosF + " grados Fahrenheit a Celsius: " + calculaCelsius(gradosF));
        System.out.println(gradosC + " grados Celsius a Fahrenheit: " + calculaFahrenheit(gradosC));
    }

    public static double calculaFahrenheit(double celsius) {
        double fahrenheit;
        fahrenheit = celsius * 9 / 5 + 32;
        return fahrenheit;
    }

    public static double calculaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}