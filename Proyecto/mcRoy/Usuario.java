package mcRoy;

import java.util.Random;

public class Usuario {
	
	public static final String EMAIL_USUARIO = "Rafael.prieto@iescristobaldemonroy.es";
	public static final String NOMBRE_USUARIO = "Rafael";
	public static final String APELLIDOS_USUARIO = "Prieto";
	
	Random idUsuarioAleatorio = new Random();
	int idUsuario = idUsuarioAleatorio.nextInt(999999999)+1;
	String email, nombre, apellidos;
	
	public Usuario(int idUsuario) {

		this.idUsuario = idUsuario;
		this.email = EMAIL_USUARIO;
		this.nombre = NOMBRE_USUARIO;
		this.apellidos = APELLIDOS_USUARIO;
	}

	public Usuario(int idUsuario, String email, String nombre, String apellidos) {
	
		this.email = email;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.idUsuario++;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
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

	
}
