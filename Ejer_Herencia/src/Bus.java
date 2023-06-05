
public class Bus extends Vehiculo{
	private int num_Plazas;

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bus(int cv, int cc, double peso, double precio) {
		super(cv, cc, peso, precio);
		// TODO Auto-generated constructor stub
	}

	public Bus(int num_Plazas) {
		super();
		this.num_Plazas = num_Plazas;
	}

	public Bus(int cv, int cc, double peso, double precio, int num_Plazas) {
		super(cv, cc, peso, precio);
		this.num_Plazas = num_Plazas;
	}

	public int getNum_Plazas() {
		return num_Plazas;
	}

	public void setNum_Plazas(int num_Plazas) {
		this.num_Plazas = num_Plazas;
	}

	@Override
	public String toString() {
		return "Bus - Nº de plazas: " + this.num_Plazas + " - " + super.toString();
	}

}
