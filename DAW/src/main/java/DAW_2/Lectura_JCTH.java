package DAW_2;

import java.io.*;
import java.util.Scanner;

public class Lectura_JCTH {

    public static void main(String[] args) {
        String path = "Meses.txt";
        File file = new File(path);

        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext())
                System.out.println(sc.next());
        } catch (IOException ioe) {
            System.out.println("No existe el archivo !!!");
        }
    }
}
