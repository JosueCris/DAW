package Modelo;

import java.io.Serializable;

public class Libros implements Serializable {
    private String isbn;
    private String titulo;
    private int anioEdicion;
    private int rEditorial;
    private int rIdioma;
    private int numeroPaginas;
    private int rMateria;
    private double precio;
    private String sinopsis;
    private int rEstante;

    public Libros() {

    }

    public Libros(String isbn) {
        this.isbn = isbn;
    }

    public Libros(String titulo, int anioEdicion, int rEditorial, int rIdioma, int numeroPaginas, int rMateria, double precio, String sinopsis, int rEstante) {
        this.titulo = titulo;
        this.anioEdicion = anioEdicion;
        this.rEditorial = rEditorial;
        this.rIdioma = rIdioma;
        this.numeroPaginas = numeroPaginas;
        this.rMateria = rMateria;
        this.precio = precio;
        this.sinopsis = sinopsis;
        this.rEstante = rEstante;
    }

    public Libros(String isbn, String titulo, int anioEdicion, int rEditorial, int rIdioma, int numeroPaginas, int rMateria, double precio, String sinopsis, int rEstante) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioEdicion = anioEdicion;
        this.rEditorial = rEditorial;
        this.rIdioma = rIdioma;
        this.numeroPaginas = numeroPaginas;
        this.rMateria = rMateria;
        this.precio = precio;
        this.sinopsis = sinopsis;
        this.rEstante = rEstante;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public int getrEditorial() {
        return rEditorial;
    }

    public void setrEditorial(int rEditorial) {
        this.rEditorial = rEditorial;
    }

    public int getrIdioma() {
        return rIdioma;
    }

    public void setrIdioma(int rIdioma) {
        this.rIdioma = rIdioma;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getrMateria() {
        return rMateria;
    }

    public void setrMateria(int rMateria) {
        this.rMateria = rMateria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getrEstante() {
        return rEstante;
    }

    public void setrEstante(int rEstante) {
        this.rEstante = rEstante;
    }

    @Override
    public String toString() {
        return "Libros{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anioEdicion=" + anioEdicion +
                ", rEditorial=" + rEditorial +
                ", rIdioma=" + rIdioma +
                ", numeroPaginas=" + numeroPaginas +
                ", rMateria=" + rMateria +
                ", precio=" + precio +
                ", sinopsis='" + sinopsis + '\'' +
                ", rEstante=" + rEstante +
                '}';
    }
}