package DAW_1;

import java.util.ArrayList;

public class ConcesionarioVehiculos_10 {
    private String id;
    private String nombre;
    private String domicilio;
    private String paginaWeb;

    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public ConcesionarioVehiculos_10(String id, String nombre, String domicilio, String paginaWeb) {
        this.id = id;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.paginaWeb = paginaWeb;
    }

    public void registrarCliente(Cliente c) {
        clientes.add(c);
    }

    public void imprimirClientes() {
        for (Cliente personas : clientes)
            System.out.println(personas.getClientes());
    }

    public void registrarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    public void imprimirVehiculos() {
        for (Vehiculo coches : vehiculos)
            System.out.println(coches.getVehiculos());
    }

    public void imprimirVehiculos(String marca) {
        for (int i=0; i<vehiculos.size(); i++) {
            if (vehiculos.get(i).getMarca().equalsIgnoreCase(marca))
                System.out.println(vehiculos.get(i).getVehiculos());
        }
    }
}


class Cliente {
    private String id;
    private String nombre;
    private String apellidos;

    public Cliente(String id, String nombre, String apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getClientes() {
        return "ID: "+id
                +"\nNombre: "+nombre
                +"\nApellidos: "+apellidos
                +"\n----------------------------";
    }
}


class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double precio;

    public Vehiculo(String matricula, String marca, String modelo, String color, double precio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getVehiculos() {
        return "Matricula: " + matricula
                + "\nMarca: " + marca
                + "\nModelo: " + modelo
                + "\nColor: " + color
                + "\nPrecio: " + precio
                + "\n----------------------------";
    }
}


class Main {

    public static void main(String[] args) {
        ConcesionarioVehiculos_10 concesionario1 = new ConcesionarioVehiculos_10("CV-28-15468F", "DAW Cars", "Calle Wallaby 42 Sidney", "www.dawcars.com");
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
