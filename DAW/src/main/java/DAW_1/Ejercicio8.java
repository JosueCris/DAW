package DAW_1;
//TERMINADO
public class Ejercicio8 {

    public static void main(String[] args) {
        int [][] numeros = new int[3][3];

        for (int i=0; i<numeros.length; i++) {
            for (int j=0; j<numeros.length; j++)
                numeros[i][j] = i+j;
        }

        System.out.println("Matriz:");
        for (int i=0; i<numeros.length; i++) {
            for (int j=0; j<numeros.length; j++)
                System.out.print(numeros[i][j]+"    ");
            System.out.println();
        }
    }
}
