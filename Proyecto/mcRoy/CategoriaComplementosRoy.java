package mcRoy;

public enum CategoriaComplementosRoy {

	MCSHAKEROY(16, Categoria.CATEGORIAS[9], "McShakeRoy", 3.30, ""),
	GOUDASTICKSROY(17, Categoria.CATEGORIAS[9], "Gouda SticksRoy", 3.15, ""),
	TOPFIESBACONCHEESEROY(18, Categoria.CATEGORIAS[9], "Top Fries Chicken&BaconRoy", 3.85, ""),
	PATATASFRITASROY(63, Categoria.CATEGORIAS[9], "Patatas FritasRoy", 2.75, ""),
	MCNUGGETSROY(19, Categoria.CATEGORIAS[9], "4 McNuggetsRoy", 2.10, ""),
	ALITASPOLLOROY(20, Categoria.CATEGORIAS[9], "4 Alitas PolloRoy", 2.55, ""),
	AROSCEBOLLAROY(21, Categoria.CATEGORIAS[9], "6 Aros DeluxeRoy", 3.15, ""),
	GAZPACHO(22, Categoria.CATEGORIAS[9], "Gazpacho", 1.95, ""),	
	MCROYRECREO(23, Categoria.CATEGORIAS[9], CategoriaMcRoyEnsaladas.MCROYRECREO.getNombre(), CategoriaMcRoyEnsaladas.MCROYRECREO.getPrecio(), "" );

	private final int idProducto;
	private final String nombreCategoria;
	private final String nombre;
	private final double precio;
	private final String descripcion;
	
	private CategoriaComplementosRoy(int idProducto, String nombreCategoria, String nombre, double precio,String descripcion) {
		
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
