package mcRoy;

public enum CategoriaComplementosRoy {

	MCSHAKEROY("McShakeRoy", 3.30),
	GOUDASTICKSROY("Gouda SticksRoy", 3.15),
	TOPFIESBACONCHEESEROY("Top Fries Chicken&BaconRoy", 3.85),
	PATATASFRITASROY("Patatas FritasRoy", 2.75),
	MCNUGGETSROY("4 McNuggetsRoy", 2.10),
	ALITASPOLLOROY("4 Alitas PolloRoy", 2.55),
	AROSCEBOLLAROY("6 Aros DeluxeRoy", 3.15),
	GAZPACHO("Gazpacho", 1.95),	
	MCROYRECREO(CategoriaMcRoyEnsaladas.MCROYRECREO.getNombre(), CategoriaMcRoyEnsaladas.MCROYRECREO.getPrecio());

	private final String nombre;
	private final double precio;
	
	private CategoriaComplementosRoy(String nombre, double precio) {
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
