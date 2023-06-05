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
	
}
