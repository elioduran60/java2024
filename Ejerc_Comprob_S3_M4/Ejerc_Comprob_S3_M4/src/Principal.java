
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
         * patrones de dibujo. El número debe ser capturado desde la consola,
         * el patrón mostrará la repetición dependiendo del número ingresado.
         *
         */
        @SuppressWarnings("unused")
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();
        int n = 0;

        System.out.print("Patrón 1:");
        System.out.print("\n");
        for (int i = 1; i <= (num - 3); i++) {
            System.out.print("*.");
        }
        System.out.print("\n");
        System.out.print("Patrón 2:");
        System.out.print("\n");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                // Imprimir "*" en la primera o última fila, o primera o última columna
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Espacio en blanco (no imprime *)
                }
            }
            System.out.println();
        }
        leer.close(); // Cerrar el scanner

    }
}
