package mcRoy;

public enum AsignatureCollection {
	
	ASIGNATUREFJUNIT("Asignature F JUnit", 6.85),
	ASIGNATUREFSTRINGS("Asignaure F Strings", 6.55),
	ASIGNATUREFDOBLEHLC("Asignature F doble de HLC", 6.95),
	ASIGNATUREFBASHSCRIPT("Asignature F Bash Script", 6.15);

	private final String nombre;
	private final double precio;
	
	private AsignatureCollection(String nombre, double precio) {
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
