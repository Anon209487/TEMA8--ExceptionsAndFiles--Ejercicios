/**
 * 
 */
package actividad8Ficheros;

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
		TemperaturaDia temperaturaDia;
		String fecha = "";
		// Variable donde guardaremos el destino del viaje
		double temperaturaMinima = 0;

		// Variable donde guardaremos el precio del viaje
		double temperaturaMaxima = 0;

		// Objeto bufferedReader
		BufferedReader reader = null;

		try {

			// Hacemos que el objeto pueda coger los datos de nuestro archivo txt
			reader = new BufferedReader(
					new FileReader("src/actividad8Ficheros/registrosDeTemperaturaArchivoTexto.txt"));

			// Leemos la primera línea
			linea = reader.readLine();
			linea = reader.readLine();
			// Bucle para ir metiendo en el array datos los datos de los viajes
			while (linea != null) {

				// Array donde introduciremos los datos del viaje
				String[] datos = linea.split(",");

				// El destino será el primer dato
				fecha = datos[0];
				// La fecha será el segundo dato
				temperaturaMinima = Double.parseDouble(datos[1]);

				// El precio será el tercer dato
				temperaturaMaxima = Double.parseDouble(datos[2]);

				// Establecemos el objeto viajes con los datos introducidos
				temperaturaDia = new TemperaturaDia(fecha, temperaturaMinima, temperaturaMaxima);

				// los añadimos a la lista de viajes
				RegistrosTemperatura.anyadirContacto(temperaturaDia);

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
