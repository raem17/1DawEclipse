import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String cadena = "";
		int cont = 0;
		
		System.out.println("Introduzca una cadena de caracteres:");
		cadena = sctxt.nextLine();
		
		// Limpio la cadena
		cadena = cadenaLimpia(cadena);
		
		String [] subCadenas = cadena.split(" ");
		
		
		for (int i = 0; i < subCadenas.length; i++) {
			//if 
		}
		
		
		System.out.println("Contador de palabras con 4 vocales diferentes: " + cont);
		
		sctxt.close();
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Método que recibe una cadena y elimina los espacios en blanco
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
	
	
	// Método que recibe una cadena y devuelve un array de enteros con el nº de veces que aparece cada vocal
	static int [] contadorCadaVocal (String cadena) {
		int [] nVocales = new int [5];
		
		for (int i = 0; i < cadena.length(); i++) {
			char letraActual = cadena.charAt(i);
			
			if (letraActual == 'a'|| letraActual == 'A' || letraActual == 'á' || letraActual == 'Á') {
				nVocales [0]++;
			} else if (letraActual == 'e' || letraActual == 'E' || letraActual == 'é' || letraActual == 'É') {
				nVocales [1]++;
			} else if (letraActual == 'i' || letraActual == 'I' || letraActual == 'í' || letraActual == 'Í') {
				nVocales [2]++;
			} else if (letraActual == 'o' || letraActual == 'O' || letraActual == 'ó' || letraActual == 'Ó') {
				nVocales [3]++;
			} else if (letraActual == 'u'|| letraActual == 'U' || letraActual == 'ú' || letraActual == 'Ú') {
				nVocales [4]++;
			}
		}
		
		return nVocales;
	}
}
