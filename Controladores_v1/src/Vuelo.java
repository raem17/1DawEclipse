
public class Vuelo {
	
	private String ciudad_destino;
	private int num_vuelo;
	private double precio;
	
	
	public Vuelo() {
		super();
	}


	public Vuelo(String ciudad_destino, int num_vuelo, double precio) {
		super();
		this.ciudad_destino = ciudad_destino;
		this.num_vuelo = num_vuelo;
		this.precio = precio;
	}


	public String getCiudad_destino() {
		return ciudad_destino;
	}


	public void setCiudad_destino(String ciudad_destino) {
		this.ciudad_destino = ciudad_destino;
	}


	public int getNum_vuelo() {
		return num_vuelo;
	}


	public void setNum_vuelo(int num_vuelo) {
		this.num_vuelo = num_vuelo;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	// Métodos
	
	public void mostrarDatosVuelo() {
		System.out.println("");
		System.out.println("Ciudad de destino: " + this.ciudad_destino);
		System.out.println("Número de vuelo: " + this.num_vuelo);
		System.out.println("Precio del vuelo " + this.precio + " €");
	}
}
