package actividad1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UtilsJava {

	public static double readDouble(Scanner scanner) {
		try {
			return scanner.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("no es double");
			scanner.nextLine();
			return 0.0;
		}
	}

	public static int readInt(Scanner scanner) {
		try {
			return scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("no es int");
			scanner.nextLine();
			return 0;
		}
	}
}
