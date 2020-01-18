package com.company;

import java.util.ArrayList;
import java.util.List;

public class DHManager {

    private List<Alumno> alumnoListtList;
    private List<Profesor> profesorList;
    private List<Curso> cursoList;
    private List<Inscripcion> inscripcionList;

    public DHManager(){
        this.alumnoListtList = new ArrayList<>();
        this.profesorList = new ArrayList<>();
        this.cursoList = new ArrayList<>();
        this.inscripcionList = new ArrayList<>();
    }

    public void altaCurso(String nombre, Integer curso, Integer cupoMaximoDeAlumnos){
        Curso nuevoCurso = new Curso(nombre, curso, cupoMaximoDeAlumnos);
        cursoList.add(nuevoCurso);
    }

    public void bajaCurso(Integer curso){
        cursoList.remove(buscarCurso(curso));
    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadHoras){
        ProfesorAdjunto profesorAdjunto = new ProfesorAdjunto(nombre,apellido,0, codigoProfesor, cantidadHoras);
        profesorList.add(profesorAdjunto);
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad){
        ProfesorTitular profesorTitular = new ProfesorTitular(nombre,apellido,0,codigoProfesor,especialidad);
        profesorList.add(profesorTitular);
    }

    public void bajaProfesor(Integer codigoProfesor){
        profesorList.remove(buscarProfesor(codigoProfesor));
    }

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno){
        Alumno alumno = new Alumno(nombre,apellido,codigoAlumno);
        alumnoListtList.add(alumno);
    }

    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso){
        Alumno alumnoAInscribir = buscarAlumno(codigoAlumno);
        Curso cursoAInscribir = buscarCurso(codigoCurso);

        if (cursoAInscribir.agregarUnAlumno(alumnoAInscribir)){
            Inscripcion inscribir = new Inscripcion(alumnoAInscribir,cursoAInscribir);
            inscripcionList.add(inscribir);
            System.out.println("Inscripción exitosa");
        }else {
            System.out.println("Inscripción errónea");
        }
    }

    public void asignarProfesores(Integer curso, Integer profesorTitular, Integer profesorAdjunto){
        Curso cursoAAsignar = buscarCurso(curso);
        ProfesorTitular profesorTitularAASignar = (ProfesorTitular) buscarProfesor(profesorTitular);
        ProfesorAdjunto profesorAdjuntoAAsignar = (ProfesorAdjunto) buscarProfesor(profesorAdjunto);
        cursoAAsignar.setProfesorTitular(profesorTitularAASignar);
        cursoAAsignar.setProfesorAdjunto(profesorAdjuntoAAsignar);
    }


    private Curso buscarCurso(Integer codigoCurso){
        Curso cursoBuscado = null;
        for (Curso curso:cursoList) {
            if(curso.getCurso().equals(codigoCurso)){
                cursoBuscado = curso;
            }

        }
        return cursoBuscado;
    }

    private Profesor buscarProfesor(Integer codigoProfesor){
        Profesor profesorBuscado = null;
        for (Profesor profesor:profesorList
             ) {
            if (profesor.getCodigoDeProfesor().equals(codigoProfesor)){
                profesorBuscado = profesor;
            }

        }
        return profesorBuscado;
    }

    private Alumno buscarAlumno (Integer codigoAlumno){
        Alumno alumnoBuscado = null;
        for (Alumno alumno:alumnoListtList
             ) {if (alumno.getCodigoDeAlumno().equals(codigoAlumno)){
                 alumnoBuscado = alumno;
        }
        }
        return alumnoBuscado;
    }
}
