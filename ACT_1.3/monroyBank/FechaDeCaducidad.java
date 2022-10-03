package monroyBank;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class FechaDeCaducidad implements IFechaDeCaducidad {
	
	static Calendar fecha = new GregorianCalendar(); // Importamos los utiles CALENDAR y GregorianCalendar para obtener el anio actual y usarlo como constante
	
	// Constantes
	public static final int MESES = 12; //Cantidad de meses
	public static final int ANIO_ACTUAL = fecha.get(Calendar.YEAR); // Anio actual
	public static final int ANIOS_VALIDEZ = 10; //Anios validez de la tarjeta

	// Atributos
	int mes;
	int anio;
	
	// Constructor
	public FechaDeCaducidad(int mes, int anio) throws CuentaCorrienteMonroyException {
		
		setMes(mes);
		setAnio(anio);
	}
	
	@Override
	public int getMes() {
		
		return mes;
	}
	
	@Override
	public int getAnio() {
		
		return anio;
	}

	public void setMes(int mes) throws CuentaCorrienteMonroyException {
		// Si el mes introducido no es correcto se lanzara una excepcion
		if (mes <= 0 || mes > MESES) {
			throw new CuentaCorrienteMonroyException("El mes de validez de la tarjeta introducido es incorrecto.");
		}
		this.mes = mes;
	}
	
	public void setAnio(int anio) throws CuentaCorrienteMonroyException {
		// Si el anio introducido es menor al anio actual o es mayor del limite de caducidad(10) se lanzara una excepecion
		if (anio > ANIO_ACTUAL + ANIOS_VALIDEZ || anio < ANIO_ACTUAL) {
			throw new CuentaCorrienteMonroyException("El anio de validez de la tarjeta introducido es incorrecto.");
		}
		this.anio = anio;
	}

	// Metodo que muestra la fecha de caducidad de la tarjeta virtual en el formato que marca el ejercicio
	@Override
	public String toString() {
		return mes + "/" + anio;
	}
}
