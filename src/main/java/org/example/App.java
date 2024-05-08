package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int numero;
        int clave;
        int dni;
        int intentos = 0;
        boolean siga = true;
        System.out.println("################ Menu ################\nMarque 1: Para Consultar Saldo \nMarque 2: Para Recargar Saldo\nMarque 3: Para Iniciar Sesión\nMarque 4: Para Salir");
        Scanner scr = new Scanner(System.in);
        numero = scr.nextInt();
        if (numero == 3) {
            while (siga) {
                System.out.println("Ingrese su número de DNI");
                Scanner xd = new Scanner(System.in);
                dni = xd.nextInt();
                String ni  = String.valueOf(dni);
                if (ni.length() == 8) {
                    System.out.println("Ingrese su clave"); {
                        while (siga) {
                            Scanner d = new Scanner(System.in);
                            clave = d.nextInt();
                            if (clave == 1930) {
                                System.out.println("Bienvenido");
                                siga = false;
                            } else {

                                intentos++;
                                if (intentos == 3) {
                                    siga = false;
                                    System.out.println("Tarjeta Bloqueada");
                                } else {
                                    System.out.println("Clave incorrecta");
                                }
                            }
                        }


                    }
                } else {
                    System.out.println("El número de DNI debe de constar de 8 digitos");
                }
            }

        } else {
            System.out.println("Opcion en mantenimiento");
        }
    }
}
