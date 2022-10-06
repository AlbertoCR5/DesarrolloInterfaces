package mcRoy;

public enum CategoriaPostresHeladosRoy {
	
	MINIMCFLUROY(50, Categoria.CATEGORIAS[7], "Mini McFluRoy", 1.80, ""),
	MCFLUROY(51, Categoria.CATEGORIAS[7], "McFluRoy", 3.20, ""),
	PINNEAPPLEPIE(52, Categoria.CATEGORIAS[7], "Bolsa de pinna", 1.10, ""),
	SATURDAE(53, Categoria.CATEGORIAS[7], "Saturdae", 2.80, ""),
	CONOHELADO(54, Categoria.CATEGORIAS[7], "Cono Helado", 1.50, ""),
	DANONINOFRESA(55, Categoria.CATEGORIAS[7], "Danonino Fresa", 2.10, "");

	private final int idProducto;
	private final String nombreCategoria;
	private final String nombre;
	private final double precio;
	private final String descripcion;
	
	private CategoriaPostresHeladosRoy(int idProducto, String nombreCategoria, String nombre, double precio, String descripcion) {
		
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
