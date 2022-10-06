package mcRoy;

public class Categoria {

	public static final String CATEGORIAS[] = {"McRoy Menus", "McRoy Sandwiches", "Monroy Style",
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

	@Override
	public String toString() {
		
		StringBuilder sbCategorias = new StringBuilder();
		
		sbCategorias.append("CATEGORIAS" + "\n");
		for (int i = 0; i < CATEGORIAS.length; i++) {
			sbCategorias.append(CATEGORIAS[i] + "\n");
		}
		
		return sbCategorias.toString();
	}

}
