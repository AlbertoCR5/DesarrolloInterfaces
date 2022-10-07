package mcRoy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario implements IUsuario{
	
    // Patron para validar el email
	public static Pattern PATRON = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	public static final String EMAIL_USUARIO = "Rafael.prieto@iescristobaldemonroy.es";
	public static final String NOMBRE_USUARIO = "Rafael";
	public static final String APELLIDOS_USUARIO = "Prieto";

	int idUsuario = 1;
	private String email, nombre, apellidos, fechaNacimiento, direccion, telefono;
	
	//Metodo de prueba que al introducir un numero de usuario cualquiera le dara uno datos por defecto a los aributos
	public Usuario(int idUsuario) {

		this.idUsuario = idUsuario;
		this.email = EMAIL_USUARIO;
		this.nombre = NOMBRE_USUARIO;
		this.apellidos = APELLIDOS_USUARIO;
	}
	//Constructor con datos fundamentales para crear un usuario
	public Usuario(String email, String nombre, String apellidos) throws McRoyException {
	
		setEmail(email);
		this.nombre = nombre;
		this.apellidos = apellidos;
		idUsuario++;
	}
	//Constructor con otros datos de interes
	public Usuario(int idUsuario, String email, String nombre, String apellidos, String fechaNacimiento,
			String direccion, String telefono) throws McRoyException {
		
		this.email = email;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		setTelefono(telefono);;
		idUsuario++;
	}

	public int getIdUsuario() {
		return idUsuario;
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
