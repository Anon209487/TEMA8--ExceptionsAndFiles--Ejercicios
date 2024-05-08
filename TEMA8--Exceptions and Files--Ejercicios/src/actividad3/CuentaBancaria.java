/**
 * 
 */
package actividad3;

/**
 * 
 */
public class CuentaBancaria {

	private double fondos;

	public CuentaBancaria() {

	}

	public CuentaBancaria(double fondos) throws NegativeDineroException {
		if (fondos >= 0) {
			fondos += fondos;
		} else {
			throw new NegativeDineroException("error constructor :");
		}

	}

	/**
	 * @return the fondos
	 */
	public double getFondos() {
		return fondos;
	}

	/**
	 * @param fondos the fondos to set
	 * @throws NegativeNumeroException
	 */
	public void setFondos(int fondos) throws NegativeDineroException {
		if (fondos >= 0 && fondos <= 24) {
			this.fondos = fondos;
		} else {
			throw new NegativeDineroException("error setter:");
		}

	}

	public double ingresarDinero(double cantidadIngresaar) throws NegativeDineroException {
		if (cantidadIngresaar >= 0) {
			fondos += cantidadIngresaar;
		} else {
			throw new NegativeDineroException("error ingresarDinero() :");
		}
		return fondos;

	}

	public double retirarDinero(double dinero) {
		if (dinero < 0) {

			fondos += dinero;
		}
		return fondos;
	}

	public double prestamo(double dinero) throws NegativeDineroException {
		if (dinero >= 0) {
			fondos += dinero;
		} else {
			throw new NegativeDineroException("error prestamo() :");
		}
		return fondos;

	}

	public String toString() {
		String cuenta = "cuenta " + "\n";
		cuenta += "fondos: " + fondos + "\n";
		return cuenta;
	}

}
