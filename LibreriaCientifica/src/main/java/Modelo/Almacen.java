package Modelo;

import java.io.Serializable;

public class Almacen implements Serializable {
    private int codRepisa;
    private int numeroEjemplares;
    private int pasillosA;

    public Almacen() {

    }

    public Almacen(int codRepisa) {
        this.codRepisa = codRepisa;
    }

    public Almacen(int numeroEjemplares, int pasillosA) {
        this.numeroEjemplares = numeroEjemplares;
        this.pasillosA = pasillosA;
    }

    public Almacen(int codRepisa, int numeroEjemplares, int pasillosA) {
        this.codRepisa = codRepisa;
        this.numeroEjemplares = numeroEjemplares;
        this.pasillosA = pasillosA;
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "codRepisa=" + codRepisa +
                ", numeroEjemplares=" + numeroEjemplares +
                ", pasillosA=" + pasillosA +
                '}';
    }
}
