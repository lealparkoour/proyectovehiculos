/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalquilerdevehiculos.clases;

/**
 *
 * @author Estudiante
 */
public interface VehiculoAble   {
    
    public void  alquilar();
    public void  devolver(int kmfinal);
    public double calcularalquiler(int km);
    
    public String  mostrardatos();
    
              
}
