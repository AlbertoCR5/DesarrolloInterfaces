package mcRoy;

public enum CategoriaSalsasRoy {
	
	KETCHUP(0),
	MOSTAZA(0),
	BARBACOA(0.15),
	DELUXE(0.20),
	BUFFALO(0.20),
	FINA(0.20),
	MAHONESA(0.15);

	private final double precio;
	
	private CategoriaSalsasRoy(double precio) {

		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}
}
