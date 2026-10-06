
package logica;
import interfazGrafica.JFrame;
import java.util.Date;
import persistencia.CConexion;

public class MainPrincipal {
    public static void main(String[] args) {
        //Conectamos la base de datos
        /*
        CConexion objetoconexion = new CConexion();
        objetoconexion.establecerConexion();
        */
        //Obtengo la fecha actual:
        Date fechaActual = new Date();
        //INSTANCIAMOS ALGUNOS PRODUCTOS

        Producto lapiceraAzul = new Producto("lapicera azul BIC",2500.0,400,"",fechaActual);
        Producto plasticola = new Producto("Plasticola Boligoma",3500.0,100,"Plasticola Escolar",fechaActual);
        Producto cartulinaAzul = new Producto("Cartulina Color Azul",4000.0,100,"",fechaActual);
        Producto corrector = new Producto("Corrector Faber castle",3000.0,250,"",fechaActual);
        Producto cajaBorradores = new Producto("Caja de 24 borradores",5000.0,100,"Ofrece un pack de 6 borradores",fechaActual);
        Producto resaltadorAzul = new Producto("Resaltador color Azul",2500.0,300,"",fechaActual);
        ListaEnlazada listaProductos = new ListaEnlazada();
        listaProductos.insertar_comienzo(lapiceraAzul);
        listaProductos.insertar_comienzo(plasticola);
        listaProductos.insertar_comienzo(cartulinaAzul);
        listaProductos.insertar_comienzo(corrector);
        listaProductos.insertar_comienzo(cajaBorradores);
        listaProductos.insertar_comienzo(resaltadorAzul);
        
        
        //CREAMOS LA LISTA PARA LOS CAMBIOS
        ListaEnlazada listaModificaciones = new ListaEnlazada();
        //CREAMOS LA VENTANA
        JFrame pantalla = new JFrame(listaProductos,listaModificaciones);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        
    }
}
