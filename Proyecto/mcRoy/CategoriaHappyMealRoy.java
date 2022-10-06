package mcRoy;

public enum CategoriaHappyMealRoy {

	PRINCIPAL(0),
	COMPLEMENTO(0),
	BEBIDA(0),
	POSTRE(4);
	
	private int precio;

	private CategoriaHappyMealRoy(int precio) {
		this.precio = precio;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
