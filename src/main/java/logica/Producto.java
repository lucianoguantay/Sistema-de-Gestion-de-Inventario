package logica;

public class Producto {
	private String nombre;
	private int precio;
	private int stock;
	private String fechaDeVencimiento;
	private String fechaDeElaboracion;
	
	public Producto (String nombre, int precio, int stock/*, String fechaDeVencimiento, String fechaDeElaboracion*/) {
		this.nombre=nombre;
		this.precio=precio;
		this.stock=stock;
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
		return String.format("El producto " + nombre + " fijado con un precio de $" + precio + " , un stock de " + stock + " y con fecha de elaboracion:" + fechaDeElaboracion);
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
