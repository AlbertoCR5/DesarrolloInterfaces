package mcRoy;

public class Producto extends Categoria{

	public static final String PRINCIPAL_HAPPYMEALROY[] = {"McBurguerRoy", "McChickenBurguerROY", "4 McNuggetsRoy", "9 McBitesRoy"};
	public static final String COMPLEMENTO_HAPPYMEALROY[] = {"Patatas peques", "Happy CheROYtos", CategoriaMcRoyEnsaladas.MCROYRECREO.getNombre()};
	public static final String POSTRE_HAPPYMEALROY[] = {"Manzana", "Pinna", "McFreezyRoy sabor mango y lichi", "Danonino"};
	public static final String BEBIDA_HAPPYMEALROY[] = {"Agua", "TropicanAranja", "TropicanAnzana"};
	Producto producto001 = new Producto(1, CATEGORIAS[0], "McRoy BigMac", 7.25);
	
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
	

	public String mostrarProductos(int categoriaSeleccionada) throws McRoyException {
		
		StringBuilder sbProductos = new StringBuilder();
		String nombreProductos[];
		double precioProductos[];
		int i = 0;
		switch (categoriaSeleccionada - 1) {
		
		case 0:
			sbProductos.append(Producto.CATEGORIAS[categoriaSeleccionada - 1] + ":" + "\n");
			nombreProductos = new String [CategoriaMcRoyMenus.values().length];
			precioProductos = new double [CategoriaMcRoyMenus.values().length];
			for (CategoriaMcRoyMenus producto : CategoriaMcRoyMenus.values()) {
				sbProductos.append("(" + (i+1) + ")" + producto.getNombre() + " " + producto.getPrecio() + "€" + "\n");
				nombreProductos[i] = producto.getNombre();
				precioProductos[i] = producto.getPrecio();
				i++;
			}
			break;
			
		case 1:
			sbProductos.append(Producto.CATEGORIAS[categoriaSeleccionada - 1] + ":" + "\n");
			nombreProductos = new String [CategoriaMcRoySandwiches.values().length];
			precioProductos = new double [CategoriaMcRoySandwiches.values().length];
			for (CategoriaMcRoySandwiches producto : CategoriaMcRoySandwiches.values()) {
				sbProductos.append("(" + (i+1) + ")" + producto.getNombre() + " " + producto.getPrecio() + "€" + "\n");
				nombreProductos[i] = producto.getNombre();
				precioProductos[i] = producto.getPrecio();
				i++;
			}
			break;
			
		case 2:
			sbProductos.append(Producto.CATEGORIAS[categoriaSeleccionada - 1] + ":" + "\n");
			nombreProductos = new String [CategoriaMonroyStyle.values().length];
			precioProductos = new double [CategoriaMonroyStyle.values().length];
			for (CategoriaMonroyStyle producto : CategoriaMonroyStyle.values()) {
				sbProductos.append("(" + (i+1) + ")" + producto.getNombre() + " " + producto.getPrecio() + "€" + "\n");
				nombreProductos[i] = producto.getNombre();
				precioProductos[i] = producto.getPrecio();
				i++;
			}
			break;
		
		case 3:
			sbProductos.append(Producto.CATEGORIAS[categoriaSeleccionada - 1] + ":" + "\n");
			nombreProductos = new String [CategoriaAsignatureCollection.values().length];
			precioProductos = new double [CategoriaAsignatureCollection.values().length];
			for (CategoriaAsignatureCollection producto : CategoriaAsignatureCollection.values()) {
				sbProductos.append("(" + (i+1) + ")" + producto.getNombre() + " " + producto.getPrecio() + "€" + "\n");
				nombreProductos[i] = producto.getNombre();
				precioProductos[i] = producto.getPrecio();
				i++;
			}
			break;
			
		case 4:
			sbProductos.append(Producto.CATEGORIAS[categoriaSeleccionada - 1] + ":" + "\n");
			nombreProductos = new String [CategoriaGrandMcRoyExtreme.values().length];
			precioProductos = new double [CategoriaGrandMcRoyExtreme.values().length];
			for (CategoriaGrandMcRoyExtreme producto : CategoriaGrandMcRoyExtreme.values()) {
				sbProductos.append("(" + (i+1) + ")" + producto.getNombre() + " " + producto.getPrecio() + "€" + "\n");
				nombreProductos[i] = producto.getNombre();
				precioProductos[i] = producto.getPrecio();
				i++;
			}
			break;
			
		case 5:
			sbProductos.append(Producto.CATEGORIAS[categoriaSeleccionada - 1] + ":" + "\n");
			nombreProductos = new String [CategoriaMcRoyEnsaladas.values().length];
			precioProductos = new double [CategoriaMcRoyEnsaladas.values().length];
			for (CategoriaMcRoyEnsaladas producto : CategoriaMcRoyEnsaladas.values()) {
				sbProductos.append("(" + (i+1) + ")" + producto.getNombre() + " " + producto.getPrecio() + "€" + "\n");
				nombreProductos[i] = producto.getNombre();
				precioProductos[i] = producto.getPrecio();
				i++;
			}
			break;
			
		case 6:
			sbProductos.append(Producto.CATEGORIAS[categoriaSeleccionada - 1] + ":" + "\n");
			for (CategoriaHappyMealRoy producto : CategoriaHappyMealRoy.values()) {

				if (producto.equals(CategoriaHappyMealRoy.PRINCIPAL)) {
					sbProductos.append("Seleccione un Principal:" + "\n");
					for (int j = 0; j < Producto.PRINCIPAL_HAPPYMEALROY.length; j++) {
						sbProductos.append("(" + (i+1) + ")" + Producto.PRINCIPAL_HAPPYMEALROY[(i-1)] + "\n");
						i++;
					}
				}
				
				if (producto.equals(CategoriaHappyMealRoy.COMPLEMENTO)) {
					i = 0;
					sbProductos.append("Seleccione un Complemento:" + "\n");
					for (int j = 0; j < Producto.COMPLEMENTO_HAPPYMEALROY.length; j++) {
						sbProductos.append("(" + (i+1) + ")" + Producto.COMPLEMENTO_HAPPYMEALROY[(i-1)] + "\n");
						i++;
					}
				}
				
				if (producto.equals(CategoriaHappyMealRoy.BEBIDA)) {
					i = 0;
					sbProductos.append("Seleccione una Bebida:" + "\n");
					for (int j = 0; j < Producto.BEBIDA_HAPPYMEALROY.length; j++) {
						sbProductos.append("(" + (i+1) + ")" + Producto.BEBIDA_HAPPYMEALROY[(i-1)] + "\n");
						i++;
					}
				}
				
				if (producto.equals(CategoriaHappyMealRoy.POSTRE)) {
					i = 0;
					sbProductos.append("Seleccione un Postre:" + "\n");
					for (int j = 0; j < Producto.POSTRE_HAPPYMEALROY.length; j++) {
						sbProductos.append("(" + (i+1) + ")" + Producto.POSTRE_HAPPYMEALROY[(i-1)] + "\n");
						i++;
					}
				}
			}
			break;
			
		case 7:
			sbProductos.append(Producto.CATEGORIAS[categoriaSeleccionada - 1] + ":" + "\n");
			nombreProductos = new String [CategoriaPostresHeladosRoy.values().length];
			precioProductos = new double [CategoriaPostresHeladosRoy.values().length];
			for (CategoriaPostresHeladosRoy producto : CategoriaPostresHeladosRoy.values()) {
				sbProductos.append("(" + (i+1) + ")" + producto.getNombre() + " " + producto.getPrecio() + "€" + "\n");
				nombreProductos[i] = producto.getNombre();
				precioProductos[i] = producto.getPrecio();
				i++;
			}
			break;
			
		case 8:
			sbProductos.append(Producto.CATEGORIAS[categoriaSeleccionada - 1] + ":" + "\n");
			nombreProductos = new String [CategoriaBebidasRoy.values().length];
			precioProductos = new double [CategoriaBebidasRoy.values().length];
			for (CategoriaBebidasRoy producto : CategoriaBebidasRoy.values()) {
				sbProductos.append("(" + (i+1) + ")" + producto.getNombre() + " " + producto.getPrecio() + "€" + "\n");
				nombreProductos[i] = producto.getNombre();
				precioProductos[i] = producto.getPrecio();
				i++;
			}
			break;
			
		case 9:
			sbProductos.append(Producto.CATEGORIAS[categoriaSeleccionada - 1] + ":" + "\n");
			nombreProductos = new String [CategoriaMonroyStyle.values().length];
			precioProductos = new double [CategoriaMonroyStyle.values().length];
			for (CategoriaComplementosRoy producto : CategoriaComplementosRoy.values()) {
				sbProductos.append("(" + i + ")" + producto.getNombre() + " " + producto.getPrecio() + "€" + "\n");
				nombreProductos[(i-1)] = producto.getNombre();
				precioProductos[(i-1)] = producto.getPrecio();
				i++;
			}
			break;
			
		case 10:
			sbProductos.append(Producto.CATEGORIAS[categoriaSeleccionada - 1] + ":" + "\n");
			precioProductos = new double [CategoriaSalsasRoy.values().length];
			for (CategoriaSalsasRoy producto : CategoriaSalsasRoy.values()) {
				sbProductos.append("(" + (i+1) + ")" + producto + " " + producto.getPrecio() + "€" + "\n");
				precioProductos[i] = producto.getPrecio();
				i++;
			}
			break;

		default:
			throw new McRoyException("Categoria seleccionada incorrecta");
			
		}
		sbProductos.append("(0)Volver a Categorias");
		
		return sbProductos.toString();
		
	}
	
	
}
