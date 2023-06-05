
public class Formacion {
	private String tipo;
	private String nombre_titulación;
	private int año_finalizacion;
	private String nombre_institucion;
	private String ciudad_institucion;
	
	public Formacion() {
		super();
	}

	public Formacion(String tipo, String nombre_titulación, int año_finalizacion, String nombre_institucion,
			String ciudad_institucion) {
		super();
		this.tipo = tipo;
		this.nombre_titulación = nombre_titulación;
		this.año_finalizacion = año_finalizacion;
		this.nombre_institucion = nombre_institucion;
		this.ciudad_institucion = ciudad_institucion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre_titulación() {
		return nombre_titulación;
	}

	public void setNombre_titulación(String nombre_titulación) {
		this.nombre_titulación = nombre_titulación;
	}

	public int getAño_finalizacion() {
		return año_finalizacion;
	}

	public void setAño_finalizacion(int año_finalizacion) {
		this.año_finalizacion = año_finalizacion;
	}

	public String getNombre_institucion() {
		return nombre_institucion;
	}

	public void setNombre_institucion(String nombre_institucion) {
		this.nombre_institucion = nombre_institucion;
	}

	public String getCiudad_institucion() {
		return ciudad_institucion;
	}

	public void setCiudad_institucion(String ciudad_institucion) {
		this.ciudad_institucion = ciudad_institucion;
	}

}
