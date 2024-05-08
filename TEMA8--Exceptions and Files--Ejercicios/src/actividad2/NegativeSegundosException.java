package actividad2;

public class NegativeSegundosException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeSegundosException(String message) {
		super(message + "error Segundos");
	}
}
