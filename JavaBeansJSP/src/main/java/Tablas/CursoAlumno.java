package Tablas;

import java.io.*;

public class CursoAlumno implements Serializable {
    private int idCursoA;
    private String alumno;
    private double calificacion;
    private int intentos;
    private int idMateria;

    public CursoAlumno() {

    }

    public int getIdCursoA() {
        return idCursoA;
    }

    public void setIdCursoA(int idCursoA) {
        this.idCursoA = idCursoA;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    @Override
    public String toString() {
        return "CursoAlumno{" +
                "idCursoA=" + idCursoA +
                ", alumno='" + alumno + '\'' +
                ", calificacion=" + calificacion +
                ", intentos=" + intentos +
                ", idMateria=" + idMateria +
                '}';
    }
}
