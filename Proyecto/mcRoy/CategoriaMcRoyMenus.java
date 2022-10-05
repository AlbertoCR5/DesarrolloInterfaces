package mcRoy;

public enum CategoriaMcRoyMenus {
	
	MCROYBIGMAC("McRoy BigMac", 7.25),
	MCROYGRANDEXTREME("McRoy Grand Extreme", 9.40),
	MCROYMONROYSTYLE("McRoy Monroy Style Chicken Buffalo", 10.50),
	MCPOLLOROY("McRoy Pollo", 7.25),
	MCROYMITADCUARTO("McRoy Mitad de un Cuarto", 7.45),
	MCROYALDELUXE("McRoy Royal Deluxe", 7.45),
	MCROYWRAP("McRoy Wrap Chicken & Bacon", 8.00),
	MCROYNUGGETS("McRoy Nuggets 9uds.", 7.40),
	MCROY4YOUSIMPLE("Menu Simple Mediano", 3.30),
	MCROY4YOUDOBLE("Menu Doble Mediano", 4.40),
	MCROY4YOUTRIPLE("Menu Triple Mediano", 5.50);

	private final String nombre;
	private final double precio;
	
	private CategoriaMcRoyMenus(String nombre, double precio) {
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
