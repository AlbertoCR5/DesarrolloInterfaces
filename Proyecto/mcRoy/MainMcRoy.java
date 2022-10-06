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
				+ "\n" + "(2)Eres inversor"
				+ "\n");
		
		if (!esCliente) {
			restaurante = new RestauranteMcMonroy(solicitarString("Introduce nombre restaurante: "), solicitarString("Introduce direccion restaurante: "));
		}
		else {
			restaurante = new RestauranteMcMonroy(RestauranteMcMonroy.NOMBRE_RESTAURANTE, RestauranteMcMonroy.DIRECCION_RESTAURANTE, RestauranteMcMonroy.TELEFONO_RESTAURANTE, RestauranteMcMonroy.DESCRIPCION_RESTAURANTE, RestauranteMcMonroy.HORARIO_APERTURA_RESTAURANTE, RestauranteMcMonroy.HORARIO_CIERRE_RESTAURANTE);
		}
		
		mostrarMensaje("Bienvenido a " + restaurante.getNombre());
		boolean esUsuarioRegistrado = solicitarTipo("(1)Usuario registrado"
										+ "\n" + "(2)Nuevo Cliente"
										+ "\n");
		
		if (esUsuarioRegistrado) {
			mostrarMensaje("Introduce identificador de usuario");
			usuario = new Usuario(comprobarEntero());
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
								+ "\n" + "(2)Comer aqui"
								+ "\n");
		
		int seleccionProducto;
		do {
			int seleccionCategoria = seleccionarCategoria();
			seleccionProducto = seleccionarProducto(seleccionCategoria, pedido);
		} while (seleccionProducto == 0);
	
	}

	private static int seleccionarProducto(int seleccionCategoria, Pedido pedido) {

		int seleccionProducto, i = 0;

		do {
			mostrarMensaje("Seleccione producto");
			String nombreProductos[];
			double precioProductos[];
			int cantidadEspacios;

			switch (seleccionCategoria - 1) {

			case 0:

				nombreProductos = new String[CategoriaMcRoyMenus.values().length];
				precioProductos = new double[CategoriaMcRoyMenus.values().length];
				for (CategoriaMcRoyMenus producto : CategoriaMcRoyMenus.values()) {
					cantidadEspacios = 40;
					cantidadEspacios = cantidadEspacios - producto.getNombre().length();
					nombreProductos[i] = producto.getNombre();
					precioProductos[i] = producto.getPrecio();
					System.out.print("(" + (i + 1) + ")" + nombreProductos[i]);
					for (int j = 0; j < cantidadEspacios; j++) {
						System.out.print(" ");
					}
					if (i > 8) {
						mostrarMensaje(precioProductos[i] + "€");
					} else {
						mostrarMensaje(" " + precioProductos[i] + "€");
					}
					i++;
				}
				break;

			case 1:

				nombreProductos = new String[CategoriaMcRoySandwiches.values().length];
				precioProductos = new double[CategoriaMcRoySandwiches.values().length];
				for (CategoriaMcRoySandwiches producto : CategoriaMcRoySandwiches.values()) {
					cantidadEspacios = 40;
					cantidadEspacios = cantidadEspacios - producto.getNombre().length();
					nombreProductos[i] = producto.getNombre();
					precioProductos[i] = producto.getPrecio();
					System.out.print("(" + (i + 1) + ")" + nombreProductos[i]);
					for (int j = 0; j < cantidadEspacios; j++) {
						System.out.print(" ");
					}
					if (i > 8) {
						mostrarMensaje(precioProductos[i] + "€");
					} else {
						mostrarMensaje(" " + precioProductos[i] + "€");
					}
					i++;
				}
				break;

			case 2:

				nombreProductos = new String[CategoriaMonroyStyle.values().length];
				precioProductos = new double[CategoriaMonroyStyle.values().length];
				for (CategoriaMonroyStyle producto : CategoriaMonroyStyle.values()) {
					cantidadEspacios = 40;
					cantidadEspacios = cantidadEspacios - producto.getNombre().length();
					nombreProductos[i] = producto.getNombre();
					precioProductos[i] = producto.getPrecio();
					System.out.print("(" + (i + 1) + ")" + nombreProductos[i]);
					for (int j = 0; j < cantidadEspacios; j++) {
						System.out.print(" ");
					}
					if (i > 8) {
						mostrarMensaje(precioProductos[i] + "€");
					} else {
						mostrarMensaje(" " + precioProductos[i] + "€");
					}
					i++;
				}
				break;

			case 3:

				nombreProductos = new String[CategoriaAsignatureCollection.values().length];
				precioProductos = new double[CategoriaAsignatureCollection.values().length];
				for (CategoriaAsignatureCollection producto : CategoriaAsignatureCollection.values()) {
					cantidadEspacios = 40;
					cantidadEspacios = cantidadEspacios - producto.getNombre().length();
					nombreProductos[i] = producto.getNombre();
					precioProductos[i] = producto.getPrecio();
					System.out.print("(" + (i + 1) + ")" + nombreProductos[i]);
					for (int j = 0; j < cantidadEspacios; j++) {
						System.out.print(" ");
					}
					if (i > 8) {
						mostrarMensaje(precioProductos[i] + "€");
					} else {
						mostrarMensaje(" " + precioProductos[i] + "€");
					}
					i++;
				}
				break;

			case 4:

				nombreProductos = new String[CategoriaGrandMcRoyExtreme.values().length];
				precioProductos = new double[CategoriaGrandMcRoyExtreme.values().length];
				for (CategoriaGrandMcRoyExtreme producto : CategoriaGrandMcRoyExtreme.values()) {
					cantidadEspacios = 40;
					cantidadEspacios = cantidadEspacios - producto.getNombre().length();
					nombreProductos[i] = producto.getNombre();
					precioProductos[i] = producto.getPrecio();
					System.out.print("(" + (i + 1) + ")" + nombreProductos[i]);
					for (int j = 0; j < cantidadEspacios; j++) {
						System.out.print(" ");
					}
					if (i > 8) {
						mostrarMensaje(precioProductos[i] + "€");
					} else {
						mostrarMensaje(" " + precioProductos[i] + "€");
					}
					i++;
				}
				break;

			case 5:

				nombreProductos = new String[CategoriaMcRoyEnsaladas.values().length];
				precioProductos = new double[CategoriaMcRoyEnsaladas.values().length];
				for (CategoriaMcRoyEnsaladas producto : CategoriaMcRoyEnsaladas.values()) {
					cantidadEspacios = 40;
					cantidadEspacios = cantidadEspacios - producto.getNombre().length();
					nombreProductos[i] = producto.getNombre();
					precioProductos[i] = producto.getPrecio();
					System.out.print("(" + (i + 1) + ")" + nombreProductos[i]);
					for (int j = 0; j < cantidadEspacios; j++) {
						System.out.print(" ");
					}
					if (i > 8) {
						mostrarMensaje(precioProductos[i] + "€");
					} else {
						mostrarMensaje(" " + precioProductos[i] + "€");
					}
					i++;
				}
				break;

			case 6:
				
				for (CategoriaHappyMealRoy producto : CategoriaHappyMealRoy.values()) {					
					if (producto.equals(CategoriaHappyMealRoy.PRINCIPAL)) {
						nombreProductos = new String[Producto.PRINCIPAL_HAPPYMEALROY.length];
						for (int j = 0; j < Producto.PRINCIPAL_HAPPYMEALROY.length; j++) {
							nombreProductos[j] = Producto.PRINCIPAL_HAPPYMEALROY[j];
							System.out.println("(" + (j + 1) + ")" + nombreProductos[j]);
						}
						mostrarMensaje("(0)Volver a Categorias");
						
					}
					seleccionProducto = comprobarEntero();
					if (producto.equals(CategoriaHappyMealRoy.COMPLEMENTO) && seleccionProducto != 0) {
						nombreProductos = new String[Producto.COMPLEMENTO_HAPPYMEALROY.length];
						for (int j = 0; j < Producto.COMPLEMENTO_HAPPYMEALROY.length; j++) {
							nombreProductos[j] = Producto.COMPLEMENTO_HAPPYMEALROY[j];
							System.out.println("(" + (j + 1) + ")" + nombreProductos[j]);
						}
						mostrarMensaje("(0)Volver a Categorias");
						seleccionProducto = comprobarEntero();
					}

					if (producto.equals(CategoriaHappyMealRoy.BEBIDA) && seleccionProducto != 0) {
						nombreProductos = new String[Producto.BEBIDA_HAPPYMEALROY.length];
						for (int j = 0; j < Producto.BEBIDA_HAPPYMEALROY.length; j++) {
							nombreProductos[j] = Producto.BEBIDA_HAPPYMEALROY[j];
							System.out.println("(" + (j + 1) + ")" + nombreProductos[j]);
						}
						mostrarMensaje("(0)Volver a Categorias");
						seleccionProducto = comprobarEntero();
					}

					if (producto.equals(CategoriaHappyMealRoy.POSTRE) && seleccionProducto != 0) {
						nombreProductos = new String[Producto.POSTRE_HAPPYMEALROY.length];
						for (int j = 0; j < Producto.POSTRE_HAPPYMEALROY.length; j++) {
							nombreProductos[j] = Producto.POSTRE_HAPPYMEALROY[j];
							System.out.println("(" + (j + 1) + ")" + nombreProductos[j]);
						}
						seleccionProducto = comprobarEntero();
					}
				}				
				break;

			case 7:

				nombreProductos = new String[CategoriaPostresHeladosRoy.values().length];
				precioProductos = new double[CategoriaPostresHeladosRoy.values().length];
				for (CategoriaPostresHeladosRoy producto : CategoriaPostresHeladosRoy.values()) {
					cantidadEspacios = 40;
					cantidadEspacios = cantidadEspacios - producto.getNombre().length();
					nombreProductos[i] = producto.getNombre();
					precioProductos[i] = producto.getPrecio();
					System.out.print("(" + (i + 1) + ")" + nombreProductos[i]);
					for (int j = 0; j < cantidadEspacios; j++) {
						System.out.print(" ");
					}
					if (i > 8) {
						mostrarMensaje(precioProductos[i] + "€");
					} else {
						mostrarMensaje(" " + precioProductos[i] + "€");
					}
					i++;
				}
				break;

			case 8:

				nombreProductos = new String[CategoriaBebidasRoy.values().length];
				precioProductos = new double[CategoriaBebidasRoy.values().length];
				for (CategoriaBebidasRoy producto : CategoriaBebidasRoy.values()) {
					cantidadEspacios = 40;
					cantidadEspacios = cantidadEspacios - producto.getNombre().length();
					nombreProductos[i] = producto.getNombre();
					precioProductos[i] = producto.getPrecio();
					System.out.print("(" + (i + 1) + ")" + nombreProductos[i]);
					for (int j = 0; j < cantidadEspacios; j++) {
						System.out.print(" ");
					}
					if (i > 8) {
						mostrarMensaje(precioProductos[i] + "€");
					} else {
						mostrarMensaje(" " + precioProductos[i] + "€");
					}
					i++;
				}
				break;

			case 9:

				nombreProductos = new String[CategoriaComplementosRoy.values().length];
				precioProductos = new double[CategoriaComplementosRoy.values().length];
				for (CategoriaComplementosRoy producto : CategoriaComplementosRoy.values()) {
					cantidadEspacios = 40;
					cantidadEspacios = cantidadEspacios - producto.getNombre().length();
					nombreProductos[i] = producto.getNombre();
					precioProductos[i] = producto.getPrecio();
					System.out.print("(" + (i + 1) + ")" + nombreProductos[i]);
					for (int j = 0; j < cantidadEspacios; j++) {
						System.out.print(" ");
					}
					if (i > 8) {
						mostrarMensaje(precioProductos[i] + "€");
					} else {
						mostrarMensaje(" " + precioProductos[i] + "€");
					}
					i++;
				}
				break;

			case 10:
				
				nombreProductos = new String[CategoriaSalsasRoy.values().length];
				precioProductos = new double[CategoriaSalsasRoy.values().length];
				for (CategoriaSalsasRoy producto : CategoriaSalsasRoy.values()) {
					cantidadEspacios = 40;
					cantidadEspacios = cantidadEspacios - producto.getNombre().length();
					nombreProductos[i] = producto.getNombre();
					precioProductos[i] = producto.getPrecio();
					System.out.print("(" + (i + 1) + ")" + nombreProductos[i]);
					for (int j = 0; j < cantidadEspacios; j++) {
						System.out.print(" ");
					}
					if (i > 8) {
						mostrarMensaje(precioProductos[i] + "€");
					} else {
						mostrarMensaje(" " + precioProductos[i] + "€");
					}
					i++;
				}
				break;

			default:
				mostrarMensaje("Categoria seleccionada incorrecta");

			}
			mostrarMensaje("(0)Volver a Categorias");
			seleccionProducto = comprobarEntero();
		} while (seleccionProducto < 0 || seleccionProducto > i);System.out.println("orchia");

		pedido.annadirProducto(CategoriaHappyMealRoy.POSTRE.getPrecio());
		return seleccionProducto;
	}


	private static int seleccionarCategoria() {
		
		int seleccionCategoria;
		
		do {
			mostrarMensaje("Seleccione categoria");
			for (int i = 0; i < Categoria.CATEGORIAS.length; i++) {
				System.out.println("(" + (i+1) + ")" + Categoria.CATEGORIAS[i]);
			}
			seleccionCategoria = comprobarEntero();
		} while (seleccionCategoria <= 0 || seleccionCategoria > Producto.CATEGORIAS.length);
		
		return seleccionCategoria;
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
			tipo = comprobarEntero();
		} while (tipo < 1 || tipo > 2);
		
		
		if (tipo == 2) {
			esValidado = false;
		}
		
		return esValidado;
	}

	private static int comprobarEntero() {
		
		int numero;

		numero = Integer.parseInt(teclado.nextLine());
				
		return numero;
	}

	private static void mostrarMensaje(String string) {
		
		System.out.println(string);
		
	}

}
