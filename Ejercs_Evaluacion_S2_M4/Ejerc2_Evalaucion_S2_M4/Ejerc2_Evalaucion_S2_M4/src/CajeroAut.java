import java.util.Scanner;

public class CajeroAut {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner leer = new Scanner(System.in);
        float saldo = 1000, dep, ret;
        int op;

        do {// Creacion del Menu
            System.out.println("----------------------------------| ");
            System.out.println("Bienvenido, ingrese la Opción deseada: ");
            System.out.println("1) Depositar dinero a mi Cuenta.");
            System.out.println("2) Retirar dinero de mi Cuenta..");
            System.out.println("3) Salir.");
            System.out.println("----------------------------------| ");
            op = leer.nextInt();
            leer.nextLine();
            switch (op) {
                case 1 -> {
                    System.out.println("Su Saldo inical es: " + saldo);
                    System.out.println("Ingrese la Cantidad que desea Depositar: ");
                    dep = leer.nextFloat();
                    saldo = saldo + dep;
                    System.out.println("Su saldo actual es: " + saldo);
                    break;
                }
                case 2 -> {
                    System.out.println("Su Saldo inical es: " + saldo);
                    System.out.println("Ingrese la Cantidad que desea Retirar: ");
                    ret = leer.nextFloat();
                    saldo = saldo - ret;
                    if (saldo < 0) {
                        System.out.println(" -> ** No tiene suficiente saldo en la Cuenta.");
                    } else
                        System.out.println("Su saldo actual es: " + saldo);
                    break;
                }
                case 3 -> {
                    System.out.println("Gracias por utilizar el sistema, vuelva pronto.");
                    break;
                }

            }
        } while (op != 3);
        System.out.println("Algoritmo finalizado.");
    }
}
