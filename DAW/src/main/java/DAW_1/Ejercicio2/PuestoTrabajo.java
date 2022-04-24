package DAW_1.Ejercicio2;

class PuestoTrabajo {
    private String codigo;
    private String descripcion;
    private double sueldoNeto;

    public String getDescripcion() {
        return descripcion;
    }

    public PuestoTrabajo(String codigo, String descripcion, double sueldoNeto) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.sueldoNeto = sueldoNeto;
    }
}