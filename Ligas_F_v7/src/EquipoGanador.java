
public class EquipoGanador {
	private String nombre_equipo;
	private int goles;
	
	public EquipoGanador() {
		super();
	}

	public EquipoGanador(String nombre_equipo, int goles) {
		super();
		this.nombre_equipo = nombre_equipo;
		this.goles = goles;
	}

	public String getNombre_equipo() {
		return nombre_equipo;
	}

	public void setNombre_equipo(String nombre_equipo) {
		this.nombre_equipo = nombre_equipo;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}
	
	public void añadirGoles (int goles) {
		this.goles = this.goles + goles;
	}
}
