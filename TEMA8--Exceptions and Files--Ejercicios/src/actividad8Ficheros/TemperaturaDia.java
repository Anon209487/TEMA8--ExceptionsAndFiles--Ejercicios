/**
 * 
 */
package actividad8Ficheros;

/**
 * 
 */
public class TemperaturaDia {
	private String fecha = "";
	private double temperaturaMinima;
	private double temperaturaMaxima;

	/**
	 * 
	 */
	public TemperaturaDia(String fecha) {
		if (fecha != null && !fecha.contentEquals("")) {
			this.fecha = fecha;
		}
	}

	/**
	 * 
	 */
	public TemperaturaDia(String fecha, double temperaturaMinima, double temperaturaMaxima) {
		if (fecha != null && !fecha.contentEquals("")) {
			this.fecha = fecha;
		}
		if (temperaturaMinima > 0) {
			this.temperaturaMinima = temperaturaMinima;
		}
		if (temperaturaMaxima > 0) {
			this.temperaturaMaxima = temperaturaMaxima;
		}
	}

	public String toString() {
		String res = fecha + "," + temperaturaMinima + "," + temperaturaMaxima;
		return res;
	}

	public boolean equals(Object o) {
		boolean res = false;
		TemperaturaDia temperaturaDiaComparacion = (TemperaturaDia) o;
		if (fecha.equals(temperaturaDiaComparacion.fecha)) {
			res = true;
		}
		return res;
	}
}
