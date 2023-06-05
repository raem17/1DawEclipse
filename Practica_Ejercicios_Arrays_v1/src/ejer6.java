import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String [] regalos = new String [8];
		
		
		// Lectura de datos
		for (int i = 0; i < regalos.length; i++) {
			System.out.println("Introduzca su regalo nº " + (i + 1));
			regalos [i] = sctxt.nextLine();
		}
		
		// Recorremos todo el array y mostramos los regalos en un orden de 1 a 8
		System.out.println("Su lista de regalos es: ");
		for (int i = 0; i < regalos.length; i++) {
			System.out.println("Regalo nº" + (i + 1) + ": " + regalos[i]);
		}
		
		
		// Sustituimos coches por carbón 
		for (int i = 0; i < regalos.length; i++) {
			if (regalos [i].equalsIgnoreCase("coche")) {
				regalos [i] = "carbón";
			}
		}
		
		// Recorremos todo el array y mostramos los regalos en un orden de 8 a 1
		System.out.println("");
		System.out.println("Su lista de regalos es: ");
		for (int i = regalos.length-1; i >= 0; i--) {
			System.out.println("Regalo nº" + (i + 1) + ": " + regalos[i]);
		}
		
		
		// Sustituimos dinero y avión por nada. 
		for (int i = 0; i < regalos.length; i++) {
			if (regalos [i].equalsIgnoreCase("dinero")) {
				regalos [i] = "";
			}
			
			if (regalos [i].equalsIgnoreCase("avión")) {
				regalos [i] = "";
			}
		}
		
		// Recorremos todo el array y mostramos los regalos en un orden de 1 a 8
		System.out.println("");
		System.out.println("Su lista de regalos es: ");
		for (int i = 0; i < regalos.length; i++) {
			System.out.println("Regalo nº" + (i + 1) + ": " + regalos[i]);
		}
		
		
		// Sustituimos todos los regalos por: "nada por feo"
		for (int i = 0; i < regalos.length; i++) {
			regalos [i] = "nada por feo";
		}
		
		// Recorremos todo el array y mostramos los regalos en un orden de 1 a 8
		System.out.println("");
		System.out.println("Su lista de regalos es: ");
		for (int i = 0; i < regalos.length; i++) {
			System.out.println("Regalo nº" + (i + 1) + ": " + regalos[i]);
		}
		
		sctxt.close();
	}

}
