package modelo;

import com.mysql.jdbc.Connection;
import controlador.ConexionMySql;
import controlador.EnviaMensaje;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Modelo {

    public void EjecutaSQL() {
    }

    public int verificaLoggin(String correoUsuario, String contrasena) {
        //este metodo verifica si los datos del usuario son valido 
        //y si es correcto devuelve el tipo de usuario que es, ejemplo 1= admin, 2=area.....
        String correo = this.recortaCorreo(correoUsuario) + "@castillo.cr";
        int tipo_usuario = 0;
        int estado = 0;
        ResultSet resultado = null;
        try {
            Statement sentencia = null;
            sentencia = ConexionMySql.obtenerInstancia().conectar().createStatement();
            System.err.println(correo);
            resultado = sentencia.executeQuery("select tipo, estado from usuario where correo = '" + correo + "' and contrasena = '" + contrasena +"'");
            if (resultado != null) {
                System.err.println("no es nullloo");
            }
            while (resultado.next()) {
                System.err.println("entro al while");
                tipo_usuario = resultado.getInt(1);
                estado=resultado.getInt(2);
                
                System.err.println(estado);
                if(estado==1){
                    return tipo_usuario;
                }else{
                    System.out.println("El usuario está bloqueado");
                    return -1;
                }                
            }

        } catch (Exception e) {
            System.out.println("Error Exception from EjecutaSQL");
            e.printStackTrace();
        }
        return tipo_usuario;
    }//----------------------------------------------------------------------------- FIN verificaLoggin()   
    
    public boolean registraUsuarioAdmin(Usuario _usuario) {
        //este metodo permite al administrador ingresar un nuevo usuario a la base de datos
        try {
            Statement sentencia = null;
            sentencia = ConexionMySql.obtenerInstancia().conectar().createStatement();
            if (sentencia.executeUpdate("insert into usuario values(" +"'"+ _usuario.getCorreo()+"'" + ","
                    + "'"+_usuario.getTipoUsuario()+ "'" + "," +"'"+ _usuario.getContraseña()+"'" + ","+_usuario.getEstado()+")") == 1) {
                return true;
            }

        } catch (Exception e) {
            System.out.println("Error Exception from Modelo -> registraUsuarioAdmin()");
            //e.printStackTrace();
            return false;
        }
        return false;
    }//----------------------------------------------------------------------------- FIN registraUsuarioAdmin()
    
    public boolean eliminaUsuarioAdmin(String correoUsuario) {            
        //este metodo permite al administrador eliminar un usuario de la base de datos
        try {
            Statement sentencia = null;
            sentencia = ConexionMySql.obtenerInstancia().conectar().createStatement(); //FALTA VALIDAR NO ELIMINAR USUARIO ACTIVO
            if (sentencia.executeUpdate("delete from usuario where correo="+"'"+correoUsuario+"'") == 1) {
                return true;
            }

        } catch (Exception e) {
            System.out.println("Error Exception from Modelo -> eliminaUsuarioAdmin()");
            e.printStackTrace();
            return false;
        }
        return false;
    }//----------------------------------------------------------------------------- FIN eliminaUsuarioAdmin()
    
    public boolean bloqueaUsuarioAdmin(String correoUsuario) {
        //este metodo permite al administrador bloquear un usuario de la base de datos
        try {
            Statement sentencia = null;
            sentencia = ConexionMySql.obtenerInstancia().conectar().createStatement();
            if (sentencia.executeUpdate("update usuario set estado=0 where correo=" + "'"+ correoUsuario + "'") == 1) {
                return true;
            }

        } catch (Exception e) {
            System.out.println("Error Exception from Modelo -> bloqueaUsuarioAdmin()");
//            e.printStackTrace();
            return false;
        }
        return false;
    }//----------------------------------------------------------------------------- FIN bloqueaUsuarioAdmin()
    
    public boolean desBloqueaUsuarioAdmin(String correoUsuario) {
        //este metodo permite al administrador bloquear un usuario de la base de datos
        try {
            Statement sentencia = null;
            sentencia = ConexionMySql.obtenerInstancia().conectar().createStatement();
            if (sentencia.executeUpdate("update usuario set estado=1 where correo=" + "'"+ correoUsuario + "'") == 1) {
                return true;
            }

        } catch (Exception e) {
            System.out.println("Error Exception from Modelo -> desBloqueaUsuarioAdmin()");
//            e.printStackTrace();
            return false;
        }
        return false;
    }//----------------------------------------------------------------------------- FIN desBloqueaUsuarioAdmin()

    public String recortaCorreo(String correUsuario) {//obtiene los datos antes del @
        String correoFinal = "";
        for (int i = 0; i + 1 <= correUsuario.length() && !correUsuario.substring(i, i + 1).equals("@"); i++) {
            correoFinal = correoFinal + correUsuario.substring(i, i + 1);
        }
        return correoFinal;
    }//----------------------------------------------------------------------------- FIN recortaCorreo()
    
    
    public void enviaCorreo(String correoUsuario){
         String correo = correoUsuario+"@hotmail.com";//cambiar por @castillo.cr
         EnviaMensaje.obtenerInstancia().sendMessage("Has solicitado una nueva contraseña para le sistema SIGETI, la misma es XXXXXX y tendra 3 días de tiempo para cambiarla por otra.","Cambio de contraseña",correo);
    }//----------------------------------------------------------------------------- FIN enviaCorreo()
    
    public boolean validaContraseña(String contraseña){
        if(contraseña.length() >= 6 && contraseña.length() <=16)
            return true;
       return false;
    }//----------------------------------------------------------------------------- FIN validaContraseña()
}
