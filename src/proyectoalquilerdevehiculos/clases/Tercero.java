/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalquilerdevehiculos.clases;

import java.io.Serializable;

/**
 *
 * @author Estudiante
 */
public class Tercero implements Serializable{
    private String nombre;
     private String cedula;

    public Tercero(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return this.nombre.toUpperCase() +" "+this.cedula.toUpperCase() ;
    }
    
    
}
