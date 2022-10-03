package monroyBank;

public interface ICuentaCorriente {

	public void abono(double cantidad) throws CuentaCorrienteMonroyException; // abona una cantidad a la cuenta, sumándola al saldo
	public void cargo(double cantidad) throws CuentaCorrienteMonroyException; // carga una cantidad a la cuenta, restándola al saldo
	public String getNumero(); // consultor del atributo número, que representa el número de cuenta corriente
	public double getSaldo(); // consultor del atributo saldo, que representa el saldo de que dispone la cuenta
	public String getTitular(); // consultor del atributo titular, que representa el titular de la cuenta
	
}
