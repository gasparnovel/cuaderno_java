public class Ejercicio20 {
    public static void main(String[] args) {

        System.out.println("El máximo de 110, 140 es: " + maximo2(110, 140));
        System.out.println("El máximo de 70, 25, 11 es: " + maximo3(70, 25, 11));
    }

    public static int maximo2(int x, int y) {
        return (x > y) ? x : y;
    }

    public static int maximo3(int x, int y, int z) {
        return maximo2(maximo2(x, y), z);
    }
}