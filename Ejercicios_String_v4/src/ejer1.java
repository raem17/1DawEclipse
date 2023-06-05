import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String cadena = "";
		int contVocales = 0;
		
		
		System.out.println("Introduzca una cadena de caracteres:");
		cadena = sctxt.nextLine();
		
		
		for (int i = 0; i < cadena.length(); i++) {
			char letraActual = cadena.toLowerCase().charAt(i);
			
			if (letraActual == 'a' || letraActual == 'e' || letraActual == 'i' || letraActual == 'o' || letraActual == 'u'
					|| letraActual == 'á' || letraActual == 'é' || letraActual == 'í' || letraActual == 'ó'|| letraActual == 'ú') {
				contVocales++;
			}
		}
		
		System.out.println("Su cadena tiene: " + contVocales + " vocales.");
		
		sctxt.close();
	}

}
