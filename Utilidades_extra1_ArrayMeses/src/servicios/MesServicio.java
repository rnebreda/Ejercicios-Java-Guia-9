/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.ArrayMes;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MesServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayMes generarMesSecreto() {
        ArrayMes am = new ArrayMes();
        String[] as = am.getMeses();
        int indice = (int) (Math.random() * 12);
        am.setMesSecreto(as[indice]);
        return am;
    }

    public void adivinaMes(ArrayMes am) {
        boolean salir = false;
        int contar=0;
        do {
            System.out.println("Ingrese un mes (en minúsculas)");
            String opcion = leer.next();
            if (opcion.equals(am.getMesSecreto())) {
                System.out.println("Acertaste");
                salir = true;
            } else {
                System.out.println("Fallaste. Intentá nuevamente");
                contar++;
                if (contar>=3) {
                    System.out.println("Perdiste. El mes secreto es "+am.getMesSecreto());
                    salir= true;
                }
            }

        } while (!salir);

    }

}
