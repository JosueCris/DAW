package DAW_1.Ejercicio2;

public class MiPrograma2 {

    public static void main(String[] args) {
        PuestoTrabajo Fotografo = new PuestoTrabajo("1010", "Le toma fotos a spiderman", 200);
        PuestoTrabajo Abogado = new PuestoTrabajo("1020", "Defiende casos de los heroes", 300);
        PuestoTrabajo Administrador = new PuestoTrabajo("1030", "Planifica y organiza tareas de la empresa", 80);
        PuestoTrabajo Consultor = new PuestoTrabajo("1040", "Asesora empresas para solucionar fallos", 100);

        Empleado empleado1 = new Empleado("1011", "Peter", "Parker", "Queens", "2525", "New York", Fotografo);
        System.out.println(empleado1.getAtributos());

        System.out.println();
        Empleado empleado2 = new Empleado("1021", "Matthew", "Murdock", "Hells Kitchen", "2530", "New York", Abogado);
        System.out.println(empleado2.getAtributos());

        System.out.println();
        Administrador empleado3 = new Administrador("1031", "Carlos", "Perez", "Conocido", "95291", "Veracruz", Administrador, 3);
        System.out.println(empleado3.getAtributos());

        System.out.println();
        Consultor empleado4 = new Consultor("1041", "Sergio", "Ramirez", "Desconocido", "93467", "Mexico", Consultor, "Alto");
        System.out.println(empleado4.getAtributos());
    }
}
