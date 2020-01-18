package com.company;

import java.util.Date;

public class Inscripcion {

    /**
     * Creo Inscripcion y paso los parámetros necesarios. Hago el constructor
     */

    private Alumno alumnoAInscribir;
    private Curso cursoSeleccionado;
    private Date fechaDeInscripcion;

    public Inscripcion(Alumno alumnoAInscribir, Curso cursoSeleccionado) {
        this.alumnoAInscribir = alumnoAInscribir;
        this.cursoSeleccionado = cursoSeleccionado;
        Date fechaDelDia = new Date();
        fechaDeInscripcion = fechaDelDia;
    }

}
