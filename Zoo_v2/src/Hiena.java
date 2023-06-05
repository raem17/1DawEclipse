
public class Hiena extends Animal{
	private int velocidad;
	private int nivel_risa;
	
	public Hiena() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hiena(String nombre, String procedencia, int altura, double peso) {
		super(nombre, procedencia, altura, peso);
		// TODO Auto-generated constructor stub
	}

	public Hiena(int velocidad, int nivel_risa) {
		super();
		this.velocidad = velocidad;
		this.nivel_risa = nivel_risa;
	}

	public Hiena(String nombre, String procedencia, int altura, double peso, int velocidad, int nivel_risa) {
		super(nombre, procedencia, altura, peso);
		this.velocidad = velocidad;
		this.nivel_risa = nivel_risa;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getNivel_risa() {
		return nivel_risa;
	}

	public void setNivel_risa(int nivel_risa) {
		this.nivel_risa = nivel_risa;
	}

	@Override
	public String toString() {
		return "Velocidad: " + velocidad + " - Nivel de risa: " + nivel_risa + " - " + super.toString();
	}
}
