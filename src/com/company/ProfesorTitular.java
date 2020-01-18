package com.company;

public class ProfesorTitular extends Profesor {

    /**
     * Creo las clases ProfTitu y Adjunto haciendo Profesor abstracto para que extiendan de el
     */

    private String especialidad;

    public ProfesorTitular(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor, String especialidad) {
        super(nombre, apellido, antiguedad, codigoDeProfesor);
        this.especialidad = especialidad;
    }


}
