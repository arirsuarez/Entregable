package com.company;

public class ProfesorAdjunto extends Profesor {

    /**
     * Creo las clases ProfTitu y Adjunto haciendo Profesor abstracto para que extiendan de el
     */

    private Integer horasParaConsultas;


    public ProfesorAdjunto(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor, Integer horasParaConsultas) {
        super(nombre, apellido, antiguedad, codigoDeProfesor);
        this.horasParaConsultas = horasParaConsultas;

    }


}
