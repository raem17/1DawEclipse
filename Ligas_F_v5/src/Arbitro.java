
public class Arbitro {
	private String nombre;
	private String apellidos;
	private String f_nacimiento;
	private int edad;
	private String dni;
	private int antiguedad;
	
	public Arbitro() {
		super();
	}

	public Arbitro(String nombre, String apellidos, String f_nacimiento, int edad, String dni, int antiguedad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.f_nacimiento = f_nacimiento;
		this.edad = edad;
		this.dni = dni;
		this.antiguedad = antiguedad;
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

	public String getF_nacimiento() {
		return f_nacimiento;
	}

	public void setF_nacimiento(String f_nacimiento) {
		this.f_nacimiento = f_nacimiento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
}
