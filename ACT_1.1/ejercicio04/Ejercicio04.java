package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	/*
	 * Escribir un programa que lea el peso de cada una de las 20 ratas de
	 * laboratorio del departamento de Biología de la Nutrición. Calcular el peso
	 * medio de las ratas e imprimir un informe parecido al siguiente:
	 */

	private static final int CANTIDAD_RATAS = 20; // Indica la cantidad de pesos que se van a introducir

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		double[] pesoRatas = solicitarPesoRatas(); // Solicita los pesos
		mostrarRatasConPeso(pesoRatas); // Muestra los distintos pesos y las veces que se repiten
		double pesoMedio = calcularMediaPeso(pesoRatas); // Calcula el peso medio de los pesos introducidos
		mostrarPesoMedio(pesoMedio); // Muestra el peso medio

	}

	/**
	 * Metodo que solicita los pesos de las ratas y los guarda en un array
	 * @return array con los pesos de las ratas
	 */
	private static double[] solicitarPesoRatas() {

		double[] pesoRatas = new double[CANTIDAD_RATAS];

		for (int i = 0; i < CANTIDAD_RATAS; i++) {
			System.out.print("Introduce peso " + (i + 1) + "/" + CANTIDAD_RATAS + ": ");
			pesoRatas[i] = Integer.parseInt(teclado.nextLine());
		}

		return pesoRatas;
	}

	/**
	 * Metodo que muestra los distintos pesos y las veces que se repiten
	 * @param pesoRatas
	 */
	private static void mostrarRatasConPeso(double[] pesoRatas) {

		for (int i = 0; i < CANTIDAD_RATAS; i++) {

			boolean esRepetido = false;
			int pesoRepetido = 0;

			for (int j = 0; j < CANTIDAD_RATAS; j++) {

				if (pesoRatas[i] == pesoRatas[j]) {
					pesoRepetido++;
					if (j < i) {
						esRepetido = true;
					}
				}

			}

			if (!esRepetido) {
				System.out.println("Hay " + pesoRepetido + " ratas que pesan " + pesoRatas[i] + " gramos");
			}

		}

	}

	/**
	 * Metodo que calcula el peso medio de las ratas pesadas
	 * @param pesoRatas
	 * @return
	 */
	private static double calcularMediaPeso(double[] pesoRatas) {

		double pesoMedio = 0;

		for (int i = 0; i < CANTIDAD_RATAS; i++) {
			pesoMedio = pesoMedio + pesoRatas[i];
		}

		return pesoMedio / CANTIDAD_RATAS;
	}

	/**
	 * Metodo que muestra el peso medio de las ratas
	 * @param pesoMedio
	 */
	private static void mostrarPesoMedio(double pesoMedio) {

		System.out.println("El peso medio de las ratas pesadas es " + pesoMedio);

	}

}
