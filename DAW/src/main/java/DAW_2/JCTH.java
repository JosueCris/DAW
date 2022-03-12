package DAW_2;

import java.util.Scanner;

public class JCTH {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre completo: ");
        sc.useDelimiter("\n");
        String nombre = sc.next();
        sc.nextLine(); // Te me olvidaste fucking buffer
        System.out.print("Ingresa tu nacionalidad: ");
        String nacionalidad = sc.nextLine();
        System.out.print("Ingresa tu año de nacimiento: ");
        int nacimiento = sc.nextInt();

        System.out.println();
        System.out.println("Nombre completo: "+nombre);
        System.out.println("Nacionalidad: "+nacionalidad);
        System.out.println("Año Nacimiento: "+nacimiento);
    }
}

/*
¿Cual es la definicion de clase en JAVA? Vendria siendo la abstraccion de algo del mundo real
    intentamos abstraer sus caracteristicas (atributos) y comportamientos (metodos) para plasmarlo en una
    plantilla.

¿Cual es la diferencia entre una clase y una estructura? Puedo ver que una clase tiene sus atributos y metodos,
    puede ser instanciado iniciandolo con valores en su metodo constructor. Por el otro lado las estructuras
    o registros solo contiene atributos pero no metodos, esos los ponemos aparate y no son exclusivamente de del struct.
    Una diferencia mas notable aun para mi es que una clase si puede ser heredada y un struct pues vendria siendo una variable
    mas que contiene variables.

¿En que consiste la herencia? En que una clase (hija o subclase) puede acceder a los atributos y metodos de otra
    clase (padre o superclase)

¿Que es ocurrencia?

¿Que es una instanciacion? Es crear un objeto a partir de una clase y la almacenamos en una variable.
*/
