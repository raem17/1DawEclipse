import java.util.ArrayList;

public class CompanyaAlt {
	private String nombre_companya;
	private ArrayList<Disco> discos;
	
	public CompanyaAlt() {
		super();
	}

	public CompanyaAlt(String nombre_companya, ArrayList<Disco> discos) {
		super();
		this.nombre_companya = nombre_companya;
		this.discos = discos;
	}

	public String getNombre_companya() {
		return nombre_companya;
	}

	public void setNombre_companya(String nombre_companya) {
		this.nombre_companya = nombre_companya;
	}

	public ArrayList<Disco> getDiscos() {
		return discos;
	}

	public void setDiscos(ArrayList<Disco> discos) {
		this.discos = discos;
	}

}
