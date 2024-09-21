/*
 * Ejerc1_Evalaucion_S5_M4
 * By: Elio Duran.
 * Prof. Felipe Cuevas.
 * Fecha: 21/09/2022
 */
public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Ejercicio Comprpbacion S4_M4
         * En esta actividad usted deberá crear dos arreglos unidimensionales. En uno
         * almacenará el nombre
         * de 5 asignaturas y en el segundo el promedio de nota por cada asignatura.
         * Finalmente, deberá sacar el promedio final y mostrar el promedio obtenido.
         * El promedio por curso corresponderá al que se almacene en el indicé de su
         * nombre
         */

        // Primer Array:
        String[] asignatura;
        asignatura = new String[5];

        // Segundo Array:
        double[] promedio;
        promedio = new double[5];

        // Llenado de los arreglos por Usuario externo:

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre de la signatura " + (i + 1) + ": ");
            asignatura[i] = System.console().readLine();
            System.out.println("Ingrese el Promedio de la signatura : ");
            promedio[i] = Double.parseDouble(System.console().readLine());
        }
        // Impresion de la impresion de materias y sus respectivos promedios
        System.out.println("--------------------------------");
        System.out.println("Sus notas son las siguientes: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(asignatura[i] + " = " + promedio[i]);
        }
        // Promedio general:
        double promedioGeneral = 0;
        for (int i = 0; i < 5; i++) {
            promedioGeneral = promedioGeneral + promedio[i];
        }
        System.out.println("Su promedio general es= " + (promedioGeneral / promedio.length));
        System.out.println("--------------------------------");
    }
}
