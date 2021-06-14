public class Ejercicio11 {
    public static void main(String[] args) {
        
        String[][] agenda = new String[7][24];

        for (int i = 0; i < agenda.length; i++) {
            for (int j = 0; j < agenda[i].length; j++) {
                agenda[i][j] = "No tengo planes.";
            }
        }

        agenda[0][0] = "Lunes";
        agenda[1][0] = "Martes";
        agenda[2][0] = "Miercoles";
        agenda[3][0] = "Jueves";
        agenda[4][0] = "Viernes";
        agenda[5][0] = "Sábado";
        agenda[6][0] = "Domingo";

        agenda[0][10] = "10h. Hacer la compra semanal";
        agenda[0][13] = "13h. Ir a recoger un paquete a Correos";
        agenda[1][16] = "16h. Clase de Crossfit";
        agenda[1][20] = "20h. Cena con amigos";

        for (int i = 0; i < agenda.length; i++) {
            for (int j = 0; j < agenda[i].length; j++) {
                System.out.println(agenda[i][j]);
            }
            System.out.print("\n");
        }
    }
}
