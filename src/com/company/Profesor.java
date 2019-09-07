package com.company;

public abstract class Profesor {

    /**
     * Creo Profesor con Constructor y Getters
     */

    private String nombre;
    private String apellido;
    private Integer antiguedad;
    private Integer codigoDeProfesor;

    public Profesor(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.antiguedad = antiguedad;
        this.codigoDeProfesor = codigoDeProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public Integer getCodigoDeProfesor() {
        return codigoDeProfesor;
    }


}
