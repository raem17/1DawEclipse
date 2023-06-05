
public class Profesor {
	private int id;
	private String nombre;
	private String curso;
	private String especialidad;
	private String horario_manniana;
	private String horario_tarde;
	private String cargo;
	
	public Profesor() {
		super();
	}

	public Profesor(int id, String nombre, String curso, String especialidad, String horario_manniana,
			String horario_tarde, String cargo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.curso = curso;
		this.especialidad = especialidad;
		this.horario_manniana = horario_manniana;
		this.horario_tarde = horario_tarde;
		this.cargo = cargo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getHorario_manniana() {
		return horario_manniana;
	}

	public void setHorario_manniana(String horario_manniana) {
		this.horario_manniana = horario_manniana;
	}

	public String getHorario_tarde() {
		return horario_tarde;
	}

	public void setHorario_tarde(String horario_tarde) {
		this.horario_tarde = horario_tarde;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
