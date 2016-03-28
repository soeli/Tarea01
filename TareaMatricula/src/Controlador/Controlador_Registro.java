/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.MetodosCursos;
import Vista.FRM_MantenimientoCusos;
import Vista.GUI_InformacionRegistroCursos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author SOFIA ELIZONDO
 */
public class Controlador_Registro implements ActionListener {
    
    
    
    GUI_InformacionRegistroCursos registroCursos;
    MetodosCursos metodosCursos;
    
    

    public Controlador_Registro(GUI_InformacionRegistroCursos registroCursos ) {
        
        this.registroCursos=registroCursos;
        metodosCursos=new MetodosCursos();  
    }
    
   
    public void actionPerformed(ActionEvent e) {
        
        
      if(e.getActionCommand().equals("RegistroCursos"))
        {
            //metodosCursos.agregarCursos(mantenimientoCursos.devolverInformacion());
            System.out.println("RegistroCursos");
           
           metodosCursos.agregarCursos(registroCursos.devolverInformacionCursos());
           metodosCursos.mostrarInfo(registroCursos.devolverInformacionCursos());
           registroCursos.blanquear();
        }
   
}
}