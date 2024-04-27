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
public class Empleado_Hora extends Empleado{
private int horas_trabajadas;

    public Empleado_Hora() {
        super();
        this.horas_trabajadas = 0;
    }

    public Empleado_Hora(int horas_trabajadas, String nombre, double sueldobase) {
        super(nombre, sueldobase);
        this.horas_trabajadas = horas_trabajadas;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }
   

    @Override
    public double calcularSalarioAnual() {
        return  getSueldobase()*getHoras_trabajadas();
    }
    
    
}
