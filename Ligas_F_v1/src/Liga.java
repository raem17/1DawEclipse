import java.util.ArrayList;

public class Liga {
	private String nombre;
	private String categoria;
	private ArrayList<Equipo> equipos;
	private ArrayList<Encuentro> partidos;
	public Liga() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Liga(String nombre, String categoria, ArrayList<Equipo> equipos, ArrayList<Encuentro> partidos) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.equipos = equipos;
		this.partidos = partidos;
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
		this.nombre = nombre;
	}
	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	/**
	 * @return the equipos
	 */
	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}
	/**
	 * @param equipos the equipos to set
	 */
	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}
	/**
	 * @return the partidos
	 */
	public ArrayList<Encuentro> getPartidos() {
		return partidos;
	}
	/**
	 * @param partidos the partidos to set
	 */
	public void setPartidos(ArrayList<Encuentro> partidos) {
		this.partidos = partidos;
	}
	@Override
	public String toString() {
		return "Liga [nombre=" + nombre + ", categoria=" + categoria + ", equipos=" + equipos + ", partidos=" + partidos
				+ "]";
	}
	
	// Métodos
	
	// 3
	public int numPartidosArbitro (Arbitro datosArbitro) {
		int cont = 0;
		
		for (int i = 0; i < this.partidos.size(); i++) {
			if (this.partidos.get(i).getArbitro().getDni().equalsIgnoreCase(datosArbitro.getDni())) {
				cont++;
			}
		}
		
		return cont;
	}
	
	// 7
	public int numGolesNomEquipo (String nombreEquipo) {
		int golesEquipoRolLocal = 0; // Los goles del equipo X cuando ocupan el rol de equipo local
		int golesEquipoRolVisit = 0; // Ídem para equipo visitante
		int golesTotalesEquipo = 0;
		
		for (int i = 0; i < this.partidos.size(); i++) {
			if (this.partidos.get(i).getEquipo_local().getNombre().equalsIgnoreCase(nombreEquipo)) {
				golesEquipoRolLocal = golesEquipoRolLocal + this.partidos.get(i).getGoles_eq_local();
			} else if (this.partidos.get(i).getEquipo_visit().getNombre().equalsIgnoreCase(nombreEquipo)) {
				golesEquipoRolVisit = golesEquipoRolVisit + this.partidos.get(i).getGoles_eq_visit();
			}
		}
		
		golesTotalesEquipo = golesEquipoRolLocal + golesEquipoRolVisit;
		
		return golesTotalesEquipo;
	}
	
	// 8
	public int numGolesRecibNomEquipo (String nombreEquipo) {
		int golesEquipoVisit = 0; // Goles del equipo enemigo cuando el equipo X ocupa el rol de equipo local
		int golesEquipoLocal = 0; // Goles del equipo enemigo cuando el equipo X ocupa el rol de equipo visitante
		int golesTotalesRecibidosEquipo = 0;
		
		for (int i = 0; i < this.partidos.size(); i++) {
			if (this.partidos.get(i).getEquipo_local().getNombre().equalsIgnoreCase(nombreEquipo)) {
				golesEquipoVisit = golesEquipoVisit + this.partidos.get(i).getGoles_eq_visit();
			} else if (this.partidos.get(i).getEquipo_visit().getNombre().equalsIgnoreCase(nombreEquipo)) {
				golesEquipoLocal = golesEquipoLocal + this.partidos.get(i).getGoles_eq_local();
			}
		}
		
		golesTotalesRecibidosEquipo = golesEquipoLocal + golesEquipoVisit;
		
		return golesTotalesRecibidosEquipo;
	}
	
	// 9
	public ArrayList<Jugador> devolverJugadoresMinutosMin() {
		ArrayList<Jugador> jugadoresMinutosMin = new ArrayList<Jugador>();
		double minutosMin = this.equipos.get(0).getJugadores().get(0).getDatos().getMinutos_jugados()+1;
		
		
		for (int i = 0; i < this.equipos.size(); i++) {
			for (int j = 0; j < this.equipos.get(i).getJugadores().size(); j++) {
				if (this.equipos.get(i).getJugadores().get(j).getDatos().getMinutos_jugados() < minutosMin) {
					minutosMin = this.equipos.get(i).getJugadores().get(j).getDatos().getMinutos_jugados();
				}
			}
		}
		
		for (int i = 0; i < this.equipos.size(); i++) {
			for (int j = 0; j < this.equipos.get(i).getJugadores().size(); j++) {
				if (this.equipos.get(i).getJugadores().get(j).getDatos().getMinutos_jugados() ==  minutosMin) {
					jugadoresMinutosMin.add(this.equipos.get(i).getJugadores().get(j));
				}
			}
		}
		
		return jugadoresMinutosMin;
	}
}
