/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exa_2da_evaluacion_luisraul_manceracastro;

/**
 *
 * @author LUIS RAUL MANCERA CASTRO
 */
public class EXA_2DA_EVALUACION_LUISRAUL_MANCERACASTRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado trabajadores[]=new Empleado[3];
        trabajadores[0]= new Empleado_Hora(1444,"Roberto Martinez Lopez", 50);
        trabajadores[1]= new Empleado_Contrato("Luis Raul Mancera Castro", 20000);
        trabajadores[2]= new Empleado_TCompleto("Vanessa Ramirez Espinoza ", 25000);
         Empleado_Hora emple1= (Empleado_Hora) trabajadores[0];
         Empleado_TCompleto emple2=(Empleado_TCompleto )trabajadores[1];
         Empleado_Contrato emple3=(Empleado_Contrato) trabajadores[2];
         
         
    }
   public static void imprimirDatos(Empleado trabajadores[]){
       System.out.println("Nombre:"+ getNombre);
       System.out.println("Sueldo Total: $"+ calcular);  
}
}