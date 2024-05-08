/**
 * 
 */
package actividad2;

/**
 * 
 */
public class Hora {

	private int hora;
	private int minutos;

	/**
	 * @return the hora
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * @return the minutos
	 */

	public int getMinutos() {
		return minutos;
	}

	public Hora(int hora, int minutos) {
		if (hora >= 0 && hora <= 24) {
			this.hora = hora;
		} else {
			this.hora = 0;
		}

		if (minutos >= 0 && minutos <= 60) {
			this.minutos = minutos;
		} else {
			this.minutos = 0;
		}
	}

	public void inc() {
		if (minutos < 59) {
			minutos++;
		} else {
			minutos = 0;
			if (hora < 23) {
				hora++;
			} else {
				hora = 0;
			}
		}
	}

	public boolean setMinutos(int valor) {
		if (valor >= 0 && valor <= 60) {
			minutos = valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean setHora(int valor) {
		if (valor >= 0 && valor <= 24) {
			hora = valor;
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return hora + ":" + (minutos < 10 ? "0" + minutos : minutos);
	}

}
