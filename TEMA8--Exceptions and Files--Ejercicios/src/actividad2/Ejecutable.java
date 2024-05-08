/**
 * 
 */
package actividad2;

/**
 * 
 */
public class Ejecutable {

	/**
	 * @param args
	 * @throws NegativeDineroException
	 */
	public static void main(String[] args)
			throws NegativeHorasException, NegativeMinutosException, NegativeSegundosException {
		try {
			Hora hora = new Hora(3, 1, -12);
		} catch (NegativeHorasException | NegativeMinutosException | NegativeSegundosException e) {
			System.out.println(e.getMessage());
		}
	}

}
