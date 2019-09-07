package com.company;

public class Alumno {
    private String nombre;
    private String apellido;
    private Integer codigoDeAlumno;

    /**
     * Creamos el constructor para cuando se crea un alumno
     * @param nombre
     * @param apellido
     * @param codigoDeAlumno
     */

    public Alumno(String nombre, String apellido, Integer codigoDeAlumno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoDeAlumno = codigoDeAlumno;
    }



}
