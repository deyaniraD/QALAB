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
        /*int lista[] = {6, 9, -8, 23, 3, 100, 3};

        int nNum1 = lista[0];
        int nNum2 = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < nNum1) {
                nNum1 = lista[i];
            }
            if (lista[i] > nNum2) {
                nNum2 = lista[i];
            }
        }
        System.out.println( "nNum1: " + nNum1 + ", nNum2: " + nNum2);
*/
        //////////////

        /*int listasNotas[] = {12, 10, 10, 9};

        double promedio = 0;

        for (int i = 0; i < listasNotas.length; i++) {
            promedio = promedio + listasNotas[i];
        }
        promedio = promedio/ listasNotas.length;
        System.out.println(promedio);*/

        ////////////

        /*int num[] = {10, 2, 1, 30};
        int i;
        int temp;

        for (int j = 0; j < num.length - 1; j++) {
            for (i = 0; i < num.length - 1; i++) {
                if (num[i] < num[i +1]) {
                    temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                }
            }

        }
        System.out.println(num[0] + " & " + num[num.length - 1]);*/
/////////

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
