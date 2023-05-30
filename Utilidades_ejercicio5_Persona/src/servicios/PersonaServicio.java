/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        System.out.println("Ingrese su fecha de nacimiento (dd, mm, aaaa)");
        int dia = leer.nextInt();
        int mes = leer.nextInt() - 1;
        int anio = leer.nextInt() - 1900;
        return new Persona(nombre, new Date(anio, mes, dia));
    }

    public int calcularEdad(Persona p) {
        Date d1 = p.getFechaNacimiento();
        Date d2 = new Date();
        int edad;

        int difAnio = d2.getYear() - d1.getYear();
        int difMes = d2.getMonth() - d1.getMonth();
        int difDia = d2.getDay() - d1.getDay();
        if ((difMes < 0) || ((difMes == 0) && (difDia < 0))) {
            edad= difAnio - 1;
        } else {
            edad = difAnio;
        }
        //System.out.println("La edad de la persona es "+edad);
        return edad;
    }
    
    public boolean menorQue(Persona p,int comparado){
        return Integer.compare(calcularEdad(p), comparado)<0;
    }
    
    public void mostrarPersona(Persona p){
        System.out.println(p.toString());
    }
}
