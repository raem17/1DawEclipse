
public class Estadis_Equipo {
	private String nombre;
	private int goles_marcados;
	private int goles_recibidos;
	private int partidos_jugados;
	private int partidos_ganados;
	private int partidos_perdidos;
	
	public Estadis_Equipo() {
		super();
	}

	public Estadis_Equipo(String nombre, int goles_marcados, int goles_recibidos, int partidos_jugados,
			int partidos_ganados, int partidos_perdidos) {
		super();
		this.nombre = nombre;
		this.goles_marcados = goles_marcados;
		this.goles_recibidos = goles_recibidos;
		this.partidos_jugados = partidos_jugados;
		this.partidos_ganados = partidos_ganados;
		this.partidos_perdidos = partidos_perdidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getGoles_marcados() {
		return goles_marcados;
	}

	public void setGoles_marcados(int goles_marcados) {
		this.goles_marcados = goles_marcados;
	}

	public int getGoles_recibidos() {
		return goles_recibidos;
	}

	public void setGoles_recibidos(int goles_recibidos) {
		this.goles_recibidos = goles_recibidos;
	}

	public int getPartidos_jugados() {
		return partidos_jugados;
	}

	public void setPartidos_jugados(int partidos_jugados) {
		this.partidos_jugados = partidos_jugados;
	}

	public int getPartidos_ganados() {
		return partidos_ganados;
	}

	public void setPartidos_ganados(int partidos_ganados) {
		this.partidos_ganados = partidos_ganados;
	}

	public int getPartidos_perdidos() {
		return partidos_perdidos;
	}

	public void setPartidos_perdidos(int partidos_perdidos) {
		this.partidos_perdidos = partidos_perdidos;
	}
	
	// Métodos
	
	public double mediaGolesXPartido() {
		double media = (double)this.goles_marcados / (double)this.partidos_jugados;
		
		return media;
	}
	
	public void añadirGolesMarcados(int golesMarcados) {
		this.goles_marcados = this.goles_marcados + golesMarcados;
	}
	
	public void añadirGolesRecibidos(int golesRecibidos) {
		this.goles_recibidos = this.goles_recibidos + golesRecibidos;
	}
	
	public void añadirPartidosJugados(int partidosJugados) {
		this.partidos_jugados = this.partidos_jugados + partidosJugados;
	}
}
