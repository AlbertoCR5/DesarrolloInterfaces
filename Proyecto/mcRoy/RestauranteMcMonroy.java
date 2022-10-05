package mcRoy;

import java.util.Random;

public class RestauranteMcMonroy {
	
	public static final String NOMBRE_RESTAURANTE = "MCMonroy's";
	public static final String DIRECCION_RESTAURANTE = "Av. de la Constituci√≥n, S/N, 41500 Alcal√° de Guada√≠ra, Sevilla";
	public static final String TELEFONO_RESTAURANTE = "954 10 09 11";
	public static final String DESCRIPCION_RESTAURANTE = "Cadena de restaurante de comida rapida de larga trayectoria famosa por sus hamburguesas, patatas fritas e instalar franquicias en lugares donde hay institutos";
	public static final String HORARIO_APERTURA_RESTAURANTE =  "12:00";
	public static final String HORARIO_CIERRE_RESTAURANTE =  "01:00";
	
	Random idRestauranteAleatorio = new Random();
	static int idRestaurante = 1; 
	String nombre, direccion, telefono, descripcion, horaApertura, horaCierre;
	static int pedido;
	
	public RestauranteMcMonroy(String nombre, String direccion) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		idRestaurante++;
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
	}

	public int getIdRestaurante() {
		return idRestaurante;
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
		return "RestauranteMcMonroy" 
				+ "\n" + idRestaurante 
				+ "\n" + direccion 
				+ "\n" + telefono
				+ "\n" + "Open: " + horaApertura
				+ "\n" + "Close: " + horaCierre
				+ "\n" + descripcion;
	}
	
	public String mostrarCategorias() {
	
		StringBuilder sbCategorias = new StringBuilder();
		
		for (int i = 0; i < Producto.CATEGORIAS.length; i++) {
			sbCategorias.append("(" + (i+1) + ")" + Producto.CATEGORIAS[i] + "\n");
		}
		
		return sbCategorias.toString();
	}
	
	public String mostrarProductos(int categoriaSeleccionada) {
		
		StringBuilder sbProductos = new StringBuilder();
		int i = 1;
		switch (categoriaSeleccionada - 1) {
		
		case 0:
			sbProductos.append(Producto.CATEGORIAS[categoriaSeleccionada - 1] + ":" + "\n");
			for (CategoriaMcRoyMenus producto : CategoriaMcRoyMenus.values()) {
				sbProductos.append("(" + i + ")" + producto.getNombre() + " " + producto.getPrecio() + "Ä" + "\n");
				i++;
			}
			break;
			
		case 1:
			sbProductos.append(Producto.CATEGORIAS[categoriaSeleccionada - 1] + ":" + "\n");
			for (CategoriaMcRoySandwiches producto : CategoriaMcRoySandwiches.values()) {
				sbProductos.append("(" + i + ")" + producto.getNombre() + " " + producto.getPrecio() + "Ä" + "\n");
				i++;
			}
			break;
			
		case 2:
			sbProductos.append(Producto.CATEGORIAS[categoriaSeleccionada - 1] + ":" + "\n");
			for (CategoriaMonroyStyle producto : CategoriaMonroyStyle.values()) {
				sbProductos.append("(" + i + ")" + producto.getNombre() + " " + producto.getPrecio() + "Ä" + "\n");
				i++;
			}
			break;
		
		case 3:
			sbProductos.append(Producto.CATEGORIAS[categoriaSeleccionada - 1] + ":" + "\n");
			for (CategoriaAsignatureCollection producto : CategoriaAsignatureCollection.values()) {
				sbProductos.append("(" + i + ")" + producto.getNombre() + " " + producto.getPrecio() + "Ä" + "\n");
				i++;
			}
			break;
			
		case 4:
			sbProductos.append(Producto.CATEGORIAS[categoriaSeleccionada - 1] + ":" + "\n");
			for (CategoriaGrandMcRoyExtreme producto : CategoriaGrandMcRoyExtreme.values()) {
				sbProductos.append("(" + i + ")" + producto.getNombre() + " " + producto.getPrecio() + "Ä" + "\n");
				i++;
			}
			break;
			
		case 5:
			sbProductos.append(Producto.CATEGORIAS[categoriaSeleccionada - 1] + ":" + "\n");
			for (CategoriaMcRoyEnsaladas producto : CategoriaMcRoyEnsaladas.values()) {
				sbProductos.append("(" + i + ")" + producto.getNombre() + " " + producto.getPrecio() + "Ä" + "\n");
				i++;
			}
			break;
			
		case 6:
			sbProductos.append(Producto.CATEGORIAS[categoriaSeleccionada - 1] + ":" + "\n");
			for (CategoriaHappyMealRoy producto : CategoriaHappyMealRoy.values()) {

				if (producto.equals(CategoriaHappyMealRoy.PRINCIPAL)) {
					
					for (int j = 0; j < Producto.PRINCIPAL_HAPPYMEALROY.length; j++) {
						sbProductos.append("(" + (i+1) + ")" + Producto.PRINCIPAL_HAPPYMEALROY[i] + "\n");
					}
				}
				
				if (producto.equals(CategoriaHappyMealRoy.COMPLEMENTO)) {
					for (int j = 0; j < Producto.COMPLEMENTO_HAPPYMEALROY.length; j++) {
						sbProductos.append("(" + (i+1) + ")" + Producto.COMPLEMENTO_HAPPYMEALROY[i] + "\n");
					}
				}
				
				if (producto.equals(CategoriaHappyMealRoy.BEBIDA)) {
					for (int j = 0; j < Producto.BEBIDA_HAPPYMEALROY.length; j++) {
						sbProductos.append("(" + (i+1) + ")" + Producto.BEBIDA_HAPPYMEALROY[i] + "\n");
					}
				}
				
				if (producto.equals(CategoriaHappyMealRoy.POSTRE)) {
					for (int j = 0; j < Producto.POSTRE_HAPPYMEALROY.length; j++) {
						sbProductos.append("(" + (i+1) + ")" + Producto.POSTRE_HAPPYMEALROY[i] + "\n");
					}
				}
			}
			break;
			
		case 7:
			sbProductos.append(Producto.CATEGORIAS[categoriaSeleccionada - 1] + ":" + "\n");
			for (CategoriaMcRoyMenus producto : CategoriaMcRoyMenus.values()) {
				sbProductos.append("(" + i + ")" + producto.getNombre() + " " + producto.getPrecio() + "Ä" + "\n");
				i++;
			}
			break;
			
		case 8:
			sbProductos.append(Producto.CATEGORIAS[categoriaSeleccionada - 1] + ":" + "\n");
			for (CategoriaMcRoyMenus producto : CategoriaMcRoyMenus.values()) {
				sbProductos.append("(" + i + ")" + producto.getNombre() + " " + producto.getPrecio() + "Ä" + "\n");
				i++;
			}
			break;
			
		case 9:
			sbProductos.append(Producto.CATEGORIAS[categoriaSeleccionada - 1] + ":" + "\n");
			for (CategoriaMcRoyMenus producto : CategoriaMcRoyMenus.values()) {
				sbProductos.append("(" + i + ")" + producto.getNombre() + " " + producto.getPrecio() + "Ä" + "\n");
				i++;
			}
			break;
			
		case 10:
			sbProductos.append(Producto.CATEGORIAS[categoriaSeleccionada - 1] + ":" + "\n");
			for (CategoriaMcRoyMenus producto : CategoriaMcRoyMenus.values()) {
				sbProductos.append("(" + i + ")" + producto.getNombre() + " " + producto.getPrecio() + "Ä" + "\n");
				i++;
			}
			break;
		
		case 11:
			sbProductos.append(Producto.CATEGORIAS[categoriaSeleccionada - 1] + ":" + "\n");
			for (CategoriaMcRoyMenus producto : CategoriaMcRoyMenus.values()) {
				sbProductos.append("(" + i + ")" + producto.getNombre() + " " + producto.getPrecio() + "Ä" + "\n");
				i++;
			}
			break;
		default:
			break;
		}
		
		
		return descripcion;
		
	}
	
	public void realizarPedido() {
		
	}

}
