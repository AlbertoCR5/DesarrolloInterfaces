package mcRoy;

public enum CategoriaMonroyStyle {
	
	MONROYSTYLEBUFFALO("Monroy Style Chicken Buffalo", 5.85),
	MONROYSTYLECHICKEN("Monroy Style Chicken Honey Mustard", 5.85);

	private final String nombre;
	private final double precio;
	
	private CategoriaMonroyStyle(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}
	
}
