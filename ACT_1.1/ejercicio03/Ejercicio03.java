package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	/*
	 * Escriba un programa que lea desde el teclado un polinomio de grado n. 
	 * Para eso, se leerá primero el grado del polinomio, 
	 * luego los coeficientes, que se almacenaran en un vector.
	 * Finalmente se leerá un valor para la variable x del polinomio y lo resuelva.
	 */


	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int gradoN = solicitarGrado("Introduce el grado del polinomio: "); //Solicita el grado del polinomio
		int[] coeficientes = solicitarCoeficientes(gradoN); //Solicita tantos coeficientes como grados tenga el polinomio +1
		int variableX = solicitarValorX("Introduce el valor de la variable x: "); //Solicita el valor de la variable x
		double resultado = resolverPolinomio(gradoN, coeficientes, variableX); //Calcula el resultado del polinomio

		System.out.println("El resultado del polinomio es " + resultado);	

	}

	private static int solicitarGrado(String string) {
		
		int gradoN;
		
		do { //Si el grado introducido del polinomio es menor a 0 volvera a solicitarlo
			System.out.print(string);//E
			gradoN = Integer.parseInt(teclado.nextLine());
		} while (gradoN <= 0);
			
		return gradoN + 1;
	}

	private static int[] solicitarCoeficientes(int gradoN) {

		int[] coeficientes = new int[gradoN];
		
		for (int i = gradoN - 1; i >= 0; i--) {
			System.out.print("Introduce coeficiente grado " + i + ": ");
			coeficientes[i] = Integer.parseInt(teclado.nextLine());
		}
		
		return coeficientes;
	}

	private static int solicitarValorX(String string) {
		
		int variableX;
		
		System.out.print(string);
		variableX = Integer.parseInt(teclado.nextLine());
		
		return variableX;
	}

	private static int resolverPolinomio(int gradoN, int[] coeficientes, int variableX) {
		
		int resultado = 0;
		
		for (int i = gradoN - 1; i >= 0; i--) {
			
			int resultadoCoeficiente = 0;
			resultadoCoeficiente = (int) (coeficientes[i] * Math.pow(variableX, i));
			resultado = resultado + resultadoCoeficiente;
		}
		
		return resultado;
	}

}
