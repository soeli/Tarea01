/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.MetodosEstudiantes;
import Vista.FRM_MantenimientoEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author SOFIA ELIZONDO
 */
public class Controlador_Estudiantes implements ActionListener{

  
    MetodosEstudiantes metodos;
    FRM_MantenimientoEstudiantes mantenimientoEstudiantes;
    
    
    public Controlador_Estudiantes(FRM_MantenimientoEstudiantes mantenimientoEstudiantes)
    {
     this.mantenimientoEstudiantes=mantenimientoEstudiantes;
     metodos=new MetodosEstudiantes();   
    }
    
    public void actionPerformed(ActionEvent e) {
      if(e.getActionCommand().equals("Consultar"))
        {
            metodos.consultarEstudiante(mantenimientoEstudiantes.devolverInformacion());
            System.out.println("Consultar");
            mantenimientoEstudiantes.blanquear();
        }
      
      if(e.getActionCommand().equals("Registro"))
        {
            System.out.println("Registro");
            metodos.agregarEstudiantes(mantenimientoEstudiantes.devolverInformacion());
            metodos.mostrarInfo(mantenimientoEstudiantes.devolverInformacion());
            mantenimientoEstudiantes.blanquear();
          
        }
      
    if(e.getActionCommand().equals("Reporte"))
        {
            metodos.reporteEstudiante(mantenimientoEstudiantes.devolverInformacion());
            System.out.println("Reporte");
            mantenimientoEstudiantes.blanquear();
        }
        
        if(e.getActionCommand().equals("Modificar"))
        {
          metodos.modificarEstudiante(mantenimientoEstudiantes.devolverInformacion());
          System.out.println("Modificar");  
          mantenimientoEstudiantes.blanquear();
    }  
        if(e.getActionCommand().equals("Eliminar"))
        {
         System.out.println("Eliminar"); 
          metodos.eliminarEstudiante(mantenimientoEstudiantes.devolverInformacion()[0]);
          mantenimientoEstudiantes.blanquear();
         }  
    }
    
}
