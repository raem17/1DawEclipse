package herenciaHospital;

public class Empleado {
	private String puesto; 
	private String nombre; 
	private String apellidos; 
	private String fecha_nac;
	
	public Empleado() {
		super();
	}

	public Empleado(String puesto, String nombre, String apellidos, String fecha_nac) {
		super();
		this.puesto = puesto;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha_nac = fecha_nac;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
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

	public String getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	@Override
	public String toString() {
		return "Puesto: " + puesto + " - Nombre: " + nombre + " - Apellidos: " + apellidos + " - Fecha de nacimiento: " + fecha_nac;
	}
}
