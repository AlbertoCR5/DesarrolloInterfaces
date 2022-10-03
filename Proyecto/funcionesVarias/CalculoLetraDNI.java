package funcionesVarias;

public class CalculoLetraDNI {

	public static final char CARACTERES[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
	public static final int RESTO = 23;
	
	String numeroDNI;

	public CalculoLetraDNI(String dni) {
		
		this.numeroDNI = dni;
	}

	public String getDni() {
		return numeroDNI;
	}

	public void setDni(String numeroDNI) throws FuncionesVariasException {
		
		if (numeroDNI.length() != 8 || !(comprobarDNI(numeroDNI))) {
			throw new FuncionesVariasException(Calculadora.MENSAJE_ERROR + ", El DNI introducido es incorrecto");
		}
		
		int numeroEnteroDNI = convertirStringAInt(numeroDNI);
		char letraDNI = calcularLetraDNI(numeroEnteroDNI);
		
		this.numeroDNI = numeroDNI + letraDNI;
	}
	
	private boolean comprobarDNI(String numeroDNI) {
		
		char caracterDNI;
		boolean esCorrectoDNI = true;

		for (int i = 0; i < numeroDNI.length() && esCorrectoDNI == true; i++) {
			caracterDNI = numeroDNI.charAt(i);

			if (Character.isLetter(caracterDNI)) {
				esCorrectoDNI = false;
			}

		}

		return esCorrectoDNI;
	}
	
	private int convertirStringAInt(String numeroDNI) {
		
		int numeroEnteroDNI = Integer.valueOf(numeroDNI);

		return numeroEnteroDNI;
	}
	
	private char calcularLetraDNI(int numeroEnteroDNI) {
		
		int letraDNI = numeroEnteroDNI % RESTO;
		
		return CARACTERES[letraDNI];
	}
	
}
