package mcRoy;

public enum CategoriaBebidasRoy {
	
	CERVEZA("Cerveza Sin ALcohol", 2.35),
	COLA("Cola Mediano", 2.10),
	COLAZERO("Cola Zero Mediano", 2.10),
	COLAZEROZERO("Cola Zero Zero Mediano", 2.10),
	COLALIGHT("Cola Light Mediano", 2.10),
	AQUARIUSZERO("Aquarius Zero Mediano", 2.10),
	FANTANARANJAZERO("Fanta Naranja Mediano", 2.10),
	LIPTONICEZERO("Lipton Ice Tea Mediano", 2.10),
	ZUMONARANJA("Zumo Naranja", 1.10),
	ZUMOTROPICANZANA("Zumo Manzana", 2.00),
	AGUA("Agua 50cl.", 1.80);

	private final String nombre;
	private final double precio;
	
	private CategoriaBebidasRoy(String nombre, double precio) {
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
