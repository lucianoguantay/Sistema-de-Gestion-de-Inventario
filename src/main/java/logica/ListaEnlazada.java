package logica;

public class ListaEnlazada {
	private Nodo cabeza;
	private int tamaño;
	
	public ListaEnlazada() {
		cabeza=null;
		tamaño=0;
	}
	public boolean listaVacia() {
		return(cabeza==null);							
	}
	public Nodo getCabeza() {
		return cabeza;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void insertar_comienzo(Producto elemento) {
		Nodo nodo_auxiliar = new Nodo(elemento);
		if (listaVacia()) {
			cabeza=nodo_auxiliar;
		}else {
			nodo_auxiliar.setSiguiente(cabeza);			
			cabeza=nodo_auxiliar;						
		}tamaño++;
	}
	public Object eliminar_posicion(int posicion) {
		if (listaVacia()) {
			System.out.println("ERROR...LISTA VACIA");
			return null;
		}else {
			Nodo buscador3 = cabeza;						
			if (posicion==0) {
				cabeza=buscador3.getSiguiente();			
			}else {
				Nodo direccion_anterior = null;
				for (int i=0;i<(posicion);i++) {
					direccion_anterior=buscador3;			
					buscador3 = buscador3.getSiguiente();		
				}
				Nodo direccion_posterior = buscador3.getSiguiente();		
				direccion_anterior.setSiguiente(direccion_posterior);		
				System.out.println("ELEMENTO ELIMINADO CON EXITO");
			}
			tamaño--;
			return buscador3.getDato();
		}
	}
	public Object eliminar_comienzo() {							//Es un eliminar al comienzo
		Nodo referencia=cabeza;
		if (!listaVacia()) {
			cabeza=referencia.getSiguiente();
			tamaño--;
			return referencia.getDato();
		}else {
			System.out.println("LA PILA ESTA VACIA");
			return null;
		}					//Devuelve el valor del dato del nodo que se elimino
	}
	public void eliminar() {
		cabeza=null;
		tamaño=0; 
	}
        public Producto busqueda(String nombreProducto){
            if (!listaVacia()){
                Nodo puntero = cabeza;
                while(puntero!=null){
                    if (puntero.getDato().getNombre().equals(nombreProducto)){
                        return (puntero.getDato());
                    }puntero = puntero.getSiguiente();
                }
                return (null);
            }else{
                System.out.println("Error lista vacia");
                return null;
            }
        }
        public void mostrar(){
            if(!listaVacia()){
                Nodo referencia = cabeza;
                System.out.println("cabeza-->");
                while (referencia!=null){
                    System.out.print("[" + referencia.getDato() + "] -->");
                    referencia=referencia.getSiguiente();
                }
            }else{
                System.out.println("Error lista vacia");
            }
        }
	
}
