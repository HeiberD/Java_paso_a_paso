package Ejercicios;

import java.util.Scanner;

public class EleccionComida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean seguirCocinando = true;
        
        while (seguirCocinando) {
            System.out.println("¿Qué ingredientes tienes en la nevera?");
            System.out.println("1. Lechuga");
            System.out.println("2. Tomate");
            System.out.println("3. Queso");
            System.out.println("4. Jamón");
            System.out.println("5. Pan");
            System.out.println("6. Nada más");

            boolean lechuga = false, tomate = false, queso = false, jamon = false, pan = false;

            String opcion;
            do {
                System.out.println("Selecciona el número del ingrediente (0 para finalizar): ");
                opcion = scanner.nextLine();

                switch (opcion) {
                    case "1":
                        lechuga = true;
                        break;
                    case "2":
                        tomate = true;
                        break;
                    case "3":
                        queso = true;
                        break;
                    case "4":
                        jamon = true;
                        break;
                    case "5":
                        pan = true;
                        break;
                    case "0":
                        break;
                    default:
                        System.out.println("Opción no válida, intenta de nuevo.");
                }
            } while (!opcion.equals("0"));

            // Decisión sobre qué comida hacer
            if (lechuga && tomate && queso) {
                System.out.println("Puedes preparar una ensalada.");
            } else if (pan && queso && jamon) {
                System.out.println("Puedes preparar un sándwich.");
            } else {
                System.out.println("No tienes suficientes ingredientes para cocinar.");
            }

            // Preguntar si desea seguir cocinando
            System.out.println("¿Quieres revisar la nevera de nuevo? (si/no)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("no")) {
                seguirCocinando = false;
            }
        }
        System.out.println("Fin del programa. ¡Buen provecho!");
    }
}

