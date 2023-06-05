package herenciaHospital;

public class Enfermera extends Empleado {
	private String planta;

	public Enfermera() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enfermera(String puesto, String nombre, String apellidos, String fecha_nac) {
		super(puesto, nombre, apellidos, fecha_nac);
		// TODO Auto-generated constructor stub
	}

	public Enfermera(String planta) {
		super();
		this.planta = planta;
	}

	public Enfermera(String puesto, String nombre, String apellidos, String fecha_nac, String planta) {
		super(puesto, nombre, apellidos, fecha_nac);
		this.planta = planta;
	}

	public String getPlanta() {
		return planta;
	}

	public void setPlanta(String planta) {
		this.planta = planta;
	}

	@Override
	public String toString() {
		return "Planta: " + planta + " - " + super.toString();
	}
}
