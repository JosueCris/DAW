package DAW_3;

import java.util.ArrayList;

public class Metodos {

    public void mostrarEstudiantes(ArrayList<Estudiante> grupo) {
        grupo.forEach(System.out::println);
    }

    public double promedioGeneral(ArrayList<Estudiante> grupo) {
        double promedio = 0.0;
        for (Estudiante estudiante : grupo)
            promedio += estudiante.getCalificacion();
        return (promedio/grupo.size());
    }

    public void mayorPromedioGeneral(ArrayList<Estudiante> grupo) {
        for (int i=0; i<grupo.size(); i++)
            if (grupo.get(i).getCalificacion() > promedioGeneral(grupo))
                System.out.println(grupo.get(i).toString());
    }

    public void menorPromedioGeneral(ArrayList<Estudiante> grupo) {
        for (int i=0; i<grupo.size(); i++)
            if (grupo.get(i).getCalificacion() < promedioGeneral(grupo))
                System.out.println(grupo.get(i).toString());
    }

    public void desempenioEstudiantes(ArrayList<Estudiante> grupo) {
        for(Estudiante lista : grupo)
            System.out.println(lista.getDesempenio(lista.getCalificacion()));
    }
}