
public class Hipopotamo extends Animal{
	private int num_dientes;
	private int altura_orejas;
	private int nivel_agresividad;
	
	public Hipopotamo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Hipopotamo(String nombre, String procedencia, int altura, double peso) {
		super(nombre, procedencia, altura, peso);
		// TODO Auto-generated constructor stub
	}

	public Hipopotamo(int num_dientes, int altura_orejas, int nivel_agresividad) {
		super();
		this.num_dientes = num_dientes;
		this.altura_orejas = altura_orejas;
		this.nivel_agresividad = nivel_agresividad;
	}

	public Hipopotamo(String nombre, String procedencia, int altura, double peso, int num_dientes, int altura_orejas,
			int nivel_agresividad) {
		super(nombre, procedencia, altura, peso);
		this.num_dientes = num_dientes;
		this.altura_orejas = altura_orejas;
		this.nivel_agresividad = nivel_agresividad;
	}

	public int getNum_dientes() {
		return num_dientes;
	}

	public void setNum_dientes(int num_dientes) {
		this.num_dientes = num_dientes;
	}

	public int getAltura_orejas() {
		return altura_orejas;
	}

	public void setAltura_orejas(int altura_orejas) {
		this.altura_orejas = altura_orejas;
	}

	public int getNivel_agresividad() {
		return nivel_agresividad;
	}

	public void setNivel_agresividad(int nivel_agresividad) {
		this.nivel_agresividad = nivel_agresividad;
	}

	@Override
	public String toString() {
		return "Nº de dientes: " + num_dientes + " - Altura de las orejas: " + altura_orejas + " cm - Nivel de agresividad: "
				+ nivel_agresividad + " - " + super.toString();
	}
}
