package monroyBank;

public interface ITarjetaBancaria {

	// Métodos Consultores
	public String getTitular();
	public String getNumero();
	public IFechaDeCaducidad getFechaDeCaducidad();
	public ICuentaCorriente getCuentaCorriente();
	public double getLimite();
	
	// Método compra
	public boolean compra(double cantidad) throws CuentaCorrienteMonroyException;
}
