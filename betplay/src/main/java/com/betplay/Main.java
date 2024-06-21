package com.betplay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de la Liga BetPlay");
        boolean salida = false;
        Scanner sc = new Scanner(System.in);
        
        while (!salida) {
            System.out.println("Bienvenido al Software LigaBetPlay");
            System.out.println("Elige tu tipo de usuario");
            System.out.println("1. Administrador");
            System.out.println("2. Entrenador");
            System.out.println("3. Jugadore");      
            System.out.println("4. Periodista");
            System.out.println("5. Aficionado");        

            try {
                System.out.println("Ingrese una opción:");
                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Login:");
                        System.out.println("Usuario:");
                        String user = sc.nextLine();
                        System.out.println("Contraseña:");
                        String pass = sc.nextLine();
                        if(user=="admin" && pass=="123"){
                            System.out.println("1. Crear Equipo");
                            System.out.println("2. Crear Partido");
                            System.out.println("3. Ver Resultados");
                            System.out.println("4. Salir");
                            try {
                                System.out.println("Ingrese una opción:");
                                int opcionAdmin = sc.nextInt();
                                switch (opcionAdmin) {
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
                        }else{
                            System.out.println("Usuario y/o contraseña incorrectos intente de nuevo");
                            break;
                        }
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
