import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un dni");
        String nif = sc.nextLine();
        if (validar(nif)) {
            System.out.println("Dni correcto");
            System.out.println(saberNumero(nif));
        } else
            System.out.println("Dni incorrecto");
    }

    public static boolean validar(String dni) {
        return comprobarFormato(dni);
    }

    private static boolean comprobarFormato(String dni) {

        boolean valido = true;

        valido = (dni.length() == 9);

        if (valido) {
            char c = dni.charAt(dni.length() - 1);
            valido = Character.isLetter(c);
        }

        if (valido) {
            int i = 0;
            while (valido && i < dni.length() - 2) {
                char n = dni.charAt(i);
                valido = Character.isDigit(n);
                i++;
            }
        }
        return valido;
    }

    private static Integer saberNumero(String dni) {
        return Integer.parseInt(dni.substring(0, dni.length() - 1));
    }
}
