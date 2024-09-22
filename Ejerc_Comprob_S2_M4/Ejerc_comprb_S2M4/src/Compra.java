import java.util.Scanner;

public class Compra {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		// System.out.println("Hello, World!");

		Scanner leer = new Scanner(System.in);
		String usuario;
		Float precio1, precio2, precio3, precio4, precioTot;

		System.out.println("-----------------------------");
		System.out.println("Ingrese el nombre del Usuario: ");
		usuario = leer.nextLine();
		System.out.println("Ingrese el precio del producto 1: ");
		precio1 = leer.nextFloat();
		System.out.println("Ingrese el precio del producto 2: ");
		precio2 = leer.nextFloat();
		System.out.println("Ingrese el precio del producto 3: ");
		precio3 = leer.nextFloat();
		System.out.println("Ingrese el precio del producto 4: ");
		precio4 = leer.nextFloat();
		precioTot = precio1 + precio2 + precio3 + precio4;

		if (precioTot < 10000) {
			System.out.println(usuario + " pagarás en efectivo el total de: " + precioTot);
		} else if (precioTot > 10001 && precioTot <= 20000) {
			System.out.println(usuario + " pagarás con tarjeta el total de: " + precioTot);
		} else {
			System.out.println(usuario + " pagarás con cheque el total de: " + precioTot);
		}
	}
}
