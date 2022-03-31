package Tablas;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Alumnos alumno1 = new Alumnos();
        alumno1.setMatricula("S18001462");
        alumno1.setSemestre(8);
        alumno1.setClaveCarrera("IINFO");
        alumno1.setaPaterno("Tellez");
        alumno1.setaMaterno("Huerta");
        alumno1.setNombre("Josue");
        alumno1.setEdad(22);
        alumno1.setFechaNac("2000-06-24");
        alumno1.setCelular("2741019045");
        alumno1.setEmail("josuetllezh@gmail.com");
        alumno1.setDireccion("Boca del Rio");
        alumno1.setBeca(true);
        alumno1.setTelefono("2299210054");
        System.out.println(alumno1.toString());
        //System.out.println(alumno1.getNombre());
    }
}
