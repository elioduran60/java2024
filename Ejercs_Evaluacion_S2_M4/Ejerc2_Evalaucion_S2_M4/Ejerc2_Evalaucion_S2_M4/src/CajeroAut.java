import java.util.Scanner;

public class CajeroAut {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner leer = new Scanner(System.in);
        float saldo = 1000, dep;
        int op;

        do {// Creacion del Menu
            System.out.println("Bienvenido, ingrese la Opcion deseada: ");
            System.out.println("1) Depositar dienro a mi Cuenta.");
            System.out.println("2) Retirar dinero de mi Cuenta..");
            System.out.println("3) Salir.");
            System.out.println("--------- ");
            op = leer.nextInt();
            leer.nextLine();
            switch (op) {
                case 1 -> {
                    System.out.println("Su Saldo inical es: " + saldo);
                    System.out.println("Ingrese la Cantidad que desea Depositar: ");
                    dep = leer.nextFloat();
                    saldo = saldo + dep;
                    System.out.println("Su saldo actual es: " + saldo);
                }
                case 2 -> {
                    System.out.println("Su Saldo inical es: " + saldo);
                    System.out.println("Ingrese la Cantidad que desea Retirar: ");
                    dep = leer.nextFloat();
                    saldo = saldo - dep;
                    System.out.println("Su saldo actual es: " + saldo);
                }
                case 3 -> System.out.println("Gracias por utilizar el sistema, vuelva pronto.");
            }
        } while (op != 3);
        System.out.println("Algoritmo finalizado.");
    }
}
