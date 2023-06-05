import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private ArrayList<Jugador> jugadores;
	public Equipo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Equipo(String nombre, ArrayList<Jugador> jugadores) {
		super();
		this.nombre = nombre;
		this.jugadores = jugadores;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", jugadores=" + jugadores + "]";
	}
	
	// Métodos
	
	// 1
	public ArrayList<Jugador> devolverJugaPosi (String posicion) {
		ArrayList<Jugador> jugadoresPosi = new ArrayList<Jugador>();
		
		for (int i = 0; i < this.jugadores.size(); i++) {
			if (this.jugadores.get(i).getPosicion().equalsIgnoreCase(posicion)) {
				jugadoresPosi.add(this.jugadores.get(i));
			}
		}
		
		return jugadoresPosi;
	}
	
	// 2
	public ArrayList<Jugador> devolverJugadoresTituMax() {
		ArrayList<Jugador> jugadoresTituMax = new ArrayList<Jugador>();
		int tituMax = this.jugadores.get(0).getDatos().getTitularidades()-1;
		
		
		for (int i = 0; i < this.jugadores.size(); i++) {
			if (this.jugadores.get(i).getDatos().getTitularidades() > tituMax) {
				tituMax = this.jugadores.get(i).getDatos().getTitularidades();
			}
		}
		
		
		for (int i = 0; i < this.jugadores.size(); i++) {
			if (this.jugadores.get(i).getDatos().getTitularidades() == tituMax) {
				jugadoresTituMax.add(this.jugadores.get(i));
			}
		}
		
		return jugadoresTituMax;
	}
	
	public int golesTotales() {
		int golesEquipo = 0;
		
		for (int i = 0; i < this.jugadores.size(); i++) {
			golesEquipo = golesEquipo + this.jugadores.get(i).getDatos().getGoles();
		}
		
		return golesEquipo;
	}
	
	public void añadirJugadorGoleadorMax (Pais datosPais) {
		Jugador jugadorMax = new Jugador();
		int golesMax = datosPais.getLigas().get(0).getEquipos().get(0).getJugadores().get(0).getDatos().getGoles()-1;
		
		for (int i = 0; i < datosPais.getLigas().size(); i++) {
			for (int j = 0; j < datosPais.getLigas().get(i).getEquipos().size(); j++) {
				for (int z = 0; z < datosPais.getLigas().get(i).getEquipos().get(j).getJugadores().size(); z++) {
					if (datosPais.getLigas().get(i).getEquipos().get(j).getJugadores().get(z).getDatos().getGoles() > golesMax) {
						golesMax = datosPais.getLigas().get(i).getEquipos().get(j).getJugadores().get(z).getDatos().getGoles();
						jugadorMax = datosPais.getLigas().get(i).getEquipos().get(j).getJugadores().get(z);
					}
				}
			}
		}
		
		this.jugadores.add(jugadorMax);
	}
	
	public int devolverNumJugasSinTarjetas() {
		int numJugas = 0;
		
		for (int i = 0; i < this.jugadores.size(); i++) {
			if (this.jugadores.get(i).noTieneTarjetas()) {
				numJugas++;
			}
		}
		
		return numJugas;
	}
	
	public boolean existeJugadorCon5Rojas() {
		boolean existeJugadorCon5Rojas = false;
		
		for (int i = 0; i < this.jugadores.size(); i++) {
			if (this.jugadores.get(i).getDatos().getTarjetas_r() > 4) {
				existeJugadorCon5Rojas = true;
				break;
			}
		}
		
		return existeJugadorCon5Rojas;
	}
	
}
