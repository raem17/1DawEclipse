
public class Operacion_cuenta {
	private String tipo_Op;
	private String fecha_Op;
	private double valor;
	
	
	public Operacion_cuenta() {
		super();
	}


	public Operacion_cuenta(String tipo_Op, String fecha_Op, double valor) {
		super();
		this.tipo_Op = tipo_Op;
		this.fecha_Op = fecha_Op;
		this.valor = valor;
	}


	public String getTipo_Op() {
		return tipo_Op;
	}


	public void setTipo_Op(String tipo_Op) {
		this.tipo_Op = tipo_Op;
	}


	public String getFecha_Op() {
		return fecha_Op;
	}


	public void setFecha_Op(String fecha_Op) {
		this.fecha_Op = fecha_Op;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	// Métodos 
	
	public boolean esIngresoMayorA500() {
		boolean esIngresoMayorA500 = false;
		
		if (this.tipo_Op == "Ingreso" && this.valor > 500) {
			esIngresoMayorA500 = true;
		}
		
		return esIngresoMayorA500;
	}
}
