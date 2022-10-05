package mcRoy;

public class Producto extends Categoria{

	public static final String PRINCIPAL_HAPPYMEALROY[] = {"McBurguerRoy", "McChickenBurguerROY", "4 McNuggetsRoy", "9 McBitesRoy"};
	public static final String COMPLEMENTO_HAPPYMEALROY[] = {"Patatas peques", "Happy CheROYtos", CategoriaMcRoyEnsaladas.MCROYRECREO.getNombre()};
	public static final String POSTRE_HAPPYMEALROY[] = {"Manzana", "Pinna", "McFreezyRoy sabor mango y lichi", "Danonino"};
	public static final String BEBIDA_HAPPYMEALROY[] = {"Agua", "TropicanAranja", "TropicanAnzana"};		
	
	static int idProducto = 1;
	String nombre, descripcion;
	double precio;
	
	public Producto(int idProducto, String nombreCategoria, String nombre, double precio) throws McRoyException {
		super(nombreCategoria);
		
		this.nombre = nombre;
		setPrecio(precio);
		idProducto++;
	}

	public Producto(int idProducto, String nombreCategoria, String nombre, String descripcion, double precio) throws McRoyException {
		super(nombreCategoria);
		
		this.nombre = nombre;
		this.descripcion = descripcion;
		setPrecio(precio);
		idProducto++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) throws McRoyException {
		
		if (precio <= 0) {
			throw new McRoyException("Precio del producto no valido");
		}
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + "]";
	}
	
}
