package logica;

public class Producto {
	private String nombre;
	private int precio;
	private int stock;
        private String info;
	private String fechaDeVencimiento;
	private String fechaDeElaboracion;
	
	public Producto (String nombre, int precio, int stock, String info/*, String fechaDeVencimiento, String fechaDeElaboracion*/) {
		this.nombre=nombre;
		this.precio=precio;
		this.stock=stock;
                this.info=info;
		/*this.fechaDeVencimiento=fechaDeVencimiento;
		this.fechaDeElaboracion=fechaDeElaboracion;*/
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock){
		this.stock=stock;
	}
        public void setInfo(String info){
            this.info = info;
        }
        public String getInfo(){
            return info;
        }
	/*public String getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}
	public void setFechaDeVencimiento(String fechaDeVencimiento) {
		this.fechaDeVencimiento=fechaDeVencimiento;
	}
	public String getFechaDeElaboracion() {
		return fechaDeElaboracion;
	}
	public void setFechaDeElaboracion(String fechaDeElaboracion) {
		this.fechaDeElaboracion=fechaDeElaboracion;
	}*/
	public String toString() {
		return ("El producto " + nombre + " fijado con un precio de $" + precio + " , un stock de " + stock + ", con la siguiente informacion registrada: " + info);
	}
	public void restarStock() {
		stock-=1;
	}
	public void aumentarStock() {
		stock+=1;
	}
	public boolean verificar_Stock() {
		return (stock>0);
	}
}
