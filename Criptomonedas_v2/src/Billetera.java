import java.util.ArrayList;

public class Billetera {
	private String n_billetera;
	private double saldo;
	private ArrayList<L_Billetera> lineas_B;
	
	public Billetera() {
		super();
	}

	public Billetera(String n_billetera, double saldo, ArrayList<L_Billetera> lineas_B) {
		super();
		this.n_billetera = n_billetera;
		this.saldo = saldo;
		this.lineas_B = lineas_B;
	}

	public String getN_billetera() {
		return n_billetera;
	}

	public void setN_billetera(String n_billetera) {
		this.n_billetera = n_billetera;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ArrayList<L_Billetera> getLineas_B() {
		return lineas_B;
	}

	public void setLineas_B(ArrayList<L_Billetera> lineas_B) {
		this.lineas_B = lineas_B;
	}
	
	
	// Métodos
	
	public Double devolverValorEnEurosBilletera() {
		Double valorEuros = 0.0;
		
		
		for (int i = 0; i < lineas_B.size(); i++) {
			valorEuros = valorEuros + lineas_B.get(i).devolverValorEnEuros_L_Billetera();
		}
		
		
		return valorEuros;
	}
	
	public Double devolverValorBilleteraEurosEnBitcoins() {
		Double valor = 0.0;
		
		for (int i = 0; i < lineas_B.size(); i++) {
			if (lineas_B.get(i).getCriptomoneda().getNombre().equalsIgnoreCase("Bitcoin")) {
				valor = valor + lineas_B.get(i).devolverValorEnEuros_L_Billetera();
			}
		}
		
		return valor;
	}
	
	public Double devolverUdsMonedaIntroducida (String nombreCriptomoneda) {
		Double uds = 0.0;
		
		for (int i = 0; i < this.lineas_B.size(); i++) {
			if (this.lineas_B.get(i).getCriptomoneda().getNombre().equalsIgnoreCase(nombreCriptomoneda)) {
				uds = uds + this.lineas_B.get(i).getUnidades();
			}
		}
		
		return uds;
	}
}
