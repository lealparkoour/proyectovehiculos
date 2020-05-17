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
public class Coche extends AbstractVehiculo implements Serializable {
    private  boolean  extras;

    public Coche(boolean extras, String matricula, int km, boolean Estado, double ValorAlquiler) {
        super(matricula, km, Estado, ValorAlquiler);
        this.extras = extras;
    }

    

    
    

    
    public boolean isExtras() {
        return extras;
    }

    public void setExtras(boolean extras) {
        this.extras = extras;
    }

    @Override
    public void alquilar() {
        
        
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String devolver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void devolver(int kmfinal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularalquiler(int km) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] obtenerArregloObjeto() {
          Object [] datos = {isExtras(),getMatricula(),isEstado(),  getKm (), getValorAlquiler()};
        return datos;
    }
}
    
