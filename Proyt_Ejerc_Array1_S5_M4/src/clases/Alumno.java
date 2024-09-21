package clases;

import java.util.Scanner;

public class Alumno {
	private final Scanner leer;
	private String rut, nombre, situacionFinal;
	private Integer edad, asistencia;
	private Float nota1, nota2, nota3, promedio;

	public Alumno() {
		leer = new Scanner(System.in);
		rut = "";
		nombre = "";
		situacionFinal = "";
		edad = 0;
		asistencia = 0;
		nota1 = 0.0f;
		nota2 = 0.0f;
		nota3 = 0.0f;
		promedio = 0.0f;
	}

	public String getRut() {
		return rut;
	}

	public void setRut() {
		System.out.println("---------");
		System.out.println("INGRESE EL RUT: ");
		rut = leer.nextLine();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre() {
		System.out.println("---------");
		System.out.println("INGRESE EL NOMBRE: ");
		nombre = leer.nextLine();
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad() {
		System.out.println("---------");
		System.out.println("INGRESE LA EDAD: ");
		edad = leer.nextInt();
		leer.nextLine();
	}

	public Integer getAsistencia() {
		return asistencia;
	}

	public void setAsistencia() {
		System.out.println("---------");
		System.out.println("INGRESE LA ASISTENCIA: ");
		asistencia = leer.nextInt();
		leer.nextLine();
	}

	public Float getNota1() {
		return nota1;
	}

	public void setNota1() {
		System.out.println("---------");
		System.out.println("INGRESE LA NOTA 1: ");
		nota1 = leer.nextFloat();
	}

	public Float getNota2() {
		return nota2;
	}

	public void setNota2() {
		System.out.println("---------");
		System.out.println("INGRESE LA NOTA 2: ");
		nota2 = leer.nextFloat();
	}

	public Float getNota3() {
		return nota3;
	}

	public void setNota3() {
		System.out.println("---------");
		System.out.println("INGRESE LA NOTA 3: ");
		nota3 = leer.nextFloat();
	}

	public Float getPromedio() {
		return promedio;
	}

	public void setPromedio() {
		promedio = (nota1 + nota2 + nota3) / 3;
	}

	public String getSituacionFinal() {
		return situacionFinal;
	}

	public void setSituacionFinal() {
		if (promedio > 3.9 && asistencia > 59) {
			situacionFinal = "Aprobado";
		} else {
			situacionFinal = "Reprobado";
		}
	}

}
