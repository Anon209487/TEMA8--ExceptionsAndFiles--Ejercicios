package actividad6Ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Reader {

	public static void main(String[] args) throws Exception {
		int numeros;
		 ArrayList<Integer> list = new ArrayList<>();
		File archivo = new File("src/actividad6Ficheros/NumerosReales.txt");
		try (Scanner scanner = new Scanner(archivo)) {
			
			while (scanner.hasNextInt()) {
				numeros = scanner.nextInt();
				System.out.println(numeros);
			    list.add(numeros);
			}
		
		}

		Collections.sort(list);
		System.out.println(list.toString());
		 guardarDatos(list);
	}
	    public static void guardarDatos(ArrayList<Integer> list) {
	        try {
	            File archivo  = new File("src/actividad6Ficheros/datos2.txt");
	            FileWriter fw;

	
	            if (archivo.exists()) {
	                fw = new FileWriter(archivo, true); 
	            } else {
	                fw = new FileWriter(archivo);
	            }

	            BufferedWriter bw = new BufferedWriter(fw);

	    
	    
	            for (Integer numero : list) {
	                bw.write(numero);
	                bw.newLine();
	            }
	            bw.close();
	            System.out.println("Datos guardados correctamente en datos.txt.");

	        } catch (IOException e) {
	            System.err.println("Error al guardar los datos: " + e.getMessage());
	        }
	    }
	
}
