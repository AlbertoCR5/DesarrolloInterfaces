package mcRoy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario implements IUsuario{
	
    // Patron para validar el email
	public static Pattern PATRON = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	public static final String EMAIL_USUARIO = "Rafael.prieto@iescristobaldemonroy.es";
	public static final String NOMBRE_USUARIO = "Rafael";
	public static final String APELLIDOS_USUARIO = "Prieto";
	private static final int CIFRAS_PIN = 4;

	private int idUsuario = 1, pinUsuario;
	static int puntos;
	private String email, nombre, apellidos, fechaNacimiento, direccion, telefono;
	
	//Metodo de prueba que al introducir un numero de usuario cualquiera le dara uno datos por defecto a los aributos
	public Usuario(int idUsuario) throws McRoyException {

		this.email = EMAIL_USUARIO;
		this.nombre = NOMBRE_USUARIO;
		this.apellidos = APELLIDOS_USUARIO;
		setPinUsuario(pinUsuario);
		puntos = 0;
		idUsuario++;
		
	}
	//Constructor con datos fundamentales para crear un usuario
	public Usuario(String email, String nombre, String apellidos, int pinUsuario) throws McRoyException {
	
		setEmail(email);
		this.nombre = nombre;
		this.apellidos = apellidos;
		setPinUsuario(pinUsuario);
		idUsuario++;
		puntos = 0;
	}
	//Constructor con otros datos de interes
	public Usuario(int idUsuario, String email, String nombre, String apellidos, int pinUsuario, String fechaNacimiento,
			String direccion, String telefono) throws McRoyException {
		
		this.email = email;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		setTelefono(telefono);
		setPinUsuario(pinUsuario);
		idUsuario++;
		puntos = 0;
	}

	public int getIdUsuario() {
		return idUsuario;
	}
	
	@Override
	public int getPinUsuario() {
		
		return pinUsuario;
	}	

	private void setPinUsuario(int pin) throws McRoyException {

		//Se comprueba que el pin contenga 4 cifras, si no, lanzara una excepcion
		if (String.valueOf(pin).length() != CIFRAS_PIN) {
			throw new McRoyException ("EL pin debe tener al menos 4 cifras.");
		}
		this.pinUsuario = pin;
	}

	public String getEmail() {
		return email;
	}

	/**
	 * Setter que valida que el email introducido sea correcto
	 * @param email
	 * @throws McRoyException
	 */
	public void setEmail(String email) throws McRoyException {
		
		if (!(ValidarMail(email))) {
			throw new McRoyException("El email introducido no es valido");
		}
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	@Override
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	@Override
	public String getDireccion() {
		return direccion;
	}

	@Override
	public String getTelefono() {		
		return telefono;
	}
	
	public int getPuntos() {
		return puntos;
	}
	
	public void setPuntos(int puntos) throws McRoyException {
		
		if (puntos < 0) {
			throw new McRoyException("Puntos Insuficientes");
		}
		
	}
	/**
	 * Setter que comprueba que el telefono introducido tenga 9 digitos
	 * @param telefono
	 * @throws McRoyException
	 */
	public void setTelefono(String telefono) throws McRoyException {
		
		if (telefono.length() != 9 || !(contieneSoloNumeros(telefono))) {
			throw new McRoyException("El teledono introducido no es correcto");
		}
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Usuario " + idUsuario;
	}
	
	/**
	 * Metodo que comprueba que el pin introducido sea correcto
	 * @param pinIntroducido
	 * @return boolean esPinCorrecto true o false
	 * @throws CuentaCorrienteMonroyException
	 */
	private boolean compruebaPin(int pinIntroducido) throws McRoyException {
		
		boolean esPinCorrecto = true;
		// Si pin introducido no coindice con el actual lanzara una excepcion
		if (this.pinUsuario != pinIntroducido) {
			esPinCorrecto = false;
			throw new McRoyException ("EL pin introducido es incorrecto.");		
		}
		
		return esPinCorrecto;	
	}
	
	/**
	 * Metodo que cambia el pin
	 * @param pinIntroducido
	 * @param pinNuevo
	 * @param repetirPinNuevo
	 * @throws CuentaCorrienteMonroyException
	 */
	protected void cambiarPin(int pinIntroducido, int pinNuevo, int repetirPinNuevo) throws McRoyException {
		
		// Si pin introducido no coindice con el actual lanzara una excepcion
		if (compruebaPin(pinIntroducido)) {
			//Se solicitaran el nuevo pin dos veces, si coinciden se actualizara el pin actual
			if (pinNuevo == repetirPinNuevo) {
				setPinUsuario(pinNuevo);
			}
			//Si no coinciden los pines introducidos se lanzara una excepcion
			else {
				throw new McRoyException ("Los pines introducidos no coinciden.");
			}
		}
			
	}
	
	/**
	 * Metodo que recibe por parametro un email y comprueba su validez
	 * @param email
	 * @return email valido, o no valido
	 */
	public static boolean ValidarMail(String email) {
    
        Matcher mather = PATRON.matcher(email);
        return mather.find();
    }

	/**
	 * Metodo que recibe por parametro un telefono y comprueba que solo contenga digitos
	 * @param telefono
	 * @return solo digitos, o no
	 */
	public static boolean contieneSoloNumeros(String telefono) {
	    return telefono.matches("[0-9]+");
	}
}
