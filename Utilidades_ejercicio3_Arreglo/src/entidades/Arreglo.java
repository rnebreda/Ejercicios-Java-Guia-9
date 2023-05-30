/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Usuario
 */
public class Arreglo {
    private double[] arreglo;
    private int orden;

    public Arreglo() {
    }

    public Arreglo(int orden) {
        this.orden = orden;
        this.arreglo = new double[orden];

    }

    public double[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(double[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }
    
    
    
}
