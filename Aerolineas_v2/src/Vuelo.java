
public class Vuelo {
	private int cod_vuelo;
	private Avion miAvion;
	private Pasajero [] datosPasajeros;
	private Aeropuerto aeropuerto_salida;
	private Aeropuerto aeropuerto_llegada;
	
	
	public Vuelo() {
		super();
	}


	public Vuelo(int cod_vuelo, Avion miAvion, Pasajero[] datosPasajeros, Aeropuerto aeropuerto_salida,
			Aeropuerto aeropuerto_llegada) {
		super();
		this.cod_vuelo = cod_vuelo;
		this.miAvion = miAvion;
		this.datosPasajeros = datosPasajeros;
		this.aeropuerto_salida = aeropuerto_salida;
		this.aeropuerto_llegada = aeropuerto_llegada;
	}


	public Vuelo(int cod_vuelo) {
		super();
		this.cod_vuelo = cod_vuelo;
	}


	public int getCod_vuelo() {
		return cod_vuelo;
	}


	public void setCod_vuelo(int cod_vuelo) {
		this.cod_vuelo = cod_vuelo;
	}


	public Avion getMiAvion() {
		return miAvion;
	}


	public void setMiAvion(Avion miAvion) {
		this.miAvion = miAvion;
	}


	public Pasajero[] getDatosPasajeros() {
		return datosPasajeros;
	}


	public void setDatosPasajeros(Pasajero[] datosPasajeros) {
		this.datosPasajeros = datosPasajeros;
	}


	public Aeropuerto getAeropuerto_salida() {
		return aeropuerto_salida;
	}


	public void setAeropuerto_salida(Aeropuerto aeropuerto_salida) {
		this.aeropuerto_salida = aeropuerto_salida;
	}


	public Aeropuerto getAeropuerto_llegada() {
		return aeropuerto_llegada;
	}


	public void setAeropuerto_llegada(Aeropuerto aeropuerto_llegada) {
		this.aeropuerto_llegada = aeropuerto_llegada;
	}
	
	
	public void mostrarDatosVuelo() {
		System.out.println("****************************************");
		System.out.println("* Vuelo: " + this.cod_vuelo);
		System.out.println("* Aeropuerto de salida: " + this.aeropuerto_salida.getNombre());
		System.out.println("* Aeropuerto de llegada: " + this.aeropuerto_llegada.getNombre());
		System.out.print("* Listado de pasajeros: ");
	
		
		for (int i = 0; i < datosPasajeros.length; i++) {
			System.out.print(datosPasajeros[i].getNombre() + " " + datosPasajeros[i].getApellidos() + ", ");
		}
		System.out.println("");
		System.out.println("*");
		System.out.println("****************************************");
	}
}
