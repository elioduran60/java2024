
/*
 * Ejerc_Comprobacion_S3_M4
 * By: Elio Duran.
 * Prof. Felipe Cuevas.
 * Fecha: 22/09/2022
 */
import java.util.Scanner;

public class Principal {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws Exception {
        /*
         * Deberás solicitar un número al azar y mostrarás los siguientes dos
         * patrones de dibujo:
         * - PATRON 1:
         * *.*.*
         * - PATRON 2:
         * ****
         * * *
         * * *
         * ****
         * El número debe ser capturado desde la consola, el patrón mostrará la
         * repetición dependiendo del número ingresado.
         *
         */
        Scanner leer = new Scanner(System.in);
        // int num;
        // int n = 0;
        /*
         * int j;
         * int i;
         * int I = 0;
         * int n = 6;
         * for (i = 1; i <= n; i++) {
         * for (j = 0; j < I; j++) {
         * System.out.print(i);
         * }
         * System.out.printf("\n");
         * }
         */

        // int num = leer.nextInt();
        int n = 0;
        int i;
        int j;
        for (i = 1; i <= 6; i++) {
            System.out.print("---");
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            // System.out.printf("\n");
        }

    }
}
