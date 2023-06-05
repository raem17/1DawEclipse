
public class Jirafa extends Animal{
	private int longitud_pestañas;
	private int num_manchas;
	
	public Jirafa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jirafa(String nombre, String procedencia, int altura, double peso) {
		super(nombre, procedencia, altura, peso);
		// TODO Auto-generated constructor stub
	}

	public Jirafa(int longitud_pestañas, int num_manchas) {
		super();
		this.longitud_pestañas = longitud_pestañas;
		this.num_manchas = num_manchas;
	}

	public Jirafa(String nombre, String procedencia, int altura, double peso, int longitud_pestañas, int num_manchas) {
		super(nombre, procedencia, altura, peso);
		this.longitud_pestañas = longitud_pestañas;
		this.num_manchas = num_manchas;
	}

	public int getLongitud_pestañas() {
		return longitud_pestañas;
	}

	public void setLongitud_pestañas(int longitud_pestañas) {
		this.longitud_pestañas = longitud_pestañas;
	}

	public int getNum_manchas() {
		return num_manchas;
	}

	public void setNum_manchas(int num_manchas) {
		this.num_manchas = num_manchas;
	}

	@Override
	public String toString() {
		return "Longitud de las pestañas: " + longitud_pestañas + " cm - Nº de manchas: " + num_manchas + " - " + super.toString();
	}
}
