import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);	
		Scanner scnum = new Scanner (System.in);	
		// 12 filas, 5 columnas 
		String [][] estadisticas = new String [2][5];
		int opc = 0;
		
		
		// El usuario rellena el array
		for (int i = 0; i < estadisticas.length; i++) {
			System.out.println("Jugador " + i + ". Introduzca su nombre:");
			estadisticas [i][0] = sctxt.nextLine();
			
			System.out.println("Jugador " + i + ". Introduzca su dorsal:");
			estadisticas [i][1] = sctxt.nextLine();
			
			System.out.println("Jugador " + i + ". Introduzca sus puntos:");
			estadisticas [i][2] = sctxt.nextLine();
			
			System.out.println("Jugador " + i + ". Introduzca sus rebotes:");
			estadisticas [i][3] = sctxt.nextLine();
			
			System.out.println("Jugador " + i + ". Introduzca sus robos:");
			estadisticas [i][4] = sctxt.nextLine();
		}
		
		
		// Menú con switch
		do {
			menu();
			opc = scnum.nextInt();
					
			switch (opc) {
			case 1:				
				System.out.println("");
				
				for (int i = 0; i < estadisticas.length; i++) {
					System.out.println(estadisticas [i][0] + " – nº " + estadisticas [i][1] + " – " + estadisticas [i][2] + " puntos – " + estadisticas [i][3] + " rebotes – " + estadisticas [i][4] + " robos.");
				}
				
				break;

			case 2:
				System.out.println("");
				String nombre = "";
				
				System.out.println("Introduzca el nombre del jugador:");
				nombre = sctxt.nextLine();
				
				
				for (int i = 0; i < estadisticas.length; i++) {
					if (nombre.equals(estadisticas [i][0]) ) {
						System.out.println(estadisticas [i][0] + " – nº " + estadisticas [i][1] + " – " + estadisticas [i][2] + " puntos – " + estadisticas [i][3] + " rebotes – " + estadisticas [i][4] + " robos.");
					}
				}
				
				break;
				
			case 3:
				System.out.println("");
				System.out.println("Ha salido del programa.");
				break;
				
			default: 
				System.out.println("");
				System.out.println("Opción no válida.");
				break;
			}
			
		} while (opc != 3);
		
		sctxt.close();
		scnum.close();
	}
	
	static void menu () {
		System.out.println("");
		System.out.println("Introduza una opción del menú:");
		System.out.println("");
		System.out.println("1. Ver estadísticas de todos los jugadores.");
		System.out.println("2. Ver estadísticas de un jugador en concreto.");
		System.out.println("3. Salir.");
	}

}
