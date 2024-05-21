package actividad7Ficheros;

import java.util.Scanner;

public class clasePrincipal {

	public static void main(String[] args) throws Exception {
		int numeros = 0;
		Reader.leeerTxt();
		do {

			numeros = menu();
			switch (numeros) {
			case 1: {
				nuevoContancto();
				break;
			}
			case 2: {
				buscarPorNombre();
				break;
			}
			case 3: {
				mostrarTodos();
				break;
			}
			case 4: {
				guardarDatos();
				break;
			}
			default:

			}
		} while (numeros != 4);

	}

	/**
	 * @return
	 */
	private static int menu() {
		int numeros;
		System.out.println("slecionar opcion:");
		System.out.println("1 Nuevo contacto.");
		System.out.println("2 Buscar por nombre.");
		System.out.println("3 Mostrar todos.");
		System.out.println("4 Salir.");
		numeros = extracted().nextInt();
		return numeros;
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}

	private static void guardarDatos() {
		Writer.guardarDatos(ListaDeContactos.contatos);

	}

	private static void mostrarTodos() {
		System.out.println(ListaDeContactos.contatos.toString());

	}

	private static void buscarPorNombre() {
		System.out.println("introduzca nombre:");
		String nombre = extracted().nextLine();
		Contacto nuevocontacto = new Contacto(nombre);
		System.out.println("Se ha encontrado el contacto ? " + ListaDeContactos.buscarPorNombre(nuevocontacto));

	}

	private static void nuevoContancto() {
		System.out.println("introduzca nombre:");
		String nombre = extracted().nextLine();
		System.out.println("introduzca numero:");
		int numero = extracted().nextInt();
		Contacto nuevocontacto = new Contacto(nombre, numero);
		ListaDeContactos.anyadirContacto(nuevocontacto);

	}
}