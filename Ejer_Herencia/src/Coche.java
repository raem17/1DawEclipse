
public class Coche extends Vehiculo {
	private String tipoCombustible;

	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coche(int cv, int cc, double peso, double precio) {
		super(cv, cc, peso, precio);
		// TODO Auto-generated constructor stub
	}

	public Coche(String tipoCombustible) {
		super();
		this.tipoCombustible = tipoCombustible;
	}

	public Coche(int cv, int cc, double peso, double precio, String tipoCombustible) {
		super(cv, cc, peso, precio);
		this.tipoCombustible = tipoCombustible;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	@Override
	public String toString() {
		return "Coche - Tipo de combustible: " + this.tipoCombustible + " - " + super.toString();
	}
}
