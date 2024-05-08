package actividad2;

public class NegativeHorasException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeHorasException(String message) {
		super(message + "error Horas");
	}
}
