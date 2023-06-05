
public class Pelicula {
	private int cod_peli;
	private String nombre_peli;
	private int annio_estreno;
	private String nombre_actor_prota;
	private int coste_produccion;
	
	public Pelicula() {
		super();
	}

	public Pelicula(int cod_peli, String nombre_peli, int annio_estreno, String nombre_actor_prota,
			int coste_produccion) {
		super();
		this.cod_peli = cod_peli;
		this.nombre_peli = nombre_peli;
		this.annio_estreno = annio_estreno;
		this.nombre_actor_prota = nombre_actor_prota;
		this.coste_produccion = coste_produccion;
	}

	public int getCod_peli() {
		return cod_peli;
	}

	public void setCod_peli(int cod_peli) {
		this.cod_peli = cod_peli;
	}

	public String getNombre_peli() {
		return nombre_peli;
	}

	public void setNombre_peli(String nombre_peli) {
		this.nombre_peli = nombre_peli;
	}

	public int getAnnio_estreno() {
		return annio_estreno;
	}

	public void setAnnio_estreno(int annio_estreno) {
		this.annio_estreno = annio_estreno;
	}

	public String getNombre_actor_prota() {
		return nombre_actor_prota;
	}

	public void setNombre_actor_prota(String nombre_actor_prota) {
		this.nombre_actor_prota = nombre_actor_prota;
	}

	public int getCoste_produccion() {
		return coste_produccion;
	}

	public void setCoste_produccion(int coste_produccion) {
		this.coste_produccion = coste_produccion;
	}
	
	// Métodos
	
	public void mostrarDatos() {
		System.out.println("\nCódigo de la película: " + this.cod_peli + ". Nombre de la película: " + this.nombre_peli + ". Año de estreno: " + this.annio_estreno + ". Nombre del actor protagonista: " + this.nombre_actor_prota + ". Coste de producción: " + this.coste_produccion);
	}
}
