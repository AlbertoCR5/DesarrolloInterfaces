package mcRoy;

public class Producto {

	public static final String CATEGORIAS[] = {"McRoyMenus", "McRoySandwiches", "Monroy Style",
			"Asignature Collection", "Grand McRoy Extreme", "McRoy Ensaladas", "Happy MealRoy",
			"Postres y Helados", "Bebidas", "Complementos", "Salsas"};
	public static final String PRINCIPAL_HAPPYMEALROY[] = {"McBurguerRoy", "McChickenBurguerROY", "4 McNuggetsRoy", "9 McBitesRoy"};
	public static final String COMPLEMENTO_HAPPYMEALROY[] = {"Patatas peques", "Happy CheROYtos", CategoriaMcRoyEnsaladas.MCROYRECREO.getNombre()};
	public static final String POSTRE_HAPPYMEALROY[] = {"Manzana", "Pinna", "McFreezyRoy sabor mango y lichi", "Danonino"};
	public static final String BEBIDA_HAPPYMEALROY[] = {"Agua", "TropicanAranja", "TropicanAnzana"};
	static int idProducto = 1;
	String nombre, descripcion;
	double precio;
	
	public Producto(String nombre, double precio) {
		
		this.nombre = nombre;
		this.precio = precio;
		idProducto++;
	}

	public Producto(String nombre, String descripcion, double precio) {

		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		idProducto++;
	}
	
}
