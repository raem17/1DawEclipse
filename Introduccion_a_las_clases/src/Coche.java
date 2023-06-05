
public class Coche {
	
	// Atributos
	
	private int nRuedas;
	private int cv; // caballos
	private int cc;
	private int nPlazas;
	
	private double peso;
	private double precio;
	
	private String color;
	private String marca;
	private String modelo;
	private String matricula;
	
	private boolean encendido;
	
	
	// Constructores (al menos 2)
	
	// Sin nada
	public Coche() {
		super();
	}

	// Con todo
	public Coche(int nRuedas, int cv, int cc, int nPlazas, double peso, double precio, String color, String marca,
			String modelo, String matricula, boolean encendido) {
		super();
		this.nRuedas = nRuedas;
		this.cv = cv;
		this.cc = cc;
		this.nPlazas = nPlazas;
		this.peso = peso;
		this.precio = precio;
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.encendido = encendido;
	}

	// Personalizado
	public Coche(int cv, int cc, double peso, double precio, String marca, boolean encendido) {
		super();
		this.cv = cv;
		this.cc = cc;
		this.peso = peso;
		this.precio = precio;
		this.marca = marca;
		this.encendido = encendido;
	}

	
	// Métodos get o getters
	public int getnRuedas() {
		return nRuedas;
	}


	public int getCv() {
		return cv;
	}


	public int getCc() {
		return cc;
	}


	public int getnPlazas() {
		return nPlazas;
	}


	public double getPeso() {
		return peso;
	}


	public double getPrecio() {
		return precio;
	}


	public String getColor() {
		return color;
	}


	public String getMarca() {
		return marca;
	}


	public String getModelo() {
		return modelo;
	}


	public String getMatricula() {
		return matricula;
	}

	
	
	// Métodos set
	public boolean isEncendido() {
		return encendido;
	}

	public void setnRuedas(int nRuedas) {
		this.nRuedas = nRuedas;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public void setnPlazas(int nPlazas) {
		this.nPlazas = nPlazas;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		} else {
			System.out.println("Peso no actualizado por ser negativo.");
		}
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	
	// Declaramos los métodos propios y específicos
	
	public void mostrarAtributos() {
		
		System.out.println("Nº de ruedas: " + this.nRuedas);
		System.out.println("CV: " + this.cv);
		System.out.println("CC: " + this.cc);
		System.out.println("Nº de plazas: " + this.nPlazas);
		System.out.println("Peso: " + this.peso + " kg");
		System.out.println("Precio: " + this.precio + " €");
		System.out.println("Color: " + this.color);
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Matrícula: " + this.matricula);

		if (this.encendido == true) {
			System.out.println("Encendido: Sí.");
		} else {
			System.out.println("Encendido: No.");
		}
	}
	
	
	public void mostrarPrecioSeguro() {
		
		double resultado = 0;
		
		resultado = ((this.cv + this.cc + this.peso) / 2) * 10;
		
		System.out.println("Precio del seguro: " + resultado + " €");
	}
	
	
	public double calcularPrecioOferta(double porcentaje) {
		
		double precioFinal = 0;
		
		precioFinal = this.precio - (this.precio * (porcentaje/100) );
		
		return precioFinal;
	}

}