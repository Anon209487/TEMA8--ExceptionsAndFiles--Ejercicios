/**
 * 
 */
package actividad7Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 */
public class Reader {

	public static void leeerTxt() {

		// Lista donde vamos a guardar los viajes
		String linea = "";
		// Creamos un objeto tipo viaje sin parámetros
		Contacto contacto;
		String nombre = "";
		// Variable donde guardaremos el destino del viaje
		int numero = 0;

		// Variable donde guardaremos el precio del viaje

		// Objeto bufferedReader
		BufferedReader reader = null;

		try {

			// Hacemos que el objeto pueda coger los datos de nuestro archivo txt
			reader = new BufferedReader(new FileReader("src/actividad7Ficheros/agenda.txt"));

			// Leemos la primera línea
			linea = reader.readLine();
			linea = reader.readLine();
			// Bucle para ir metiendo en el array datos los datos de los viajes
			while (linea != null) {

				// Array donde introduciremos los datos del viaje
				String[] datos = linea.split(":");

				// El destino será el primer dato
				nombre = datos[0];

				// La fecha será el segundo dato
				numero = Integer.parseInt(datos[1]);

				// Establecemos el objeto viajes con los datos introducidos
				contacto = new Contacto(nombre, numero);

				// los añadimos a la lista de viajes
				ListaDeContactos.anyadirContacto(contacto);

				// Leemos la siguiente línea
				linea = reader.readLine();
			}

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
