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
package entidades;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Auto {
    private String propietario;
    private Date fechaVencimiento;
    private String color;
    private String modelo;
    private int kmMotor;
    private int ultimoService;

    public Auto() {
    }

    public Auto(String propietario, Date fechaVencimiento, String color, String modelo, int kmMotor) {
        this.propietario = propietario;
        this.fechaVencimiento = fechaVencimiento;
        this.color = color;
        this.modelo = modelo;
        this.kmMotor = kmMotor;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKmMotor() {
        return kmMotor;
    }

    public void setKmMotor(int kmMotor) {
        this.kmMotor = kmMotor;
    }

    public int getUltimoService() {
        return ultimoService;
    }

    public void setUltimoService(int ultimoService) {
        this.ultimoService = ultimoService;
    }

    @Override
    public String toString() {
        return "Auto{" +"propietario=" + propietario + ", fechaVencimiento=" + fechaVencimiento.getDate()+"/"+(fechaVencimiento.getMonth()+1)+"/"+(fechaVencimiento.getYear()+1900) + ", color=" + color + ", modelo=" + modelo + ", kmMotor=" + kmMotor + ", ultimoService=" + ultimoService + '}';
    }
    
    
}
