/**
 * 
 */
package actividad1;

import java.util.Scanner;

/**
 * 
 */
public class Ejecutable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		doubleError(scanner);
		intError(scanner);

	}

	/**
	 * @param scanner
	 */
	private static void intError(Scanner scanner) {
		System.out.println("Introduce un int");
		int numeroInt = UtilsJava.readInt(scanner);
		System.out.println("El valor int introducido es: " + numeroInt);
	}

	/**
	 * @param scanner
	 */
	private static void doubleError(Scanner scanner) {
		System.out.println("Introduce un double");
		double numeroDouble = UtilsJava.readDouble(scanner);
		System.out.println("El valor double introducido es: " + numeroDouble);
	}
}
