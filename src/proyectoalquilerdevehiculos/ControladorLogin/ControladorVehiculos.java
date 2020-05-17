/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalquilerdevehiculos.ControladorLogin;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;
import proyectoalquilerdevehiculos.clases.AbstractVehiculo;
import proyectoalquilerdevehiculos.clases.Coche;
import proyectoalquilerdevehiculos.clases.Furgoneta;
import proyectoalquilerdevehiculos.clases.LeerArchivoPlano;
import proyectoalquilerdevehiculos.clases.Moto;

/**
 *
 * @author Estudiante
 */
public class ControladorVehiculos implements Serializable{
  
    private List<AbstractVehiculo> vehiculos;

    public List<AbstractVehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<AbstractVehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
            

    public ControladorVehiculos() {
        llenarvehiculos();
    }
    
    
    public void llenarvehiculos(){
        
        vehiculos= new ArrayList<>();
        
        LeerArchivoPlano.cargarCoches(vehiculos);
        
       
    }
     public List<AbstractVehiculo> obtenerVehiculos (String tipo)
     {
         List<AbstractVehiculo> listaTemp = new ArrayList<>();
                 
        for (AbstractVehiculo vehiculo : vehiculos) {
            switch(tipo){
            
                case "Coche":
                    if (vehiculo instanceof Coche){
                        listaTemp.add(vehiculo);
                    }
                    break;
                case "Furgoneta":
                    if(vehiculo instanceof Furgoneta){
                        listaTemp.add(vehiculo);
                    }
                    
                    break;
                    
                case "Moto":
                    if(vehiculo instanceof Moto){
                        listaTemp.add(vehiculo);
                    }
                    
                    
                    break;
                    
                    
                    
            }
        }
        return listaTemp;
             
          
          }
                 
    }
     
            
    

    

