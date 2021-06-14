public class Ejercicio10 {
    public static void main(String[] args) {

        double celsius;
        
        System.out.println("La lista de conversión para valores Farenheit-Celsius en intervalos de 20 es: ");
        for (int i = 0; i <= 300; i += 20) {
            celsius = (5.0 / 9.0) * (i - 32);

            System.out.println(i + "º Fahrenheit = " + celsius + "º celsius");
        }
    }
}