package Tablas;

import java.io.*;

public class Profesores implements Serializable {
    private int idProfesor;
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String tipoContrato;
    private int eeEspecializa;
    private String direccion;
    private String telefono;
    private String celular;
    private String tipoEstudios;
    private String email;
    private String fechaNac;
    private String lugarEstudios;

    public Profesores() {

    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public int getEeEspecializa() {
        return eeEspecializa;
    }

    public void setEeEspecializa(int eeEspecializa) {
        this.eeEspecializa = eeEspecializa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTipoEstudios() {
        return tipoEstudios;
    }

    public void setTipoEstudios(String tipoEstudios) {
        this.tipoEstudios = tipoEstudios;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getLugarEstudios() {
        return lugarEstudios;
    }

    public void setLugarEstudios(String lugarEstudios) {
        this.lugarEstudios = lugarEstudios;
    }

    @Override
    public String toString() {
        return "Profesores{" +
                "idProfesor=" + idProfesor +
                ", nombre='" + nombre + '\'' +
                ", aPaterno='" + aPaterno + '\'' +
                ", aMaterno='" + aMaterno + '\'' +
                ", tipoContrato='" + tipoContrato + '\'' +
                ", eeEspecializa=" + eeEspecializa +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", celular='" + celular + '\'' +
                ", tipoEstudios='" + tipoEstudios + '\'' +
                ", email='" + email + '\'' +
                ", fechaNac='" + fechaNac + '\'' +
                ", lugarEstudios='" + lugarEstudios + '\'' +
                '}';
    }
}
