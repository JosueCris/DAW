package Modelo;

import java.io.Serializable;

public class Alumnos implements Serializable {
    private String matricula;
    private int semestre;
    private String claveCarrera;
    private String aPaterno;
    private String aMaterno;
    private String nombre;
    private int edad;
    private String fechaNac;  // Si es tipo date
    private String celular;
    private String email;
    private String direccion;
    private Boolean beca;    // Es booleano en la bd
    private String telefono;

    public Alumnos() { }

    public Alumnos(String matricula) {
        this.matricula = matricula;
    }

    public Alumnos(String matricula, int semestre, String claveCarrera, String aPaterno, String aMaterno, String nombre, int edad, String fechaNac, String celular, String email, String direccion, Boolean beca, String telefono) {
        this.matricula = matricula;
        this.semestre = semestre;
        this.claveCarrera = claveCarrera;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.email = email;
        this.direccion = direccion;
        this.beca = beca;
        this.telefono = telefono;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getClaveCarrera() {
        return claveCarrera;
    }

    public void setClaveCarrera(String claveCarrera) {
        this.claveCarrera = claveCarrera;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getBeca() {
        return beca;
    }

    public void setBeca(Boolean beca) {
        this.beca = beca;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "matricula='" + matricula + '\'' +
                ", semestre=" + semestre +
                ", claveCarrera='" + claveCarrera + '\'' +
                ", aPaterno='" + aPaterno + '\'' +
                ", aMaterno='" + aMaterno + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", fechaNac='" + fechaNac + '\'' +
                ", celular='" + celular + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                ", beca='" + beca + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
