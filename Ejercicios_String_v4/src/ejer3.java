import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String cadena = "";
		int contConsonanates = 0;
		
		
		System.out.println("Introduzca una cadena de caracteres:");
		cadena = sctxt.nextLine();
		
		
		for (int i = 0; i < cadena.length(); i++) {
			char letraActual = cadena.toLowerCase().charAt(i);
			
			if (letraActual == 'b' || letraActual == 'c' || letraActual == 'd' || letraActual == 'f' || letraActual == 'g' || letraActual == 'h' || letraActual == 'j' || letraActual == 'k' || letraActual == 'l' || letraActual == 'm' || letraActual == 'n' || letraActual == 'ñ' || letraActual == 'p' || letraActual == 'q' || letraActual == 'r' || letraActual == 's' || letraActual == 't' || letraActual == 'v' || letraActual == 'w' || letraActual == 'x' || letraActual == 'y' || letraActual == 'z' ) {
				contConsonanates++;
			}
		}
		
		System.out.println("Su cadena tiene: " + contConsonanates + " consonantes.");
		
		sctxt.close();
	}

}
