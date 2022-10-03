package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	/*
	 * Realice un programa que lea los lados de un triangulo y determine el tipo de
	 * triangulo (equilátero, escaleno o isósceles)
	 */

	private static final int CANTIDAD_LADOS = 3; //Lados de un triangulo
	private static final int ISOSCELES = 2;	//Lados iguales que tiene un triangulo isosceles
	private static final int ESCALENO = 1; //Los lados de un triangulo escaleno son diferentes

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int[] lados = solicitarLados();
		int tipoTriangulo = comprobarLados(lados);

		if (tipoTriangulo == ESCALENO) {
			System.out.println("El triangulo introducido corresponde a un triangulo ESCALENO");
		} else {
			if (tipoTriangulo == ISOSCELES) {
				System.out.println("El triangulo introducido corresponde a un triangulo ISOSCELES");
			} else {
				System.out.println("El triangulo introducido corresponde a un triangulo EQUILATERO");
			}

		}

	}

	private static int[] solicitarLados() {

		int[] numeros = new int[CANTIDAD_LADOS];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce lado " + (i + 1) + "/" + CANTIDAD_LADOS + ": ");
			numeros[i] = Integer.parseInt(teclado.nextLine());
		}

		return numeros;
	}

	private static int comprobarLados(int[] lados) {

		int ladosIguales = 1;

		for (int i = 0; i < CANTIDAD_LADOS; i++) {

			for (int j = i + 1; j < CANTIDAD_LADOS; j++) {

				if (lados[i] == lados[j]) {
					ladosIguales++;
				}
			}

		}

		return ladosIguales;
	}

}
