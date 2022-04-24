package DAW_1.Ejercicio2;

class Administrador extends Empleado {
    private int antiguedad;

    public Administrador(String id, String nombre, String apellidos, String domicilio, String codigoPostal, String ciudad, PuestoTrabajo puesto, int antiguedad) {
        super(id, nombre, apellidos, domicilio, codigoPostal, ciudad, puesto);
        this.antiguedad = antiguedad;
    }

    @Override
    public String getAtributos() {
        return super.getAtributos()
                +"\nAntiguedad: "+antiguedad;
    }
}