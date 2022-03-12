package discos;

public class prueba {

    public static void main(String[] args) {
//        int [] frecs = null;
//
//        if (frecs == null)
//            System.out.println("El arreglo es una referencia nula");
//        else {
//            int tam = frecs.length;
//            for (int i = 0; i < tam; i++)
//                System.out.println("pos=" + i + "contenido="
//            + frecs[i]);
//        }

//        int num = 8;
//        for (int i = 0; i <= num; i ++)
//            if (i < num / 2)  {
//                i += num / 4;
//                System.out.println("En el if, siguiente valor de i="
//                + i);
//            }
//            else  {
//                i += num / 5;
//                System.out.println("En el else, siguiente valor de i="
//                + i);
//            }
    int [] array = {1, 2, 3, 4, 5};
    int [] n = eleva(array);
    for (int i : n)
        System.out.print(n +"\n");

    }

    public static int[] eleva( int[] nums) {
        int tam = nums.length;
        int[] nuevo = new int[tam];
        for (int i = 0; i < tam; i++)
            if (nums[i] % 2 == 0)
                nuevo[i] = nums[i] * nums[i];
            else
                nuevo[i] = nums[i] * nums[i] * nums[i];
        return nuevo;
    }

    }
