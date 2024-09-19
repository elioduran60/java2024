package principal;

import java.io.*;

public class ManejadorProductos {

	public static void main(String[] args) {
		// Datos del producto: nombre, tipo, marca, cantidad, precioBruto, iva,
		// precioNeto, ganancia
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		String nombre, tipo, marca;
		Integer cantidad, precioBruto, iva, precioNeto, ganancia, op;

		try {
			System.out.println("Ingrese el nombre del producto: ");
			nombre = leer.readLine();
			System.out.println("Ingrese el tipo del producto: ");
			tipo = leer.readLine();
			System.out.println("Ingrese la marca del producto: ");
			marca = leer.readLine();
			System.out.println("Ingrese la cantidad almacenada de ese producto: ");
			cantidad = Integer.valueOf(leer.readLine());
			System.out.println("Ingrese el precio bruto del producto: ");
			precioNeto = Integer.valueOf(leer.readLine());

			iva = precioNeto * 19 / 100;
			ganancia = (precioNeto + iva) * 20 / 100;
			precioBruto = precioNeto + iva + ganancia;

			System.out.println("Nombre: \t" + nombre);
			System.out.println("Tipo: \t" + tipo);
			System.out.println("Marca: \t" + marca);
			System.out.println("Cantidad: \t" + cantidad);
			System.out.println("Precio Neto: \t" + precioNeto);
			System.out.println("IVA: \t" + iva);
			System.out.println("Ganancia: \t" + ganancia);
			System.out.println("Precio Bruto: \t" + precioBruto);

			System.out.println("¿Desea ingresar otro producto?");

			op = Integer.valueOf(leer.readLine());
			if (op == 1) {
				System.out.println("Ingrese el nombre del producto: ");
				nombre = leer.readLine();
				System.out.println("Ingrese el tipo del producto: ");
				tipo = leer.readLine();
				System.out.println("Ingrese la marca del producto: ");
				marca = leer.readLine();
				System.out.println("Ingrese la cantidad almacenada de ese producto: ");
				cantidad = Integer.valueOf(leer.readLine());
				System.out.println("Ingrese el precio bruto del producto: ");
				precioNeto = Integer.valueOf(leer.readLine());

				iva = precioNeto * 19 / 100;
				ganancia = (precioNeto + iva) * 20 / 100;
				precioBruto = precioNeto + iva + ganancia;

				System.out.println("Nombre: \t" + nombre);
				System.out.println("Tipo: \t" + tipo);
				System.out.println("Marca: \t" + marca);
				System.out.println("Cantidad: \t" + cantidad);
				System.out.println("Precio Neto: \t" + precioNeto);
				System.out.println("IVA: \t" + iva);
				System.out.println("Ganancia: \t" + ganancia);
				System.out.println("Precio Bruto: \t" + precioBruto);

				System.out.println("¿Desea ingresar otro producto?");
			}
		} catch (IOException error) {
			System.err.println("Error del tipo: " + error.getMessage());
		}
	}

}
