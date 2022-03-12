package DAW_3;

import java.util.ArrayList;

public class Practica3_JCTH {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();

        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        Estudiante e1 = new Estudiante("0001", 3.3);
        Estudiante e2 = new Estudiante("0002", 3.6);
        Estudiante e3 = new Estudiante("0003", 2.6);
        Estudiante e4 = new Estudiante("0004", 8.1);
        Estudiante e5 = new Estudiante("0005", 2);
        Estudiante e6 = new Estudiante("0006", 0.8);
        Estudiante e7 = new Estudiante("0007", 10);
        Estudiante e8 = new Estudiante("0008", 7.5);
        Estudiante e9 = new Estudiante("0009", 9.9);
        Estudiante e10 = new Estudiante("0010", 0.3);
        Estudiante e11 = new Estudiante("0011", 8.7);
        Estudiante e12 = new Estudiante("0012", 8.9);
        Estudiante e13 = new Estudiante("0013", 9.4);
        Estudiante e14 = new Estudiante("0014", 10);
        Estudiante e15 = new Estudiante("0015", 8.2);
        Estudiante e16 = new Estudiante("0016", 2.3);
        Estudiante e17 = new Estudiante("0017", 9.9);
        Estudiante e18 = new Estudiante("0018", 0);
        Estudiante e19 = new Estudiante("0019", 3.8);

        estudiantes.add(e1);
        estudiantes.add(e2);
        estudiantes.add(e3);
        estudiantes.add(e4);
        estudiantes.add(e5);
        estudiantes.add(e6);
        estudiantes.add(e7);
        estudiantes.add(e8);
        estudiantes.add(e9);
        estudiantes.add(e10);
        estudiantes.add(e11);
        estudiantes.add(e12);
        estudiantes.add(e13);
        estudiantes.add(e14);
        estudiantes.add(e15);
        estudiantes.add(e16);
        estudiantes.add(e17);
        estudiantes.add(e18);
        estudiantes.add(e19);

        System.out.println("\tESTUDIANTES \nNombre\tCalificacion");
        metodos.mostrarEstudiantes(estudiantes);

        System.out.println("\nPROMEDIO GENERAL \n" + metodos.promedioGeneral(estudiantes));

        System.out.println("\nMAYORES AL PROMEDIO GENERAL \nNombre\tCalificacion");
        metodos.mayorPromedioGeneral(estudiantes);

        System.out.println("\nMENORES AL PROMEDIO GENERAL \nNombre\tCalificacion");
        metodos.menorPromedioGeneral(estudiantes);

        System.out.println("\n\tDESEMPENIO \nNombre\tDesempenio");
        metodos.desempenioEstudiantes(estudiantes);
    }
}
