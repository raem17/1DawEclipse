
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

}
