package DAW_1.Ejercicio1;
//TERMINADO
import java.util.Scanner;

public class MiPrograma {

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

        Alumno alumno1 = new Alumno(matricula, nombre, apellidos, fecha, creditos);
        System.out.println("\n"+alumno1.getAtributos());
    }
}
