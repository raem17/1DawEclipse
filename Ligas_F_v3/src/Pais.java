import java.util.ArrayList;

public class Pais {
	private String nombre;
	private ArrayList<Liga> ligas;
	public Pais() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pais(String nombre, ArrayList<Liga> ligas) {
		super();
		this.nombre = nombre;
		this.ligas = ligas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Liga> getLigas() {
		return ligas;
	}
	public void setLigas(ArrayList<Liga> ligas) {
		this.ligas = ligas;
	}
	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", ligas=" + ligas + "]";
	}
	
	
}
