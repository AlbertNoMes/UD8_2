/*
 * AUTOR: ALBERT NOTARIO MESTRES
 * DATA: 24/01/22
 */

package main;

import java.util.Random;

public class Password {

	// DEFINIMOS ATRIBUTOS DE CLASE
	private int longitud;
	private String password;

	// CONSTRUCTOR POR DEFECTO
	public Password() {

		this.longitud = 9;
		this.password = "admin1234";
	}

	// CONSTRUCTOR CON LONGITUD Y EL RANDOM
	public Password(int longitud) {

		this.longitud = longitud;
		this.password = randomPassword(longitud);
	}

	// METODO RANDOM
	private String randomPassword(int longitud) {
		String pass = "";
		Random rnd = new Random();
		for (int i = 0; i < longitud; i++) {
			pass += (char) (rnd.nextInt(91) + 65);
		}

		return pass;
	}

	// GETTERS Y SETTERS
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// METODO TOSTRING
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + password + "]";
	}
}