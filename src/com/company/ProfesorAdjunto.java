package com.company;

public class ProfesorAdjunto extends Profesor {

    private Integer horasParaConsultas;


    public ProfesorAdjunto(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor, Integer horasParaConsultas) {
        super(nombre, apellido, antiguedad, codigoDeProfesor);
        this.horasParaConsultas = horasParaConsultas;
    }


}
