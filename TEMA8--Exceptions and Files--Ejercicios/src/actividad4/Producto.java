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
	 * @throws PrecioException
	 * @throws NombreException
	 */
	public Producto(String nombre, double precio) throws PrecioException, NombreException {
		if (nombre != null && nombre != "") {
			this.nombre = nombre;
		} else {
			throw new NombreException("error nombre");
		}
		if (precio > 0) {
			this.precio = precio;
		} else {
			throw new PrecioException(" precio no puede ser negativo");
		}

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
	 * @throws NombreException
	 */
	public void setNombre(String nombre) throws NombreException {
		if (nombre != null && nombre != "") {
			this.nombre = nombre;
		} else {
			throw new NombreException("error nombre");
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
	 * @throws PrecioException
	 */
	public void setPrecio(double precio) throws PrecioException {
		if (precio > 0) {
			this.precio = precio;
		} else {
			throw new PrecioException(" precio no puede ser negativo");
		}
	}

	public boolean equals(Object obj) {
		Producto empleadoComparacion = (Producto) obj;
		return this.getNombre().equals(empleadoComparacion.getNombre());

	}

	public String toString() {

		return " nombre: " + nombre + " precio: " + precio;
	}
}
