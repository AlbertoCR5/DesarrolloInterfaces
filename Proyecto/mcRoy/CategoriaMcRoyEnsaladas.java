package mcRoy;

public enum CategoriaMcRoyEnsaladas {
	
	MCROYCOK(26, Categoria.CATEGORIAS[5], "Ensalada Cok con pollo crujiente", 5.85, ""),
	MCROYRECREO(27, Categoria.CATEGORIAS[5], "Ensalada del recreo", 3.15, ""),
	MCROYQUESOCABRA(28, Categoria.CATEGORIAS[5], "Ensalada queso de cabra", 5.85, "");

	private final int idProducto;
	private final String nombreCategoria;
	private final String nombre;
	private final double precio;
	private final String descripcion;
	
	private CategoriaMcRoyEnsaladas(int idProducto, String nombreCategoria, String nombre, double precio, String descripcion) {
		
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
