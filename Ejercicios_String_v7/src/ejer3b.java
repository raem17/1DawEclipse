import java.util.Scanner;

public class ejer3b {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String frase = "";
		int nPalabras = 0;
		
		System.out.println("Introduzca una frase:");
		frase = sctxt.nextLine();
		
		
		nPalabras = nPalabrasEnCadena(frase);
		
		
		System.out.println("Hay "  + nPalabras+ " palabras en la frase.");
		
		sctxt.close();
	}
	
	// Método que recibe una cadena y elimina los espacios en blanco sobrantes
	static String cadenaLimpia (String cadena) {
		
		String cadenaLimpia = "";
		
		cadena = cadena.trim();
		
		
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) != ' ') {
				cadenaLimpia = cadenaLimpia + cadena.charAt(i);			
			} else if (cadena.charAt(i+1) != ' ') {
				cadenaLimpia = cadenaLimpia + cadena.charAt(i);
			}
		}
		
		return cadenaLimpia;
	}
	
	// Método que reciba una cadena y devuelva el nº de palabras
	static int nPalabrasEnCadena (String cadena) {
		
		int numPalabras = 0;
		
		cadena = cadenaLimpia(cadena);
		
		String [] subCadenas = cadena.split(" ");
		
		numPalabras = subCadenas.length;
		
		return numPalabras;
	}
}
