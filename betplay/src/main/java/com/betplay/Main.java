package com.betplay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de la Liga BetPlay");
        boolean salida = false;
        while (!salida) {
            System.out.println("Bienvenido al Software LigaBetPlay");
            System.out.println("1. Crear Equipo");
            System.out.println("2. Crear Partido");
            System.out.println("3. Ver Resultados");
            System.out.println("4. Salir");
            try(Scanner sc = new Scanner(System.in)){
                System.out.println("Ingrese una opción:");
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                    System.out.println("opcion 1");
                    case 2:
                    System.out.println("opcion 2");
                    case 3:
                    System.out.println("opcion 3");
                    case 4:
                    System.out.println("Adiós!");
            }
        }
        }
    }
}