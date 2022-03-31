package Tablas;

import java.io.*;

public class Salones implements Serializable {
    private String codigoSalon;
    private String lugar;
    private int numPupitre;

    public Salones() {

    }

    public String getCodigoSalon() {
        return codigoSalon;
    }

    public void setCodigoSalon(String codigoSalon) {
        this.codigoSalon = codigoSalon;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getNumPupitre() {
        return numPupitre;
    }

    public void setNumPupitre(int numPupitre) {
        this.numPupitre = numPupitre;
    }

    @Override
    public String toString() {
        return "Salones{" +
                "codigoSalon='" + codigoSalon + '\'' +
                ", lugar='" + lugar + '\'' +
                ", numPupitre=" + numPupitre +
                '}';
    }
}
