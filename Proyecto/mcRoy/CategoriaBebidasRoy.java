package mcRoy;

public enum CategoriaBebidasRoy {
	
	CERVEZA(5, Categoria.CATEGORIAS[8], "Cerveza Sin ALcohol", 2.35, ""),
	COLA(6, Categoria.CATEGORIAS[8],"Cola Mediano", 2.10, ""),
	COLAZERO(7, Categoria.CATEGORIAS[8],"Cola Zero Mediano", 2.10, ""),
	COLAZEROZERO(8, Categoria.CATEGORIAS[8],"Cola Zero Zero Mediano", 2.10, ""),
	COLALIGHT(9, Categoria.CATEGORIAS[8],"Cola Light Mediano", 2.10, ""),
	AQUARIUSZERO(10, Categoria.CATEGORIAS[8],"Aquarius Zero Mediano", 2.10, ""),
	FANTANARANJAZERO(11, Categoria.CATEGORIAS[8],"Fanta Naranja Mediano", 2.10, ""),
	LIPTONICEZERO(12, Categoria.CATEGORIAS[8],"Lipton Ice Tea Mediano", 2.10, ""),
	ZUMONARANJA(13, Categoria.CATEGORIAS[8],"Zumo Naranja", 1.10, ""),
	ZUMOTROPICANZANA(14, Categoria.CATEGORIAS[8],"Zumo Manzana", 2.00, ""),
	AGUA(15, Categoria.CATEGORIAS[8],"Agua 50cl.", 1.80, "");

	private final int idProducto;
	private final String nombreCategoria;
	private final String nombre;
	private final double precio;
	private final String descripcion;
	
	private CategoriaBebidasRoy(int idProducto, String nombreCategoria, String nombre, double precio, String descripcion) {
		
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
