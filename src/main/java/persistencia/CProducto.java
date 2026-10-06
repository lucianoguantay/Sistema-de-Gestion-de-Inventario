
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;


public class CProducto {

    public CProducto() {
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
}
