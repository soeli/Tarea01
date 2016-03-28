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
public class Cursos {
    
    
    private String nombre, siglas;
    private String creditos;

    public Cursos(String siglas, String nombre, String creditos) {
        this.nombre = nombre;
        this.siglas = siglas;
        this.creditos = creditos;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the siglas
     */
    public String getSiglas() {
        return siglas;
    }

    /**
     * @param siglas the siglas to set
     */
    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    /**
     * @return the creditos
     */
    public String getCreditos() {
        return creditos;
    }

    /**
     * @param creditos the creditos to set
     */
    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }
    
    public String getInformacion()
    {
        return "\nNombre: "+getNombre()+"\nSiglas: "+getSiglas()+"\nCréditos: "+getCreditos()+"\n"; 
    }
    
    
    
}
