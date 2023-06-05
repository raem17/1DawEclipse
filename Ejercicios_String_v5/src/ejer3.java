import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String cadena = "";
		String subcadenaMax = "";
		
		System.out.println("Introduzca una cadena de caracteres:");
		cadena = sctxt.nextLine();

		String [] subCadenas = cadena.split(" ");
		
		
		for (int i = 0; i < subCadenas.length; i++) {
			if (subCadenas [i].length() > subcadenaMax.length()) {
				subcadenaMax = subCadenas [i];
			}
		}
		
		
		System.out.println("Palabra más larga: '" + subcadenaMax + "' con " + subcadenaMax.length() + " caracteres.");
		
		sctxt.close();
	}

}
