package com.company;

import java.util.List;
import java.util.Map;

public class Curso {

    /**
     * Agrego los atributos Prof.Titular y Adjunto con la Lista de Alumnos.
     */

    private String nombre;
    private  Integer curso;
    private ProfesorTitular profesorTitular;
    private ProfesorAdjunto profesorAdjunto;
    private List<Alumno> listaDeAlumnosInscriptos;


    /**
     * Creo los getters y setters para el curso
     * @return
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCurso() {
        return curso;
    }

    public void setCurso(Integer curso) {
        this.curso = curso;
    }

    public ProfesorTitular getProfesorTitular() {
        return profesorTitular;
    }

    public void setProfesorTitular(ProfesorTitular profesorTitular) {
        this.profesorTitular = profesorTitular;
    }

    public ProfesorAdjunto getProfesorAdjunto() {
        return profesorAdjunto;
    }

    public void setProfesorAdjunto(ProfesorAdjunto profesorAdjunto) {
        this.profesorAdjunto = profesorAdjunto;
    }

    public List<Alumno> getListaDeAlumnosInscriptos() {
        return listaDeAlumnosInscriptos;
    }

    public void setListaDeAlumnosInscriptos(List<Alumno> listaDeAlumnosInscriptos) {
        this.listaDeAlumnosInscriptos = listaDeAlumnosInscriptos;
    }
}


