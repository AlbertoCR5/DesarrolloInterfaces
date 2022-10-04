package mcRoy;

public enum McRoyEnsaladas {
	
	MCROYCOK("Ensalada Cok con pollo crujiente", 5.85),
	MCROYRECREO("Ensalada del recreo", 3.15),
	MCROYQUESOCABRA("Ensalada queso de cabra", 5.85);

	private final String nombre;
	private final double precio;
	
	private McRoyEnsaladas(String nombre, double precio) {
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
