
public class Animal {
	private String nombre;
	private String procedencia;
	private int altura;
	private double peso;
	
	public Animal() {
		super();
	}

	public Animal(String nombre, String procedencia, int altura, double peso) {
		super();
		this.nombre = nombre;
		this.procedencia = procedencia;
		this.altura = altura;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " - Procedencia: " + procedencia + " - Altura: " + altura + " cm - Peso: " + peso + " kg";
	}
}
