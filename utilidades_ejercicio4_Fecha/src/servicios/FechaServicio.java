/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class FechaServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Date fechaNacimiento(){
        System.out.println("Ingrese su fecha de nacimiento (dd, mm, aaaa)");
        int dia = leer.nextInt();
        int mes = leer.nextInt()-1;
        int anio = leer.nextInt()-1900;
        return new Date (anio, mes, dia);
    }
    
    public Date fechaActual(){
        return new Date ();
    }
    
    public int diferencia(Date d1, Date d2){      
        int difAnio = d2.getYear()-d1.getYear();
        int difMes = d2.getMonth()-d1.getMonth();
        int difDia = d2.getDay()-d1.getDay();
        if ((difMes<0)||((difMes==0)&&(difDia<0))) {
            return difAnio-1;
        }else{
            return difAnio;
        }
                
    }
    
}
