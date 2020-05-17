/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalquilerdevehiculos.clases;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 *
 * @author Estudiante
 */
public abstract class AbstractVehiculo implements VehiculoAble{
private String matricula;
private int km;
    private boolean Estado;
 private double ValorAlquiler;

    public AbstractVehiculo(String matricula, int km, boolean Estado, double ValorAlquiler) {
        this.matricula = matricula;
        this.km = km;
        this.Estado = Estado;
        this.ValorAlquiler = ValorAlquiler;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public double getValorAlquiler() {
        return ValorAlquiler;
    }

    public void setValorAlquiler(double ValorAlquiler) {
        this.ValorAlquiler = ValorAlquiler;
    }

    
 
 
 public abstract Object [] obtenerArregloObjeto();
 

   
   public abstract void alquilar();
   
    
   
   public abstract String devolver();
   
   
          
    

    
     
 
   
    

        
    
    }
   
    

   