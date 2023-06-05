
public class Linea_Venta {
	private double importe;
	private Videojuego videojuego;
	private int unidades;
	
	public Linea_Venta() {
		super();
	}

	public Linea_Venta(double importe, Videojuego videojuego, int unidades) {
		super();
		this.importe = importe;
		this.videojuego = videojuego;
		this.unidades = unidades;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public Videojuego getVideojuego() {
		return videojuego;
	}

	public void setVideojuego(Videojuego videojuego) {
		this.videojuego = videojuego;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	
	
	// Métodos
	public double devolverImpTot_L_Venta() {
		double impTot = this.importe * this.unidades;
		
		return impTot;
	}
}
