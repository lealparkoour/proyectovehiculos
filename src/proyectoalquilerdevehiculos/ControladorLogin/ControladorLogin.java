/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalquilerdevehiculos.ControladorLogin;

import java.util.List;
import proyectoalquilerdevehiculos.clases.LeerArchivoPlano;
import proyectoalquilerdevehiculos.clases.TipoUsuario;
import proyectoalquilerdevehiculos.clases.Usuario;


/**
 *
 * @author Estudiante
 */
public class ControladorLogin {
     private TipoUsuario[] tipoUsuarios;
   private List<Usuario> usuarios; 

    public ControladorLogin() {
        llenarTiposUsuario();
        llenarUsuarios();
        
    }
     private void llenarTiposUsuario()
             {
        tipoUsuarios = new TipoUsuario[2];
        tipoUsuarios[0] = new TipoUsuario ("1","administrador");
        tipoUsuarios[1] = new TipoUsuario ("2","usuario");             
    }
     
     
     private void llenarUsuarios()
    {
        usuarios=LeerArchivoPlano.cargarUsuarios(tipoUsuarios);
        
    }
    
    public Usuario encontrarUsuario(String login, String password)
    {
        for(Usuario usuarioEncontrado: usuarios)
        {
            if(usuarioEncontrado.getLogin().compareTo(login)==0 &&
                    usuarioEncontrado.getPassword().compareTo(password)==0)
            {
                return usuarioEncontrado;
            }
        }
        
        return null;
    }
    
}
