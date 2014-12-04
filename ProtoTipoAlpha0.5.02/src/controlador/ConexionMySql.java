package controlador;
import com.mysql.jdbc.Connection;
import java.sql.Array.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionMySql {
    
    private static ConexionMySql instancia = null;
    private Connection conexion;
   
    public static ConexionMySql obtenerInstancia(){
        if(instancia == null){
            instancia = new ConexionMySql();
        }
        return instancia;
    }
    
    public Connection conectar(){
        boolean ok = false;
        try{
            System.out.println("Intendo conectar");
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/sigeti", "root", "root");
            if(conexion != null){
                System.out.println("Conexion exitosa");
                ok = true;
            }else{
                System.out.println("Conexion fallida");
                ok = false;
            }
//            Statement estado = conexion.createStatement();
//            estado.executeUpdate("insert into numero values(3)");
////            System.out.println("inserto");
        }
        catch (SQLException e) {
            System.err.println("Error de SQLException");
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            System.err.println("Error de ClassNotFoundException");
            e.printStackTrace();
        }
        catch (Exception e) {
            System.err.println("Error de Exception");
            e.printStackTrace();
        }
        return conexion;
    }
    
    public Connection getConexion() {
        return conexion;
    }
    
    
}
