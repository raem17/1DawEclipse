
public class Aerolinea {
	
	private String nombre;
	private String pais_origen;
	
	
	public Aerolinea() {
		super();
	}


	public Aerolinea(String nombre, String pais_origen) {
		super();
		this.nombre = nombre;
		this.pais_origen = pais_origen;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPais_origen() {
		return pais_origen;
	}


	public void setPais_origen(String pais_origen) {
		this.pais_origen = pais_origen;
	}
	
	
	// Métodos
	
	public void mostrarDatosAerolinea () {
		System.out.println("");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("País de origen: " + this.pais_origen);
	}
}
