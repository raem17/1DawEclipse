
public class Estadis_Marcador {
	private String marcador;
	private int num_repeticiones;
	
	public Estadis_Marcador() {
		super();
	}

	public Estadis_Marcador(String marcador, int num_repeticiones) {
		super();
		this.marcador = marcador;
		this.num_repeticiones = num_repeticiones;
	}

	public String getMarcador() {
		return marcador;
	}

	public void setMarcador(String marcador) {
		this.marcador = marcador;
	}

	public int getNum_repeticiones() {
		return num_repeticiones;
	}

	public void setNum_repeticiones(int num_repeticiones) {
		this.num_repeticiones = num_repeticiones;
	}
	
	public void agregarRepeticiones(int repes) {
		this.num_repeticiones = this.num_repeticiones + repes;
	}
}
