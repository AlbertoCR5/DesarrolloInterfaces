package mcRoy;

import java.util.Scanner;

public class MainMcRoy {

	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		RestauranteMcMonroy restaurante;
		Usuario usuario = null;
		Pedido pedido = new Pedido();
		boolean esCliente = solicitarTipo("Bienvenido a McMonroy"
				+ "\n" + "(1)Eres cliente"
				+ "\n" + "(2)Eres inversor");
		
		if (!esCliente) {
			restaurante = new RestauranteMcMonroy(solicitarString("Introduce nombre restaurante: "), solicitarString("Introduce direccion restaurante: "));
		}
		else {
			restaurante = new RestauranteMcMonroy(RestauranteMcMonroy.NOMBRE_RESTAURANTE, RestauranteMcMonroy.DIRECCION_RESTAURANTE, RestauranteMcMonroy.TELEFONO_RESTAURANTE, RestauranteMcMonroy.DESCRIPCION_RESTAURANTE, RestauranteMcMonroy.HORARIO_APERTURA_RESTAURANTE, RestauranteMcMonroy.HORARIO_CIERRE_RESTAURANTE);
		}
		
		mostrarMensaje("Bienvenido a " + restaurante.getNombre());
		boolean esUsuarioRegistrado = solicitarTipo("(1)Usuario registrado"
										+ "\n" + "(2)Nuevo Cliente");
		
		if (esUsuarioRegistrado) {
			usuario = new Usuario(comprobarEntero("Introduce identificador de usuario"));
		}
		else {
			try {
				usuario = new Usuario(solicitarString("Introduce E-mail: "), solicitarString("Introduce nombre: "), solicitarString("Introduce apellidos: "));
			} catch (McRoyException e) {
				e.getMessage();
			}
		}
		
		mostrarMensaje("Hola " + usuario.getNombre());
		pedido.esParaLlevar = solicitarTipo("(1)Para LLevar"
								+ "\n" + "(2)Comer aqui");

		int seleccionarCategoria;
		int seleccionarProducto;
		try {
			do {
				mostrarMensaje(restaurante.mostrarCategorias());
				seleccionarCategoria = comprobarEntero("Seleccione categoria");
			} while (seleccionarCategoria <= 0 || seleccionarCategoria > Producto.CATEGORIAS.length);
			
			do {
				mostrarMensaje(restaurante.mostrarProductos(seleccionarCategoria));
				seleccionarProducto = comprobarEntero("Seleccione producto");
			} while (seleccionarProducto < 0 || seleccionarProducto > restaurante.mostrarProductos(seleccionarCategoria).length());
			//pedido.annadirProducto(restaurante.mostrarProductos(seleccionarCategoria));
		} catch (McRoyException e) {
			e.printStackTrace();
		}
		
			
		
	}


	private static String solicitarString(String string) {
		
		System.out.println(string);
		String cadena = comprobarString();
		
		return cadena;
	}

	private static String comprobarString() {
		
		String cadena = teclado.nextLine();		
		
		return cadena;
	}

	private static boolean solicitarTipo(String string) {
		
		boolean esValidado = true;
		int tipo;
		
		do {
			System.out.print(string);
			tipo = comprobarEntero("");
		} while (tipo < 1 || tipo > 2);
		
		
		if (tipo == 2) {
			esValidado = false;
		}
		
		return esValidado;
	}

	private static int comprobarEntero(String string) {
		
		int numero = 0;
		
		do {
			try {
				System.out.println(string);
				numero = Integer.parseInt(teclado.nextLine());
			} catch (NumberFormatException e) {
				e.getMessage();
			}
		} while (numero <= 0);
				
		return numero;
	}

	private static void mostrarMensaje(String string) {
		
		System.out.println(string);
		
	}

}
