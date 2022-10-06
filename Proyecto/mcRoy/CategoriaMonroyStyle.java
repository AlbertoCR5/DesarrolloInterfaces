package mcRoy;

public enum CategoriaMonroyStyle {
	
	MONROYSTYLEBUFFALO(48, Categoria.CATEGORIAS[2], "Monroy Style Chicken Buffalo", 5.85, ""),
	MONROYSTYLECHICKEN(49, Categoria.CATEGORIAS[2], "Monroy Style Chicken Honey Mustard", 5.85, "");

	private final int idProducto;
	private final String nombreCategoria;
	private final String nombre;
	private final double precio;
	private final String descripcion;
	
	private CategoriaMonroyStyle(int idProducto, String nombreCategoria, String nombre, double precio, String descripcion) {
		
		this.idProducto = idProducto;
		this.nombreCategoria = nombreCategoria;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public String getDescripcion() {
		return descripcion;
	}
}
