/**
 * 
 */
package actividad2;

/**
 * 
 */
public class Hora {
	private int segundos;
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

	public Hora(int hora, int minutos, int segundos)
			throws NegativeHorasException, NegativeMinutosException, NegativeSegundosException {
		if (hora >= 0 && hora <= 24) {
			this.hora = hora;
		} else {
			throw new NegativeHorasException("error constructor :");
		}

		if (minutos >= 0 && minutos <= 60) {
			this.minutos = minutos;
		} else {
			throw new NegativeMinutosException("error constructor :");
		}
		if (segundos >= 0 && segundos <= 24) {
			this.segundos = segundos;
		} else {
			throw new NegativeSegundosException("error constructor :");
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

	public void setMinutos(int minutos) throws NegativeMinutosException {
		if (minutos >= 0 && minutos <= 24) {
			this.minutos = minutos;
		} else {
			throw new NegativeMinutosException("error setter:");
		}

	}

	public void setHora(int hora) throws NegativeHorasException {
		if (hora >= 0 && hora <= 24) {
			this.hora = hora;
		} else {
			throw new NegativeHorasException("La hora no pueden ser negativa");
		}

	}

	/**
	 * @return the segundos
	 */
	public int getSegundos() {
		return segundos;
	}

	/**
	 * @param segundos the segundos to set
	 * @throws NegativeNumeroException
	 */
	public void setSegundos(int segundos) throws NegativeSegundosException {
		if (segundos >= 0 && segundos <= 24) {
			this.segundos = segundos;
		} else {
			throw new NegativeSegundosException("error setter:");
		}

	}

	public String toString() {
		return hora + ":" + (minutos < 10 ? "0" + minutos : minutos);
	}

}
