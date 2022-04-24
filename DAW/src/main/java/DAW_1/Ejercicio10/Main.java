package DAW_1.Ejercicio10;

public class Main {

    public static void main(String[] args) {
        ConcesionarioVehiculos concesionario1 = new ConcesionarioVehiculos("CV-28-15468F", "DAW Cars", "Calle Wallaby 42 Sidney", "www.dawcars.com");
        Cliente cliente1 = new Cliente("1011", "Harry James", "Potter Evans");
        Cliente cliente2 = new Cliente("2012", "Ronald Bilius", "Weasley Prewett");
        Cliente cliente3 = new Cliente("3013", "Hermione Jean", "Granger");
        concesionario1.registrarCliente(cliente1);
        concesionario1.registrarCliente(cliente2);
        concesionario1.registrarCliente(cliente3);

        System.out.println("CLIENTES:");
        concesionario1.imprimirClientes();

        Vehiculo vehiculo1 = new Vehiculo("AB-79-1019J", "VW", "Gol", "Gris", 250000);
        Vehiculo vehiculo2 = new Vehiculo("ZS-22-0032M", "Nissan", "Tsuru", "Blanco", 200000);
        Vehiculo vehiculo3 = new Vehiculo("HF-00-2022S", "Chevrolet", "TRAX LT", "Naranja", 400000);
        Vehiculo vehiculo4 = new Vehiculo("OD-21-7889R", "VW", "Vocho", "Amarillo", 100000);
        concesionario1.registrarVehiculo(vehiculo1);
        concesionario1.registrarVehiculo(vehiculo2);
        concesionario1.registrarVehiculo(vehiculo3);
        concesionario1.registrarVehiculo(vehiculo4);

        System.out.println("\nCOCHES");
        concesionario1.imprimirVehiculos();

        System.out.println("\nCOCHES DE LA MARCA VW");
        concesionario1.imprimirVehiculos("VW");
    }
}
