
public class Registro_Videojuego {
	private String nombre;
	private int unidadesVendidas;
	
	public Registro_Videojuego() {
		super();
	}

	public Registro_Videojuego(String nombre, int unidadesVendidas) {
		super();
		this.nombre = nombre;
		this.unidadesVendidas = unidadesVendidas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getUnidadesVendidas() {
		return unidadesVendidas;
	}

	public void setUnidadesVendidas(int unidadesVendidas) {
		this.unidadesVendidas = unidadesVendidas;
	}
	
	// Métodos
	
	/**
	 * Suma las unidades pasadas por parámetro a las unidades actuales del registro de videojuego.
	 * @param unidades Las unidades que se van a añadir.
	 */
	public void añadirUnidades (int unidades) {
		this.unidadesVendidas = this.unidadesVendidas + unidades;
	}
}
