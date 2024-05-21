/**
 * 
 */
package actividad7Ficheros;

/**
 * 
 */
public class Contacto {
	private String nombre = "";
	private int telefono;

	/**
	 * 
	 */
	public Contacto(String nombre) {
		if (nombre != null && !nombre.contentEquals("")) {
			this.nombre = nombre;
		}
	}

	/**
	 * 
	 */
	public Contacto(String nombre, int telefono) {
		if (nombre != null && !nombre.contentEquals("")) {
			this.nombre = nombre;
		}
		if (telefono > 0) {
			this.telefono = telefono;
		}
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.contentEquals("")) {
			this.nombre = nombre;
		}

	}

	/**
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		if (telefono > 0) {
			this.telefono = telefono;
		}

	}

	public String toString() {
		String res = "nombre: " + nombre + "\n";
		res += "telefono: " + telefono + "\n";
		return res;
	}

	public boolean equals(Object o) {
		boolean res = false;
		Contacto contactoComparacion = (Contacto) o;
		if (nombre.equals(contactoComparacion.nombre) || telefono == contactoComparacion.telefono) {
			res = true;
		}
		return res;
	}
}
