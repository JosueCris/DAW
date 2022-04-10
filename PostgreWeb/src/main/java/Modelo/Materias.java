package Modelo;

import java.io.Serializable;

public class Materias implements Serializable {
    private int codigo;
    private String nombre;
    private int creditos;
    private int horasSemana;
    private String tipo;
    private int profesor;

    public Materias() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getHorasSemana() {
        return horasSemana;
    }

    public void setHorasSemana(int horasSemana) {
        this.horasSemana = horasSemana;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getProfesor() {
        return profesor;
    }

    public void setProfesor(int profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Materias{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", creditos=" + creditos +
                ", horasSemana=" + horasSemana +
                ", tipo='" + tipo + '\'' +
                ", profesor=" + profesor +
                '}';
    }
}
