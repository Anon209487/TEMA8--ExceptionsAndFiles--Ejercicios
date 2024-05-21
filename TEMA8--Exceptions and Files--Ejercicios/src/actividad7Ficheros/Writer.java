package actividad7Ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Writer {
	public static void guardarDatos(ArrayList<Contacto> contatos) {
		String insetar = "numero:agenda";
		try {
			File archivo = new File("src/actividad7Ficheros/agenda.txt");
			FileWriter fw;

			if (archivo.exists()) {
				fw = new FileWriter(archivo, true);
			} else {
				fw = new FileWriter(archivo);
			}

			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(insetar);
			bw.newLine();
			for (Contacto contacto : contatos) {
				bw.write(contacto.toString());
				bw.newLine();
			}
			bw.close();
			System.out.println("Datos guardados correctamente en datos.txt.");

		} catch (IOException e) {
			System.err.println("Error al guardar los datos: " + e.getMessage());
		}
	}

}
