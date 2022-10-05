package mcRoy;

public enum TipoSaboresHeladosRoy {
	
	SABORES("Chocolate", "Chocolate Blanco", "Caramelo", "Crema Cacahuete"),
	SIROPE("Cornetto", "M&M", "KitKat", "Oreo", "Suchard");

	private final String nombre;
	
	private TipoSaboresHeladosRoy(String nombre, String nombre2, String nombre3, String nombre4) {
		this.nombre = nombre;
	}

	TipoSaboresHeladosRoy(String nombre, String nombre2, String nombre3, String nombre4, String nombre5) {
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}
}
