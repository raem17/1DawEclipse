
public class L_Billetera {
	private Criptomoneda criptomoneda;
	private double unidades;
	
	public L_Billetera() {
		super();
	}

	public L_Billetera(Criptomoneda criptomoneda, double unidades) {
		super();
		this.criptomoneda = criptomoneda;
		this.unidades = unidades;
	}

	public Criptomoneda getCriptomoneda() {
		return criptomoneda;
	}

	public void setCriptomoneda(Criptomoneda criptomoneda) {
		this.criptomoneda = criptomoneda;
	}

	public double getUnidades() {
		return unidades;
	}

	public void setUnidades(double unidades) {
		this.unidades = unidades;
	}
	
	
	// Métodos
	
	public Double devolverValorEnEuros_L_Billetera () {
		Double valorEuros = 0.0;
		
		valorEuros = this.unidades * this.criptomoneda.getValor_E();
		
		return valorEuros;
	}
	
	public Double devolverValorEnDolares_L_Billetera () {
		Double valorDolares = 0.0;
		
		valorDolares = this.unidades * this.criptomoneda.getValor_D();
		
		return valorDolares;
	}
	
}
