package actividad1Ficheros;

import java.io.File;
import java.util.Scanner;

public class Reader {

	public static void main(String[] args) throws Exception {
		int numero = 0;
		int contador = 0;
		File archivo = new File(
				"\\Users\\nruiz\\git\\TEMA8--Ejercicios\\TEMA8--Exceptions and Files--Ejercicios\\src\\actividad1Ficheros\\NumerosReales.txt");
		try (Scanner scanner = new Scanner(archivo)) {
			
			while (scanner.hasNextInt()) {
				System.out.print(scanner.nextInt() + " ");
				numero += scanner.nextInt();
				contador++;
			}
			System.out.println();
			System.out.println("media "+ numero/contador);
			System.out.println("suma "+numero);
		}
	}
}
