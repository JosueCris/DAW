package Tablas;

import java.io.*;

public class Semestres implements Serializable {
    private int codigo;
    private String numero;

    public Semestres() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Semestres{" +
                "codigo=" + codigo +
                ", numero='" + numero + '\'' +
                '}';
    }
}
