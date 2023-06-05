
public class Camion extends Vehiculo{
	private int num_Ejes;

	public Camion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Camion(int cv, int cc, double peso, double precio) {
		super(cv, cc, peso, precio);
		// TODO Auto-generated constructor stub
	}

	public Camion(int num_Ejes) {
		super();
		this.num_Ejes = num_Ejes;
	}

	public Camion(int cv, int cc, double peso, double precio, int num_Ejes) {
		super(cv, cc, peso, precio);
		this.num_Ejes = num_Ejes;
	}

	public int getnum_Ejes() {
		return num_Ejes;
	}

	public void setnum_Ejes(int num_Ejes) {
		this.num_Ejes = num_Ejes;
	}

	@Override
	public String toString() {
		return "Camión - Nº de ejes: " + this.num_Ejes + " - " + super.toString();
	}

}
