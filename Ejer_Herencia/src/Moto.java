
public class Moto extends Vehiculo{
	private int num_Cilindros;

	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Moto(int cv, int cc, double peso, double precio) {
		super(cv, cc, peso, precio);
		// TODO Auto-generated constructor stub
	}

	public Moto(int num_Cilindros) {
		super();
		this.num_Cilindros = num_Cilindros;
	}

	public Moto(int cv, int cc, double peso, double precio, int num_Cilindros) {
		super(cv, cc, peso, precio);
		this.num_Cilindros = num_Cilindros;
	}

	public int getNum_Cilindros() {
		return num_Cilindros;
	}

	public void setNum_Cilindros(int num_Cilindros) {
		this.num_Cilindros = num_Cilindros;
	}

	@Override
	public String toString() {
		return "Moto - Nº de cilindros: " + this.num_Cilindros + " - " + super.toString();
	}
}
