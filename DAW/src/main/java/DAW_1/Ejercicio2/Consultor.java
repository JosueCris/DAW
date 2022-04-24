package DAW_1.Ejercicio2;

class Consultor extends Empleado {
    private String categProfesional;

    public Consultor(String id, String nombre, String apellidos, String domicilio, String codigoPostal, String ciudad, PuestoTrabajo puesto, String categProfesional) {
        super(id, nombre, apellidos, domicilio, codigoPostal, ciudad, puesto);
        this.categProfesional = categProfesional;
    }

    @Override
    public String getAtributos() {
        return super.getAtributos()
                +"\nCategoria Profesional: "+categProfesional;
    }
}