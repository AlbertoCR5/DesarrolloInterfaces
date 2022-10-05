package mcRoy;

public enum CategoriaGrandMcRoyExtreme {
	
	GRANDMCROYEXTREMECHEESY("Grand McRoy Extreme Cheesy", 5.60),
	GRANDMCROYEXTREMEBACON("Grand McRoy Extreme Bacon", 5.60);

	private final String nombre;
	private final double precio;
	
	private CategoriaGrandMcRoyExtreme(String nombre, double precio) {
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
