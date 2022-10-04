package mcRoy;

public class Producto {

	
	static int idProducto = 1;
	String nombre, descripcion;
	double precio;
	
	public Producto(String nombre, double precio) {
		
		this.nombre = nombre;
		this.precio = precio;
		idProducto++;
	}

	public Producto(String nombre, String descripcion, double precio) {

		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		idProducto++;
	}
	
	
	
	
}
