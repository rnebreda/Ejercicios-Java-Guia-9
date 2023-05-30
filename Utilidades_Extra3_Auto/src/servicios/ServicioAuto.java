/*
Ejercicio 7
Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo.

 */
package servicios;

import entidades.Auto;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioAuto {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Auto CrearAuto(){
        Auto car = new Auto();
        System.out.println("Ingrese el nombre del titular");
        car.setPropietario(leer.next());
        System.out.println("Ingrese la fecha de vencimiento del carnet (dd/mm/yyyy)");
        String fecha= leer.next();
        int dia = Integer.parseInt(fecha.substring(0,2));
        int mes = Integer.parseInt(fecha.substring(3,5));
        int anio = Integer.parseInt(fecha.substring(6,10));
        car.setFechaVencimiento(new Date(anio-1900, mes-1, dia));
        System.out.println("Ingrese el color");
        car.setColor(leer.next());
        System.out.println("Ingrese el modelo");
        car.setModelo(leer.next());
        car.setKmMotor(7500);
        car.setUltimoService(0);
        return car;
    }
    
    public void cambioTitular(Auto car){
        System.out.println("Ingrese el nombre del nuevo propietario");
        car.setPropietario(leer.next());
    }
    
    public void agregarKms(Auto car){
        System.out.println("Ingrese los kilómetros recorridos");
        car.setKmMotor(car.getKmMotor()+leer.nextInt());
        System.out.println("Los kilómetros del motor son: "+car.getKmMotor());
    }
    
    public void servicioMotor (Auto car){
        if (car.getKmMotor()-car.getUltimoService()>10000) {
            System.out.println("Es necesario realizar el service del motor / Servicio realizado");
            car.setUltimoService(car.getKmMotor());
        }else{
            System.out.println("Faltan para el próximo sevice "+(10000-car.getKmMotor()+car.getUltimoService())+" Kms.");
        }
    }
    public void mostrarDatos (Auto car){
        System.out.println(car.toString());
    }
    
}
