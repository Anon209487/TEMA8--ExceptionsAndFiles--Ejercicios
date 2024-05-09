package actividad3Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {

	public static void main(String[] args) {
		int suma = 0;
		int contador = 0;
		int edad = 0;
		String nombre = "";
		double numero = 0;
		File archivo = new File(
				"\\Users\\nruiz\\git\\TEMA8--Ejercicios\\TEMA8--Exceptions and Files--Ejercicios\\src\\actividad3Ficheros\\Alumnos.txt");

		try (Scanner scanner = new Scanner(archivo)) {

			scanner.useDelimiter("[\\s\\t]+");

			while (scanner.hasNext()) {
				if (scanner.hasNextLine()) {
					nombre = scanner.nextLine();

				} else if (scanner.hasNextInt()) {
					edad = scanner.nextInt();

				} else if (scanner.hasNextDouble()) {
					numero = scanner.nextDouble();
					System.out.print(numero + " ");

				} else {

					scanner.next();
				}
				System.out.println(nombre + edad + numero);
			}

			System.out.println();
			if (contador > 0) {
				double media = (double) suma / contador;
				System.out.println("Media: " + media);
			} else {
				System.out.println("No se encontraron enteros válidos.");
			}

			System.out.println("Suma total: " + suma);
		} catch (FileNotFoundException e) {
			System.err.println("Archivo no encontrado: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Error al procesar el archivo: " + e.getMessage());
		}
	}
}
