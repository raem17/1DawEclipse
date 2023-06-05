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
	
	// Métodos
	
	public boolean existeEquiposCon21Jugas() {
		boolean existeEquiposCon21Jugas = false;
		
		for (int i = 0; i < this.ligas.size(); i++) {
			for (int j = 0; j < this.ligas.get(i).getEquipos().size(); j++) {
				if (this.ligas.get(i).getEquipos().get(j).getJugadores().size() > 20) {
					existeEquiposCon21Jugas = true;
					break;
				}
			}
		}
		
		return existeEquiposCon21Jugas;
	}
	
	
}
