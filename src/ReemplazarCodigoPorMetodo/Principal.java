/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReemplazarCodigoPorMetodo;

import java.util.Scanner;

/**
 *
 * @author lprie
 */
public class Principal {

    public static void main(String[] args) {
        int opcion = 0;
        String cadena;
        Scanner entrada = new Scanner(System.in);
        do {
            do {
                System.out.println("Menú:");
                System.out.println("1.- Suma");
                System.out.println("2.- Resta");
                System.out.println("3.- Multiplicación");
                System.out.println("4.- División");
                System.out.println("5.- Salir");
                System.out.println("Selecciona una opcion: ");
                cadena = entrada.nextLine();
                try {
                    opcion = Integer.parseInt(cadena);
                } catch (Exception e) {
                    opcion = 0;
                }
                if (opcion < 1 || opcion > 4) {
                    System.out.println("Opción no valida. Prueba otra vez");
                }
            } while (opcion < 1 || opcion > 4);

            switch (opcion) {
                case 1:
                    //codigo
                    System.out.println("Has seleccionado la opción 1");
                    break;
                case 2:
                    //codigo
                    System.out.println("Has seleccionado la opción 2");
                    break;
                case 3:
                    //codigo
                    System.out.println("Has seleccionado la opción 3");
                    break;
                case 4:
                    //codigo
                    System.out.println("Has seleccionado la opción 4");
                    break;
            }
        } while (opcion != 5);
        System.out.println("Adios");
    }
}
