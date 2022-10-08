package mcRoy;

public enum CategoriaMcRoySandwiches {
	
	BIGMACROY(40, Categoria.CATEGORIAS[1], "Big MacRoy", 4.85, ""),
	MCROYDELUXE(41, Categoria.CATEGORIAS[1], "McRoy Deluxe", 4.85, ""),
	GRANDMCROYEXTREME(42, Categoria.CATEGORIAS[1], "Grand McRoy Extreme", 6.00, ""),
	MITADDEUNCUARTODEKILO(43, Categoria.CATEGORIAS[1], "Mitad de un Cuarto de Kilo", 4.85, ""),
	CBO(44, Categoria.CATEGORIAS[1], "CBO", 5.60, ""),
	AlcalarennoStyle(45, Categoria.CATEGORIAS[1], "Alcalarenno Style", 5.85, ""),
	MCPOLLOROY(46, Categoria.CATEGORIAS[1], "McPollo Roy", 4.85, ""),
	MCROYWRAP(47, Categoria.CATEGORIAS[1], "McRoy Wrap", 5.05, "");

	private final int idProducto;
	private final String nombreCategoria;
	private final String nombre;
	private final double precio;
	private final String descripcion;
	
	private CategoriaMcRoySandwiches(int idProducto, String nombreCategoria, String nombre, double precio, String descripcion) {
		
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
