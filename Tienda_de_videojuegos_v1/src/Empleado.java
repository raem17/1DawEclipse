
public class Empleado {
	private String nombre;
	private String apellidos;
	private String direccion;
	private String dni;
	private String num_empleado;
	
	public Empleado() {
		super();
	}

	public Empleado(String nombre, String apellidos, String direccion, String dni, String num_empleado) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.dni = dni;
		this.num_empleado = num_empleado;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNum_empleado() {
		return num_empleado;
	}

	public void setNum_empleado(String num_empleado) {
		this.num_empleado = num_empleado;
	}
}
