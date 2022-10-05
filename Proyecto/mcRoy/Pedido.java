package mcRoy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pedido extends RestauranteMcMonroy {

	static Calendar fecha = new GregorianCalendar(); // Importamos los utiles CALENDAR y GregorianCalendar para obtener el anio actual y usarlo como constante
	static DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	static Date hora = new Date();
	
	// Constantes
	public static final int ANIO_ACTUAL = fecha.get(Calendar.YEAR); // Anio actual
	public static final int MES_ACTUAL = fecha.get(Calendar.MONTH); // Mes actual
	public static final int DIA_ACTUAL = fecha.get(Calendar.DAY_OF_YEAR); // Dia actual
	public static final String HORA_ACTUAL = dateFormat.format(hora); // Hora Actual

	// Atributos	
	String horaActual;
	int dia;
	int mes;
	int anio;
	boolean esParaLlevar;
	boolean esServicioMesa;
	static int idPedido = 0;
	static int idPedidoPantalla = 0;
	
	
	public Pedido(String nombre, String direccion, String horaActual, int dia, int mes, int anio, boolean esParaLLevar, boolean esServicioMesa) {
		super(nombre, direccion);
		
		this.horaActual = horaActual;
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		this.esParaLlevar = esParaLLevar;
		this.esServicioMesa = esServicioMesa;
		idPedido++;
		idPedidoPantalla++;
	}

	public static int getIdPedido() {
		return idPedido;
	}
	
	public static int getIdPedidoPantalla() {
		return idPedidoPantalla;
	}

	public static void setIdPedidoPantalla(int idPedidoPantalla) {
		
		if (idPedidoPantalla == 100) {
			idPedidoPantalla = 0;
		}		
		Pedido.idPedidoPantalla = idPedidoPantalla;
	}

	public String getHoraActual() {
		return horaActual;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnio() {
		return anio;
	}

	public boolean isEsParaLlevar() {
		return esParaLlevar;
	}

	public boolean isEsServicioMesa() {
		return esServicioMesa;
	}
	
}
