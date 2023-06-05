
public class Pasajero {
	private String nombre;
	private String apellidos;
	private String DNI;
	private int edad;
	private String provincia;
	
	
	public Pasajero() {
		super();
	}


	public Pasajero(String nombre, String apellidos, String DNI, int edad, String provincia) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.DNI = DNI;
		this.edad = edad;
		this.provincia = provincia;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		DNI = dNI;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
	public void mostrarDatos() {
		System.out.println("Nombre del pasajero: " + this.nombre);
		System.out.println("Apellidos del pasajero: " + this.apellidos);
		System.out.println("DNI del pasajero: " + this.DNI);
		System.out.println("Edad del pasajero: " + this.edad);
		System.out.println("Provincia del pasajero: " + this.provincia);
		System.out.println("");
	}
}
