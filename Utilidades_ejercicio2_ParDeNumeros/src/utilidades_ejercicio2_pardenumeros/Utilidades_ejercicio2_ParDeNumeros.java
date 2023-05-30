/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades_ejercicio2_pardenumeros;

import entidades.ParDeNumeros;
import servicios.ParDeNumerosServicio;

/**
 *
 * @author Usuario
 */
public class Utilidades_ejercicio2_ParDeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumerosServicio pdns = new ParDeNumerosServicio();
        ParDeNumeros pdn = pdns.crearPar();
        pdns.mostrarValores(pdn);
        pdns.devolverMayor(pdn);
        ParDeNumerosServicio.calcularPotencia(pdn);
        ParDeNumerosServicio.calcularRaiz(pdn);
        
    }
    
}
