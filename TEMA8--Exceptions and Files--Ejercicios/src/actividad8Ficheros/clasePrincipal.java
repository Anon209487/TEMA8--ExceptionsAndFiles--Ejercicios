package actividad8Ficheros;

import java.util.Scanner;

public class clasePrincipal {

	public static void main(String[] args) throws Exception {
		int numeros = 0;

		do {

			numeros = menu();
			switch (numeros) {
			case 1: {
				anyadirContacto();
				break;
			}
			case 2: {
				System.out.println(RegistrosTemperatura.regristoTemperaturas.toString());
				break;
			}
			case 3: {
				Writer.guardarDatos(RegistrosTemperatura.regristoTemperaturas);
				break;
			}

			default:

			}
		} while (numeros != 3);

	}

	private static void anyadirContacto() {
		System.out.println("introduzca fecha: ");
		String fecha = extracted().nextLine();
		System.out.println("introduzca temperatura minuma: ");
		double temperaturaMinima = extracted().nextDouble();
		System.out.println("introduzca temperatura maxima: ");
		double temperaturaMaxima = extracted().nextDouble();
		TemperaturaDia nuevoRegistro = new TemperaturaDia(fecha, temperaturaMinima, temperaturaMaxima);
		RegistrosTemperatura.anyadirContacto(nuevoRegistro);
	}

	/**
	 * @return
	 */
	private static int menu() {
		int numeros;
		System.out.println("slecionne:");
		System.out.println("1 Registra nueva temperatura:");
		System.out.println("2 Mostrar historial de registros:");
		System.out.println("3 Salir:");
		numeros = extracted().nextInt();
		return numeros;
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}

}