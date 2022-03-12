package DAW_1;
//TERMINADO
import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        int n = sc.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int m = sc.nextInt();

        int total = 0;
        for(int i=0; i<m; i++){
            total += n;
        }
        System.out.println(n+" x "+m+" = "+total);
    }
}
