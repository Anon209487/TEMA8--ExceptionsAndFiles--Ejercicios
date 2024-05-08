package actividad4;

public class NombreException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NombreException(String message) {
		super(message + "error String");
	}
}
