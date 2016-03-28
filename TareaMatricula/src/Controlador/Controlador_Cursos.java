/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.MetodosCursos;
import Vista.FRM_MantenimientoCusos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Vista.GUI_InformacionRegistroCursos;

/**
 *
 * @author SOFIA ELIZONDO
 */
public class Controlador_Cursos implements ActionListener{
    
    GUI_InformacionRegistroCursos registroCursos;
    MetodosCursos metodos;
    FRM_MantenimientoCusos mantenimientoCursos;
    
    
    public Controlador_Cursos(FRM_MantenimientoCusos mantenimientoCursos)
    {
        registroCursos=new GUI_InformacionRegistroCursos();
        this.mantenimientoCursos=mantenimientoCursos;
        metodos=new MetodosCursos();   
    }
    
   
    public void actionPerformed(ActionEvent e) {
        
        
      if(e.getActionCommand().equals("Consultar"))
        {
           metodos.prueba(mantenimientoCursos.devolverInformacion());
            System.out.println("Consultar");
        }
      
      if(e.getActionCommand().equals("Registro"))
        {
            System.out.println("Registro");
            this.registroCursos.setVisible(true);
    
        }
      
    if(e.getActionCommand().equals("Reportes"))
        {
            //metodos.reporteCursos(mantenimientoCursos.devolverInformacion());
            System.out.println("Reportes");
        }
        
        if(e.getActionCommand().equals("Modificar"))
        {
         // metodos.modificarCursos(mantenimientoCursos.devolverInformacion());
          System.out.println("Modificar");  
    }  
        if(e.getActionCommand().equals("Eliminar"))
        {
         
          metodos.eliminarCursos(mantenimientoCursos.devolverInformacion());
          System.out.println("Eliminar"); 
          System.out.println(mantenimientoCursos.devolverInformacion()); 
          
         } 
        
        if(e.getActionCommand().equals("Matricula"))
        {
         System.out.println("Matricula"); 
          //metodos.eliminarCursos(mantenimientoCursos.devolverInformacion()[0]);
         } 
        
        
        
    }
    
}
