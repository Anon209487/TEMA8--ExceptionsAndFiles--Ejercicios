package actividad3;

public class NegativeDineroException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeDineroException(String message) {
		super(message + "error valor negativo");
	}
}
