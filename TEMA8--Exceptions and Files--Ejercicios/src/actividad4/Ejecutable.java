/**
 * 
 */
package actividad4;

import java.util.Scanner;

/**
 * 
 */
public class Ejecutable {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws PrecioException, NombreException {
		nuevoProducto();
	}

	private static void nuevoProducto() {
		String nombreNrticulo = "";
		double precio = 0;
		System.out.println("Introduzca nombre del articulo");
		System.out.println("Introduzca precio del precio");
		nombreNrticulo = extracted().nextLine();
		precio = extracted().nextDouble();

		try {
			Producto nuevoProducto = new Producto(nombreNrticulo, precio);
		} catch (NombreException | PrecioException e) {
			System.out.println(e.getMessage());
		}

	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}
}
