/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades_extra3_auto;

import entidades.Auto;
import java.util.Scanner;
import servicios.ServicioAuto;

/**
 *
 * @author Usuario
 */
public class Utilidades_Extra3_Auto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioAuto miServicio = new ServicioAuto();
        Auto[] misVehiculos = new Auto[3];
        
        for (int i = 0; i < misVehiculos.length; i++) {
            System.out.println("Datos del vehículo " + (i + 1));
            misVehiculos[i] = miServicio.CrearAuto();
        }
        String opcion, salida = " ";
        boolean correcto = false;
        int aux = 0, elegida = 0;
        do {
            do {
                for (int i = 0; i < misVehiculos.length; i++) {
                    System.out.println((i + 1) + " - " + misVehiculos[i].getModelo());
                }
                System.out.println("Ingrese una opción");
                opcion = leer.next();
                if (!opcion.equals("1") && !opcion.equals("2") && !opcion.equals("3")) {
                    System.out.println("La opcion no es correcta");
                } else {
                    correcto = true;
                }
                
            } while (!correcto);
            switch (opcion) {
                case "1":
                    aux = 0;
                    break;
                case "2":
                    aux = 1;
                    break;
                case "3":
                    aux = 2;
                    break;
            }
            do {
                System.out.println("1 - Cambio de titular");
                System.out.println("2 - Agregar kilometros recorridos");
                System.out.println("3 - Servicio");
                System.out.println("4 - Mostrar datos");
                System.out.println("5 - Salir");
                System.out.println("Ingrese una opción");
                elegida = leer.nextInt();
                switch (elegida) {
                    case 1:
                        miServicio.cambioTitular(misVehiculos[aux]);
                        break;
                    case 2:
                        miServicio.agregarKms(misVehiculos[aux]);
                        break;
                    case 3:
                        miServicio.servicioMotor(misVehiculos[aux]);
                        break;
                    case 4:
                        miServicio.mostrarDatos(misVehiculos[aux]);
                }
                
            } while (elegida != 5);
            System.out.println("Desea consultar otro vehículo? (S=Si)");
            salida = leer.next();
            
        } while (salida.equalsIgnoreCase("S"));
        
    }
    
}
