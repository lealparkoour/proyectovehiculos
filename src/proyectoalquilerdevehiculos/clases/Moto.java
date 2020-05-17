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
public class Moto extends AbstractVehiculo implements Serializable{
   private boolean casco;

    public Moto(boolean casco, String matricula, int km, boolean Estado, double ValorAlquiler) {
        super(matricula, km, Estado, ValorAlquiler);
        this.casco = casco;
    }

    public boolean isCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    @Override
    public Object[] obtenerArregloObjeto() {
        Object [] datos = {isCasco(),getMatricula(),  getKm (),isEstado(), getValorAlquiler()};
        return datos;
    }

    @Override
    public void alquilar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String devolver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public  void devolver(int kmfinal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularalquiler(int km) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
