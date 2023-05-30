/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades_ejercicio1_cadena;

import Entidades.Cadena;
import Servicios.CadenaServicio;

/**
 *
 * @author Usuario
 */
public class Utilidades_ejercicio1_Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaServicio cs = new CadenaServicio();
        Cadena cd = cs.crearCadena();
        System.out.println("La cantidad de vocales de la frase es: " + cs.mostrarVocales(cd));
        System.out.print("La frase invertida es: ");
        cs.invertirFrase(cd);
        cs.vecesRepetido(cd);
        cs.compararLongitud(cd);
        cs.unirFrases(cd);
        cs.reemplazar(cd);
        boolean contiene = cs.contiene(cd);
        if (contiene) {
            System.out.println("El caracter buscado se encuentra en la frase");

        } else {
            System.out.println("El caracter buscado NO se encuentra en la frase");
        }

    }

}
