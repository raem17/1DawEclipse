
public class Criptomoneda {
	private String nombre;
	private double valor_E;
	private double valor_D;
	private double capitalizacion;
	
	public Criptomoneda() {
		super();
	}

	public Criptomoneda(String nombre, double valor_E, double valor_D, double capitalizacion) {
		super();
		this.nombre = nombre;
		this.valor_E = valor_E;
		this.valor_D = valor_D;
		this.capitalizacion = capitalizacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValor_E() {
		return valor_E;
	}

	public void setValor_E(double valor_E) {
		this.valor_E = valor_E;
	}

	public double getValor_D() {
		return valor_D;
	}

	public void setValor_D(double valor_D) {
		this.valor_D = valor_D;
	}

	public double getCapitalizacion() {
		return capitalizacion;
	}

	public void setCapitalizacion(double capitalizacion) {
		this.capitalizacion = capitalizacion;
	}
}
