/**
 * 
 */
package actividad3;

/**
 * 
 */
public class Ejecutable {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws NegativeDineroException {
		try {
			CuentaBancaria cuenta = new CuentaBancaria(-1);
		} catch (NegativeDineroException e) {
			System.out.println(e.getMessage());
		}
	}

}
