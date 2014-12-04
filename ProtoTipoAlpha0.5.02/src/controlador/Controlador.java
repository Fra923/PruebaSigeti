
package controlador;

import modelo.Modelo;
import modelo.Usuario;

public class Controlador {
    
    private Controlador() {
        model= new Modelo();
    }//-----------------------------------------------------END_constructor de la clase()
    
    public boolean registraUsuarioAdmin(String correo, String contraseña, int tipo){
        
        String correoFinal = model.recortaCorreo(correo)+"@castillo.cr";
        return model.registraUsuarioAdmin(new Usuario(correoFinal, contraseña, tipo, 1));
        
    }
    
    public boolean eliminaUsuarioAdmin(String correo){
        String correoFinal = model.recortaCorreo(correo)+"@castillo.cr";
        System.out.println("correoFinal="+correoFinal);
        return model.eliminaUsuarioAdmin(correoFinal);
    }
    
    public int verificaLoggin(String correo, String contraseña){
               return model.verificaLoggin(correo, contraseña);
    }//-----------------------------------------------------END_verificaLoggin()
    
    public boolean bloqueaUsuarioAdmin(String correo){
        String correoFinal = model.recortaCorreo(correo)+"@castillo.cr";
        System.out.println(correoFinal);
        return model.bloqueaUsuarioAdmin(correoFinal);
    }//-----------------------------------------------------END_bloqueaUsuarioAdmin()
    
    public boolean desBloqueaUsuarioAdmin(String correo){
        String correoFinal = model.recortaCorreo(correo)+"@castillo.cr";
        System.out.println(correoFinal);
        return model.desBloqueaUsuarioAdmin(correoFinal);
    }//-----------------------------------------------------END_desBloqueaUsuarioAdmin()
    
    public void enviaCorreo(String correoUsuario){
        model.enviaCorreo(correoUsuario);
    }//-----------------------------------------------------END_enviaCorreo()
    
    public boolean validaContraseña(String contraseña){
        return model.validaContraseña(contraseña);
    }//-----------------------------------------------------END_validaContraseña()
    
    public static Controlador obtenerInstancia() {//asi garantizamos que solo aya una ventana
        if (instancia == null) {
            instancia = new Controlador();
        }
        return instancia;
    }//-----------------------------------------------------END_obtenerInstancia
        
    private static Controlador instancia = null;     
    private Modelo model;
    
}
