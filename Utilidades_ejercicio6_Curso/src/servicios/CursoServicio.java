/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CursoServicio {
      private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public String [] cargarAlumnos (){
     String [] A = new String[5];
     
        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese nombre del alumno");
          A [i] = leer.next();
       
        }
        return A;
    }
    
    public Curso crearCurso () {
        Curso cursoObjeto = new Curso ();
        System.out.println("ingrese nombre del curso");
        cursoObjeto.setNombreCurso(leer.next());
        System.out.println("ingrese cantidad de horas por dia");
        cursoObjeto.setCantidadHorasPorDia(leer.nextInt());
         System.out.println("ingrese cantidad de dias por semana");
        cursoObjeto.setCantidadDiasPorSemana(leer.nextInt());
          System.out.println("ingrese turno: M o T");
        cursoObjeto.setTurno(leer.next());
        System.out.println("ingrese precio por hora");
        cursoObjeto.setPrecioPorHora(leer.nextDouble()); 
       cursoObjeto.setAlumnos(this.cargarAlumnos());
       return cursoObjeto;
             
    }
    public double calcularGananciaSemanal(Curso cursoObjeto){
        double ganancia;
        ganancia = cursoObjeto.getCantidadHorasPorDia()*cursoObjeto.getPrecioPorHora()
                *cursoObjeto.getCantidadDiasPorSemana()*5;
       
        
        return ganancia;
    }
}
