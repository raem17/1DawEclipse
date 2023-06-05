import java.util.Scanner;

public class Utilidades {
	
	// Método de mostrar menú
	static void menu() {
		System.out.println("");
		System.out.println("1. Mostrar notas de un alumno.");
		System.out.println("2. Mostrar notas de todos los alumnos.");
		System.out.println("3. Modificar datos de un alumno.");
		System.out.println("4. Poner un 0 a todos los alumnos en todos los módulos.");
		System.out.println("5. Aprobado general a todos los alumnos en todos los módulos.");
		System.out.println("6. Salir.");
	}
	
	
	// Método de opción 1
	static void mostrarNotaAlumno(String [][] datos) {
		System.out.println("");
		Scanner sctxt = new Scanner (System.in);
		String nombre = "";
		boolean existe = false;
		
		
		System.out.println("Introduzca el nombre del alumno:");
		nombre = sctxt.nextLine();
		 
		
		for (int i = 0; i < datos.length; i++) {
			if (nombre.equals(datos [i][0]) ) {
				existe = true;
				
				System.out.println(datos [i][0] + ": Redes: " + datos [i][1] + " - Sistemas: " + datos [i][2] + " - Móviles: "+ datos [i][3] + " - Programación: " + datos [i][4] + " - FOL: " + datos [i][5]);								
			}
		}
		
		
		if (existe == false) {
			System.out.println("El alumno no existe.");
		}
	}
	
	
	// Método de opción 2
	static void mostrarNotasAlumnos(String [][] datos) {
		for (int i = 0; i < datos.length; i++) {
			System.out.println(datos [i][0] + ": Redes: " + datos [i][1] + " - Sistemas: " + datos [i][2] + " - Móviles: "+ datos [i][3] + " - Programación: " + datos [i][4] + " - FOL: " + datos [i][5]); 
		}
	}
	
	
	// Método de opción 3
	static void modificarDatos(String [][] datos) {
		System.out.println("");
		Scanner sctxt = new Scanner (System.in);
		Scanner scnum = new Scanner (System.in);
		
		String nombre = "";
		boolean auxExiste = false;
		int auxOpc = 0;
		
		
		System.out.println("Introduzca el nombre del alumno:");
		nombre = sctxt.nextLine();
		 
		
		// Compueba si el alumno existe
		for (int i = 0; i < datos.length; i++) {
			if (nombre.equals(datos [i][0]) ) {
				auxExiste = true;	
			}
		}
		
		// Si existe, muestra menú con switch
		if (auxExiste == true) {
			
			do {
				System.out.println("");
				System.out.println("1. Modificar nombre.");
				System.out.println("2. Modificar nota Redes.");
				System.out.println("3. Modificar nota Sistemas.");
				System.out.println("4. Modificar nota Móviles.");
				System.out.println("5. Modificar nota Programación.");
				System.out.println("6. Modificar nota FOL.");
				System.out.println("7. Salir de: Modificar datos de un alumno.");
				auxOpc = scnum.nextInt();
				
				
				switch (auxOpc) {
				case 1:
					
					for (int i = 0; i < datos.length; i++) {
						if (nombre.equals(datos [i][0]) ) {
							System.out.println("Introduza el nombre nuevo:");
							datos [i][0] = 	sctxt.nextLine();
							nombre = datos [i][0];
						}
					}
					
					break;
					
				case 2:
					
					for (int i = 0; i < datos.length; i++) {
						if (nombre.equals(datos [i][0]) ) {
							System.out.println("Introduza la nueva nota en Redes:");
							datos [i][1] = 	sctxt.nextLine();
						}
					}
					
					break;
					
				case 3:
					
					for (int i = 0; i < datos.length; i++) {
						if (nombre.equals(datos [i][0]) ) {
							System.out.println("Introduza la nueva nota en Sistemas:");
							datos [i][2] = 	sctxt.nextLine();
						}
					}
					
					break;
					
				case 4:
						
					for (int i = 0; i < datos.length; i++) {
						if (nombre.equals(datos [i][0]) ) {
							System.out.println("Introduza la nueva nota en Móviles:");
							datos [i][3] = 	sctxt.nextLine();
						}
					}
					
					break;
					
				case 5:
						
					for (int i = 0; i < datos.length; i++) {
						if (nombre.equals(datos [i][0]) ) {
							System.out.println("Introduza la nueva nota en Programación:");
							datos [i][4] = 	sctxt.nextLine();
						}
					}
					
					break;
					
				case 6:
					
					for (int i = 0; i < datos.length; i++) {
						if (nombre.equals(datos [i][0]) ) {
							System.out.println("Introduza la nueva nota en FOL:");
							datos [i][5] = 	sctxt.nextLine();
						}
					}
					
					break;
					
				case 7:
					
					System.out.println("Ha salido del menú: Modificar datos de un alumno.");
					
					break;

				default: System.out.println("Opción incorrecta.");
					break;
				}
				
			} while (auxOpc != 7);

		} else { // Sino, no
			System.out.println("El alumno no existe.");
		}
	}
	
	
	// Método de opción 4
	static void suspensoGeneral(String [][] datos) {
		for (int i = 0; i < datos.length; i++) {
			datos [i][1] = "0";
			datos [i][2] = "0";
			datos [i][3] = "0";
			datos [i][4] = "0";
			datos [i][5] = "0";
		}
	}
	
	
	// Método de opción 5
	static void aprobadoGeneral(String [][] datos) {
		for (int i = 0; i < datos.length; i++) {
			datos [i][1] = "5";
			datos [i][2] = "5";
			datos [i][3] = "5";
			datos [i][4] = "5";
			datos [i][5] = "5";
		}
	}
}
