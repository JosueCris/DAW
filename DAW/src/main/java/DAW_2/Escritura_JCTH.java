package DAW_2;

import java.io.*;

public class Escritura_JCTH {

    public static void main(String[] args) {
        PrintWriter pw = null;
        String file = "Meses.txt";
        String [] meses = {"Enero", "Febrero", "Marzo", "Abril",
                           "Mayo", "Junio", "Julio", "Agosto",
                           "Septiembre", "Octubre", "Noviembre",
                           "Diciembre"};

        try {
            pw = new PrintWriter(file);
        }catch(FileNotFoundException fnfe){
            System.out.println("No existe el archivo");
        }

        for(String escritor : meses)
            pw.println(escritor);

        pw.close();
    }
}
