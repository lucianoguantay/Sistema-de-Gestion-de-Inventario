package logica;

public class Nodo {
	private Producto elemento;
	private Nodo siguiente;
	
	public Nodo (Producto elemento) {
		this.elemento=elemento;
		siguiente=null;		
	}
	public void setDato(Producto elemento) {
		this.elemento=elemento;
	}
	public Producto getDato() {
		return elemento;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente=siguiente;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
}