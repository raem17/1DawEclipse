
public class Avion {
	private int modelo;
	private int capacidadPasajeros;
	private String matricula;
	private double capacidadDeposito;
	private int añoFabricacion;
	
	
	public Avion() {
		super();
	}


	public Avion(int modelo, int capacidadPasajeros, String matricula, double capacidadDeposito,
			int añoFabricacion) {
		super();
		this.modelo = modelo;
		this.capacidadPasajeros = capacidadPasajeros;
		this.matricula = matricula;
		this.capacidadDeposito = capacidadDeposito;
		this.añoFabricacion = añoFabricacion;
	}


	public Avion(String matricula) {
		super();
		this.matricula = matricula;
	}


	public int getModelo() {
		return modelo;
	}


	public void setModelo(int modelo) {
		this.modelo = modelo;
	}


	public int getCapacidadPasajeros() {
		return capacidadPasajeros;
	}


	public void setCapacidadPasajeros(int capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public double getCapacidadDeposito() {
		return capacidadDeposito;
	}


	public void setCapacidadDeposito(double capacidadDeposito) {
		this.capacidadDeposito = capacidadDeposito;
	}


	public int getAñoFabricacion() {
		return añoFabricacion;
	}


	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}
	
	
	public void mostrarDatosAvion () {
		System.out.println("****************************************");
		System.out.println("* Modelo Avión: " + this.modelo);
		System.out.println("* Capacidad: " + this.capacidadPasajeros + " pasajeros.");
		System.out.println("* Matrícula: " + this.matricula);
		System.out.println("* Capacidad de depósito: " + this.capacidadDeposito + " litros");
		System.out.println("* Año de fabricación: " + this.añoFabricacion);
		System.out.println("*");
		System.out.println("****************************************");
	}
}
