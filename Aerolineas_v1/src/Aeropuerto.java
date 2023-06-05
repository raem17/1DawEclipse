
public class Aeropuerto {
	private String nombre;
	private String ciudad;
	private int codigo_aeropuerto;
	
	
	public Aeropuerto() {
		super();
	}


	public Aeropuerto(String nombre, String ciudad, int codigo_aeropuerto) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.codigo_aeropuerto = codigo_aeropuerto;
	}


	public Aeropuerto(int codigo_aeropuerto) {
		super();
		this.codigo_aeropuerto = codigo_aeropuerto;
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


	public int getCodigo_aeropuerto() {
		return codigo_aeropuerto;
	}


	public void setCodigo_aeropuerto(int codigo_aeropuerto) {
		this.codigo_aeropuerto = codigo_aeropuerto;
	}
	
	
	public void mostrarDatosAeropuerto   () {
		System.out.println("****************************************");
		System.out.println("* Aeropuerto: " + this.nombre);
		System.out.println("* Ciudad: " + this.ciudad);
		System.out.println("* Código: " + this.codigo_aeropuerto);
		System.out.println("*");
		System.out.println("****************************************");
	}
	
	
	public void mostrarDatosCod (int numero) {
		if (this.codigo_aeropuerto < numero) {
			mostrarDatosAeropuerto();
		}
	}
}
