import java.util.Scanner;

public class Padawan {
	Scanner scnum = new Scanner(System.in);
	
	private String nombre;
	private int edad;
	private int fuerza;
	private int potencial;
	private String planeta_procedencia;
	
	
	// Constructores
	
	public Padawan() {
		super();
	}


	public Padawan(String nombre, int edad, int fuerza, int potencial, String planeta_procedencia) {
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
	
	
	// Métodos
	
	public void mostrarDatosPadawan() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);
		System.out.println("Fuerza: " + this.fuerza);
		System.out.println("Potencial: " + this.potencial);
		System.out.println("Planeta de procedencia: " + this.planeta_procedencia);
	}
	
	
	static void mostrarDatosPadawanConcreto(Padawan [] datosPadawans) {
		Scanner sctxt = new Scanner (System.in);
		String nombre = "";
		boolean existe = false;
		
		
		System.out.println("Introduzca el nombre del padawan:");
		nombre = sctxt.nextLine();
		
		
		for (int i = 0; i < datosPadawans.length; i++) {
			if (datosPadawans[i].getNombre().equals(nombre)) {
				existe = true;
				
				datosPadawans[i].mostrarDatosPadawan();
			}
		}
		
		
		if (existe == false) {
			System.out.println("El padawan no existe.");
		}
	}
	
	
	static void mostrarNombresPadawansPotencialSuperior(Padawan [] datosPadawans) {
		Scanner scnum = new Scanner (System.in);
		int valor = 0;
		
		
		System.out.println("Introduzca el valor (potencial):");
		valor = scnum.nextInt();
		
		
		for (int i = 0; i < datosPadawans.length; i++) {
			if (datosPadawans[i].getPotencial() > valor) {
				System.out.println(datosPadawans[i].getNombre());
			}
		}
	}
	
	
	static void mostrarDatosPadawanMenorPotencial(Padawan [] datosPadawans) {
		System.out.println("");
		
		int potencialMin = 0;
		String padawanPotencialMin = "";
		
		// Declaro potencialMin como el potencial del último padawan
		// Declaro padawanPotencialMin como el nombre del último padawan
		for (int i = 0; i < datosPadawans.length; i++) {
			potencialMin = datosPadawans[i].getPotencial();
			padawanPotencialMin = datosPadawans[i].getNombre();
		}
		
		
		// Busco el padawan con menor potencial
		for (int i = 0; i < datosPadawans.length; i++) {
			if (potencialMin > datosPadawans[i].getPotencial()) {
				potencialMin = datosPadawans[i].getPotencial();
				padawanPotencialMin = datosPadawans[i].getNombre();
			}
		}
		
		
		for (int i = 0; i < datosPadawans.length; i++) {
			if (datosPadawans[i].getNombre().equals(padawanPotencialMin)) {				
				datosPadawans[i].mostrarDatosPadawan();
				System.out.println("");
			}
		}
	}
	
	static void mostrarDatosPadawansLetraInicioOFin(Padawan [] datosPadawans) {
		Scanner sctxt = new Scanner(System.in);
		char letra = ' ';
		
		System.out.println("Introduzca la letra:");
		letra = sctxt.nextLine().charAt(0);
		
		
		for (int i = 0; i < datosPadawans.length; i++) {
			if (datosPadawans[i].getNombre().startsWith(String.valueOf(letra)) || datosPadawans[i].getNombre().endsWith(String.valueOf(letra)) ) {
				datosPadawans[i].mostrarDatosPadawan();
				System.out.println("");
			}
		}
	}
	
	
	static void setNombresPadawansEnMinus(Padawan [] datosPadawans) {
		for (int i = 0; i < datosPadawans.length; i++) {
			datosPadawans[i].setNombre(datosPadawans[i].getNombre().toLowerCase());
		}
	}
}
