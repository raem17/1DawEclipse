package herenciaHospital;

public class Celador extends Empleado{
	private String planta;
	private int peso;
	
	public Celador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Celador(String puesto, String nombre, String apellidos, String fecha_nac) {
		super(puesto, nombre, apellidos, fecha_nac);
		// TODO Auto-generated constructor stub
	}

	public Celador(String planta, int peso) {
		super();
		this.planta = planta;
		this.peso = peso;
	}

	public Celador(String puesto, String nombre, String apellidos, String fecha_nac, String planta, int peso) {
		super(puesto, nombre, apellidos, fecha_nac);
		this.planta = planta;
		this.peso = peso;
	}

	public String getPlanta() {
		return planta;
	}

	public void setPlanta(String planta) {
		this.planta = planta;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Planta: " + planta + " - Peso: " + peso + " kg - " + super.toString();
	}
}
