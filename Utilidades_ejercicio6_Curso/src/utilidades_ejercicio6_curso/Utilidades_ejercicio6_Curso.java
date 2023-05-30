/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades_ejercicio6_curso;

import entidades.Curso;
import servicios.CursoServicio;

/**
 *
 * @author Usuario
 */
public class Utilidades_ejercicio6_Curso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoServicio miServicio = new CursoServicio();
        Curso miCurso = miServicio.crearCurso();

        System.out.println(miServicio.calcularGananciaSemanal(miCurso));

        for (int i = 0; i < 5; i++) {
            System.out.println(miCurso.getAlumnos()[i]);
        }

    }

}
