import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);	
		// 12 filas, 5 columnas 
		String [][] estadisticas = new String [12][5];
		
		
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
		
		
		for (int i = 0; i < estadisticas.length; i++) {
			System.out.println(estadisticas [i][0] + " – nº " + estadisticas [i][1] + " – " + estadisticas [i][2] + " puntos – " + estadisticas [i][3] + " rebotes – " + estadisticas [i][4] + " robos.");
		}
		
		sctxt.close();
	}

}
