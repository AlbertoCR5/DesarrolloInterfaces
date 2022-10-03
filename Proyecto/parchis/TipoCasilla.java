package parchis;

public enum TipoCasilla {
	SALIDA(Casilla.CASILLA_SALIDA),
	SEGURO(Casilla.CASILLA_SEGURO),
	ENTRADA(Casilla.CASILLA_ENTRADA);
	
	private int[] posicionCasilla;

	private TipoCasilla(int[] casillaSalida) {
		this.posicionCasilla = casillaSalida;
	}
	
	public int[] getPosicionCasilla() {
		return posicionCasilla;
	}
}
