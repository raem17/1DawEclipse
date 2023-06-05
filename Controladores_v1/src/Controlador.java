import java.util.Scanner;

public class Controlador {
	Scanner scnum = new Scanner(System.in);

	private String nombre;
	private String apellidos;
	private String DNI;
	private int año_nacimiento;
	private int años_experiencia;
	private int nivel_destreza;
	
	
	public Controlador() {
		super();
	}


	public Controlador(String nombre, String apellidos, String DNI, int año_nacimiento, int años_experiencia, int nivel_destreza) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.DNI = DNI;
		this.año_nacimiento = año_nacimiento;
		this.años_experiencia = años_experiencia;
		
		if (nivel_destreza >= 0 && nivel_destreza <= 100) {
			this.nivel_destreza = nivel_destreza;
		} else {
			System.out.println("Nivel de destreza no establecido. El nivel de destreza debe estar entre el 0 y el 100.");
		}
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getDNI() {
		return DNI;
	}
	
	
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}


	public int getAño_nacimiento() {
		return año_nacimiento;
	}


	public void setAño_nacimiento(int año_nacimiento) {
		this.año_nacimiento = año_nacimiento;
	}


	public int getAños_experiencia() {
		return años_experiencia;
	}


	public void setAños_experiencia(int años_experiencia) {
		this.años_experiencia = años_experiencia;
	}


	public int getNivel_destreza() {
		return nivel_destreza;
	}


	public void setNivel_destreza(int nivel_destreza) {
		
		do {
			if (nivel_destreza >= 0 && nivel_destreza <= 100) {
				this.nivel_destreza = nivel_destreza;
			} else {
				System.out.println("El nivel de destreza debe estar entre el 0 y el 100. Introduzca de nuevo.");
				nivel_destreza = scnum.nextInt();
				this.nivel_destreza = nivel_destreza;
			}
			
		} while (nivel_destreza < 0 || nivel_destreza > 100);
	}
	
	
	// Métodos
	
	public void mostrarDatosControlador() {
		System.out.println("");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellidos: " + this.apellidos);
		System.out.println("DNI: " + this.DNI);
		System.out.println("Año de nacimiento: " + this.año_nacimiento);
		System.out.println("Años de experiencia: " + this.años_experiencia);
		System.out.println("Nivel de destreza: " + this.nivel_destreza);
	}
	
	
	public void incrementoAñosExperiencia(int valor) {
		this.años_experiencia = this.años_experiencia + valor;
	}
}
