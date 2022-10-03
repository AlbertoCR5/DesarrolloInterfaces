package parchis;

public enum Colores {

	AMARILLO(0), AZUL(1), ROJO(2), VERDE(3);
	
	private int color;

	private Colores(int color) {
		this.color = color;
	}

	public int getColor() {
		return color;
	}
}
