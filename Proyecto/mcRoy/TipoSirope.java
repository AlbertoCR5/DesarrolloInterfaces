package mcRoy;

public enum TipoSirope {
	
	CHOCOLATE("Chocolate"),
	CHOCOLATEBLANCO("Chocolate Blanco"),
	CARAMELO("Caramelo"),
	CREMACACAHUETE("Crema Cacahuete"),
	FRESA("Fresa");

	private final String tipoSirope;

	private TipoSirope(String tipoSirope) {
		this.tipoSirope = tipoSirope;
	}

	public String getTipoSirope() {
		return tipoSirope;
	}

}
