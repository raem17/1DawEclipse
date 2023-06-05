
public class Vehiculo {

	private int cv;
	private int cc;
	private double peso;
	private double precio;
	
	public Vehiculo() {
		super();
	}

	public Vehiculo(int cv, int cc, double peso, double precio) {
		super();
		this.cv = cv;
		this.cc = cc;
		this.peso = peso;
		this.precio = precio;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "CV: " + cv + " - CC: " + cc + " - Peso: " + peso + " kg - Precio: " + precio + " €";
	}
}
