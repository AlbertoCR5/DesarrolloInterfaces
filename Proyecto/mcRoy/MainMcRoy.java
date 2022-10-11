package mcRoy;

import java.util.Scanner;

public class MainMcRoy {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		RestauranteMcMonroy restaurante;
		Usuario usuario = null;
		Pedido pedido = new Pedido();
		
		//Se solicita al usuario si es cliente o inversor
		boolean esCliente = solicitarTipo("Bienvenido a McMonroy" + "\n" + "(1)Eres Cliente" + "\n" + "(2)Eres Inversor");

		//Si es inversor, se le soliciran los datos del restaurante
		if (!esCliente) {
			restaurante = new RestauranteMcMonroy(solicitarString("Introduce nombre restaurante: "),
					solicitarString("Introduce direccion restaurante: "), comprobarEntero("Establece un codigo de seguridad: "));
			mostrarMensaje("Restaurante creado correctamente" + "\n" + restaurante.toString());
		} else { //Si es cliente se creara un restaurante con datos por defecto
			restaurante = new RestauranteMcMonroy();			
			mostrarMensaje("Bienvenido a " + restaurante.getNombre());
			//Se solicita al cliente si es usuario registrado o nuevo cliente
			boolean esUsuarioRegistrado = solicitarTipo("(1)Usuario registrado" + "\n" + "(2)Nuevo Cliente");
			
			try {
				if (esUsuarioRegistrado) {
					// Se le solicita al usuario registradi el numero de usuario, como prueba,
					// cualquier numero vale

					usuario = new Usuario(comprobarEntero("Introduce identificador de usuario:"));

				} else {// Si no es usuario registrado, se le solicitaran los datos

					usuario = new Usuario(solicitarString("Introduce E-mail: "), solicitarString("Introduce nombre: "),
							solicitarString("Introduce apellidos: "), comprobarEntero("Introduce un pin valido"));

				}
			} catch (McRoyException e) {
				mostrarMensaje("" + e);;
			}
			
			//Se le solicita al cliente si el pedido es para llevar o comer en restaurante
			mostrarMensaje("Hola " + usuario.getNombre());
			pedido.esParaLlevar = solicitarTipo("(1)Para LLevar" + "\n" + "(2)Comer aqui");
			
			char respuesta;
			//Se solicita al cliente que escoja un producto entre las diferentes categorias y se le preguntara si desea annadir algo mas
			do {
				int seleccionProducto;
				do {
					int seleccionCategoria = seleccionarCategoria();
					seleccionProducto = seleccionarProducto(seleccionCategoria, pedido);
				} while (seleccionProducto == -1);
				respuesta = solicitarRespuesta("Desea añadir algo mas?(S/N)");
			} while (respuesta == 'S');
			
			//Si no desea nada mas, se preguntara al cliente si el servicio es a mesa, o si recogera el pedido en el mostrador
			pedido.esServicioMesa = solicitarTipo("(1)Servir en mesa" + "\n" + "(2)Recoger en mostrador" + "\n");
			
			//Muestra un ticket y el programa finaliza
			if (!pedido.esServicioMesa) {
				mostrarMensaje("                " + pedido.getIdPedidoPantalla());
			}
			mostrarMensaje("           " + restaurante.getNombre().concat("\n").concat(restaurante.getDireccion()).concat("\n").concat(pedido.toString()));
		}
	
	}

	private static int seleccionarProducto(int seleccionCategoria, Pedido pedido) {

		int seleccionProducto = 0, seleccionSirope, seleccionTopping, cantidadEspacios, i, k, l;
		String nombreProductos[], tipoSirope[], tipoTopping[];
		double precioProductos[];

		mostrarMensaje("Seleccione producto");

		switch (seleccionCategoria - 1) {

		case 0:
			do {
				i = 0;
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
				seleccionProducto = comprobarEntero("(0)Volver a Categorias") - 1;
			} while (seleccionProducto < -1 || seleccionProducto >= nombreProductos.length);

			if (seleccionProducto != -1) {
				pedido.annadirProducto(precioProductos[seleccionProducto], nombreProductos[seleccionProducto]);
			}
			break;

		case 1:
			do {
				i = 0;
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
				seleccionProducto = comprobarEntero("(0)Volver a Categorias") - 1;
			} while (seleccionProducto < -1 || seleccionProducto >= nombreProductos.length);

			if (seleccionProducto != -1) {
				pedido.annadirProducto(precioProductos[seleccionProducto], nombreProductos[seleccionProducto]);
			}
			break;

		case 2:
			do {
				i = 0;
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
				seleccionProducto = comprobarEntero("(0)Volver a Categorias") - 1;
			} while (seleccionProducto < -1 || seleccionProducto >= nombreProductos.length);

			if (seleccionProducto != -1) {
				pedido.annadirProducto(precioProductos[seleccionProducto], nombreProductos[seleccionProducto]);
			}
			break;

		case 3:
			do {
				i = 0;
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
				seleccionProducto = comprobarEntero("(0)Volver a Categorias") - 1;
			} while (seleccionProducto < -1 || seleccionProducto >= nombreProductos.length);

			if (seleccionProducto != -1) {
				pedido.annadirProducto(precioProductos[seleccionProducto], nombreProductos[seleccionProducto]);
			}
			break;

		case 4:
			do {
				i = 0;
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
				seleccionProducto = comprobarEntero("(0)Volver a Categorias") - 1;
			} while (seleccionProducto < -1 || seleccionProducto >= nombreProductos.length);

			if (seleccionProducto != -1) {
				pedido.annadirProducto(precioProductos[seleccionProducto], nombreProductos[seleccionProducto]);
			}
			break;

		case 5:
			do {
				i = 0;
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
				seleccionProducto = comprobarEntero("(0)Volver a Categorias") - 1;
			} while (seleccionProducto < -1 || seleccionProducto >= nombreProductos.length);

			if (seleccionProducto != -1) {
				pedido.annadirProducto(precioProductos[seleccionProducto], nombreProductos[seleccionProducto]);
			}
			break;

		case 6:
			do {
				for (CategoriaHappyMealRoy producto : CategoriaHappyMealRoy.values()) {
					if (producto.equals(CategoriaHappyMealRoy.PRINCIPAL)) {
						nombreProductos = new String[Producto.PRINCIPAL_HAPPYMEALROY.length];
						mostrarMensaje("Seleccione Principal");
						for (int j = 0; j < Producto.PRINCIPAL_HAPPYMEALROY.length; j++) {
							nombreProductos[j] = Producto.PRINCIPAL_HAPPYMEALROY[j];
							System.out.println("(" + (j + 1) + ")" + nombreProductos[j]);
						}
						mostrarMensaje("(0)Volver a Categorias");
						do {
							seleccionProducto = comprobarEntero("") - 1;
						} while (seleccionProducto < -1 || seleccionProducto > nombreProductos.length);
					}

					if (producto.equals(CategoriaHappyMealRoy.COMPLEMENTO) && seleccionProducto != -1) {
						nombreProductos = new String[Producto.COMPLEMENTO_HAPPYMEALROY.length];
						mostrarMensaje("Seleccione Complemento");
						for (int j = 0; j < Producto.COMPLEMENTO_HAPPYMEALROY.length; j++) {
							nombreProductos[j] = Producto.COMPLEMENTO_HAPPYMEALROY[j];
							System.out.println("(" + (j + 1) + ")" + nombreProductos[j]);
						}
						mostrarMensaje("(0)Volver a Categorias");
						do {
							seleccionProducto = comprobarEntero("") - 1;
						} while (seleccionProducto < -1 || seleccionProducto > nombreProductos.length);
					}

					if (producto.equals(CategoriaHappyMealRoy.BEBIDA) && seleccionProducto != -1) {
						nombreProductos = new String[Producto.BEBIDA_HAPPYMEALROY.length];
						mostrarMensaje("Seleccione Bebida");
						for (int j = 0; j < Producto.BEBIDA_HAPPYMEALROY.length; j++) {
							nombreProductos[j] = Producto.BEBIDA_HAPPYMEALROY[j];
							System.out.println("(" + (j + 1) + ")" + nombreProductos[j]);
						}
						mostrarMensaje("(0)Volver a Categorias");
						do {
							seleccionProducto = comprobarEntero("") - 1;
						} while (seleccionProducto < -1 || seleccionProducto > nombreProductos.length);
					}

					if (producto.equals(CategoriaHappyMealRoy.POSTRE) && seleccionProducto != -1) {
						nombreProductos = new String[Producto.POSTRE_HAPPYMEALROY.length];
						mostrarMensaje("Seleccione Postre");
						for (int j = 0; j < Producto.POSTRE_HAPPYMEALROY.length; j++) {
							nombreProductos[j] = Producto.POSTRE_HAPPYMEALROY[j];
							System.out.println("(" + (j + 1) + ")" + nombreProductos[j]);
						}
						mostrarMensaje("(0)Volver a Categorias");
						do {
							seleccionProducto = comprobarEntero("") - 1;
						} while (seleccionProducto < -1 || seleccionProducto >= nombreProductos.length);
					}
				}
			} while (seleccionProducto < -1);

			if (seleccionProducto != -1) {
				pedido.annadirProducto(CategoriaHappyMealRoy.POSTRE.getPrecio(), "Happy MealRoy");
			}
			break;

		case 7:
			do {
				do {
					i = 0;
					nombreProductos = new String[CategoriaPostresHeladosRoy.values().length];
					precioProductos = new double[CategoriaPostresHeladosRoy.values().length];
					tipoSirope = new String[TipoSirope.values().length];
					tipoTopping = new String[TipoTopping.values().length];
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
					seleccionProducto = comprobarEntero("(0)Volver a Categorias") - 1;
				} while (seleccionProducto < -1 || seleccionProducto > nombreProductos.length);

				if (seleccionProducto == 0 || seleccionProducto == 1 || seleccionProducto == 3) {
					do {
						k = 0;
						for (TipoSirope sirope : TipoSirope.values()) {
							tipoSirope[k] = sirope.getTipoSirope();
							mostrarMensaje("(" + (k + 1) + ")" + tipoSirope[k]);
							k++;
						}
						seleccionSirope = comprobarEntero("(0)Volver a Categorias") - 1;
					} while (seleccionSirope < -1 || seleccionSirope > tipoSirope.length);
					if (seleccionSirope == -1) {
						seleccionProducto = -1;
					}

				}

				if (seleccionProducto == 0 || seleccionProducto == 1) {
					do {
						l = 0;
						for (TipoTopping topping : TipoTopping.values()) {
							tipoTopping[l] = topping.getTipoTopping();
							mostrarMensaje("(" + (l + 1) + ")" + tipoTopping[l]);
							l++;
						}
						seleccionTopping = comprobarEntero("(0)Volver a Categorias") - 1;
						if (seleccionTopping == -1) {
							seleccionProducto = -1;
						}
					} while (seleccionTopping < -1 || seleccionTopping > tipoTopping.length);

				}
			} while (seleccionProducto < -1 || seleccionProducto >= nombreProductos.length);

			if (seleccionProducto != -1) {
				pedido.annadirProducto(precioProductos[seleccionProducto], nombreProductos[seleccionProducto]);
			}
			break;

		case 8:
			do {
				i = 0;
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
				seleccionProducto = comprobarEntero("(0)Volver a Categorias") - 1;
			} while (seleccionProducto < -1 || seleccionProducto >= nombreProductos.length);

			if (seleccionProducto != -1) {
				pedido.annadirProducto(precioProductos[seleccionProducto], nombreProductos[seleccionProducto]);
			}
			break;

		case 9:
			do {
				i = 0;
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
				seleccionProducto = comprobarEntero("(0)Volver a Categorias") - 1;
			} while (seleccionProducto < -1 || seleccionProducto >= nombreProductos.length);

			if (seleccionProducto != -1) {
				pedido.annadirProducto(precioProductos[seleccionProducto], nombreProductos[seleccionProducto]);
			}
			break;

		case 10:
			do {
				i = 0;
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
				seleccionProducto = comprobarEntero("(0)Volver a Categorias") - 1;
			} while (seleccionProducto < -1 || seleccionProducto >= nombreProductos.length);

			if (seleccionProducto != -1) {
				pedido.annadirProducto(precioProductos[seleccionProducto], nombreProductos[seleccionProducto]);
			}
			break;

		default:
			mostrarMensaje("Categoria seleccionada incorrecta");
		}
		return seleccionProducto;

	}

	private static char solicitarRespuesta(String string) {

		char respuesta;

		do {
			mostrarMensaje(string);
			respuesta = teclado.nextLine().toUpperCase().charAt(0);
		} while (respuesta != 'S' && respuesta != 'N');

		return respuesta;
	}

	private static int seleccionarCategoria() {

		int seleccionCategoria;

		do {
			mostrarMensaje("Seleccione categoria");
			for (int i = 0; i < Categoria.CATEGORIAS.length; i++) {
				mostrarMensaje("(" + (i + 1) + ")" + Categoria.CATEGORIAS[i]);
			}
			seleccionCategoria = comprobarEntero("");
		} while (seleccionCategoria <= 0 || seleccionCategoria > Producto.CATEGORIAS.length);

		return seleccionCategoria;
	}

	private static String solicitarString(String string) {

		String cadena;
		
		do {
			mostrarMensaje(string);
			cadena = teclado.nextLine();
		} while (cadena.length() <= 0);

		return cadena;
	}

	private static boolean solicitarTipo(String string) {

		boolean esValidado = true;
		int tipo;

		do {
			tipo = comprobarEntero(string);
		} while (tipo < 1 || tipo > 2);

		if (tipo == 2) {
			esValidado = false;
		}

		return esValidado;
	}

	private static int comprobarEntero(String string) {

		int numero = 0;
		boolean esDigito;

		mostrarMensaje(string);
		do {
			try {
				esDigito = true;				
				numero = Integer.parseInt(teclado.nextLine());
			} catch (NumberFormatException e) {
				mostrarMensaje("Introduce un digito");
				esDigito = false;
			}
		} while (!esDigito);

		return numero;
	}

	private static void mostrarMensaje(String string) {

		System.out.println(string);
	}
}
