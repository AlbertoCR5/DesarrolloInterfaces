package monroyBank;

public class TarjetaBancaria extends CuentaCorriente implements ITarjetaBancaria {

	// Atributos
	IFechaDeCaducidad fechaDeCaducidad;
	ICuentaCorriente cuentaCorriente;
	double limite;

	// Constructor
	public TarjetaBancaria(String titular, String numero, double saldo, IFechaDeCaducidad fechaDeCaducidad,
			double limite) throws CuentaCorrienteMonroyException {
		super(titular, numero, saldo);
		
		this.fechaDeCaducidad = fechaDeCaducidad;
		this.setLimite(limite);
	}

	@Override
	public String getTitular() {

		return titular;
	}

	@Override
	public String getNumero() {

		return numero;
	}

	@Override
	public IFechaDeCaducidad getFechaDeCaducidad() {

		return fechaDeCaducidad;
	}

	@Override
	public ICuentaCorriente getCuentaCorriente() {

		return cuentaCorriente;
	}

	@Override
	public double getLimite() {

		return limite;
	}

	private void setLimite(double limite) throws CuentaCorrienteMonroyException {
		// Se comprueba que el limite de gasto no sea superior al saldo actual, si lo es, se lanzara una excepcion
		if (limite > saldo) {
			throw new CuentaCorrienteMonroyException("El limite no puede ser superior al saldo. " + saldo);
		}
		this.limite = limite;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "TarjetaBancaria: Fecha Caducidad" + fechaDeCaducidad + "\n" + "Limite: " + limite;
	}

	@Override
	public boolean compra(double cantidad) throws CuentaCorrienteMonroyException {

		boolean esCompraRealizada = true;
		// Si la cantidad a gastar es mayor al limite indicado se lanzara una excepcion
		if (limite < cantidad) {
			esCompraRealizada = false;
			throw new CuentaCorrienteMonroyException("No puedes efectuar la compra ya que el precio supera el limite de gastos. " + limite);
		}

		return esCompraRealizada;
	}

}
