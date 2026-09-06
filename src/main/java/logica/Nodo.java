package logica;

public class Nodo {
	private Object elemento;
	private Nodo siguiente;
	
	public Nodo (Object elemento) {
		this.elemento=elemento;
		siguiente=null;		
	}
	public void setDato(Object elemento) {
		this.elemento=elemento;
	}
	public Object getDato() {
		return elemento;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente=siguiente;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
}