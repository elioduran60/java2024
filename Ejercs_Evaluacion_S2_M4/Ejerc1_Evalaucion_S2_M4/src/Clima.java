import java.util.Scanner;

/*
 * Ejerc1_Evalaucion_S2_M4
 * By: Elio Duran.
 * Prof. Felipe Cuevas.
 * Fecha: 20/09/2022
 */
public class Clima {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);
        Float temperatura;

        System.out.println("Bienvenido");
        System.out.println("Por favor, ingrese la temperatura de hoy: ");
        temperatura = leer.nextFloat();
        if (temperatura <= 10) {
            System.out.println("Hay " + temperatura + " grados. El tipo de clima es Frio");
        } else if (temperatura > 10 && temperatura < 20) {
            System.out.println("Hay " + temperatura + " grados. El tipo de clima es Nublado");
        } else if (temperatura > 20 && temperatura < 30) {
            System.out.println("Hay " + temperatura + " grados. El tipo de clima es Caluroso");
        } else {
            System.out.println("Hay " + temperatura + " grados. El tipo de clima es Tropical");
        }
    }
}