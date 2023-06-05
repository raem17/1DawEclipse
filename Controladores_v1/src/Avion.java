
public class Avion {
	
	private String marca;
	private String modelo;
	private String matricula;
	private double capacidad_deposito;
	private int capacidad_pasajeros;
	
	
	public Avion() {
		super();
	}


	public Avion(String marca, String modelo, String matricula, double capacidad_deposito, int capacidad_pasajeros) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.capacidad_deposito = capacidad_deposito;
		this.capacidad_pasajeros = capacidad_pasajeros;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public double getCapacidad_deposito() {
		return capacidad_deposito;
	}


	public void setCapacidad_deposito(double capacidad_deposito) {
		this.capacidad_deposito = capacidad_deposito;
	}


	public int getCapacidad_pasajeros() {
		return capacidad_pasajeros;
	}


	public void setCapacidad_pasajeros(int capacidad_pasajeros) {
		this.capacidad_pasajeros = capacidad_pasajeros;
	}
	
	
	// Métodos
	
	public void mostrarDatosAvion() {
		System.out.println("");
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Capacidad del depósito: " + this.capacidad_deposito);
		System.out.println("Capacidad de pasajeros: " + this.capacidad_pasajeros);
	}
	
	
	public void incrementoDeposito(double valor) {
		this.capacidad_deposito = this.capacidad_deposito + valor;
	}
	
	
	public void incrementoCapacidadPasajeros(int valor) {
		this.capacidad_pasajeros = this.capacidad_pasajeros + valor;
	}
}
