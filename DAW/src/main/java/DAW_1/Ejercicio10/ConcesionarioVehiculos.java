package DAW_1.Ejercicio10;

import java.util.ArrayList;

public class ConcesionarioVehiculos {
    private String id;
    private String nombre;
    private String domicilio;
    private String paginaWeb;

    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public ConcesionarioVehiculos(String id, String nombre, String domicilio, String paginaWeb) {
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