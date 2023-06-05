import java.util.ArrayList;

public class Competicion {
	private String nombre;
	private ArrayList<Equipo> equipos;
	public Competicion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Competicion(String nombre, ArrayList<Equipo> equipos) {
		super();
		this.nombre = nombre;
		this.equipos = equipos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}
	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}
	@Override
	public String toString() {
		return "Competicion [nombre=" + nombre + ", equipos=" + equipos + "]";
	}
	
	
}
