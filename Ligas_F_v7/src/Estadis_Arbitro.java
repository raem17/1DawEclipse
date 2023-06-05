
public class Estadis_Arbitro {
	private String nombre;
	private String dni;
	private int partidos_arbitrados;
	
	public Estadis_Arbitro() {
		super();
	}

	public Estadis_Arbitro(String nombre, String dni, int partidos_arbitrados) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.partidos_arbitrados = partidos_arbitrados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getPartidos_arbitrados() {
		return partidos_arbitrados;
	}

	public void setPartidos_arbitrados(int partidos_arbitrados) {
		this.partidos_arbitrados = partidos_arbitrados;
	}
	
	// Métodos
	
	public void añadirPartidos(int partidos_arbi) {
		this.partidos_arbitrados = this.partidos_arbitrados + partidos_arbi;
	}
}
