package mcRoy;

public enum CategoriaSalsasRoy {
	
	KETCHUP(56, Categoria.CATEGORIAS[10], "Salsa Ketchup", 0, ""),
	MOSTAZA(57, Categoria.CATEGORIAS[10], "Salsa Mostaza", 0, ""),
	BARBACOA(58, Categoria.CATEGORIAS[10], "alsa Barbacoa", 0.15, ""),
	DELUXE(59, Categoria.CATEGORIAS[10], "Salsa Deluxe", 0.20, ""),
	BUFFALO(60, Categoria.CATEGORIAS[10], "Salsa Buffalo", 0.20, ""),
	FINA(61, Categoria.CATEGORIAS[10], "Salsa Fina", 0.20, ""),
	MAHONESA(62, Categoria.CATEGORIAS[10], "Salsa Mahonesa", 0.15, "");

	private final int idProducto;
	private final String nombreCategoria;
	private final String nombre;
	private final double precio;
	private final String descripcion;
	
	private CategoriaSalsasRoy(int idProducto, String nombreCategoria, String nombre, double precio, String descripcion) {
		
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
