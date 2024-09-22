
/*
 * Ejerc1_Evaluacion_S3_M4
 * By: Elio Duran.
 * Prof. Felipe Cuevas.
 * Fecha: 22/09/2022
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
         * Ejercs_Comprob_S3_M4:
         * Deberás solicitar un número entre 1 y 100. Se Mostrará los números pares
         * e impares que se encuentren en el número ingresado por el usuario.
         * Si el usuario ingresa un número menor a uno o mayor que 100 le indicará
         * su error y hará que solicite nuevamente un número entre 1 y 100.
         * 
         */
        @SuppressWarnings("resource")
        Scanner leer = new Scanner(System.in);
        int num;
        int n = 0;
        int m = 0;
        do {
            System.out.println("Ingrese un numero entre 1 y 100: ");
            num = leer.nextInt();
            if (num >= 1 && num <= 100) { // Mostrar los números pares e impares que se encuentren
                for (int i = 1; i <= num; i++) {
                    if (i % 2 == 0) {
                        n++;
                    } else {
                        m++;
                    }
                }
                System.out.println("El total de numeros pares es: " + n);
                System.out.println("El total de numeros impares es: " + m);
                break;
            } else {
                // System.out.println("El numero ingresado no válido ");
                // do {
                System.out.println("----------------------------ERROR");
            }
        } while (num < 1 || num > 100);
        {
            System.out.println("------------------fin del Programa");
        }
    }
}
