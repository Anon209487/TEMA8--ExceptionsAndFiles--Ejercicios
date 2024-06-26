/**
 * 
 */
package actividad3Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 */
public class Reader {
	public static void main(String[] args) {

		// Lista donde vamos a guardar los viajes
		String linea = "";
		String nombre = "";
		// Variable donde guardaremos el destino del viaje
		int edad = 0;
		int contador = 0;
		double mediaedad = 0;
		double mediaaltura = 0;
		// Variable donde guardaremos el precio del viaje
		double altura = 0;

		// Objeto bufferedReader
		BufferedReader reader = null;

		try {

			// Hacemos que el objeto pueda coger los datos de nuestro archivo txt
			reader = new BufferedReader(new FileReader("src/actividad3Ficheros/Alumnos.txt"));

			// Leemos la primera l�nea
			linea = reader.readLine();
			// Bucle para ir metiendo en el array datos los datos de los viajes
			while (linea != null) {

				// Array donde introduciremos los datos del viaje
				String[] datos = linea.split(" ");

				// El destino ser� el primer dato
				nombre = datos[0];
				// La fecha ser� el segundo dato
				edad = Integer.parseInt(datos[1]);

				// El precio ser� el tercer dato
				altura = Double.parseDouble(datos[2]);
				System.out.println(nombre + " " + edad + " " + altura);
				contador++;
				mediaedad += edad;
				mediaaltura += altura;
				// Leemos la siguiente l�nea
				linea = reader.readLine();
			}
			mediaedad = mediaedad / contador;
			mediaaltura = mediaaltura / contador;
			System.out.println("la media de edad es : " + mediaedad + " la media de altura es : " + mediaaltura);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
