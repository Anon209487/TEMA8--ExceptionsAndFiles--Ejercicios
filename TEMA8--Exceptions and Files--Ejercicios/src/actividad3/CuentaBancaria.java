/**
 * 
 */
package actividad3;

/**
 * 
 */
public class CuentaBancaria {

	protected double fondos;
	protected double deuda;

	public CuentaBancaria() {

	}

	public double ingresarDinero(double dinero) {
		if (dinero > 0) {

			fondos += dinero;
		}
		return fondos;

	}

	public double retirarDinero(double dinero) {
		if (dinero < 0) {

			fondos += dinero;
		}
		return fondos;
	}

	public double prestamo(double dinero) {
		if (dinero > 0) {

			deuda += dinero * 0.25;
			fondos += dinero;
		}
		return fondos;
	}

	public String toString() {
		String cuenta = "cuenta " + "\n";
		cuenta += "fondos: " + fondos + "\n";
		cuenta += "deuda: " + deuda + "\n";
		return cuenta;
	}

}
