package mcRoy;

public class RestauranteMcMonroy implements IRestauranteMcMonroy {
	
	
	//Constantes
	public static final String NOMBRE_RESTAURANTE = "MCMonroy's";
	public static final String DIRECCION_RESTAURANTE = "Av. de la Constitucion, S/N, 41500 Alcala de Guadaira, Sevilla";
	public static final String TELEFONO_RESTAURANTE = "954 10 09 11";
	public static final String DESCRIPCION_RESTAURANTE = "Cadena de restaurante de comida rapida de larga trayectoria famosa por sus hamburguesas, patatas fritas e instalar franquicias en lugares donde hay institutos";
	public static final String HORARIO_APERTURA_RESTAURANTE =  "12:00";
	public static final String HORARIO_CIERRE_RESTAURANTE =  "01:00";
	private static final int CODIGO_SEGURIDAD = 1234;
	
	//Atributos
	String nombre, direccion, telefono, descripcion, horaApertura, horaCierre;
	int codigoSeguridad;
	static int idRestaurante = 0; 	
	static double totalFacturado;
	
	//Constructor de prueba que establece unos datos por defecto
	public RestauranteMcMonroy() {
		
		this.nombre = NOMBRE_RESTAURANTE;
		this.direccion = DIRECCION_RESTAURANTE;
		this.telefono = TELEFONO_RESTAURANTE;
		this.descripcion = DESCRIPCION_RESTAURANTE;
		this.horaApertura = HORARIO_APERTURA_RESTAURANTE;
		this.horaCierre = HORARIO_CIERRE_RESTAURANTE;
		this.codigoSeguridad = CODIGO_SEGURIDAD;
		idRestaurante++; //Este numero aumentara cada vez que se cree un restaurante
		totalFacturado = 0; //Mostrara el total facturado por el restaurante entre todos los pedidos
	}

	//Constructor con datos fundamentales que apareceran en el ticket de compra
	public RestauranteMcMonroy(String nombre, String direccion, int codigoSeguridad) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.codigoSeguridad = codigoSeguridad;
		idRestaurante++;
		totalFacturado = 0;
	}
	
	//Constructor con otros datos de interes
	public RestauranteMcMonroy(String nombre, String direccion, String telefono, String descripcion,
			String horaApertura, String horaCierre, int codigoSeguridad) {

		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.descripcion = descripcion;
		this.horaApertura = horaApertura;
		this.horaCierre = horaCierre;
		this.codigoSeguridad = codigoSeguridad;
		idRestaurante++;
		totalFacturado = 0;
	}

	//Getters and Setters
	public int getIdRestaurante() {
		return idRestaurante;
	}

	public static double getTotalFacturado() {
		return totalFacturado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getHoraApertura() {
		return horaApertura;
	}

	public void setHoraApertura(String horaApertura) {
		this.horaApertura = horaApertura;
	}

	public String getHoraCierre() {
		return horaCierre;
	}

	public void setHoraCierre(String horaCierre) {
		this.horaCierre = horaCierre;
	}

	public int getCodigoSeguridad() {
		return codigoSeguridad;
	}

	public void setCodigoSeguridad(int codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}

	@Override
	public String toString() {
		return nombre 
			+ "\n" + idRestaurante 
			+ "\n" + direccion 
			+ "\n" + telefono
			+ "\n" + "Open: " + horaApertura
			+ "\n" + "Close: " + horaCierre
			+ "\n" + descripcion;
	}

}
