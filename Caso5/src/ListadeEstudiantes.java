package listaestudiantes;

import java.util.ArrayList;
import java.util.Scanner;

public class estudiantes {

    public static void main(String[] args) {
        ArrayList<String> estudiantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        System.out.println("=== Lista de Estudiantes ===");

        while (opcion != 3) {
            System.out.println("\n1. Agregar estudiante");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine().trim());

                switch (opcion) {
                    case 1:
                        System.out.print("Ingresa el nombre del estudiante: ");
                        String nombre = scanner.nextLine().trim();

                        if (nombre.isEmpty()) {
                            throw new IllegalArgumentException("El nombre no puede estar vacío.");
                        }
                        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                            throw new IllegalArgumentException("El nombre solo puede contener letras.");
                        }

                        estudiantes.add(nombre);
                        System.out.println("✓ Estudiante agregado correctamente.");
                        break;

                    case 2:
                        if (estudiantes.isEmpty()) {
                            System.out.println("La lista está vacía.");
                        } else {
                            System.out.println("\n--- Lista de estudiantes ---");
                            for (int i = 0; i < estudiantes.size(); i++) {
                                System.out.println((i + 1) + ". " + estudiantes.get(i));
                            }
                        }
                        break;

                    case 3:
                        System.out.println("¡Hasta luego!");
                        break;

                    default:
                        System.out.println("Opción inválida. Elige 1, 2 o 3.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar un número (1, 2 o 3).");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}