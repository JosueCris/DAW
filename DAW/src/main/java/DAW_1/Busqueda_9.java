package DAW_1;
//TERMINADO
public class Busqueda_9 {

    public static void main(String[] args) {
        int [] numeros = {1, 2, 4, 5, 6, 7 ,8, 9, 10, 11, 12, 15, 16, 17, 18};
        binario(numeros, 8);
        binario(numeros, 15);
        binario(numeros, 19);
    }

    public static void binario(int [] array, int number) {
        int centro, inicio = 0, fin = array.length-1, count = 0;
        while(inicio <= fin) {
            centro = (inicio + fin) / 2;
            count++;
            if (array[centro] == number) {
                System.out.println("Dato encontrado");
                break;
            }
            else if (number < array[centro])
                fin = centro - 1;
            else
                inicio = centro + 1;
        }
        if (inicio > fin)
            System.out.println("Dato NO encontrado");
        System.out.println("Total de iteraciones: " + count +"\n");
    }
}
