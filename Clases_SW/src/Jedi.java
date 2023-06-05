import java.util.Scanner;

public class Jedi {
	Scanner scnum = new Scanner(System.in);
	
	private String nombre;
	private int edad;
	private int fuerza;
	private int potencial;
	private String planeta_procedencia;
	private String color_laser;
	
	
	// Constructores
	
	public Jedi() {
		super();
	}


	public Jedi(String nombre, int edad, int fuerza, int potencial, String planeta_procedencia, String color_laser) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.fuerza = fuerza;
		this.potencial = potencial;
		this.planeta_procedencia = planeta_procedencia;
	}

	
	// Getters y setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getFuerza() {
		return fuerza;
	}


	public void setFuerza(int fuerza) {
		
		do {
			if (fuerza >= 0 && fuerza <= 10) {
				this.fuerza = fuerza;
			} else {
				System.out.println("La fuerza debe estar entre el 0 y el 10. Introduzca de nuevo.");
				fuerza = scnum.nextInt();
				this.fuerza = fuerza;
			}
			
		} while (fuerza < 0 || fuerza > 10);
		
	}


	public int getPotencial() {
		return potencial;
	}


	public void setPotencial(int potencial) {
		this.potencial = potencial;
	}


	public String getPlaneta_procedencia() {
		return planeta_procedencia;
	}


	public void setPlaneta_procedencia(String planeta_procedencia) {
		this.planeta_procedencia = planeta_procedencia;
	}
	
	
	public String getColor_laser() {
		return color_laser;
	}


	public void setColor_laser(String color_laser) {
		this.color_laser = color_laser;
	}

	
	// Métodos
	
	public void mostrarDatosJedi() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);
		System.out.println("Fuerza: " + this.fuerza);
		System.out.println("Potencial: " + this.potencial);
		System.out.println("Planeta de procedencia: " + this.planeta_procedencia);
		System.out.println("Color de la espada láser: " + this.color_laser);
	}
	
	
	static void mostrarDatosJediConcreto(Jedi [] datosJedis) {
		Scanner sctxt = new Scanner (System.in);
		String nombre = "";
		boolean existe = false;
		
		
		System.out.println("Introduzca el nombre del jedi:");
		nombre = sctxt.nextLine();
		
		
		for (int i = 0; i < datosJedis.length; i++) {
			if (datosJedis[i].getNombre().equals(nombre)) {
				existe = true;
				
				datosJedis[i].mostrarDatosJedi();
			}
		}
		
		
		if (existe == false) {
			System.out.println("El jedi no existe.");
		}
	}
	
	
	static void setNombresJedisEnMayus(Jedi [] datosJedis) {
		for (int i = 0; i < datosJedis.length; i++) {
			datosJedis[i].setNombre(datosJedis[i].getNombre().toUpperCase());
		}
	}
	
	static void dosJedisMasNivelFuerza(Jedi [] datosJedis) {
		Jedi aux;
		
		
		// Lo ordena de menor a mayor según la fuerza
		for (int i = 0; i < datosJedis.length; i++) {
			for (int j = 0; j < datosJedis.length-1; j++) {
				if (datosJedis[j+1].getFuerza() < datosJedis[j].getFuerza()) {
					aux = datosJedis[j+1]; // recuerda
					datosJedis[j+1] = datosJedis[j];
					datosJedis[j] = aux;
				}
			}
		}
		
		
		for (int i = datosJedis.length-2; i < datosJedis.length; i++) {
			datosJedis[i].mostrarDatosJedi();
			System.out.println("");
		}
	}
}
