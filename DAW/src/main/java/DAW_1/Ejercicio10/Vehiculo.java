package DAW_1.Ejercicio10;

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