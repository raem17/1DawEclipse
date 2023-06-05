
public class Comandante {
	private String nombre;
	private String apellidos;
	private String telefono;
	private String dni;
	private int edad;
	private String rango;
	
	
	public Comandante() {
		super();
	}


	public Comandante(String nombre, String apellidos, String telefono, String dni, int edad, String rango) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.dni = dni;
		this.edad = edad;
		this.rango = rango;
	}


	public Comandante(String dni) {
		super();
		this.dni = dni;
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


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getRango() {
		return rango;
	}


	public void setRango(String rango) {
		this.rango = rango;
	}
	
	
	public void mostrarDatosComandante  () {
		System.out.println("****************************************");
		System.out.println("* Nombre y apellidos: " + this.nombre + " " + this.apellidos);
		System.out.println("* DNI: " + this.dni);
		System.out.println("* Edad: " + this.edad);
		System.out.println("* Rango: " + this.rango);
		System.out.println("*");
		System.out.println("****************************************");
	}
	
	
	public void nombreSiRango (String rango) {
		if (this.rango.equalsIgnoreCase(rango)) {
			System.out.println("****************************************");
			System.out.println("* Nombre y apellidos: " + this.nombre + " " + this.apellidos);
			System.out.println("****************************************");
		}
	}
}
