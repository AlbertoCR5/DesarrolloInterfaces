package mcRoy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {
	
    // Patron para validar el email
	public static Pattern PATRON = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	public static final String EMAIL_USUARIO = "Rafael.prieto@iescristobaldemonroy.es";
	public static final String NOMBRE_USUARIO = "Rafael";
	public static final String APELLIDOS_USUARIO = "Prieto";

	int idUsuario = 1;
	private String email, nombre, apellidos;
	
	public Usuario(int idUsuario) {

		this.idUsuario = idUsuario;
		this.email = EMAIL_USUARIO;
		this.nombre = NOMBRE_USUARIO;
		this.apellidos = APELLIDOS_USUARIO;
	}

	public Usuario(String email, String nombre, String apellidos) throws McRoyException {
	
		setEmail(email);
		this.nombre = nombre;
		this.apellidos = apellidos;
		idUsuario++;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public String getEmail() {
		return email;
	}

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
	public String toString() {
		return "Usuario " + idUsuario;
	}

	public static boolean ValidarMail(String email) {
    
        Matcher mather = PATRON.matcher(email);
        return mather.find();
    }
	
}
