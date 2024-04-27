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
public class Empleado_TCompleto extends Empleado{

    public Empleado_TCompleto() {
          super();
    }

    public Empleado_TCompleto(String nombre, double sueldobase) {
        super(nombre, sueldobase);
    }

    @Override
    public double calcularSalarioAnual() {
      return  getSueldobase()*12;
       
        
    }
     private double calcularBono(){
         return calcularSalarioAnual() * .10;
    }
}
