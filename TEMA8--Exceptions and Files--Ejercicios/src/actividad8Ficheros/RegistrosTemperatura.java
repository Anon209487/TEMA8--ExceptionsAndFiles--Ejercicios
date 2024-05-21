package actividad8Ficheros;

import java.util.ArrayList;

public class RegistrosTemperatura {
	public static ArrayList<TemperaturaDia> regristoTemperaturas = new ArrayList<>();

	public static void anyadirContacto(TemperaturaDia nuevoRegistro) {
		boolean anyadirNuevoRegistro = true;
		for (TemperaturaDia temperaturaDia : regristoTemperaturas) {
			if (nuevoRegistro.equals(temperaturaDia)) {
				anyadirNuevoRegistro = false;
			}
		}

		if (anyadirNuevoRegistro) {
			regristoTemperaturas.add(nuevoRegistro);
		}
	}

}
