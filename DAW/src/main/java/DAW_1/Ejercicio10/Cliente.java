package DAW_1.Ejercicio10;

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