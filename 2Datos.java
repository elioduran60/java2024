
import java.util.Scanner;

public class Datos {
    private static Scanner leer = new Scanner(System.in);
    private String usuario;
    private String clave;
    private String claveadmin;
    private String usuarioadmin;

    // Constructor
    public Datos() {
        leer = new Scanner(System.in);
        usuarioadmin = "admin";
        claveadmin = "1234";
        usuario = "";
        clave = "";

    }

    // Metódos:
    public String getUsuarioadmin() {
        return usuarioadmin = "admin";
    }

    public void setUsuarioadmin() {
        System.err.println("Ingresa Usuario del Administrador: ");
        usuarioadmin = leer.next();
    }

    public String getClaveadmin() {
        return claveadmin = "1234";
    }

    public void setClaveadmin() {
        System.err.println("Ingresa Contraseña del Administrador: ");
        claveadmin = leer.next();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario() {
        System.out.println("Ingresa el Nombre del nuevo usuario: ");
        usuario = leer.next();
    }

    public String getClave() {
        return clave;
    }

    public void setClave() {
        System.out.println("Ingresa la Contraseña para el nuevo usuario: ");
        clave = leer.next();
    }

    @Override
    public String toString() {
        return "Datos{usuario='" + usuario + "', clave='" + clave + "'}";
    }
}
