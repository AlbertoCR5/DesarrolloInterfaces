package mcRoy;

public enum CategoriaAsignatureCollection {
	
	ASIGNATUREFJUNIT(1, Categoria.CATEGORIAS[3], "Asignature F JUnit", 6.85, ""),
	ASIGNATUREFSTRINGS(2, Categoria.CATEGORIAS[3], "Asignaure F Strings", 6.55, ""),
	ASIGNATUREFDOBLEHLC(3, Categoria.CATEGORIAS[3], "Asignature F doble de HLC", 6.95, ""),
	ASIGNATUREFBASHSCRIPT(4, Categoria.CATEGORIAS[3],"Asignature F Bash Script", 6.15, "");

	private final int idProducto;
	private final String nombreCategoria;
	private final String nombre;
	private final double precio;
	private final String descripcion;

	private CategoriaAsignatureCollection(int idProducto, String nombreCategoria, String nombre, double precio, String descripcion) {

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
