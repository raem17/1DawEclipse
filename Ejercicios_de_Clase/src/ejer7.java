import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String frase = "";
		String letra1 = "";
		String letra2 = "";
		String letra3 = "";
		int contador = 0;
		
		
		System.out.println("Introduzca una frase:");
		frase = sctxt.nextLine();
		
		String[] subCadenas = frase.split(" ");
		
		System.out.println("Introduzca una letra:");
		letra1 = sctxt.nextLine();
		
		System.out.println("Introduzca una letra:");
		letra2 = sctxt.nextLine();
		
		System.out.println("Introduzca una letra:");
		letra3 = sctxt.nextLine();
		
		
		for (int i = 0; i < subCadenas.length; i++) {
			if (subCadenas [i].contains(letra1) && subCadenas [i].contains(letra2) && subCadenas [i].contains(letra3)) {
				contador++;
			}
		}
		
		
		System.out.println("Número de palabras con las letras " + letra1 + ", " + letra2  + ", " + letra3 + ": " + contador);
		
		sctxt.close();
	}

}
