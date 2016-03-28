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
public class MetodosCursos {
    
    ArrayList <Cursos> arrayCursos;
    
    
    public MetodosCursos()
            {
             arrayCursos=new ArrayList <Cursos>();    
            }
    
    public boolean comprobarCursos(String siglas)
    {
        
       boolean condicion=false;
        for(int contador=0; contador<arrayCursos.size();contador++)
        {
            if(siglas.equals(arrayCursos.get(contador).getSiglas()))
            {
                condicion=true;
                contador=arrayCursos.size();
            }
        }
        
        return condicion;
    }
    
    public void agregarCursos (String informacion[])
    {
        if(comprobarCursos(informacion[0]))
        {
          JOptionPane.showMessageDialog(null, "Curso "+informacion[0]+" se encontraba Registrado");
        }
        else
        {
            Cursos temporal=new Cursos(informacion[0],informacion[1],informacion[2]);
            arrayCursos.add(temporal);
            JOptionPane.showMessageDialog(null, "Curso "+informacion[0]+" Registrado");
        }
        
    }
    
    public void mostrarInfo(String informacion[])
    {
        for(int contador=0; contador<arrayCursos.size();contador++)
        {
            if(informacion[0].equals(arrayCursos.get(contador).getSiglas()))
            {
                System.out.println(arrayCursos.get(contador).getInformacion());
                contador=arrayCursos.size();
            }
        }
    }
    
    public void eliminarCursos(String informacion)
    {
        
        for(int contador=0; contador<arrayCursos.size();contador++)
        {
            if(informacion.equals(arrayCursos.get(contador).getSiglas()))
            {
                arrayCursos.remove(contador);
                contador=arrayCursos.size();
                JOptionPane.showMessageDialog(null, "Curso "+informacion+" Eliminado");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Curso "+informacion+" No existe");
            }
        }
        
        
    }
    
    public void consultarCursos(String informacion)
    {
        for(int contador=0; contador<arrayCursos.size();contador++)
        {
            if(informacion.equals(arrayCursos.get(contador).getSiglas()))
            {
                JOptionPane.showMessageDialog(null, arrayCursos.get(contador).getInformacion());
                contador=arrayCursos.size();
            }
        }
        
        
    }
    public void prueba(String casa)
    {
        JOptionPane.showMessageDialog(null, "Curso "+casa+" No existe");
    }
    
}
