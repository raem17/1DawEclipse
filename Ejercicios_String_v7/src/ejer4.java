import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String cadena = "";
		
		
		System.out.println("Introduzca una cadena de caracteres:");
		cadena = sctxt.nextLine();
		
		
		System.out.println("Contador de la letra 'a': "+ contadorCadaVocal(cadena) [0]);
		System.out.println("Contador de la letra 'e': "+ contadorCadaVocal(cadena) [1]);
		System.out.println("Contador de la letra 'i': "+ contadorCadaVocal(cadena) [2]);
		System.out.println("Contador de la letra 'o': "+ contadorCadaVocal(cadena) [3]);
		System.out.println("Contador de la letra 'u': "+ contadorCadaVocal(cadena) [4]);
		
		sctxt.close();
	}
	
	// Método que recibe una cadena y devuelve un array de enteros con el nº de veces que aparece cada vocal. 
	//Al resultado se le trata como un array de enteros
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
