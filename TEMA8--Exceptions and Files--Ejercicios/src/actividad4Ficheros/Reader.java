package actividad4Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {

    public static void main(String[] args) {
        String palabra = "";
        File archivo = new File("src/actividad4Ficheros/Texto.txt");

        try (Scanner scanner = new Scanner(archivo)) {

            while (scanner.hasNextLine()) {
                palabra = scanner.nextLine();
                palabra=palabra.trim();
                if (palabra.equalsIgnoreCase("end")) {
                    break; 
                }
                System.out.println(palabra);
            }

            System.out.println();

        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error al procesar el archivo: " + e.getMessage());
        }
    }
}
