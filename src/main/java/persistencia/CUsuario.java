
package persistencia;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class CUsuario {

    public CUsuario() {
    }
    
    public void insertarUsuario(String nombre, String password, String rol){
        CConexion objetoConexion = new CConexion();
        try{
            Connection conexion = objetoConexion.establecerConexion();
            
            // SIN PROECIMIENTOS ALMACENADOS //
            /*
            String consulta = "INSERT INTO Usuarios (Nombre, Password, Rol) VALUES (?, ?, ?);"; //Se utiliza ? para evitar la inyeccion de codigo SQL. Obliga a dividir en 2 fases: la compilacion que luego espera a que llegue un resultado
            PreparedStatement ps = conexion.prepareStatement(consulta);
            
            ps.setString(1, nombre);    //Insertamos lo que mande por parametro
            ps.setString(2, password);
            ps.setString(3, rol);
            
            ps.execute();  //Ejecutamos el comando de escritura de SQL Server
            JOptionPane.showMessageDialog(null, "Usuario guardado exitosamente");
            
            */
            //Con Procedimientos Almacenados 
            
            String consultaUser = "{CALL dbo.usp_InsertarUsuario(?, ?, ?)}";

            // Usamos CallableStatement en lugar de PreparedStatement
            CallableStatement cs = conexion.prepareCall(consultaUser);

            
            cs.setString(1, nombre);
            cs.setString(2, password);
            cs.setString(3, rol);

            cs.execute();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al guardar el usuario: " + e.toString());
        }
    }
    
    
}
