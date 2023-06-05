
public class Estadistica {
	private int goles;
	private int asistencias;
	private int tarjetas_a;
	private int tarjetas_r;
	private int partidos_j;
	private int titularidades;
	private double minutos_jugados;
	public Estadistica() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Estadistica(int goles, int asistencias, int tarjetas_a, int tarjetas_r, int partidos_j, int titularidades,
			double minutos_jugados) {
		super();
		this.goles = goles;
		this.asistencias = asistencias;
		this.tarjetas_a = tarjetas_a;
		this.tarjetas_r = tarjetas_r;
		this.partidos_j = partidos_j;
		this.titularidades = titularidades;
		this.minutos_jugados = minutos_jugados;
	}
	/**
	 * @return the goles
	 */
	public int getGoles() {
		return goles;
	}
	/**
	 * @param goles the goles to set
	 */
	public void setGoles(int goles) {
		this.goles = goles;
	}
	/**
	 * @return the asistencias
	 */
	public int getAsistencias() {
		return asistencias;
	}
	/**
	 * @param asistencias the asistencias to set
	 */
	public void setAsistencias(int asistencias) {
		this.asistencias = asistencias;
	}
	/**
	 * @return the tarjetas_a
	 */
	public int getTarjetas_a() {
		return tarjetas_a;
	}
	/**
	 * @param tarjetas_a the tarjetas_a to set
	 */
	public void setTarjetas_a(int tarjetas_a) {
		this.tarjetas_a = tarjetas_a;
	}
	/**
	 * @return the tarjetas_r
	 */
	public int getTarjetas_r() {
		return tarjetas_r;
	}
	/**
	 * @param tarjetas_r the tarjetas_r to set
	 */
	public void setTarjetas_r(int tarjetas_r) {
		this.tarjetas_r = tarjetas_r;
	}
	/**
	 * @return the partidos_j
	 */
	public int getPartidos_j() {
		return partidos_j;
	}
	/**
	 * @param partidos_j the partidos_j to set
	 */
	public void setPartidos_j(int partidos_j) {
		this.partidos_j = partidos_j;
	}
	/**
	 * @return the titularidades
	 */
	public int getTitularidades() {
		return titularidades;
	}
	/**
	 * @param titularidades the titularidades to set
	 */
	public void setTitularidades(int titularidades) {
		this.titularidades = titularidades;
	}
	/**
	 * @return the minutos_jugados
	 */
	public double getMinutos_jugados() {
		return minutos_jugados;
	}
	/**
	 * @param minutos_jugados the minutos_jugados to set
	 */
	public void setMinutos_jugados(double minutos_jugados) {
		this.minutos_jugados = minutos_jugados;
	}
	@Override
	public String toString() {
		return "Estadistica [goles=" + goles + ", asistencias=" + asistencias + ", tarjetas_a=" + tarjetas_a
				+ ", tarjetas_r=" + tarjetas_r + ", partidos_j=" + partidos_j + ", titularidades=" + titularidades
				+ ", minutos_jugados=" + minutos_jugados + "]";
	}
	
	
}
