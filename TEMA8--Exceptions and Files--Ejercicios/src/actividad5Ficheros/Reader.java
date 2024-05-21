package actividad5Ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import actividad1.UtilsJava;


		public class Reader {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Por favor, introduce tu nombre:");
		        String nombre = scanner.nextLine();

		        System.out.println("Ahora, por favor, introduce tu edad:");
		        int edad = scanner.nextInt();

		        guardarDatos(nombre, edad);
		        
		        scanner.close();
		    }

		    public static void guardarDatos(String nombre, int edad) {
		        try {
		            File archivo  = new File("src/actividad5Ficheros/datos.txt");
		            FileWriter fw;

		
		            if (archivo.exists()) {
		                fw = new FileWriter(archivo, true); 
		            } else {
		                fw = new FileWriter(archivo);
		            }

		            BufferedWriter bw = new BufferedWriter(fw);

		   
		            bw.write(nombre + "," + edad);
		            bw.newLine();

		            bw.close();
		            System.out.println("Datos guardados correctamente en datos.txt.");

		        } catch (IOException e) {
		            System.err.println("Error al guardar los datos: " + e.getMessage());
		        }
		    }
		}

	
	

