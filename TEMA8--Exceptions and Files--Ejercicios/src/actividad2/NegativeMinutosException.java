package actividad2;

public class NegativeMinutosException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeMinutosException(String message) {
		super(message + "error mintos");
	}
}
