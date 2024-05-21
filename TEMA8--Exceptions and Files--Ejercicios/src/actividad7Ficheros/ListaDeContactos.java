package actividad7Ficheros;

import java.util.ArrayList;

public class ListaDeContactos {
	public static ArrayList<Contacto> contatos = new ArrayList<>(20);

	public static void anyadirContacto(Contacto conctactoNuevo) {
		boolean anyadirContacto = true;
		for (Contacto contacto : contatos) {
			if (conctactoNuevo.equals(contacto)) {
				anyadirContacto = false;
			}
		}
		if (anyadirContacto) {
			contatos.add(conctactoNuevo);
		}
	}

	public static boolean buscarPorNombre(Contacto conctactoNuevo) {
		boolean anyadirContacto = false;
		for (Contacto contacto : contatos) {
			if (conctactoNuevo.equals(contacto)) {
				System.out.println(contacto);
				anyadirContacto = true;
			}
		}

		return anyadirContacto;
	}
}
 