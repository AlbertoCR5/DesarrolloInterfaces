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

	@Override
	public String toString() {
		return "Categoria [nombreCategoria=" + nombreCategoria + "]";
	}
	
	public String mostrarCategorias() {
		
		StringBuilder sbCategorias = new StringBuilder();
		
		for (int i = 0; i < CATEGORIAS.length; i++) {
			sbCategorias.append("(" + (i+1) + ")" + Producto.CATEGORIAS[i] + "\n");
		}
		
		return sbCategorias.toString();
	}
}
