package herenciaHospital;

public class Administrativo extends Empleado{
	private String planta;
	private String nivel_excel;
	
	public Administrativo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrativo(String puesto, String nombre, String apellidos, String fecha_nac) {
		super(puesto, nombre, apellidos, fecha_nac);
		// TODO Auto-generated constructor stub
	}

	public Administrativo(String planta, String nivel_excel) {
		super();
		this.planta = planta;
		this.nivel_excel = nivel_excel;
	}

	public Administrativo(String puesto, String nombre, String apellidos, String fecha_nac, String planta,
			String nivel_excel) {
		super(puesto, nombre, apellidos, fecha_nac);
		this.planta = planta;
		this.nivel_excel = nivel_excel;
	}

	public String getPlanta() {
		return planta;
	}

	public void setPlanta(String planta) {
		this.planta = planta;
	}

	public String getNivel_excel() {
		return nivel_excel;
	}

	public void setNivel_excel(String nivel_excel) {
		this.nivel_excel = nivel_excel;
	}

	@Override
	public String toString() {
		return "Planta: " + planta + " - Nivel de Excel: " + nivel_excel + " - " + super.toString();
	}
}
