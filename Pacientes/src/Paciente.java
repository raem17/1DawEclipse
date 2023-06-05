
public class Paciente {
	private int codigo_paciente;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String poblacion;
	private int cod_postal;
	private String telefono;
	private String f_nacimiento;
	
	public Paciente() {
		super();
	}

	public Paciente(int codigo_paciente, String nombre, String apellidos, String direccion, String poblacion,
			int cod_postal, String telefono, String f_nacimiento) {
		super();
		this.codigo_paciente = codigo_paciente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.poblacion = poblacion;
		this.cod_postal = cod_postal;
		this.telefono = telefono;
		this.f_nacimiento = f_nacimiento;
	}

	public int getCodigo_paciente() {
		return codigo_paciente;
	}

	public void setCodigo_paciente(int codigo_paciente) {
		this.codigo_paciente = codigo_paciente;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public int getCod_postal() {
		return cod_postal;
	}

	public void setCod_postal(int cod_postal) {
		this.cod_postal = cod_postal;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getF_nacimiento() {
		return f_nacimiento;
	}

	public void setF_nacimiento(String f_nacimiento) {
		this.f_nacimiento = f_nacimiento;
	}
	
	// Métodos
	public void mostrarDatos() {
		System.out.println("\nCódigo de paciente: " + this.codigo_paciente + ". Nombre: " + this.nombre + ". Apellidos: " + this.apellidos + ". Dirección: " + this.direccion + ". Población: " + this.poblacion + ". Código postal: " + this.cod_postal + ". Teléfono: " + this.telefono + ". Fecha de nacimiento: " + this.f_nacimiento);
	}
	
	public int devolverAñoDeNacimiento() {
		int annio = Integer.parseInt(this.f_nacimiento.split("/")[2]);
		
		return annio;
	}
}













