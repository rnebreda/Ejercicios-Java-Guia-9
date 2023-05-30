/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CadenaServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {
        System.out.println("Ingrese la frase");
        return new Cadena(leer.next());

    }

    public int mostrarVocales(Cadena cd) {
        int cuentaVocales = 0;
        for (int i = 0; i < cd.getLongitud(); i++) {
            if (cd.getFrase().substring(i, i + 1).equalsIgnoreCase("A")
                    || cd.getFrase().substring(i, i + 1).equalsIgnoreCase("E")
                    || cd.getFrase().substring(i, i + 1).equalsIgnoreCase("I")
                    || cd.getFrase().substring(i, i + 1).equalsIgnoreCase("O")
                    || cd.getFrase().substring(i, i + 1).equalsIgnoreCase("U")) {
                cuentaVocales++;
            }
        }

        return cuentaVocales;
    }

    public void invertirFrase(Cadena cd) {
        for (int i = cd.getLongitud() - 1; i >= 0; i--) {
            System.out.print(cd.getFrase().substring(i, i + 1));
        }
        System.out.println("");
    }

    public void vecesRepetido(Cadena cd) {
        System.out.println("Ingrese un caracter a buscar en la frase");
        String aux = leer.next();
        int cuentaRepetidos = 0;
        for (int i = 0; i < cd.getLongitud(); i++) {
            if (cd.getFrase().substring(i, i + 1).equalsIgnoreCase(aux)) {
                cuentaRepetidos++;
            }
        }
        System.out.println("El caracter " + aux + " se repite " + cuentaRepetidos + " veces");

    }

    public void compararLongitud(Cadena cd) {        
        System.out.println("Ingrese una frase");
        String aux = leer.next();
        int compara = Integer.compare(cd.getLongitud(), aux.length());

        if (compara == 0) {
            System.out.println("Las longitudes de ambas frases son iguales");
        } else if (compara > 0) {
            System.out.println("Las longitud de la frase ingresada es menor");
        } else {
            System.out.println("La longitud de la frase ingresada es mayor");
        }

    }
    
    public void unirFrases (Cadena cd){
        System.out.println("Ingrese una frase");
        String aux = leer.next();
        System.out.println(cd.getFrase().concat(" "+aux));
    }

    public void reemplazar (Cadena cd){
        System.out.println("Ingrese un caracter");
        String aux = leer.next();
        System.out.println(cd.getFrase().replaceAll("a", aux));
    }
    
    public boolean contiene (Cadena cd){
        System.out.println("Ingrese un caracter");
        String aux = leer.next();
        return cd.getFrase().contains(String.valueOf(aux));
        
    }
}
