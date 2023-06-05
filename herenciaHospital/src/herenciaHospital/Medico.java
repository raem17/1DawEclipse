package herenciaHospital;

public class Medico extends Empleado {
	private String especialidad;
	private int n_intervenciones;
	private int n_consulta;
	
	public Medico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medico(String puesto, String nombre, String apellidos, String fecha_nac) {
		super(puesto, nombre, apellidos, fecha_nac);
		// TODO Auto-generated constructor stub
	}

	public Medico(String especialidad, int n_intervenciones, int n_consulta) {
		super();
		this.especialidad = especialidad;
		this.n_intervenciones = n_intervenciones;
		this.n_consulta = n_consulta;
	}

	public Medico(String puesto, String nombre, String apellidos, String fecha_nac, String especialidad,
			int n_intervenciones, int n_consulta) {
		super(puesto, nombre, apellidos, fecha_nac);
		this.especialidad = especialidad;
		this.n_intervenciones = n_intervenciones;
		this.n_consulta = n_consulta;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getN_intervenciones() {
		return n_intervenciones;
	}

	public void setN_intervenciones(int n_intervenciones) {
		this.n_intervenciones = n_intervenciones;
	}

	public int getN_consulta() {
		return n_consulta;
	}

	public void setN_consulta(int n_consulta) {
		this.n_consulta = n_consulta;
	}

	@Override
	public String toString() {
		return "Especialidad: " + especialidad + " - Nº de intervenciones - " + n_intervenciones + " - Nº de consulta: "
				+ n_consulta + " - " + super.toString();
	}
}
