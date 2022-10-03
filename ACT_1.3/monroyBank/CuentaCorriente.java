package monroyBank;

public class CuentaCorriente implements ICuentaCorriente {

	// Constantes
	private static final int LONGITUD_NUMERO_CUENTA = 10;
	
	// Atributos
	String titular;
	String numero;
	double saldo;
	
	// Constructor
	public CuentaCorriente(String titular, String numero, double saldo) throws CuentaCorrienteMonroyException {
		
		setTitular(titular);
		this.setNumero(numero);
		this.setSaldo(saldo);
	}

	@Override
	public String getTitular() {
		
		return titular;
	}

	public void setTitular(String titular) throws CuentaCorrienteMonroyException {
		// Se comprueba que el nombre del titular tenga al menos una longitud de 3, si no es correcto se lanzara una excepcion
		if (titular.length() < 3) {
			throw new CuentaCorrienteMonroyException("Nombre del titular incorrecto.");
		}
		this.titular = titular;
	}

	@Override
	public String getNumero() {
		
		return numero;
	}
	
	private void setNumero(String numero) throws CuentaCorrienteMonroyException {
		// Se comprueba que el numero de cuenta introducido tenga un tamanio de 10, si no, se lanzara una excepcion
		if (numero.length() != LONGITUD_NUMERO_CUENTA) { 
			throw new CuentaCorrienteMonroyException("Numero de cuenta incorrecto.");
		}
		this.numero = numero;
	}	

	@Override
	public double getSaldo() {
		
		return saldo;
	}
	
	protected void setSaldo(double saldo)throws CuentaCorrienteMonroyException {
		// Se comprueba que no se introduzca un saldo negativo, en ese caso lanzara una excepcion
		if (saldo<0){ 
			throw new CuentaCorrienteMonroyException("No puede crear una  cuenta con un saldo negativo.");
		}		
		this.saldo = saldo;
	}
	
	// Informacion acerca de la cuenta corriente
	@Override
	public String toString() {
		return "Cuenta Corriente Monroy" + "\n" + titular + "\n" + "Numero cuenta: " + numero + "\n" + "Saldo:" + saldo;
	}

	/**
	 * Metodo para ingresar dinero
	 */
	@Override
	public void abono(double cantidad) throws CuentaCorrienteMonroyException {
		// Se comprueba que no se ingrese una cantidad negativa, en ese caso lanzara una excepcion
		if (cantidad <= 0) {
			throw new CuentaCorrienteMonroyException("No puedes abonar una cantidad negativa o 0.");
		}
		// Se actualiza el saldo sumandole la cantidad ingresada
		saldo = saldo + cantidad;
	}

	/**
	 * Metodo para retirar dinero
	 */
	@Override
	public void cargo(double cantidad) throws CuentaCorrienteMonroyException {
		// Se comprueba que no se retire una cantidad superior al saldo actual, en ese caso lanzara una excepcion
		if (cantidad > saldo) {
			throw new CuentaCorrienteMonroyException("Insuficiente saldo para realizar ese cargo.");
		}
		// Se actualiza el saldo restandole la cantidad ingresada
		saldo = saldo - cantidad;
	}

}
