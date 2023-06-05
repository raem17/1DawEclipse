
public class MVP {

	String nombre_jugador;
	int dorsal;
	String equipo;
	int nGoles;
	int nAsistencias;
	int nFaltas;
	int nPasesClave;
	String jornada;
	String temporada;
	
	
	MVP() {}


	MVP(String nombre_jugador, int dorsal, String equipo, int nGoles, int nAsistencias, int nFaltas,
			int nPasesClave, String jornada, String temporada) {
		
		super();
		this.nombre_jugador = nombre_jugador;
		this.dorsal = dorsal;
		this.equipo = equipo;
		this.nGoles = nGoles;
		this.nAsistencias = nAsistencias;
		this.nFaltas = nFaltas;
		this.nPasesClave = nPasesClave;
		this.jornada = jornada;
		this.temporada = temporada;
	}
	
	
	
}
