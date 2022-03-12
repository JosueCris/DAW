package DAW_1;

public class Empleado_2 {
    private String id;
    private String nombre;
    private String apellidos;
    private String domicilio;
    private String codigoPostal;
    private String ciudad;
    private PuestoTrabajo puesto;

    public Empleado_2(String id, String nombre, String apellidos, String domicilio, String codigoPostal, String ciudad, PuestoTrabajo puesto) {
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


class Administrador extends Empleado_2 {
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


class Consultor extends Empleado_2 {
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


class MiPrograma2 {
    public static void main(String[] args) {

        PuestoTrabajo Fotografo = new PuestoTrabajo("1010", "Le toma fotos a spiderman", 200);
        PuestoTrabajo Abogado = new PuestoTrabajo("1020", "Defiende casos de los heroes", 300);
        PuestoTrabajo Administrador = new PuestoTrabajo("1030", "Planifica y organiza tareas de la empresa", 80);
        PuestoTrabajo Consultor = new PuestoTrabajo("1040", "Asesora empresas para solucionar fallos", 100);

        Empleado_2 empleado1 = new Empleado_2("1011", "Peter", "Parker", "Queens", "2525", "New York", Fotografo);
        System.out.println(empleado1.getAtributos());

        System.out.println();
        Empleado_2 empleado2 = new Empleado_2("1021", "Matthew", "Murdock", "Hells Kitchen", "2530", "New York", Abogado);
        System.out.println(empleado2.getAtributos());

        System.out.println();
        Administrador empleado3 = new Administrador("1031", "Carlos", "Perez", "Conocido", "95291", "Veracruz", Administrador, 3);
        System.out.println(empleado3.getAtributos());

        System.out.println();
        Consultor empleado4 = new Consultor("1041", "Sergio", "Ramirez", "Desconocido", "93467", "Mexico", Consultor, "Alto");
        System.out.println(empleado4.getAtributos());
    }
}
