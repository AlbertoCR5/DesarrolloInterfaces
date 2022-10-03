package parchis;

public class Jugador {

	String nombre;
	Colores color;
	Tablero tablero;
	Ficha fichas[];
	public Jugador(String nombre, Colores color, Tablero tablero, Ficha[] fichas) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.tablero = tablero;
		this.fichas = fichas;
	}
	
}
