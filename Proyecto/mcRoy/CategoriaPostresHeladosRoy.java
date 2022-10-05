package mcRoy;

public enum CategoriaPostresHeladosRoy {
	
	MINIMCFLUROY("Mini McFluRoy", 1.80),
	MCFLUROY("McFluRoy", 3.20),
	PINNEAPPLEPIE("Bolsa de piña", 1.10),
	SATURDAE("Copa Helado", 2.80),
	CONOHELADO("Cono Helado", 1.50),
	DANONINOFRESA("Aquarius Zero Mediano", 2.10);

	private final String nombre;
	private final double precio;
	
	private CategoriaPostresHeladosRoy(String nombre, double precio) {
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
