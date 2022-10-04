package mcRoy;

public enum McRoySandwiches {
	
	BIGMACROY("Big MacRoy", 4.85),
	MCROYDELUXE("McRoy Deluxe", 4.85),
	GRANDMCROYEXTREME("Grand McRoy Extreme", 6.00),
	MITADDEUNCUARTODEKILO("Mitad de un Cuarto de Kilo", 4.85),
	CBO("CBO", 5.60),
	AlcalarennoStyle("Alcalarenno Style", 5.85),
	MCPOLLOROY("McPollo Roy", 4.85),
	MCROYWRAP("McRoy Wrap", 5.05);

	private final String nombre;
	private final double precio;
	
	private McRoySandwiches(String nombre, double precio) {
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
