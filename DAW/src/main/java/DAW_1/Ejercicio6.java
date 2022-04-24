package DAW_1;
//TERMINADO
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int potencia = 1;

        System.out.print("Ingresa un numero: ");
        int numero = sc.nextInt();
        System.out.print("Ingresa el exponente: ");
        int exponente = sc.nextInt();

        while(0<exponente){
            potencia *= numero;
            exponente--;
        }
        System.out.println("La potencia es: "+ potencia);
    }
}
