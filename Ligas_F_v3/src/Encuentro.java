
public class Encuentro {
	private Equipo equipo_local;
	private Equipo equipo_visit;
	private String fecha;
	private Liga liga;
	private int goles_eq_local;
	private int goles_eq_visit;
	private Arbitro arbitro;
	
	public Encuentro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Encuentro(Equipo equipo_local, Equipo equipo_visit, String fecha, Liga liga, int goles_eq_local,
			int goles_eq_visit, Arbitro arbitro) {
		super();
		this.equipo_local = equipo_local;
		this.equipo_visit = equipo_visit;
		this.fecha = fecha;
		this.liga = liga;
		this.goles_eq_local = goles_eq_local;
		this.goles_eq_visit = goles_eq_visit;
		this.arbitro = arbitro;
	}
	/**
	 * @return the equipo_local
	 */
	public Equipo getEquipo_local() {
		return equipo_local;
	}
	/**
	 * @param equipo_local the equipo_local to set
	 */
	public void setEquipo_local(Equipo equipo_local) {
		this.equipo_local = equipo_local;
	}
	/**
	 * @return the equipo_visit
	 */
	public Equipo getEquipo_visit() {
		return equipo_visit;
	}
	/**
	 * @param equipo_visit the equipo_visit to set
	 */
	public void setEquipo_visit(Equipo equipo_visit) {
		this.equipo_visit = equipo_visit;
	}
	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the liga
	 */
	public Liga getLiga() {
		return liga;
	}
	/**
	 * @param liga the liga to set
	 */
	public void setLiga(Liga liga) {
		this.liga = liga;
	}
	/**
	 * @return the goles_eq_local
	 */
	public int getGoles_eq_local() {
		return goles_eq_local;
	}
	/**
	 * @param goles_eq_local the goles_eq_local to set
	 */
	public void setGoles_eq_local(int goles_eq_local) {
		this.goles_eq_local = goles_eq_local;
	}
	/**
	 * @return the goles_eq_visit
	 */
	public int getGoles_eq_visit() {
		return goles_eq_visit;
	}
	/**
	 * @param goles_eq_visit the goles_eq_visit to set
	 */
	public void setGoles_eq_visit(int goles_eq_visit) {
		this.goles_eq_visit = goles_eq_visit;
	}
	public Arbitro getArbitro() {
		return arbitro;
	}

	public void setArbitro(Arbitro arbitro) {
		this.arbitro = arbitro;
	}

	@Override
	public String toString() {
		return "Encuentro [equipo_local=" + equipo_local + ", equipo_visit=" + equipo_visit + ", fecha=" + fecha
				+ ", liga=" + liga + ", goles_eq_local=" + goles_eq_local + ", goles_eq_visit=" + goles_eq_visit + "]";
	}
	
	public int golesTotales() {
		int golesT = this.goles_eq_local + this.goles_eq_visit;
		
		return golesT;
	}
		
}
