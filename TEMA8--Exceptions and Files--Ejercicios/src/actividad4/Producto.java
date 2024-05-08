/**
 * 
 */
package actividad4;

/**
 * 
 */

public class Producto {
	private String nombre = "";
	protected double precio;

	/**
	 * 
	 * @param nombre
	 * @param precio
	 */
	public Producto(String nombre, double precio) {
		// TODO Auto-generated constructor stub
		if (nombre != null && nombre != "") {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
		}

	}

	public String toString() {

		return " nombre: " + nombre + " precio: " + precio;
	}

	public double calcular(int cantidadProductos) {
		Double resultado = 0.0;
		if (cantidadProductos > 0) {
			resultado = this.precio * cantidadProductos;

		}
		return resultado;
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
		if (nombre != null && nombre != "") {
			this.nombre = nombre;
		}
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

	public boolean equals(Object obj) {
		Producto empleadoComparacion = (Producto) obj;
		return this.getNombre().equals(empleadoComparacion.getNombre());

	}
}
