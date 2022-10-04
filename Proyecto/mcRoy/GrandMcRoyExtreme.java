package mcRoy;

public enum GrandMcRoyExtreme {
	
	GRANDMCROYEXTREMECHEESY("Grand McRoy Extreme Cheesy", 5.60),
	GRANDMCROYEXTREMEBACON("Grand McRoy Extreme Bacon", 5.60);

	private final String nombre;
	private final double precio;
	
	private GrandMcRoyExtreme(String nombre, double precio) {
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
