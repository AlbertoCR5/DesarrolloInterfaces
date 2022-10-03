package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	/*
	 * Realice un programa que leídos tres números enteros por teclado, 
	 * determine si están en orden creciente.
	 */
	
	private static final int CANTIDAD_NUMEROS = 3; //Indica la cantidad de numeros que se van a introducir
	
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] numeros = solicitarNumeros(); //Solicita los numeros
		boolean esCreciente = comprobarOrdenNumeros(numeros); //Comprueba que los numeros esten en orden creciente
		
		if (esCreciente) { //Si el orden es creciente...
			System.out.println("Los numeros han sido introducidos en orden creciente");
		}
		else  { //Si el orden no es creciente
			System.out.println("Los numeros NO han sido introducidos en orden creciente");
		}

	}
	/**
	 * Metodo que solicita numeros por teclado
	 * @return array de numeros
	 */
	private static int[] solicitarNumeros() {

		int[] numeros = new int[CANTIDAD_NUMEROS]; //Array de enteros con tamano igual a la cantidad de numeros a ingresar

		for (int i = 0; i < numeros.length; i++) { //Solicitara un numero cada vez
			System.out.print("Introduce numero " + (i+1) + "/" + CANTIDAD_NUMEROS + ": ");
			numeros[i] = Integer.parseInt(teclado.nextLine());
		}
		
		return numeros;
	}

	/**
	 * Metodo que comprueba que los numeros introducidos esten en orden creciente
	 * @param numeros
	 * @return boolean true si es creciente, false si no lo es
	 */
	private static boolean comprobarOrdenNumeros(int[] numeros) {
		
		int crecientes = 0;
		boolean esCreciente = false;
		
		for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
			
			if (i < CANTIDAD_NUMEROS -1) {
				
				if (numeros[i] <= numeros[i+1]) {
					crecientes++;
				}
			}
		}
		
		if (crecientes == 2) {
			esCreciente = true;
		}
		
		return esCreciente;
	}

}
