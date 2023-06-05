import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String cadena = "";
		int contVocales = 0;
		
		
		System.out.println("Introduzca una cadena de caracteres:");
		cadena = sctxt.nextLine();
		
		
		for (int i = 0; i < cadena.length(); i++) {
			char letraActual = cadena.charAt(i);
			
			if (letraActual == 'a' || letraActual == 'e' || letraActual == 'i' || letraActual == 'o' || letraActual == 'u'
				|| letraActual == 'á' || letraActual == 'é' || letraActual == 'í' || letraActual == 'ó'|| letraActual == 'ú'
				|| letraActual == 'A' || letraActual == 'E' || letraActual == 'I' || letraActual == 'O'|| letraActual == 'U'
				|| letraActual == 'Á' || letraActual == 'É' || letraActual == 'Í' || letraActual == 'Ó'|| letraActual == 'Ú') {
				contVocales++;
			}
		}
		
		System.out.println("Su cadena tiene: " + contVocales + " vocales.");
		
		sctxt.close();
	}

}