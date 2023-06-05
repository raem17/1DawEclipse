import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		
		Scanner scnum = new Scanner (System.in);
		int N = 0;
		
		// 1º parte: Pedir número N (número de personas). Se crea un array con números de posiciones = N.
		
		System.out.println("Introduzca un número entero positivo de personas ");
		N = scnum.nextInt();
		
		int [] alturas = new int [N];
		
		/* 2ª parte: 
		Se evalúa si N es positivo y si lo es, el programa sigue. La mayoría del programa esá dentro del if.
		Si N es postivo, se crean las variables correspondientes y se piden las alturas con un bucle, también se calcula
		la media de las alturas  */
		
		if (N > 0) {
			int contAlturas = 0;
			int alturasMedia = 0;
			int acuAlturas = 0;
			
			for (int i = 0; i < alturas.length; i++) {
				System.out.println("Introduzca la altura nº " + (i + 1) + " como un número entero, positivo y en cm:");
				alturas [i] = scnum.nextInt();
				
				contAlturas++;
				acuAlturas = acuAlturas + alturas [i];
			}
			
			alturasMedia = acuAlturas / contAlturas;
			
			/* 3ª parte: 
			Se crean dos variables nuevas.
			Con un for se recorre todo el array para comprobar las alturas superiores e inferiores a la media */
			
			int contAlturasSuperiores = 0;
			int contAlturasInferiores = 0;
			
			for (int i = 0; i < alturas.length; i++) {
				
				if (alturas [i] > alturasMedia) {
					contAlturasSuperiores++;
				}
				
				if (alturas [i] < alturasMedia) {
					contAlturasInferiores++;
				}
			}
			
			System.out.println("Altura media: " + alturasMedia + " cm");
			System.out.println("Personas con altura superior a la media: " + contAlturasSuperiores);
			System.out.println("Personas con altura inferior a la media: " + contAlturasInferiores);
		}
		
		scnum.close();
		
	}

}
