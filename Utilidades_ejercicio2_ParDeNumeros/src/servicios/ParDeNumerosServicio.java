/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.ParDeNumeros;

/**
 *
 * @author Usuario
 */
public class ParDeNumerosServicio {

    public ParDeNumeros crearPar() {
        return new ParDeNumeros();
    }

    public void mostrarValores(ParDeNumeros pdn) {
        System.out.print("Los 2 números reales son: " + pdn.getNro1() + " y " + pdn.getNro2());
        System.out.println("");
    }
    
        public void devolverMayor(ParDeNumeros pdn) {
            double mayor;
            if (pdn.getNro1()>pdn.getNro2()) {
                mayor= pdn.getNro1();
            }else{
                mayor= pdn.getNro2();
            }
        System.out.println("El mayor es: " + mayor);
    }
        
        public static void calcularPotencia (ParDeNumeros pdn){
            
            long redondeado1= (Math.max(Math.round(pdn.getNro1()), Math.round(pdn.getNro2())));
            long redondeado2= (Math.min(Math.round(pdn.getNro1()), Math.round(pdn.getNro2())));
            System.out.println("El número mayor elevado al menor es: "+ Math.pow(redondeado1, redondeado2));
        }
        
        public static void calcularRaiz (ParDeNumeros pdn){
            
            double radicando = Math.abs(Math.min(pdn.getNro1(), pdn.getNro2()));
            System.out.println("La raiz cuadrada del número menor es: "+ Math.sqrt(radicando));
        }

}
