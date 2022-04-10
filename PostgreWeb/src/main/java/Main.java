import Datos.AlumnosDAO;
import Datos.ProfesoresDAO;
import Modelo.Alumnos;
import Modelo.Profesores;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
Por alguna razon no me funciono con alumnos, no se si tenga conflictos por la matricula tipo String
asi que lo deje con profesores :/
 */
//        AlumnosDAO alumnosDAO = new AlumnosDAO();
//        Alumnos prueba = new Alumnos("S18001427");
//        Alumnos salida = alumnosDAO.seleccionarRegistro(prueba);
//        System.out.println("Alumno encontrado \n" + salida);

        ProfesoresDAO profeDAO = new ProfesoresDAO();
//        System.out.print("Ingrese la clave del profesor: ");
//        int clave = sc.nextInt();

//        Profesores nuevo = new Profesores(14, "Raul", "Juarez", "Aguirre", "Tiempo Completo", 8, "Veracruz", "2294321212", "2299894365", "Doctorado", "raulja@uv.mx", "1980-12-12", "Universidad Veracruzana");
//        profeDAO.insertarRegistro(nuevo);
        Profesores prueba = new Profesores(2);
/*
Note que despues de hacer el registro la conexion de la BD se cierra, por lo que no me es posible dejar tanto el registro seguido
de la seleccion en el main, debo volver a ejecutarlo si quiero ver al nuevo maestro
*/
        Profesores salida = profeDAO.seleccionarRegistro(prueba);
        System.out.println("Profesor encontrado \n" + salida);
    }
}