package mcRoy;

public class Producto extends Categoria implements IProducto{

	//Constantes con varios Productos
	public static final String PRINCIPAL_HAPPYMEALROY[] = {"McBurguerRoy", "McChickenBurguerROY", "4 McNuggetsRoy", "9 McBitesRoy"};
	public static final String COMPLEMENTO_HAPPYMEALROY[] = {"Patatas peques", "Happy CheROYtos", CategoriaMcRoyEnsaladas.MCROYRECREO.getNombre()};
	public static final String POSTRE_HAPPYMEALROY[] = {"Manzana", "Pinna", "McFreezyRoy sabor mango y lichi", "Danonino"};
	public static final String BEBIDA_HAPPYMEALROY[] = {"Agua", "TropicanAranja", "TropicanAnzana"};
	
	private static int idProducto = 64; //Ya hay 63 productos creados
	String nombre, descripcion;
	double precio;
	
	//Constructores
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

	public static int getIdProducto() {
		return idProducto;
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
		
		//Si el precio del producto es menor o igual a cero, se lanzara una excepcion
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

	/**
	 * Se motrara un listado con todos los productos organizados por sus categorias
	 */
	@Override
	public String toString() {
		
		StringBuilder sbProductos = new StringBuilder();
		int i = 0;
		
		sbProductos.append("LISTADO DE PRODUCTOS:" + "\n");
		
		sbProductos.append(Producto.CATEGORIAS[i] + ":" + "\n");
		for (CategoriaMcRoyMenus producto : CategoriaMcRoyMenus.values()) {
			sbProductos.append(producto.getIdProducto() + producto.getNombre() + " " + producto.getPrecio() + "€" + producto.getDescripcion() + "\n");	
		}
		i++;

		sbProductos.append("\n" + Producto.CATEGORIAS[i] + ":" + "\n");
		for (CategoriaMcRoySandwiches producto : CategoriaMcRoySandwiches.values()) {
			sbProductos.append(producto.getIdProducto() + producto.getNombre() + " " + producto.getPrecio() + "€" + producto.getDescripcion() + "\n");			
		}
		i++;
		
		sbProductos.append(Producto.CATEGORIAS[i] + ":" + "\n");
		for (CategoriaMonroyStyle producto : CategoriaMonroyStyle.values()) {
			sbProductos.append(producto.getIdProducto() + producto.getNombre() + " " + producto.getPrecio() + "€" + producto.getDescripcion() + "\n");			
		}
		i++;

		sbProductos.append(Producto.CATEGORIAS[i] + ":" + "\n");
		for (CategoriaAsignatureCollection producto : CategoriaAsignatureCollection.values()) {
			sbProductos.append(producto.getIdProducto() + producto.getNombre() + " " + producto.getPrecio() + "€" + producto.getDescripcion() + "\n");			
		}
		i++;

		sbProductos.append(Producto.CATEGORIAS[i] + ":" + "\n");
		for (CategoriaGrandMcRoyExtreme producto : CategoriaGrandMcRoyExtreme.values()) {
			sbProductos.append(producto.getIdProducto() + producto.getNombre() + " " + producto.getPrecio() + "€" + producto.getDescripcion() + "\n");			
		}
		i++;

		sbProductos.append(Producto.CATEGORIAS[i] + ":" + "\n");
		for (CategoriaMcRoyEnsaladas producto : CategoriaMcRoyEnsaladas.values()) {
			sbProductos.append(producto.getIdProducto() + producto.getNombre() + " " + producto.getPrecio() + "€" + producto.getDescripcion() + "\n");			
		}
		i++;

		sbProductos.append(Producto.CATEGORIAS[i] + ":" + "\n");
		for (CategoriaHappyMealRoy producto : CategoriaHappyMealRoy.values()) {

			if (producto.equals(CategoriaHappyMealRoy.PRINCIPAL)) {
				for (int j = 0; j < Producto.PRINCIPAL_HAPPYMEALROY.length; j++) {
					sbProductos.append(Producto.PRINCIPAL_HAPPYMEALROY[j] + "\n");
				}
			}
			
			if (producto.equals(CategoriaHappyMealRoy.COMPLEMENTO)) {
				for (int j = 0; j < Producto.COMPLEMENTO_HAPPYMEALROY.length; j++) {
					sbProductos.append(Producto.COMPLEMENTO_HAPPYMEALROY[j] + "\n");
				}
			}
			
			if (producto.equals(CategoriaHappyMealRoy.BEBIDA)) {
				for (int j = 0; j < Producto.BEBIDA_HAPPYMEALROY.length; j++) {
					sbProductos.append(Producto.BEBIDA_HAPPYMEALROY[j] + "\n");
				}
			}
			
			if (producto.equals(CategoriaHappyMealRoy.POSTRE)) {
				for (int j = 0; j < Producto.POSTRE_HAPPYMEALROY.length; j++) {
					sbProductos.append(Producto.POSTRE_HAPPYMEALROY[j] + "\n");
				}
			}
		}
		i++;
		
		sbProductos.append(Producto.CATEGORIAS[i] + ":" + "\n");
		for (CategoriaPostresHeladosRoy producto : CategoriaPostresHeladosRoy.values()) {
			sbProductos.append(producto.getIdProducto() + producto.getNombre() + " " + producto.getPrecio() + "€" + producto.getDescripcion() + "\n");	
		}
		i++;

		sbProductos.append(Producto.CATEGORIAS[i] + ":" + "\n");
		for (CategoriaBebidasRoy producto : CategoriaBebidasRoy.values()) {
			sbProductos.append(producto.getIdProducto() + producto.getNombre() + " " + producto.getPrecio() + "€" + producto.getDescripcion() + "\n");	
		}
		i++;

		sbProductos.append(Producto.CATEGORIAS[i] + ":" + "\n");
		for (CategoriaComplementosRoy producto : CategoriaComplementosRoy.values()) {
			sbProductos.append(producto.getIdProducto() + producto.getNombre() + " " + producto.getPrecio() + "€" + producto.getDescripcion() + "\n");	
		}
		i++;

		sbProductos.append(Producto.CATEGORIAS[i] + ":" + "\n");
		for (CategoriaSalsasRoy producto : CategoriaSalsasRoy.values()) {
			sbProductos.append(producto.getIdProducto() + producto.getNombre() + " " + producto.getPrecio() + "€" + producto.getDescripcion() + "\n");	
		}
		i++;
		
		return sbProductos.toString();
	}
			
}
