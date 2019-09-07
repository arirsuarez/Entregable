package com.company;

public class Profesor {

    /**
     * Creo Profesor con Getters y Setters
     */

    private String nombre;
    private String apellido;
    private Integer antiguedad;
    private Integer codigoDeProfesor;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Integer getCodigoDeProfesor() {
        return codigoDeProfesor;
    }

    public void setCodigoDeProfesor(Integer codigoDeProfesor) {
        this.codigoDeProfesor = codigoDeProfesor;
    }
}
