package com.betplay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de la Liga BetPlay");
        boolean salida = false;
        Scanner sc = new Scanner(System.in);
        while (!salida) {
            System.out.println("Bienvenido al Software LigaBetPlay");
            System.out.println("1. Crear Equipo");
            System.out.println("2. Crear Partido");
            System.out.println("3. Ver Resultados");
            System.out.println("4. Salir");
            try {
                System.out.println("Ingrese una opción:");
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("opcion 1");
                        break;
                    case 2:
                        System.out.println("opcion 2");
                        break;
                    case 3:
                        System.out.println("opcion 3");
                        break;
                    case 4:
                        System.out.println("Adiós!");
                        salida = true;  // Cambiar el valor de salida para salir del bucle
                        break;
                    default:
                        System.out.println("Opción no válida, intente de nuevo.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, por favor ingrese un número.");
                sc.next();  // Consumir la entrada inválida para evitar un bucle infinito
            }
        }
        sc.close();  // Cerrar el Scanner fuera del bucle
    }
}
