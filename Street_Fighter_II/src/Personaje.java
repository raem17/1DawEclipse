/**
 * Esta clase define objetos con los siguientes atributos: nombre_personaje, pais_de_procedencia, historia, altura, peso, color_pelo, vestimenta, escenario, puntos_vida, velocidad y fuerza.
 * @author roger
 *
 */
public class Personaje {
	private String nombre_personaje;
	private String pais_de_procedencia;
	private String historia;
	private double altura;
	private double peso;
	private String color_pelo;
	private String vestimenta;
	private String escenario;
	private double puntos_vida;
	private double velocidad;
	private double fuerza;
	
	/**
	 * 
	 */
	public Personaje() {
		super();
	}

	/**
	 * @param nombre_personaje String
	 * @param pais_de_procedencia String
	 * @param historia String
	 * @param altura double
	 * @param peso double
	 * @param color_pelo String
	 * @param vestimenta String
	 * @param escenario String
	 * @param puntos_vida double
	 * @param velocidad double
	 * @param fuerza double
	 */
	public Personaje(String nombre_personaje, String pais_de_procedencia, String historia, double altura, double peso,
			String color_pelo, String vestimenta, String escenario, double puntos_vida, double velocidad,
			double fuerza) {
		super();
		this.nombre_personaje = nombre_personaje;
		this.pais_de_procedencia = pais_de_procedencia;
		this.historia = historia;
		this.altura = altura;
		this.peso = peso;
		this.color_pelo = color_pelo;
		this.vestimenta = vestimenta;
		this.escenario = escenario;
		this.puntos_vida = puntos_vida;

		if (fuerza < 1 || fuerza > 10) {
			System.out.println("Velocidad no establecida, el rango debe estar entre 1 y 10.");
		} else {
			this.velocidad = velocidad;
		}
	}
	
	/**
	 * @return the nombre_personaje
	 */
	public String getNombre_personaje() {
		return nombre_personaje;
	}

	/**
	 * @param nombre_personaje the nombre_personaje to set
	 */
	public void setNombre_personaje(String nombre_personaje) {
		this.nombre_personaje = nombre_personaje;
	}

	/**
	 * @return the pais_de_procedencia
	 */
	public String getPais_de_procedencia() {
		return pais_de_procedencia;
	}

	/**
	 * @param pais_de_procedencia the pais_de_procedencia to set
	 */
	public void setPais_de_procedencia(String pais_de_procedencia) {
		this.pais_de_procedencia = pais_de_procedencia;
	}

	/**
	 * @return the historia
	 */
	public String getHistoria() {
		return historia;
	}

	/**
	 * @param historia the historia to set
	 */
	public void setHistoria(String historia) {
		this.historia = historia;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return the color_pelo
	 */
	public String getColor_pelo() {
		return color_pelo;
	}

	/**
	 * @param color_pelo the color_pelo to set
	 */
	public void setColor_pelo(String color_pelo) {
		this.color_pelo = color_pelo;
	}

	/**
	 * @return the vestimenta
	 */
	public String getVestimenta() {
		return vestimenta;
	}

	/**
	 * @param vestimenta the vestimenta to set
	 */
	public void setVestimenta(String vestimenta) {
		this.vestimenta = vestimenta;
	}

	/**
	 * @return the escenario
	 */
	public String getEscenario() {
		return escenario;
	}

	/**
	 * @param escenario the escenario to set
	 */
	public void setEscenario(String escenario) {
		this.escenario = escenario;
	}

	/**
	 * @return the puntos_vida
	 */
	public double getPuntos_vida() {
		return puntos_vida;
	}

	/**
	 * @param puntos_vida the puntos_vida to set
	 */
	public void setPuntos_vida(double puntos_vida) {
		this.puntos_vida = puntos_vida;
	}

	/**
	 * 
	 * @return the velocidad
	 */
	public double getVelocidad() {
		return velocidad;
	}

	/**
	 * 
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(double velocidad) {
		if (fuerza < 1 || fuerza > 10) {
			System.out.println("Velocidad no establecida, el rango debe estar entre 1 y 10.");
		} else {
			this.velocidad = velocidad;
		}
	}

	/**
	 * 
	 * @return the fuerza
	 */
	public double getFuerza() {
		return fuerza;
	}

	/**
	 * 
	 * @param fuerza the fuerza to set
	 */
	public void setFuerza(double fuerza) {
		if (fuerza < 1 || fuerza > 10) {
			System.out.println("Fuerza no establecida, el rango debe estar entre 1 y 10.");
		} else {
			this.fuerza = fuerza;
		}
	}
	
	// Métodos

	/**
	 * Devuelve el dannio afligido del personaje segun el tipo de ataque recibido por parametro.
	 * @param tipo_ataque El tipo de ataque (String).
	 * @return El dannio afligido (double).
	 */
	public double ataque (String tipo_ataque) {
		double damage = 0.0;
		
		if (tipo_ataque.equalsIgnoreCase("punnio_rapido")) {
			damage = this.fuerza * 0.3;
		} else if (tipo_ataque.equalsIgnoreCase("punnio_lento")) {
			damage = this.fuerza * 0.7;
		} else if (tipo_ataque.equalsIgnoreCase("patada_rapida")) {
			damage = this.fuerza * 0.5;
		} else if (tipo_ataque.equalsIgnoreCase("patada_lenta")) {
			damage = this.fuerza * 1;
		} else if (tipo_ataque.equalsIgnoreCase("agarre_rapido")) {
			damage = this.fuerza * 3;
		} else if (tipo_ataque.equalsIgnoreCase("agarre_lento")) {
			damage = this.fuerza * 5;
		} else if (tipo_ataque.equalsIgnoreCase("ataque_especial_1")) {
			damage = this.fuerza * 1.5;
		} else if (tipo_ataque.equalsIgnoreCase("ataque_especial_2")) {
			damage = this.fuerza * 2;
		} else if (tipo_ataque.equalsIgnoreCase("ataque_especial_3")) {
			damage = this.fuerza * 3;
		}
		
		return damage;
	}
	
	/**
	 * Resta el dannio pasado por parametro a los puntos de vida del personaje.
	 * @param dannio Valor que se restara a los puntos de vida del personaje.
	 */
	public void restarVida(double dannio) {
		this.puntos_vida = this.puntos_vida - dannio;
	}
}
