package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Curso {

    /**
     * Agrego los atributos Prof.Titular y Adjunto con la Lista de Alumnos.
     */

    private String nombre;
    private Integer curso;
    private ProfesorTitular profesorTitular;
    private ProfesorAdjunto profesorAdjunto;
    private List<Alumno> listaDeAlumnosInscriptos;
    private Integer cupoMaximosDeAlumnos;


    public Curso(String nombre, Integer curso, Integer cupoMaximosDeAlumnos) {
        this.nombre = nombre;
        this.curso = curso;
        this.cupoMaximosDeAlumnos = cupoMaximosDeAlumnos;
        listaDeAlumnosInscriptos = new ArrayList<>();
    }

    /**
     * Creo los getters y setters para el curso
     *
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(curso, curso.curso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(curso);
    }

    public Boolean agregarUnAlumno(Alumno unAlumno){
        if(listaDeAlumnosInscriptos.size() < cupoMaximosDeAlumnos){
            return listaDeAlumnosInscriptos.add(unAlumno);
        }else{
            System.out.println("No hay más cupo");
            return false;
        }
    }

    public void eliminarAlumno(Alumno unAlumno){
        listaDeAlumnosInscriptos.remove(unAlumno);
    }


}


