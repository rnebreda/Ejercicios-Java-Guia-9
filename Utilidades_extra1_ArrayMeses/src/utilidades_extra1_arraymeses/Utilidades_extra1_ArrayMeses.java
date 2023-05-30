/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades_extra1_arraymeses;

import entidades.ArrayMes;
import servicios.MesServicio;

/**
 *
 * @author Usuario
 */
public class Utilidades_extra1_ArrayMeses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MesServicio ms = new MesServicio();
        ArrayMes am = ms.generarMesSecreto();
        ms.adivinaMes(am);
    }
    
}
