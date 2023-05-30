/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Arreglo;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ArregloServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Arreglo crearArreglo(int orden) {
        return new Arreglo(orden);
    }

    public void inicializarA(double[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10000);
            a[i] = a[i]/100;
        }
    }

    public void mostrar(double[] a) {
        System.out.println(Arrays.toString(a));
    }

    public void ordenar(double[] a) {
        double aux;
        int ultimo = a.length - 1;
        Arrays.sort(a);
        for (int i = 0; i < a.length / 2; i++) {
            aux = a[i];
            a[i] = a[ultimo - i];
            a[ultimo - i]= aux;
        }

    }

    public void inicializarB(double[] a, double[] b) {
        System.arraycopy(a, 0, b, 0, 10);
        Arrays.fill(b, 10, 20, 0.5);
    }
}
