import java.util.ArrayList;

public class Venta {
	private Empleado emple;
	private String fecha_venta;
	private double importe_tot_venta;
	private Tienda tienda;
	private Cliente cliente;
	private ArrayList<Linea_Venta> lineas_venta;
	
	public Venta() {
		super();
	}

	public Venta(Empleado emple, String fecha_venta, double importe_tot_venta, Tienda tienda, Cliente cliente,
			ArrayList<Linea_Venta> lineas_venta) {
		super();
		this.emple = emple;
		this.fecha_venta = fecha_venta;
		this.importe_tot_venta = importe_tot_venta;
		this.tienda = tienda;
		this.cliente = cliente;
		this.lineas_venta = lineas_venta;
	}

	public Empleado getEmple() {
		return emple;
	}

	public void setEmple(Empleado emple) {
		this.emple = emple;
	}

	public String getFecha_venta() {
		return fecha_venta;
	}

	public void setFecha_venta(String fecha_venta) {
		this.fecha_venta = fecha_venta;
	}

	public double getImporte_tot_venta() {
		return importe_tot_venta;
	}

	public void setImporte_tot_venta(double importe_tot_venta) {
		this.importe_tot_venta = importe_tot_venta;
	}

	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Linea_Venta> getLineas_venta() {
		return lineas_venta;
	}

	public void setLineas_venta(ArrayList<Linea_Venta> lineas_venta) {
		this.lineas_venta = lineas_venta;
	}
	
	
	// Métodos
	
	// Método 5
	public double devolverImpTot() {
		double impTotal = 0.0;
		
		for (int i = 0; i < this.lineas_venta.size(); i++) {
			impTotal = impTotal + this.lineas_venta.get(i).devolverImpTot_L_Venta();
		}
		
		return impTotal;
	}
	
	// Método auxiliar
	public boolean elMesDeVentaEsPar() {
		boolean elMesDeVentaEsPar = false;
		String[] fecha = this.fecha_venta.split("/");
		
		
		if (Integer.parseInt(fecha[1]) % 2 == 0) {
			elMesDeVentaEsPar = true;
		}
		
		return elMesDeVentaEsPar;
	}
	
	/*public ArrayList<Linea_Venta> vacio() {
		
	}*/
	
}
