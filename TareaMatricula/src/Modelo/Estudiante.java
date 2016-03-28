/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author SOFIA ELIZONDO
 */
public class Estudiante {
    
    
    
    private String carnet, nombre;
    
    public Estudiante(String cedula, String nombre)
    {
      this.carnet=cedula;
      this.nombre=nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    public String getInformacion()
    {
     return "Informacion del estudiante:"+"\nNombre: "+getNombre()+"\nCarnet: "+getCarnet()+"\n";      
    }
    
    
    
}
