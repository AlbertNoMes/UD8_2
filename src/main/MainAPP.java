/*
 * AUTOR: ALBERT NOTARIO MESTRES
 * DATA: 24/01/22
 */

package main;

public class MainAPP {

	public static void main(String[] args) {

		Password pass1 = new Password();
		Password pass2 = new Password(20);

		System.out.println(pass1.toString());
		System.out.println(pass2.toString());

	}
}