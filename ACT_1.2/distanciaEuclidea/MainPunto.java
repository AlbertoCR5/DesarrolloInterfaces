package distanciaEuclidea;

import java.util.Scanner;

public class MainPunto {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Punto puntoA, puntoB;

		puntoA = crearPunto("Crear punto A");
		puntoB = crearPunto("Crear punto B");

		System.out.println(puntoA.distanciaEuclidea(puntoB) + " es la distancia euclediana entre los puntos ["
				+ puntoA.toString() + "," + puntoB.toString() + "]");

	}

	private static Punto crearPunto(String string) {

		double x, y;

		System.out.println(string);
		System.out.print("Introduzca posicion x: ");
		x = Integer.parseInt(teclado.nextLine());

		System.out.print("Introduzca posicion y: ");
		y = Integer.parseInt(teclado.nextLine());

		Punto punto = new Punto(x, y);

		return punto;
	}

}
