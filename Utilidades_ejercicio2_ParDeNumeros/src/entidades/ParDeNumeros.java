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
public class ParDeNumeros {
    
    private double nro1;
    private double nro2;

    public ParDeNumeros() {
        nro1= (Math.random()*200)-100;
        nro2= (Math.random()*200)-100;
    }

    public double getNro1() {
        return nro1;
    }

    public void setNro1(double nro1) {
        this.nro1 = nro1;
    }

    public double getNro2() {
        return nro2;
    }

    public void setNro2(double nro2) {
        this.nro2 = nro2;
    }
    
    
    
}
