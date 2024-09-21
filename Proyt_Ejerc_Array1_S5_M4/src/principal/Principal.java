package principal;

import clases.Alumno;
import java.util.*;

public class Principal {

	public static void main(String[] args) {

		// Declaracion del objeto de la clase ArrayList llamada 'curso'
		ArrayList<Alumno> curso = new ArrayList<>();

		// Acá declaro los objetos Scanner e int para las demás operaciones
		@SuppressWarnings("resource")
		Scanner leer = new Scanner(System.in);
		int op;

		do {
			System.out.println("  ");
			System.out.println("--------- MENÚ ---------");
			System.out.println("1) Ingresar alumnos.");
			System.out.println("2) Mostrar datos de alumnos junto a su situación final.");
			System.out.println("3) Buscar un alumno en específico.");
			System.out.println("4) Calcular y mostrar el promedio del curso.");
			System.out.println("5) Calcular y mostrar la cantidad de Aprobados y Reprobados.");
			System.out.println("6) Salir.");
			System.out.println("--------- INGRESE LA OPCIÓN: ");
			System.out.println("  ");
			op = leer.nextInt();
			leer.nextLine();

			switch (op) {
				case 1 -> {
					// Acá crearemos un objeto de la clase Alumno para guardar los datos
					Alumno a = new Alumno();
					a.setRut();
					a.setNombre();
					a.setEdad();
					a.setAsistencia();
					a.setNota1();
					a.setNota2();
					a.setNota3();
					a.setPromedio();
					a.setSituacionFinal();

					// Creado el objeto "a" (de la clase Alumno) y agregado cada valor (con setXxx),
					// se se procede a llenar el ArrayList 'curso' para que se guarden los datos.
					curso.add(a);
				}
				case 2 -> { // Se recorre el ArrayList 'curso' para mostrar los datos con el "forEach"
					for (Alumno aux : curso) {
						System.out.println("--------------------------");
						System.out.println("RUT: " + aux.getRut());
						System.out.println("NOMBRE: " + aux.getNombre());
						System.out.println("EDAD: " + aux.getEdad());
						System.out.println("ASISTENCIA: " + aux.getAsistencia());
						System.out.println("NOTA 1: " + aux.getNota1());
						System.out.println("NOTA 2: " + aux.getNota2());
						System.out.println("NOTA 3: " + aux.getNota3());
						System.out.println("PROMEDIO: " + aux.getPromedio());
						System.out.println("SITUACIÓN FINAL: " + aux.getSituacionFinal());
					}
				}
				case 3 -> { // Se recorre el ArrayList 'curso' para buscar un alumno
					String rutAux;
					boolean existe = false;
					System.out.println("--------- INGRESE EL RUT A BUSCAR: ");
					rutAux = leer.nextLine();

					for (Alumno aux : curso) {
						if (aux.getRut().equalsIgnoreCase(rutAux) == true) {
							System.out.println("---------DATOS DEL ALUMNO ENCONTRADO");
							System.out.println("RUT: " + aux.getRut());
							System.out.println("NOMBRE: " + aux.getNombre());
							System.out.println("EDAD: " + aux.getEdad());
							System.out.println("ASISTENCIA: " + aux.getAsistencia());
							System.out.println("NOTA 1: " + aux.getNota1());
							System.out.println("NOTA 2: " + aux.getNota2());
							System.out.println("NOTA 3: " + aux.getNota3());
							System.out.println("PROMEDIO: " + aux.getPromedio());
							System.out.println("SITUACIÓN FINAL: " + aux.getSituacionFinal());
							existe = true;
						}
					}

					if (existe == false) {
						System.out.println("--------- EL ALUMNO BUSCADO NO EXISTE.");
					}
				}
				case 4 -> {// Se recorre el ArrayList 'curso' para calcular el promedio
					Float promAux = 0.0f; // Acumulador de promedios
					Float promCurso; // Variable que contiene el promedio final del curso

					for (Alumno aux : curso) {
						promAux = promAux + aux.getPromedio();
					}

					promCurso = promAux / curso.size();
					System.out.println("--------- EL PROMEDIO DEL CURSO ES: " + promCurso);
				}
				case 5 -> {// Se recorre el ArrayList 'curso' para mostrar la cantidad de Aprobados y
							// Reprobados
					int contadorAA = 0;
					int contadorRR = 0;

					for (Alumno aux : curso) {
						if (aux.getSituacionFinal().equals("Aprobado") == true) {
							contadorAA++;
						} else {
							contadorRR++;
						}
					}

					System.out.println("--------- LA CANTIDAD DE ALUMNOS APROBADOS: " + contadorAA);
					System.out.println("--------- LA CANTIDAD DE ALUMNOS REPROBADOS: " + contadorRR);
				}
				case 6 -> System.out.println("Saliendo del menú...");
				default -> System.out.println("Opción inválida.");
			}
		} while (op != 6);

		System.out.println("Algoritmo finalizado.");
	}

}
