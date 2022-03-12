package DAW_3;

public class Estudiante {
    private String nombreCompleto;
    private double calificacion;
    private String desempenio;

    public Estudiante(String nombreCompleto, double calificacion) {
        this.nombreCompleto = nombreCompleto;
        this.calificacion = calificacion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public String getDesempenio(double calificacion) {
        if (calificacion>=9.5 && calificacion<=10)
            return this.nombreCompleto + "\tExcelente";
        if (calificacion>=8.5 && calificacion<=9.4)
            return this.nombreCompleto + "\tMuy bien";
        if (calificacion>=7.5 && calificacion<=8.4)
            return this.nombreCompleto + "\tBien";
        if (calificacion>=7.0 && calificacion<=7.4)
            return this.nombreCompleto + "\tSuficiente";
        if (calificacion>=0.0 && calificacion<=6.9)
            return this.nombreCompleto + "\tInsuficiente";;
        return "Invalido";
    }

    @Override
    public String toString() {
        return " " + nombreCompleto + "\t    " + calificacion;
    }
}