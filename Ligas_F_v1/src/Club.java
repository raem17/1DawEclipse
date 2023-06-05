import java.util.ArrayList;

public class Club {	
	private String nombre;
	private String ciudad;
	private ArrayList<Equipo> equipos;
	public Club() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Club(String nombre, String ciudad, ArrayList<Equipo> equipos) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.equipos = equipos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}
	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}
	@Override
	public String toString() {
		return "Club [nombre=" + nombre + ", ciudad=" + ciudad + ", equipos=" + equipos + "]";
	}
	
	

}
