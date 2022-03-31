package Tablas;

import java.io.*;

public class CursoSalon implements Serializable {
    private int idCursoSa;
    private int curso;
    private int dia;
    private String hora;
    private String mes;

    public CursoSalon() {

    }

    public int getIdCursoSa() {
        return idCursoSa;
    }

    public void setIdCursoSa(int idCursoSa) {
        this.idCursoSa = idCursoSa;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "CursoSalon{" +
                "idCursoSa=" + idCursoSa +
                ", curso=" + curso +
                ", dia=" + dia +
                ", hora=" + hora +
                ", mes='" + mes + '\'' +
                '}';
    }
}
