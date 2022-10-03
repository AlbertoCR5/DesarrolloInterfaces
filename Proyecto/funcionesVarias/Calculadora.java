package funcionesVarias;

public class Calculadora implements ICalculadora{

	public final static int VALOR_MINIMO = 0;
	public static final String MENSAJE_ERROR = "ERROR";
	
	double resultado;
	
	public Calculadora(double resultado) {

		this.resultado = resultado;
	}
	@Override
	public void suma(double sumando, double sumando2) {
		
		resultado = sumando + sumando2;		
	}
	
	@Override
	public void resta(double minuendo, double sustraendo) {
		
		resultado = minuendo - sustraendo;
	}
	
	@Override
	public void multiplicacion(double multiplicando, double multiplicador) {
		
		resultado = multiplicando * multiplicador;
	}
	
	@Override
	public void division(double dividendo, double divisor) throws FuncionesVariasException {
		
		if (divisor == VALOR_MINIMO) {
			throw new FuncionesVariasException(MENSAJE_ERROR + ", el divisor no puede ser 0");
		}
		resultado = dividendo / divisor;
	}
	
	@Override
	public void potencia(double base, double exponente) {
		
		resultado = Math.pow(base, exponente);
	}
	
	@Override
	public void factorial(double numero) throws FuncionesVariasException {
		
		if (numero < VALOR_MINIMO) {
			throw new FuncionesVariasException(MENSAJE_ERROR + ", No se puede calcular el factorial de un numero negativo");
		}
		resultado = 1;
		
		while(numero!=0) {
			 resultado = resultado * numero;
			 numero--;
		}
	}
	@Override
	public void media(double numero) {
		
		int contador = 0;
		
		do {
			resultado = resultado + numero;
			contador++;
		} while (numero != 0);
		
		resultado = resultado / contador;
	}	
	
}
