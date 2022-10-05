package mcRoy;

public class RestauranteMcMonroy {
	
	public static final String NOMBRE_RESTAURANTE = "MCMonroy's";
	public static final String DIRECCION_RESTAURANTE = "Av. de la ConstituciÃ³n, S/N, 41500 AlcalÃ¡ de GuadaÃ­ra, Sevilla";
	public static final String TELEFONO_RESTAURANTE = "954 10 09 11";
	public static final String DESCRIPCION_RESTAURANTE = "Cadena de restaurante de comida rapida de larga trayectoria famosa por sus hamburguesas, patatas fritas e instalar franquicias en lugares donde hay institutos";
	public static final String HORARIO_APERTURA_RESTAURANTE =  "12:00";
	public static final String HORARIO_CIERRE_RESTAURANTE =  "01:00";	

	static int idRestaurante = 1; 
	String nombre, direccion, telefono, descripcion, horaApertura, horaCierre;
	static int pedido;
	static double totalFacturado;
	
	
	public RestauranteMcMonroy(String nombre, String direccion) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		idRestaurante++;
		totalFacturado = 0;
	}
	
	public RestauranteMcMonroy(String nombre, String direccion, String telefono, String descripcion,
			String horaApertura, String horaCierre) {

		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.descripcion = descripcion;
		this.horaApertura = horaApertura;
		this.horaCierre = horaCierre;
		idRestaurante++;
		totalFacturado = 0;
	}

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
	
	
	public void realizarPedido() {
		
	}

}
