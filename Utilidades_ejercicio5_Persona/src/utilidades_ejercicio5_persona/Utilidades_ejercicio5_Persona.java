/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades_ejercicio5_persona;

import entidades.Persona;
import java.util.Scanner;
import servicios.PersonaServicio;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Utilidades_ejercicio5_Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio ps = new PersonaServicio();
        Persona p = ps.crearPersona();
        System.out.println("La edad de la persona es: " + ps.calcularEdad(p));
        System.out.println("Ingrese una edad para comparar con la persona");
        boolean menor = ps.menorQue(p, leer.nextInt());
        if (menor) {
            System.out.println("La persona es menor");

        } else {
            System.out.println("La persona es Mayor");
        }
        System.out.println("Los datos de la persona son: ");
        ps.mostrarPersona(p);

    }

}
