/*
 * Ejerc_Comprobacion_S6_M4
 * By: Elio Duran.
 * Prof. Felipe Cuevas.
 * Fecha: 22/09/2022
 */
//package principal;

//import datospersona.Datos;
import java.util.ArrayList;
import java.util.Scanner;

public class Persona {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Scanner leer = new Scanner(System.in);
        ArrayList<Datos> lista_personas = new ArrayList<>();

        // Creación del Usuario Administrador:
        Datos admin = new Datos();
        // lista_personas.add(admin);

        System.out.println("Ingresa Usuario Administrador del sistema: ");
        String usuarioadm = leer.next();
        System.out.println("Ingresa contraseña del Administrador: ");
        String claveadm = leer.next();

        // Validacion del administrador:
        if (usuarioadm.equals(admin.getUsuarioadmin()) && claveadm.equals(admin.getClaveadmin())) {
            System.out.println("Bienvenido Administrador");
            @SuppressWarnings("unused")
            boolean bandera = true;

            // Ingresos de nuevos usuarios:
            while (bandera) {
                System.out.println("¿Desea agregar un nuevo usuario? (Si o No) ");
                String respuesta = leer.next();
                if (respuesta.equalsIgnoreCase("Si")) {
                    Datos nuevoUsuario = new Datos();
                    nuevoUsuario.setUsuario();
                    nuevoUsuario.setClave();
                    lista_personas.add(nuevoUsuario);
                    System.out.println("Usuario agregado: " + nuevoUsuario.getUsuario());
                } else {
                    bandera = false;
                }
            }

            // Lista de usuarios cargados en el sistema (inlcuyendo el Administrador):
            System.out.println("\n************************************");
            System.out.println("Lista de usuarios: ");
            for (Datos usuario : lista_personas) {
                System.out.println(usuario.getUsuario());
            }
            System.out.println("\n************************************");

            int op = 0;
            do {
                System.out.println("Ingresa nombre del usuario para acceder a la calculadora: ");
                String usuario = leer.next();
                System.out.println("Ingresa contraseña: ");
                String clave = leer.next();

                boolean accesoPermitido = false;
                for (Datos persona : lista_personas) {
                    if (persona.getUsuario().equalsIgnoreCase(usuario) && persona.getClave().equalsIgnoreCase(clave)) {
                        accesoPermitido = true;
                        break;
                    }
                }

                if (accesoPermitido) {
                    System.out.println("** Bienvenido a la calculadora **");
                    System.out.println("1. Calcular la raíz cuadrada de un número");
                    System.out.println("2. Ver el valor de Pi ('π') ");
                    System.out.println("3. Calcular la potencia de un número");
                    System.out.println("4. Salir");
                    op = leer.nextInt();

                    switch (op) {
                        case 1 -> {
                            System.out.println("Ingrese el número para calcular la raíz cuadrada: ");
                            double num = leer.nextDouble();
                            System.out.println("La raíz cuadrada de " + num + " es: " + Math.sqrt(num));
                        }
                        case 2 -> System.out.println("El valor de Pi es: " + Math.PI);
                        case 3 -> {
                            System.out.println("Ingrese la base: ");
                            double base = leer.nextDouble();
                            System.out.println("Ingrese el exponente: ");
                            double exponente = leer.nextDouble();
                            System.out.println("El resultado de " + base + " elevado a " + exponente + " es: "
                                    + Math.pow(base, exponente));
                        }
                        case 4 -> System.out.println("Saliendo del programa...");
                        default -> System.out.println("Opción inválida");
                    }
                } else {
                    System.out.println("Usuario o contraseña incorrectos.");
                }
            } while (op != 4);
        } else {
            System.out.println("Usuario o contraseña del administrador incorrectos");
        }
        leer.close();
    }
}
