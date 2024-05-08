package actividad4;

public class PrecioException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PrecioException(String message) {
		super(message + "error valor negativo");
	}
}
