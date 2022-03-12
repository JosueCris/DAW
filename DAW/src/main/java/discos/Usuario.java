package discos;

public class Usuario {
  
  public static void main(String[] args)  {
    System.out.println("Empieza la prueba con el usuario.");
    Disco elMio = new Disco();
    elMio.setPermitidas(20);
    Disco elTuyo = new Disco((short)2,"Descifrando Enigma",2014,30);
    String mio = elMio.muestraDisco("Se trata de miDisco:\n");
    System.out.println(mio);
    System.out.println("El contenido de mi disco usando toString():");
    System.out.println("*******\n" + elMio +"\n********");
    elTuyo.setActivas(elTuyo.getActivas() + 1);
    String tuyo = "El contenido de 'tuDisco' con toString():\n"
      + elTuyo;
    System.out.println(tuyo);
    System.out.println();
    elTuyo.setActivas(49);
    System.out.println("objeto elTuyo:\n" 
                         + elTuyo.daTransmision());
    System.out.println();
    System.out.println("objeto elTuyo:\n" + elTuyo.daTransmision());
    System.out.println();
    System.out.println("objeto elTuyo:\n"
                         + (elTuyo.terminaTransmision()
                              ?"Termino en 'elTuyo'"
                              : "No habia nada que terminar"));
    System.out.println();
    System.out.println("objeto elTuyo:\n" + elTuyo.daTransmision());
    System.out.println();
    Disco elNuestro = (Disco)(elMio.copiaDisco());
    System.out.println(elMio.daTransmision());
    System.out.println("Disco 'elMio':\n" + elMio);
    System.out.println();
    System.out.println("Disco 'elNuestro':\n" + elNuestro);
    System.out.println();
    System.out.println("Hasta luego");
  }
}
