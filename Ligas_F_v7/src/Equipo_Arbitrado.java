
public class Equipo_Arbitrado {
	private String nombre;
	private int num_veces_arbitrado;
	
	public Equipo_Arbitrado() {
		super();
	}

	public Equipo_Arbitrado(String nombre, int num_veces_arbitrado) {
		super();
		this.nombre = nombre;
		this.num_veces_arbitrado = num_veces_arbitrado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVeces_arbitrado() {
		return num_veces_arbitrado;
	}

	public void setVeces_arbitrado(int veces_arbitrado) {
		this.num_veces_arbitrado = veces_arbitrado;
	}
	
	public void agregarNumVecesArbitrado(int vecesArbitrado ) {
		this.num_veces_arbitrado = this.num_veces_arbitrado + vecesArbitrado;
	}
}
