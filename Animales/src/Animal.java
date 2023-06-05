
public class Animal {
	private String id;
	private double altura;
	private double peso;
	private int edad;
	private String nombre;
	private String tipo;
	private String especie;
	private double nivel_fuerza;
	private boolean mimoso;
	private String sonido;
	private String propietario;
	
	public Animal() {
		super();
	}

	public Animal(String id, double altura, double peso, int edad, String nombre, String tipo, String especie,
			double nivel_fuerza, boolean mimoso, String sonido, String propietario) {
		super();
		this.id = id;
		this.altura = altura;
		this.peso = peso;
		this.edad = edad;
		this.nombre = nombre;
		this.tipo = tipo;
		this.especie = especie;
		this.nivel_fuerza = nivel_fuerza;
		this.mimoso = mimoso;
		this.sonido = sonido;
		this.propietario = propietario;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public double getNivel_fuerza() {
		return nivel_fuerza;
	}

	public void setNivel_fuerza(double nivel_fuerza) {
		this.nivel_fuerza = nivel_fuerza;
	}

	public boolean isMimoso() {
		return mimoso;
	}

	public void setMimoso(boolean mimoso) {
		this.mimoso = mimoso;
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	
	public void mostrarDatos() {
		String esMimoso = "No";
		if (this.isMimoso()) {
			esMimoso = "Sí";
		}
		
		System.out.println("ID: " + this.id + " - Altura: " + this.altura + " - Peso: " + this.peso + " - Edad: " + this.edad + " - Nombre: " + this.nombre
				+ " -  Tipo: " + this.tipo + " -  Especie: " + this.especie + " - Nivel de fuerza: " + this.nivel_fuerza + " - Es mimoso: " + esMimoso + " - Sonido: "
				+ this.sonido + " - Propietarios: " + this.propietario);
	}
	
	public void mostrarDatosDomesticos() {
		String esMimoso = "No";
		if (this.isMimoso()) {
			esMimoso = "Sí";
		}
		
		System.out.println("ID: " + this.id + " - Altura: " + this.altura + " cm - Peso: " + this.peso + " kg - Edad: " + this.edad + " años - Nombre: " + this.nombre
				+ " -  Tipo: " + this.tipo + " -  Especie: " + this.especie + " - Es mimoso: " + esMimoso + " - Sonido: "
				+ this.sonido + " - Propietarios: " + this.propietario);
	}
}
