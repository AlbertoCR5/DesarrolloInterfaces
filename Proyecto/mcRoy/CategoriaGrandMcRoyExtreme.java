package mcRoy;

public enum CategoriaGrandMcRoyExtreme {
	
	GRANDMCROYEXTREMECHEESY(24, Categoria.CATEGORIAS[10], "Grand McRoy Extreme Cheesy", 5.60, ""),
	GRANDMCROYEXTREMEBACON(25, Categoria.CATEGORIAS[10], "Grand McRoy Extreme Bacon", 5.60, "");

	private final int idProducto;
	private final String nombreCategoria;
	private final String nombre;
	private final double precio;
	private final String descripcion;
	
	private CategoriaGrandMcRoyExtreme(int idProducto, String nombreCategoria, String nombre, double precio,String descripcion) {
		
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
