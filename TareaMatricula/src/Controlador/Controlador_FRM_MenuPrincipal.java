/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Vista.FRM_MantenimientoCusos;
import Vista.FRM_MantenimientoEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.GUI_InformacionRegistroCursos;

/**
 *
 * @author SOFIA ELIZONDO
 */
public class Controlador_FRM_MenuPrincipal implements ActionListener {
 
   FRM_MantenimientoEstudiantes mantenimientoEstudiantes;
   FRM_MantenimientoCusos mantenimientoCursos;
   GUI_InformacionRegistroCursos registroCursos;
   
   public Controlador_FRM_MenuPrincipal()
        {
             mantenimientoEstudiantes=new FRM_MantenimientoEstudiantes();
             mantenimientoCursos=new FRM_MantenimientoCusos();
             registroCursos=new GUI_InformacionRegistroCursos();
        }

  
    public void actionPerformed(ActionEvent e) { 
    
        if(e.getActionCommand().equals("Salir"))
        {
            System.exit(0);
        }
        
        if(e.getActionCommand().equals("Estudiantes"))
        {
            this.mantenimientoEstudiantes.setVisible(true);
        }
        
        if(e.getActionCommand().equals("Cursos"))
        {
            System.out.println("Cursos");
           this.mantenimientoCursos.setVisible(true);

    }
    }
}
    
    
    

