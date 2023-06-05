import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String cadena = "";
		int contConsonanates = 0;
		
		
		System.out.println("Introduzca una cadena de caracteres:");
		cadena = sctxt.nextLine();
		
		
		for (int i = 0; i < cadena.length(); i++) {
			char letraActual = cadena.charAt(i);
			
			if (letraActual == 'b' || letraActual == 'c' || letraActual == 'd' || letraActual == 'f' || letraActual == 'g' || letraActual == 'h' || letraActual == 'j' || letraActual == 'k' || letraActual == 'l' || letraActual == 'm' || letraActual == 'n' || letraActual == 'ñ' || letraActual == 'p' || letraActual == 'q' || letraActual == 'r' || letraActual == 's' || letraActual == 't' || letraActual == 'v' || letraActual == 'w' || letraActual == 'x' || letraActual == 'y' || letraActual == 'z' ||
				letraActual == 'B' || letraActual == 'C' || letraActual == 'D' || letraActual == 'F' || letraActual == 'G' || letraActual == 'H' || letraActual == 'J' || letraActual == 'K' || letraActual == 'L' || letraActual == 'M' || letraActual == 'N' || letraActual == 'Ñ' || letraActual == 'P' || letraActual == 'Q' || letraActual == 'R' || letraActual == 'S' || letraActual == 'T' || letraActual == 'V' || letraActual == 'W' || letraActual == 'X' || letraActual == 'Y' || letraActual == 'Z') {
				contConsonanates++;
			}
		}
		
		System.out.println("Su cadena tiene: " + contConsonanates + " consonantes.");
		
		sctxt.close();
	}

}
