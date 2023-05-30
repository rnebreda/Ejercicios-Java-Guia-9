/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades_ejercicio4_fecha;

import java.util.Scanner;
import servicios.FechaServicio;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Utilidades_ejercicio4_fecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        FechaServicio fs = new FechaServicio();
        Date d1 = fs.fechaNacimiento();
        Date d2 = fs.fechaActual();
        int edad = fs.diferencia(d1, d2);
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println("La edad es: " + edad);
    }

}
