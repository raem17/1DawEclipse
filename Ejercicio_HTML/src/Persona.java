
public class Persona {
	private String nombre_completo;
	private String descripcion;
	private String correo;
	private String aptitud_1;
	private String aptitud_2;
	private String aptitud_3;
	
	public Persona() {
		super();
	}

	public Persona(String nombre_completo, String descripcion, String correo, String aptitud_1, String aptitud_2,
			String aptitud_3) {
		super();
		this.nombre_completo = nombre_completo;
		this.descripcion = descripcion;
		this.correo = correo;
		this.aptitud_1 = aptitud_1;
		this.aptitud_2 = aptitud_2;
		this.aptitud_3 = aptitud_3;
	}

	public String getNombre_completo() {
		return nombre_completo;
	}

	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getAptitud_1() {
		return aptitud_1;
	}

	public void setAptitud_1(String aptitud_1) {
		this.aptitud_1 = aptitud_1;
	}

	public String getAptitud_2() {
		return aptitud_2;
	}

	public void setAptitud_2(String aptitud_2) {
		this.aptitud_2 = aptitud_2;
	}

	public String getAptitud_3() {
		return aptitud_3;
	}

	public void setAptitud_3(String aptitud_3) {
		this.aptitud_3 = aptitud_3;
	}
}
