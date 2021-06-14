import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        System.out.println("Escribe tu peso en kilogramos");
        Scanner entrada = new Scanner(System.in);
        double peso = entrada.nextDouble();

        System.out.println("Escribe tu altura en metros");
        Scanner entrada2 = new Scanner(System.in);
        double altura = entrada2.nextDouble();

        double ims = Math.round(peso / (altura * altura));

        System.out.println("Este es tu IMS: " + ims);
        if (ims < 16) {
            System.out.println("Criterio de ingreso en hospital");
        } else {
            if (ims == 16) {
                System.out.println("Infrapeso");
            } else {
                if (ims == 17) {
                    System.out.println("Bajo peso");
                } else {
                    if (ims == 18) {
                        System.out.println("Bajo peso");
                    } else {
                        if (ims > 18 && ims <= 25) {
                            System.out.println("Peso normal (saludable)");
                        } else {
                            if (ims > 25 && ims <= 30) {
                                System.out.println("Sobrepeso");
                            } else {
                                if (ims > 30 && ims <= 35) {
                                    System.out.println("Sobrepeso crónico");
                                } else {
                                    if (ims > 35 && ims <= 40) {
                                        System.out.println("Obesidad premórbida");
                                    } else
                                        System.out.println("Obesidad mórbida");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
