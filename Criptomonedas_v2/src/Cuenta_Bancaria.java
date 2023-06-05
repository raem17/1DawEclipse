import java.util.ArrayList;

public class Cuenta_Bancaria {
	private String n_cuenta;
	private double saldo;
	private ArrayList<Operacion_cuenta> historial;
	
	public Cuenta_Bancaria() {
		super();
	}
	
	public Cuenta_Bancaria(String n_cuenta, double saldo, ArrayList<Operacion_cuenta> historial) {
		super();
		this.n_cuenta = n_cuenta;
		this.saldo = saldo;
		this.historial = historial;
	}

	public String getN_cuenta() {
		return n_cuenta;
	}

	public void setN_cuenta(String n_cuenta) {
		this.n_cuenta = n_cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ArrayList<Operacion_cuenta> getHistorial() {
		return historial;
	}

	public void setHistorial(ArrayList<Operacion_cuenta> historial) {
		this.historial = historial;
	}
	
	
	// Métodos
	
	public Double devolverValorTotal () {
		Double valorTotal = 0.0;
		
		for (int i = 0; i < historial.size(); i++) {
			valorTotal = valorTotal + historial.get(i).getValor();
		}
		
		return valorTotal;
	}
}
