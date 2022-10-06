package mcRoy;

public enum TipoTopping {
	
	CORNETTO("Cornetto"),
	MYM("M&M"),
	KITKAT("KitKat"),
	OREO("Oreo"),
	SUCHARD("Suchard");

	private final String tipoTopping;

	private TipoTopping(String tipoTopping) {
		this.tipoTopping = tipoTopping;
	}

	public String getTipoTopping() {
		return tipoTopping;
	}
	
}
