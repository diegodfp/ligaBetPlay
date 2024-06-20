package com.betplay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de la Liga BetPlay");
        boolean salida = false;
        while (salida==false) {
            System.out.println("LOGIN SI DESEA CANCELAR INGRESE X EN USUARIO");
            try(Scanner sn = new Scanner(System.in)){
                System.out.print("Usuario:\t");
                String user = sn.nextLine();
                if (user=="x") {
                    salida=true;
                }
                System.out.print("Contrasena\t");
                String pass = sn.nextLine();
                
            }
        }
    }
}