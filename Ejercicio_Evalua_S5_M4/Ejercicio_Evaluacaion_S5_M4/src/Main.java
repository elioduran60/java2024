
/*
 * Ejerc1_Evalaucion_S5_M4
 * By: Elio Duran.
 * Prof. Felipe Cuevas.
 * Fecha: 21/09/2022
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
         * Ejercicio:
         * Crear una aplicación para mostrar distintos productos. Supondremos que la
         * aplicación
         * será usada por un vendedor y él deberá poder ingresar un máximo de 7
         * nuevos productos,
         * cambiar los datos del producto, por ejemplo, si varía de precio y
         * ver la lista de productos. La aplicación no deja de funcionar hasta que el
         * vendedor así lo decide.
         * Los productos deberán tener nombre, valor y descripción. La lista inicial
         * de productos es la siguiente:
         * |NOMBRE | VALOR | DESCRIPCIÓN |
         * |chocolate | 500 | Chocolate amargo, 500 gr.|
         * |leche | 800 | Leche entera, 1 litro. |
         * |arroz | 900 | Arroz grado 2, 1 kilo. |
         * 
         */

        @SuppressWarnings("resource")
        Scanner leer = new Scanner(System.in);

        // Primer Array:
        String[][] productos;
        productos = new String[7][3];
        productos[0][0] = "Chocolate";
        productos[0][1] = "500";
        productos[0][2] = "Chocolate amargo, 500 gr.";

        productos[1][0] = "Leche";
        productos[1][1] = "800";
        productos[1][2] = "Leche entera, 1 litro.";

        productos[2][0] = "Arroz";
        productos[2][1] = "900";
        productos[2][2] = "Arroz grado 2, 1 kilo.";

        // Variables:
        String nombre, valor, descrip;
        int op;

        do {
            System.out.println("--------------------------------------------------------------");
            System.out.println("    Eliga una Opción: ");
            System.out.println("1) Ver Productos.");
            System.out.println("2) Agregar Productos.");
            System.out.println("3) Modificar Productos..");
            System.out.println("4) Salir.");
            System.out.println("--------------------------------------------------------------");
            System.out.println(" ");
            op = leer.nextInt();
            leer.nextLine();
            switch (op) {

                case 1 -> {// Impresion de Productos:
                    for (String[] producto : productos) {
                        if (producto[0] == null) {
                            break;
                        }
                        System.out.println("Producto: " + producto[0] + " - Valor: " + producto[1] + " - Descripcion: "
                                + producto[2]);
                    }
                }
                case 2 -> { // Agregar Productos a la lista existente:
                    int i = 0;
                    do {
                        if (productos[i][0] == null) {
                            System.out.println("Ingrese el Nombre del Producto: ");
                            nombre = leer.nextLine();
                            productos[i][0] = nombre;
                            System.out.println("Ingrese el Valor del Producto: ");
                            valor = leer.nextLine();
                            productos[i][1] = valor;
                            System.out.println("Ingrese la Descripcion del Producto: ");
                            descrip = leer.nextLine();
                            productos[i][2] = descrip;
                            System.out.println("Producto agregado con exito: ");
                            System.out.println(
                                    "Producto: " + nombre + " - Valor: " + valor + " - Descripcion: " + descrip);
                            if (i + 1 < productos.length) {
                                System.out.println("Desea agregar otro Producto? (Si o No)");
                                String lectura = leer.nextLine();
                                if (lectura.equalsIgnoreCase("No") == true) {
                                    break;
                                }
                            } else {
                                System.out.println("Lista completa");
                            }
                        }
                        i++;
                    } while (i != productos.length);
                }
                case 4 -> System.out.println("Saliendo del menú.");
                default -> System.out.println("Opción no Valida.");
            }
        } while (op != 7);
    }
}
