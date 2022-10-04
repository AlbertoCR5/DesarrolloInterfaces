package mcRoy;

public enum HappyMcRoy {

	PRINCIPAL("McBurguerRoy", "McChickenBurguerROY", "4 McNuggetsRoy", "9 McBitesRoy"),
	COMPLEMENTO("Patatas peques", "Happy CheROYtos", McRoyEnsaladas.MCROYRECREO.getNombre()),
	POSTRE("Manzana", "Pinna", "McFreezyRoy sabor mango y lichi", "Danonino"),
	BEBIDA("Agua", "TropicanAranja", "TropicanAnzana");
	
	private final String nombre;

	HappyMcRoy(String nombre, String nombre2, String nombre3) {
		this.nombre = nombre;
	}

	private HappyMcRoy(String nombre, String nombre2, String nombre3, String nombre4) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
}
