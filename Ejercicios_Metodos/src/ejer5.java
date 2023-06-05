import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String palabraMax = "";
		String [] nombres = new String [3];
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Introduzca un nombre:");
			nombres [i] = sctxt.nextLine();
		}
		
		palabraMax = palabraMaxEnArray(nombres);
				
		System.out.println("Palabra con más letras: " + palabraMax);
		
		sctxt.close();
	}

	// Método que cuenta las letras de un string
	static int numLetras (String cadena) {
		
		int numLetras = 0;
		String letras = "qwrtypsdfghjklñzxcvbnmaeiouáéíóúQWRTYPSDFGHJKLÑZXCVBNMAEIOUÁÉÍÓÚ";
		 
		
		for (int i = 0; i < cadena.length(); i++) {
			if (letras.contains(String.valueOf(cadena.charAt(i)))) {
				numLetras++;
			}
		}
		
		return numLetras;
	}
	
	// Método que recibe por parámetro un array de Strings y devuelve la palabra con más letras del array.
	static String palabraMaxEnArray (String [] cadenas) {
		
		String palabraMax = "";
		String palabrasDeSubCadenas = "";
		
		
		for (int i = 0; i < cadenas.length; i++) {
			cadenas [i] = limpiaCadena(cadenas [i]);
			palabrasDeSubCadenas = palabrasDeSubCadenas + cadenas [i] + " ";
		}
		
		
		String [] palabras = palabrasDeSubCadenas.split(" ");
				
				
		for (int i = 0; i < palabras.length; i++) {
			if (numLetras(palabras [i]) > numLetras(palabraMax)) {
				palabraMax = palabras [i];
			}
		}
		
		return palabraMax;
	}
	
	// Método que recibe una cadena y elimina los espacios en blanco sobrantes
	static String limpiaCadena (String cadena) {
		
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
}