
package persistencia;

import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import javax.swing.JOptionPane;


public class ProductoDAO {

    public ProductoDAO() {
    }
    
    public void insertarProducto(String nombre, Double precio, int stock, String info, java.util.Date fechaRegistro){
        CConexion objetoConexion = new CConexion();
        String consultaProducto = "INSERT INTO Productos (Nombre,Precio,Stock,Informacion,FechaRegistro) VALUES (?,?,?,?,?)";
        
        try {
            Connection conexion = objetoConexion.establecerConexion();
            PreparedStatement ps = conexion.prepareStatement(consultaProducto);
            ps.setString(1, nombre);
            ps.setDouble(2, precio);
            ps.setInt(3, stock);
            ps.setString(4, info);
            // DEBO PASAR DATE DE JAVA A DATE DE SQL
            java.sql.Date fechaSQL = new java.sql.Date(fechaRegistro.getTime());
            ps.setDate(5, fechaSQL);
            ps.execute();
        
        javax.swing.JOptionPane.showMessageDialog(null, "Producto guardado exitosamente");
        
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error al guardar el producto: " + e.toString());
        }
    }
    
    
    public String mostrarNombreProductos(){
        CConexion objetoConexion = new CConexion();
        
        try{
            Connection conexion = objetoConexion.establecerConexion();
            String ConsultaBuscarNombreProd = "{CALL dbo.usp_MostrarNombreProducto}";
            CallableStatement cs = conexion.prepareCall(ConsultaBuscarNombreProd);
            String texto = "";
            //Obtenemos el resultado
            
            // Usamos ResultSet si el resultado de esa query es un SELECT --> UNA TABLA
            ResultSet resultado = cs.executeQuery();
            
            while(resultado.next()){
                texto += resultado.getString("Nombre")+"\n";
            }
            return texto;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos", "ERROR",HEIGHT);
        }
        return null;
    }
    
    public boolean verificarExistProducto(String nombre){
        CConexion objetoConexion = new CConexion();
        try{
            
            Connection conexion = objetoConexion.establecerConexion();
            String ConsultaExistProd = "{CALL dbo.usp_BuscarProductoxNombre (?,?)}";
            boolean parametroOutput = false;
            CallableStatement cs = conexion.prepareCall(ConsultaExistProd);
            cs.setString(1, nombre);
            // Esto es para todos los parametros del tipo OUTPUT
            cs.registerOutParameter(2, Types.BIT);
            cs.execute();
            boolean existe = cs.getBoolean(2);
            return existe;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al conectar con la base de datos","ERROR",HEIGHT);
        }
        return false;
    }
}
