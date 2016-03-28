/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author SOFIA ELIZONDO
 */
public class MetodosEstudiantes {
    
    ArrayList <Estudiante> arrayEstudiantes;
    int numeroEstudiante=-1;
    
    public MetodosEstudiantes()
            {
             arrayEstudiantes=new ArrayList <Estudiante>();    
            }
    
    
    public boolean comprobarEstudiante(String carnet)
    {
        
       boolean condicion=false;
        for(int contador=0; contador<arrayEstudiantes.size();contador++)
        {
            if(carnet.equals(arrayEstudiantes.get(contador).getCarnet()))
            {
                condicion=true;
                contador=arrayEstudiantes.size();
            }
        }
        
        return condicion;
    }
    
    public void buscarNumeroEstudiante(String carnet)
    {
        
        for(int contador=0; contador<arrayEstudiantes.size();contador++)
        { numeroEstudiante=0;
            if(carnet.equals(arrayEstudiantes.get(contador).getCarnet()))
            {
                contador=arrayEstudiantes.size();
                numeroEstudiante=contador;
            }
        }
    }
    public void agregarEstudiantes (String informacion[])
    {
        if(comprobarEstudiante(informacion[0]))
        {
          JOptionPane.showMessageDialog(null, "Carnet "+informacion[0]+" se encontraba Registrado");
        }
        else
        {
            Estudiante temporal=new Estudiante(informacion[0],informacion[1]);
            arrayEstudiantes.add(temporal);
            JOptionPane.showMessageDialog(null, "Carnet "+informacion[0]+" Registrado");
        }
        
    }
    
    public void mostrarInfo(String informacion[])
    {
        for(int contador=0; contador<arrayEstudiantes.size();contador++)
        {
            if(informacion[0].equals(arrayEstudiantes.get(contador).getCarnet()))
            {
                System.out.println(arrayEstudiantes.get(contador).getInformacion());
                contador=arrayEstudiantes.size();
            }
        }
    }
    
    public void eliminarEstudiante(String informacion)
    {
        
        for(int contador=0; contador<arrayEstudiantes.size();contador++)
        {
            if(informacion.equals(arrayEstudiantes.get(contador).getCarnet()))
            {
                arrayEstudiantes.remove(contador);
                contador=arrayEstudiantes.size();
                JOptionPane.showMessageDialog(null, "Carnet "+informacion+" Eliminado");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Carnet "+informacion+" No existe");
            }
        }
        
        
    }
    
    public void consultarEstudiante(String informacion[])
    {
        for(int contador=0; contador<arrayEstudiantes.size();contador++)
        {
            if(informacion[0].equals(arrayEstudiantes.get(contador).getCarnet()))
            {
                JOptionPane.showMessageDialog(null, arrayEstudiantes.get(contador).getInformacion());
                contador=arrayEstudiantes.size();
            }
        }
        
        
    }
    
    public void modificarEstudiante(String informacion[])
    {
         for(int contador=0; contador<arrayEstudiantes.size();contador++)
        { 
            if(informacion[0].equals(arrayEstudiantes.get(contador).getCarnet()))
            {
                arrayEstudiantes.get(contador).setNombre(informacion[1]);
                contador=arrayEstudiantes.size();
                numeroEstudiante=contador;
                JOptionPane.showMessageDialog(null, "Carnet "+informacion[0]+" Existente \nCambio de nombre a "+informacion[1]);
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Carnet "+informacion[0]+" No existe");
                System.out.println("Modificar");
                System.out.println(contador);
            }
        }
    }
    
    public void reporteEstudiante(String informacion[])
    {
        String listaEstudiantes=" ";
        
     for(int contador=0; contador<arrayEstudiantes.size();contador++)
        {
            listaEstudiantes+=arrayEstudiantes.get(contador).getInformacion();
            
             
        }   
            JOptionPane.showMessageDialog(null, listaEstudiantes);
        
    }
    
}
