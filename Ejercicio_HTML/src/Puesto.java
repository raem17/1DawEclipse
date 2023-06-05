
public class Puesto {
	private String nombre_puesto;
	private String nombre_empleador;
	private String ciudad;
	private String comunidad_autonoma;
	private int año_inicio;
	private String actividad_1;
	private String actividad_2;
	private String actividad_3;
	
	public Puesto() {
		super();
	}

	public Puesto(String nombre_puesto, String nombre_empleador, String ciudad, String comunidad_autonoma,
			int año_inicio, String actividad_1, String actividad_2, String actividad_3) {
		super();
		this.nombre_puesto = nombre_puesto;
		this.nombre_empleador = nombre_empleador;
		this.ciudad = ciudad;
		this.comunidad_autonoma = comunidad_autonoma;
		this.año_inicio = año_inicio;
		this.actividad_1 = actividad_1;
		this.actividad_2 = actividad_2;
		this.actividad_3 = actividad_3;
	}

	public String getNombre_puesto() {
		return nombre_puesto;
	}

	public void setNombre_puesto(String nombre_puesto) {
		this.nombre_puesto = nombre_puesto;
	}

	public String getNombre_empleador() {
		return nombre_empleador;
	}

	public void setNombre_empleador(String nombre_empleador) {
		this.nombre_empleador = nombre_empleador;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getComunidad_autonoma() {
		return comunidad_autonoma;
	}

	public void setComunidad_autonoma(String comunidad_autonoma) {
		this.comunidad_autonoma = comunidad_autonoma;
	}

	public int getAño_inicio() {
		return año_inicio;
	}

	public void setAño_inicio(int año_inicio) {
		this.año_inicio = año_inicio;
	}

	public String getActividad_1() {
		return actividad_1;
	}

	public void setActividad_1(String actividad_1) {
		this.actividad_1 = actividad_1;
	}

	public String getActividad_2() {
		return actividad_2;
	}

	public void setActividad_2(String actividad_2) {
		this.actividad_2 = actividad_2;
	}

	public String getActividad_3() {
		return actividad_3;
	}

	public void setActividad_3(String actividad_3) {
		this.actividad_3 = actividad_3;
	}

}
