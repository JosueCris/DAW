package DAW_1.Ejercicio2;

public class Empleado {
    private String id;
    private String nombre;
    private String apellidos;
    private String domicilio;
    private String codigoPostal;
    private String ciudad;
    private PuestoTrabajo puesto;

    public Empleado(String id, String nombre, String apellidos, String domicilio, String codigoPostal, String ciudad, PuestoTrabajo puesto) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.puesto = puesto;
    }

    public String getAtributos() {
        return "ID: "+id
                +"\nNombre: "+nombre
                +"\nApellidos: "+apellidos
                +"\nDomicilio: "+domicilio
                +"\nCodigo Postal: "+codigoPostal
                +"\nCiudad: "+ciudad
                +"\nPuesto: "+puesto.getDescripcion();
    }
}