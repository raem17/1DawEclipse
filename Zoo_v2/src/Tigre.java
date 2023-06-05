
public class Tigre extends Animal {
	private String color;
	private int num_rallas;
	
	public Tigre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Tigre(String nombre, String procedencia, int altura, double peso) {
		super(nombre, procedencia, altura, peso);
		// TODO Auto-generated constructor stub
	}

	public Tigre(String color, int num_rallas) {
		super();
		this.color = color;
		this.num_rallas = num_rallas;
	}

	public Tigre(String nombre, String procedencia, int altura, double peso, String color, int num_rallas) {
		super(nombre, procedencia, altura, peso);
		this.color = color;
		this.num_rallas = num_rallas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNum_rallas() {
		return num_rallas;
	}

	public void setNum_rallas(int num_rallas) {
		this.num_rallas = num_rallas;
	}

	@Override
	public String toString() {
		return "Color: " + color + " - Nº de rallas: " + num_rallas + " - " + super.toString();
	}
}
