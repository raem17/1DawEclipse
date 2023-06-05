/**
 * Clase con los atributos: nombre_equipo, p_jugados, p_ganados, p_empatados, p_perdidos, g_favor, g_contra y puntos.
 * @author roger
 *
 */
public class Clasificacion {
	private String nombre_equipo;
	private int p_jugados;
	private int p_ganados;
	private int p_empatados;
	private int p_perdidos;
	private int g_favor;
	private int g_contra;
	private int puntos;
	
	public Clasificacion() {
		super();
	}

	public Clasificacion(String nombre_equipo, int p_jugados, int p_ganados, int p_empatados, int p_perdidos,
			int g_favor, int g_contra, int puntos) {
		super();
		this.nombre_equipo = nombre_equipo;
		this.p_jugados = p_jugados;
		this.p_ganados = p_ganados;
		this.p_empatados = p_empatados;
		this.p_perdidos = p_perdidos;
		this.g_favor = g_favor;
		this.g_contra = g_contra;
		this.puntos = puntos;
	}

	public String getNombre_equipo() {
		return nombre_equipo;
	}

	public void setNombre_equipo(String nombre_equipo) {
		this.nombre_equipo = nombre_equipo;
	}

	public int getP_jugados() {
		return p_jugados;
	}

	public void setP_jugados(int p_jugados) {
		this.p_jugados = p_jugados;
	}

	public int getP_ganados() {
		return p_ganados;
	}

	public void setP_ganados(int p_ganados) {
		this.p_ganados = p_ganados;
	}

	public int getP_empatados() {
		return p_empatados;
	}

	public void setP_empatados(int p_empatados) {
		this.p_empatados = p_empatados;
	}

	public int getP_perdidos() {
		return p_perdidos;
	}

	public void setP_perdidos(int p_perdidos) {
		this.p_perdidos = p_perdidos;
	}

	public int getG_favor() {
		return g_favor;
	}

	public void setG_favor(int g_favor) {
		this.g_favor = g_favor;
	}

	public int getG_contra() {
		return g_contra;
	}

	public void setG_contra(int g_contra) {
		this.g_contra = g_contra;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
}
