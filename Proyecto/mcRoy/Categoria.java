package mcRoy;

public class Categoria {

	public static final String CATEGORIAS[] = {"McRoyMenus", "McRoySandwiches", "Monroy Style",
			"Asignature Collection", "Grand McRoy Extreme", "McRoy Ensaladas", "Happy MealRoy",
			"Postres y Helados", "Bebidas", "Complementos", "Salsas"};
	
	String nombreCategoria;

	public Categoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombre(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}
	
}
