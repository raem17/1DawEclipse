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
		System.out.println("6. Mostrar en pantalla la media de una asignatura pedida al usuario.");
		System.out.println("7. Mostrar el nombre del alumno con media más baja.");
		System.out.println("8. Mostrar el nombre del alumno con media más alta.");
		System.out.println("9. Mostrar el nombre del alumno con más nº de suspensos.");
		System.out.println("10. Salir.");
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
		System.out.println("");
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
	
	
	// Método de opción 6
	static void mediaAsignatura(String [][] datos) {
		System.out.println("");
		Scanner sctxt = new Scanner (System.in);
		Scanner scnum = new Scanner (System.in);
		
		String asig = "";
		Double acuAsig = 0.0;
		Double mediaAsig = 0.0;
		
		
		System.out.println("Introduza el nombre de la asignatura:");
		asig = sctxt.nextLine();
		
		
		if (asig.equalsIgnoreCase("Redes")) {
			for (int i = 0; i < datos.length; i++) {
				acuAsig = acuAsig + Double.parseDouble(datos [i][1]);
			}
			
			mediaAsig = acuAsig / datos.length;
			System.out.print("La media de Redes es: ");
			System.out.printf("%.2f", mediaAsig);
			System.out.println("");
			
		} else if (asig.equalsIgnoreCase("Sistemas")) {
			for (int i = 0; i < datos.length; i++) {
				acuAsig = acuAsig + Double.parseDouble(datos [i][2]);
			}
			
			mediaAsig = acuAsig / datos.length;
			System.out.print("La media de Sistemas es: ");
			System.out.printf("%.2f", mediaAsig);
			System.out.println("");
			
		} else if (asig.equalsIgnoreCase("Móviles")) {
			for (int i = 0; i < datos.length; i++) {
				acuAsig = acuAsig + Double.parseDouble(datos [i][3]);
			}
			
			mediaAsig = acuAsig / datos.length;
			System.out.print("La media de Móviles es: ");
			System.out.printf("%.2f", mediaAsig);
			System.out.println("");
			
		} else if (asig.equalsIgnoreCase("Programación")) {
			for (int i = 0; i < datos.length; i++) {
				acuAsig = acuAsig + Double.parseDouble(datos [i][4]);
			}
			
			mediaAsig = acuAsig / datos.length;
			System.out.print("La media de Programación es: ");
			System.out.printf("%.2f", mediaAsig);
			System.out.println("");
			
		} else if (asig.equalsIgnoreCase("FOL")) {
			for (int i = 0; i < datos.length; i++) {
				acuAsig = acuAsig + Double.parseDouble(datos [i][5]);
			}
			
			mediaAsig = acuAsig / datos.length;
			System.out.print("La media de FOL es: ");
			System.out.printf("%.2f", mediaAsig);
			System.out.println("");
			
		} else {
			System.out.println("La asignatura introducida no existe.");
		}
	}
	
	
	// Método de opción 7
	static void nombreMediaMin(String [][] datos) {
		System.out.println("");
		
		Double [] medias = new Double [datos.length];
		String alumnoMediaMin = "";
		Double mediaMin;
		
		
		for (int i = 0; i < datos.length; i++) {
			medias [i] = (Double.parseDouble(datos[i][1]) + Double.parseDouble(datos[i][2]) + Double.parseDouble(datos[i][3]) + Double.parseDouble(datos[i][4]) + Double.parseDouble(datos[i][5])) / 5;
		}
		
		
		mediaMin = medias [0] + 1;
		
		
		for (int i = 0; i < medias.length; i ++) {
			if (medias [i] < mediaMin) {
				mediaMin = medias [i];
				alumnoMediaMin = datos [i][0];
			}
		}
		
		System.out.println("El alumno con la media más baja es: " + alumnoMediaMin);
	}
	
	
	// Método de opción 8
	static void nombreMediaMax(String [][] datos) {
		System.out.println("");
		
		Double [] medias = new Double [datos.length];
		String alumnoMediaMax = "";
		Double mediaMax;
		
		
		for (int i = 0; i < datos.length; i++) {
			medias [i] = (Double.parseDouble(datos[i][1]) + Double.parseDouble(datos[i][2]) + Double.parseDouble(datos[i][3]) + Double.parseDouble(datos[i][4]) + Double.parseDouble(datos[i][5])) / 5;
		}
		
		
		mediaMax = medias [0] - 1;
		
		
		for (int i = 0; i < medias.length; i ++) {
			if (medias [i] > mediaMax) {
				mediaMax = medias [i];
				alumnoMediaMax = datos [i][0];
			}
		}
		
		System.out.println("El alumno con la media más alta es: " + alumnoMediaMax);
	}
	
	
	// Método de opción 9
	static void nombreSuspensosMax(String [][] datos) {
		System.out.println("");
		
		String alumnoSuspensosMax = "";
		int contSusMax = 0;
		int [] contadoresSuspensos = new int [datos.length];
		
		for (int i = 0; i < contadoresSuspensos.length; i++) {
			contadoresSuspensos [i] = 0;
		}
		
		
		for (int i = 0; i < datos.length; i++) {
			if (Integer.parseInt(datos[i][1]) < 5) {
				contadoresSuspensos [i]++;			
			}
			
			if (Integer.parseInt(datos[i][2]) < 5) {
				contadoresSuspensos [i]++;			
			}
			
			if (Integer.parseInt(datos[i][3]) < 5) {
				contadoresSuspensos [i]++;			
			}
			
			if (Integer.parseInt(datos[i][4]) < 5) {
				contadoresSuspensos [i]++;			
			}
			
			if (Integer.parseInt(datos[i][5]) < 5) {
				contadoresSuspensos [i]++;			
			}
		}
		
		
		int contadorAux = 0;
		for (int i = 0; i < contadoresSuspensos.length; i ++) {
			if (contadoresSuspensos [i] > contSusMax) {
				contSusMax = contadoresSuspensos [i];
				alumnoSuspensosMax = datos [i][0];
			}
			
			if (contadoresSuspensos [i] == 0) {
				contadorAux++;
			}
		}
		
		
		// Esto en caso de que ningún alumno haya suspendido
		if (contadorAux == contadoresSuspensos.length) {
			alumnoSuspensosMax = "Ninguno.";
		}
		
		System.out.println("El alumno con más suspensos es: " + alumnoSuspensosMax);
	}
}