package DAW_1.Ejercicio1;

public class Alumno {
    private String matricula;
    private String nombre;
    private String apellidos;
    private String fechaIngreso;
    private int creditos;

    public Alumno(String matricula, String nombre, String apellidos, String fechaIngreso, int creditos) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaIngreso = fechaIngreso;
        this.creditos = creditos;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getAtributos() {
        return "Matricula: "+getMatricula()
                +"\nNombre: "+getNombre()
                +"\nApellidos: "+getApellidos()
                +"\nFecha Ingreso: "+getFechaIngreso()
                +"\nCreditos: "+getCreditos()
                +"\n----------------------------";
    }
}