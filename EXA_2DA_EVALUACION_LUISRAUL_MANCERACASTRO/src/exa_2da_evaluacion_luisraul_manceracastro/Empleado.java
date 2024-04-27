/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exa_2da_evaluacion_luisraul_manceracastro;

/**
 *
 * @author invitado
 */
public abstract class Empleado {
    private String nombre;
    private double sueldobase;

    public Empleado() { 
        this.nombre = "En blanco";
        this.sueldobase = 0;
    }

    public Empleado(String nombre, double sueldobase) {
        this.nombre = nombre;
        this.sueldobase = sueldobase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldobase() {
        return sueldobase;
    }

    public void setSueldobase(double sueldobase) {
        this.sueldobase = sueldobase;
    }

  public abstract double calcularSalarioAnual();
    
}
