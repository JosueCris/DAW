package DAW_1;
//TERMINADO
import java.util.Scanner;

public class Alumno_1 {
    private String matricula;
    private String nombre;
    private String apellidos;
    private String fechaIngreso;
    private int creditos;

    public Alumno_1(String matricula, String nombre, String apellidos, String fechaIngreso, int creditos) {
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


class MiPrograma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la matricula: ");
        String matricula = sc.nextLine();
        System.out.print("Ingresa el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingresa los apellidos: ");
        String apellidos = sc.nextLine();
        System.out.print("Ingresa la fecha de ingreso: ");
        String fecha = sc.nextLine();
        System.out.print("Ingresa los creditos: ");
        int creditos = sc.nextInt();

        Alumno_1 alumno1 = new Alumno_1(matricula, nombre, apellidos, fecha, creditos);
        System.out.println("\n"+alumno1.getAtributos());
    }
}
