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
public abstract class AbstractVehiculo implements VehiculoAble{

    @Override
    public abstract String mostrardatos();

    @Override
    public abstract double calcularalquiler(int km);

    @Override
    public abstract void devolver(int kmfinal);

    @Override
    public abstract void alquilar();

    private String matricula;

   
  private int km;
    private boolean estado;
    private double ValorAlquiler;

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
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getValorAlquiler() {
        return ValorAlquiler;
    }

    public void setValorAlquiler(double ValorAlquiler) {
        this.ValorAlquiler = ValorAlquiler;
    }
    
    
}
