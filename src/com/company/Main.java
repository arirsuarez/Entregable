package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        DHManager dhManager = new DHManager();

        dhManager.altaCurso("Full Stack",2001,3);
        dhManager.altaCurso("Android", 2002, 2);

        dhManager.altaProfesorTitular("Cosme","Fulanito",001,"Full Stack");
        dhManager.altaProfesorTitular("Alex", "Plosivo", 002, "Android");

        dhManager.altaProfesorAdjunto("Pepe", "Lotazo", 0003,20);
        dhManager.altaProfesorAdjunto("Aldo", "Lorido", 0004, 25);

        dhManager.altaAlumno("Juampa", "Cifico", 1);
        dhManager.altaAlumno("Àmilcar", "Cajada", 2);
        dhManager.altaAlumno("Diego", "Loso", 3);
        dhManager.altaAlumno("Pedro", "Medario", 4);

        dhManager.inscribirAlumno(1,2001);
        dhManager.inscribirAlumno(2,2001);
        dhManager.inscribirAlumno(3,2001);
        //dhManager.inscribirAlumno(4,2001);

        dhManager.inscribirAlumno(1,2002);
        dhManager.inscribirAlumno(2, 2002);


        dhManager.bajaCurso(2002);

        dhManager.bajaProfesor(1);

    }

    //(Parte K) TODO     Agregaría una lista de cursos en Alumnos y un método para poder consultarlos (get o print List).
    // TODO       En el UML se agrega una flecha que sale desde Alumno hasta Curso "Tiene".
}
