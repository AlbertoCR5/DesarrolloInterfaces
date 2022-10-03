package funcionesVarias;

public interface ICalculadora {

	public void suma(double sumando, double sumando2);
	public void resta(double minuendo, double sustraendo);
	public void multiplicacion(double multiplicando, double multiplicador);
	public void division(double dividendo, double divisor) throws FuncionesVariasException;
	public void potencia(double base, double exponente);
	public void factorial(double numero) throws FuncionesVariasException;
	public void media(double numero);
}
