package mcRoy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pedido {

	static Calendar fecha = new GregorianCalendar(); // Importamos los utiles CALENDAR y GregorianCalendar para obtener el anio actual y usarlo como constante
	static DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	static Date hora = new Date();
	
	// Constantes
	public static final int ANIO_ACTUAL = fecha.get(Calendar.YEAR); // Anio actual
	public static final int MES_ACTUAL = fecha.get(Calendar.MONTH); // Mes actual
	public static final int DIA_ACTUAL = fecha.get(Calendar.DATE); // Dia actual
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
	double precioPedido = 0;
	StringBuilder cadenaPedido = new StringBuilder();
	
	
	public Pedido() {
		
		this.horaActual = HORA_ACTUAL;
		this.dia = DIA_ACTUAL;
		this.mes = MES_ACTUAL;
		this.anio = ANIO_ACTUAL;
		idPedido++;
		idPedidoPantalla++;
	}

	public Pedido(String horaActual, int dia, int mes, int anio, boolean esParaLLevar, boolean esServicioMesa) {
		
		this.horaActual = HORA_ACTUAL;
		this.dia = DIA_ACTUAL;
		this.mes = MES_ACTUAL;
		this.anio = ANIO_ACTUAL;
		this.esParaLlevar = esParaLLevar;
		this.esServicioMesa = esServicioMesa;
		idPedido++;
		idPedidoPantalla++;	
	}

	public static int getIdPedido() {
		return idPedido;
	}
	
	public int getIdPedidoPantalla() {
		return idPedidoPantalla;
	}

	public static void setIdPedidoPantalla(int idPedidoPantalla) {
		
		if (idPedidoPantalla == 100) {
			idPedidoPantalla = 0;
		}		
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

	@Override
	public String toString() {
		return "Num Pedido: " + idPedido +  "\n               " + dia + "/" + mes + "/" + anio
				+ " " + horaActual + "\n\nArticulo\n" + cadenaPedido + "\nTotal                     " 
				+ String.format("%.2f", precioPedido) + "€" + "\n           DISFRUTA";
	}
	
	public double annadirProducto(double precioProducto, String nombreProducto) {
		
		cadenaPedido.append(nombreProducto + "     " + precioProducto + "\n");
		
		precioPedido = precioPedido + precioProducto;
		RestauranteMcMonroy.totalFacturado = RestauranteMcMonroy.totalFacturado + precioPedido;
		
		cadenaPedido.toString();
		
		return precioPedido;	
	}
}
