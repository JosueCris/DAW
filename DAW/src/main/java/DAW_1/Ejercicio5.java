package DAW_1;
//TERMINADO
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        int numero = sc.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int multiplicador = sc.nextInt();

        int total = 0;
        for(int i=0; i<multiplicador; i++){
            total += numero;
        }
        System.out.println(numero+" x "+multiplicador+" = "+total);
    }
}
