package parchis;

public class Parchis {

	int numeroJugadores;
	int jugadores[] = new int [numeroJugadores];
	int fichasJuego[];
	Jugador jugadorTurno;
	Tablero tablero;
	Colores coloresJuego[];
	
	public Parchis() {

		tablero = Tablero.crearTablero();
	}

	public int getNumeroJugadores() {
		return numeroJugadores;
	}

	public void setNumeroJugadores(int numeroJugadores) throws ParchisException {
		
		if (numeroJugadores < 2 || numeroJugadores > 4) {
			throw new ParchisException("Debe de haber de 2 a 4 jugadores");
		}
		this.numeroJugadores = numeroJugadores;
	}

	public int[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(int[] jugadores) {
		this.jugadores = jugadores;
	}

	public int[] getFichasJuego() {
		return fichasJuego;
	}

	public void setFichasJuego(int[] fichasJuego) {
		this.fichasJuego = fichasJuego;
	}

}
