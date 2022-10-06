package mcRoy;

public enum CategoriaMcRoyMenus {
	
	MCROYBIGMAC(29, Categoria.CATEGORIAS[0], "McRoy BigMac", 7.25, ""),
	MCROYGRANDEXTREME(30, Categoria.CATEGORIAS[0], "McRoy Grand Extreme", 9.40, ""),
	MCROYMONROYSTYLE(31, Categoria.CATEGORIAS[0], "McRoy Monroy Style Chicken Buffalo", 10.50, ""),
	MCPOLLOROY(32, Categoria.CATEGORIAS[0], "McRoy Pollo", 7.25, ""),
	MCROYMITADCUARTO(33, Categoria.CATEGORIAS[0], "McRoy Mitad de un Cuarto", 7.45, ""),
	MCROYALDELUXE(34, Categoria.CATEGORIAS[0], "McRoy Royal Deluxe", 7.45, ""),
	MCROYWRAP(35, Categoria.CATEGORIAS[0], "McRoy Wrap Chicken & Bacon", 8.00, ""),
	MCROYNUGGETS(36, Categoria.CATEGORIAS[0], "McRoy Nuggets 9uds.", 7.40, ""),
	MCROY4YOUSIMPLE(37, Categoria.CATEGORIAS[0], "Menu Simple Mediano", 3.30, ""),
	MCROY4YOUDOBLE(38, Categoria.CATEGORIAS[0], "Menu Doble Mediano", 4.40, ""),
	MCROY4YOUTRIPLE(39, Categoria.CATEGORIAS[0], "Menu Triple Mediano", 5.50, "");
	
	private final int idProducto;
	private final String nombreCategoria;
	private final String nombre;
	private final double precio;
	private final String descripcion;
	
	private CategoriaMcRoyMenus(int idProducto, String nombreCategoria, String nombre, double precio, String descripcion) {
		
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
