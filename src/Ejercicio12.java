public class Ejercicio12 {
    public static void main(String[] args) {

        int f0 = 0, f1 = 1, cont = 0;

        System.out.print(f0 + " " + f1 + " ");
        while (cont < 50) {
            int cur = f0 + f1;
            f0 = f1;
            f1 = cur;
            System.out.print(cur + " ");
            cont++;
        };
    }
}