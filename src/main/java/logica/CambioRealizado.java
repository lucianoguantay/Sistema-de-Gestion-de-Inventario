
package logica;
import java.util.Date;
 
public class CambioRealizado {
    private Date fechaCambio;
    private Usuario responsable;
    private String informacionCambio;

    public CambioRealizado(Date fechaCambio, Usuario responsable, String informacionCambio){
        this.fechaCambio = fechaCambio;
        this.responsable = responsable;
        this.informacionCambio = informacionCambio;
    }

    public Date getFechaCambio() {
        return fechaCambio;
    }

    public void setFechaCambio(Date fechaCambio) {
        this.fechaCambio = fechaCambio;
    }

    public Usuario getResponsable() {
        return responsable;
    }

    public void setResponsable(Usuario responsable) {
        this.responsable = responsable;
    }

    public String getInformacionCambio() {
        return informacionCambio;
    }

    public void setInformacionCambio(String informacionCambio) {
        this.informacionCambio = informacionCambio;
    }
    
   @Override
    public String toString() { 
        return ("Fecha y hora de la Modificacion: " + fechaCambio + 
                ".\n Realizado por el usuario: " + responsable.getNombre() + 
                ".\n Informacion del Cambio: " + informacionCambio);
    }

}