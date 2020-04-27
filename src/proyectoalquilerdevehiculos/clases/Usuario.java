/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalquilerdevehiculos.clases;

import java.io.Serializable;
import javax.print.DocFlavor;

/**
 *
 * @author Estudiante
 */
public class Usuario extends Tercero implements Serializable{
   
    private String login;
    private String password;
    private TipoUsuario Tipousuario;

    public Usuario(String login, String password, TipoUsuario Tipousuario, String nombre, String cedula) {
        super(nombre, cedula);
        this.login = login;
        this.password = password;
        this.Tipousuario = Tipousuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TipoUsuario getTipousuario() {
        return Tipousuario;
    }

    public void setTipousuario(TipoUsuario Tipousuario) {
        this.Tipousuario = Tipousuario;
    }
    
    
    
    
}
