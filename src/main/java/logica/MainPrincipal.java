
package logica;
import interfazGrafica.JFrame;

public class MainPrincipal {
    public static void main(String[] args) {
        //INSTANCIAMOS ALGUNOS PRODUCTOS
        Producto lapiceraAzul = new Producto("lapicera azul BIC",2500,400,"");
        Producto plasticola = new Producto("Plasticola Boligoma",3500,100,"Plasticola Escolar");
        Producto cartulinaAzul = new Producto("Cartulina Color Azul",4000,100,"");
        Producto corrector = new Producto("Corrector Faber castle",3000,250,"");
        Producto cajaBorradores = new Producto("Caja de 24 borradores",5000,100,"Ofrece un pack de 6 borradores");
        Producto resaltadorAzul = new Producto("Resaltador color Azul",2500,300,"");
        ListaEnlazada listaProductos = new ListaEnlazada();
        listaProductos.insertar_comienzo(lapiceraAzul);
        listaProductos.insertar_comienzo(plasticola);
        listaProductos.insertar_comienzo(cartulinaAzul);
        listaProductos.insertar_comienzo(corrector);
        listaProductos.insertar_comienzo(cajaBorradores);
        listaProductos.insertar_comienzo(resaltadorAzul);
        //CREAMOS LA VENTANA
        JFrame pantalla = new JFrame(listaProductos);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        
    }
}
