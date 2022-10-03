package monroyBank;

public class TarjetaVirtual extends TarjetaBancaria implements ITarjetaVirtual{
	
	
	/*
	 * **** He suprimido el uso de boolean en algunos metodos por que he visto mas practico para este ejercicio el tirar excepciones****
	 */
	
	private static final int SALDO_INICIAL_MONEDERO = 0;

	// Constantes
	private static final int CIFRAS_PIN = 4; // Longitud del pin
	
	// Atributos
	double monedero;
	private int pin;
	
	// Constructor
	public TarjetaVirtual(String titular, String numero, double saldo, IFechaDeCaducidad fechaDeCaducidad, double limite, int pin) throws CuentaCorrienteMonroyException {
		super(titular, numero, saldo, fechaDeCaducidad, limite);
		
		monedero = SALDO_INICIAL_MONEDERO; // Se inicializa explícitamente a cero tal como pide el ejercicio
		setPin(pin);
	}

	@Override
	public double getMonedero() {
		
		return monedero;
	}
	
	@Override
	public int getPin() {
		
		return pin;
	}	

	private void setPin(int pin) throws CuentaCorrienteMonroyException {

		//Se comprueba que el pin contenga 4 cifras, si no, lanzara una excepcion
		if (String.valueOf(pin).length() != CIFRAS_PIN) {
			throw new CuentaCorrienteMonroyException ("EL pin debe tener al menos 4 cifras.");
		}
		this.pin = pin;
	}
	
	// Informacion que se mostrara acerca de la tarjeta virtual
	@Override
	public String toString() {
		return "***TARJETA VIRTUAL***" + "\nTitular: " + super.getTitular()
		+ "\nMonedero: " + monedero
		+ "\nSaldo: " + super.getSaldo()
		+ "\nFecha de Caducidad: " + fechaDeCaducidad.toString();
	}

	/**
	 * Metodo que comprueba que el pin introducido sea correcto
	 * @param pinIntroducido
	 * @return boolean esPinCorrecto true o false
	 * @throws CuentaCorrienteMonroyException
	 */
	private boolean compruebaPin(int pinIntroducido) throws CuentaCorrienteMonroyException {
		
		boolean esPinCorrecto = true;
		// Si pin introducido no coindice con el actual lanzara una excepcion
		if (this.pin != pinIntroducido) {
			esPinCorrecto = false;
			throw new CuentaCorrienteMonroyException ("EL pin introducido es incorrecto.");		
		}
		
		return esPinCorrecto;	
	}
	
	/**
	 * Metodo que recarga el monedero
	 * @param recarga
	 * @param pinIntroducido
	 * @throws CuentaCorrienteMonroyException
	 */
	protected void recargarMonedero(double recarga, int pinIntroducido) throws CuentaCorrienteMonroyException {

		// Si pin introducido no coindice con el actual lanzara una excepcion
		if (compruebaPin(pinIntroducido)) {
			// Si la recarga es negativa o igual a 0, se lanzara una excepcion
			if (recarga <= 0) {
				throw new CuentaCorrienteMonroyException ("Recarga no realizada, ingrese una cantidad mayor a 0.");
			}
			else {
				// Si el saldo actual de la cuenta corriente es inferior a la recarga de monedero que se quiere realizar, lanzara una excpecion
				if (super.getSaldo() < recarga) {
					throw new CuentaCorrienteMonroyException ("No dispones de suficiente saldo para realizar la recarga. " + super.getSaldo());
				}
			}						
		}
		
		// Si el pin es correcto y hay sufciente saldo para realizar la recarga del monedero actualizara las cantidades de monedero y del saldo			
		this.monedero = this.monedero + recarga;
		super.saldo = saldo - recarga;

	}
	
	/**
	 * Metodo que realiza un compra
	 * @param precio
	 * @param pinIntroducido
	 * @throws CuentaCorrienteMonroyException
	 */
	protected void compra(double precio, int pinIntroducido) throws CuentaCorrienteMonroyException {
		
		// Si pin introducido no coindice con el actual lanzara una excepcion
		if (compruebaPin(pinIntroducido)) {
			// Si la cantidad actual en el monedero es inferior al precio de la compra a realizar o supera el limite indicado, se lanzara una excepcion
			if (monedero < precio || !super.compra(precio)) {
				throw new CuentaCorrienteMonroyException ("No dispones de suficiente saldo en el monedero para realizar la compra. " + monedero);
			}
		}
		// Si el pin es correcto y hay suficiente saldo en el monedero para realizar la compra, el saldo del monedero se actualizara
		this.monedero = this.monedero - precio;			
	}
	
	/**
	 * Metodo que cambia el pin
	 * @param pinIntroducido
	 * @param pinNuevo
	 * @param repetirPinNuevo
	 * @throws CuentaCorrienteMonroyException
	 */
	protected void cambiarPin(int pinIntroducido, int pinNuevo, int repetirPinNuevo) throws CuentaCorrienteMonroyException {
			
		// Si pin introducido no coindice con el actual lanzara una excepcion
		if (compruebaPin(pinIntroducido)) {
			//Se solicitaran el nuevo pin dos veces, si coinciden se actualizara el pin actual
			if (pinNuevo == repetirPinNuevo) {
				setPin(pinNuevo);
			}
			//Si no coinciden los pines introducidos se lanzara una excepcion
			else {
				throw new CuentaCorrienteMonroyException ("Los pines introducidos no coinciden.");
			}
		}
			
	}
	
}
