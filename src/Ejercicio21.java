public class Ejercicio21 {
    public static void main(String[] args) {

        System.out.println("17 es primo: " + esPrimo(17));
        System.out.println("37 es primo: " + esPrimo(37));
        System.out.println("69 es primo: " + esPrimo(69));
        System.out.println("999 es primo: " + esPrimo(999));
    }

    public static boolean esPrimo(int n) {
        int cont = 2;
        boolean primo = true;

        while ((primo) && (cont != n)) {
            if (n % cont == 0)
                primo = false;
            cont++;
        }
        return primo;
    }
}