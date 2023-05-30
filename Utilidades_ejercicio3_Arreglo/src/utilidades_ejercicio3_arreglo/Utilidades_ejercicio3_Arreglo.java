/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades_ejercicio3_arreglo;

import entidades.Arreglo;
import servicios.ArregloServicio;

/**
 *
 * @author Usuario
 */
public class Utilidades_ejercicio3_Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArregloServicio as = new ArregloServicio();
        Arreglo a = as.crearArreglo(50);
        Arreglo b = as.crearArreglo(20);
        as.inicializarA(a.getArreglo());
        as.mostrar(a.getArreglo());
        as.ordenar(a.getArreglo());
        as.inicializarB(a.getArreglo(), b.getArreglo());
        as.mostrar(a.getArreglo());
        as.mostrar(b.getArreglo());
    }
    
}
