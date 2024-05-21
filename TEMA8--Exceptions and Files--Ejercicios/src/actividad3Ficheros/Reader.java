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
		double numero2=0;
		File archivo = new File(
			 	"\\Users\\fiero\\OneDrive\\Documentos\\GitHub\\TEMA8--ExceptionsAndFiles--Ejercicios\\TEMA8--Exceptions and Files--Ejercicios\\src\\actividad3Ficheros\\Alumnos.txt");

		try (Scanner scanner = new Scanner(archivo)) {

			scanner.useDelimiter("[\\s\\t]+");

			while (scanner.hasNext()) {
				if (scanner.hasNextInt()) {
					 numero = scanner.nextInt();
					System.out.print(numero + "INT ");
					suma += numero;
					contador++;
				} 
			
	
				if (scanner.hasNextDouble()) {
					numero2 = scanner.nextDouble();
					System.out.print(numero2 + " DOUBLE");
					suma += numero2;
					contador++;
				} else {
					scanner.next();
				}
			}

				System.out.print(nombre + edad + numero +" ");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			System.out.println();
			if (contador > 0) {
				double media = (double) suma / contador;
				System.out.println("Media: " + media);
			} else {
				System.out.println("No se encontraron enteros válidos.");
			}

	}}
	

