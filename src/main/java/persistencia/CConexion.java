
package persistencia;
import java.io.FileInputStream;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.util.Properties;

public class CConexion {
    Connection conectar = null;
    
    
    
    public Connection establecerConexion(){
        try{
            //Cargamos el archivo oculto
            Properties props = new Properties(); //Utilizamos la clase por defecto properties que permite leer archivos del tipo atributo = valor
            props.load(new FileInputStream("database.properties"));
            String ip = props.getProperty("db.ip");
            String puerto = props.getProperty("db.port");
            String bd = props.getProperty("db.name");
            String usuario = props.getProperty("db.user");
            String password = props.getProperty("db.password");
            //Escribimos la cadena
            String cadena = "jdbc:sqlserver://" + ip + ":" + puerto + ";databaseName=" + bd + ";encrypt=true;trustServerCertificate=true;";
            conectar = DriverManager.getConnection(cadena,usuario,password);
            System.out.println("Se conecto correctamente a la base de datos");
            //JOptionPane.showMessageDialog(null, "Se conecto correctamente a la base de datos", "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e ){
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos, error:" + e.toString(), "ERROR DE CONEXIÓN", JOptionPane.ERROR_MESSAGE); 
            System.out.println(e.toString());
        }
        return conectar;
    }
}
