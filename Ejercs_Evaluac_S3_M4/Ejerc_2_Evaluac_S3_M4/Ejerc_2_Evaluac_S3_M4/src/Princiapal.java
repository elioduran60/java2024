
/*
 * Ejerc1_Evaluacion_S3_M4
 * By: Elio Duran.
 * Prof. Felipe Cuevas.
 * Fecha: 22/09/2022
 */

import java.util.Scanner;

public class Princiapal {
    public static void main(String[] args) throws Exception {

        /*
         * Ejercicio 2 (Ejerc_2_Evaluac_S3_M4):
         * Deberás solicitar 10 números enteros. Contarás la cantidad de números
         * positivos, negativos y ceros ingresados y mostrarás el total de cada uno.
         */

        @SuppressWarnings("resource")
        Scanner leer = new Scanner(System.in);
        int num;
        int n = 0;
        int m = 0;
        int o = 0;
        int op = 0;

        do {
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
            if (num == 0) {
                o++;
            } else if (num > 0) {
                n++;
            } else {
                m++;
            }
            op++;
            if (op == 10) {
                System.out.println("El total de ceros es: " + o);
                System.out.println("El total de positivos es: " + n);
                System.out.println("El total de negativos es: " + m);
                System.out.println("-----------Fin del Programa");
                break;
            }

        } while (op != 10);

    }
}