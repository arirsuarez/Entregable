package com.company;

import java.util.Objects;

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

    public Integer getCodigoDeAlumno() {
        return codigoDeAlumno;
    }

    public void setCodigoDeAlumno(Integer codigoDeAlumno) {
        this.codigoDeAlumno = codigoDeAlumno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return codigoDeAlumno.equals(alumno.codigoDeAlumno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoDeAlumno);
    }
}
