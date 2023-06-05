import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String cadena = "";
		int cont = 0;
		
		
		System.out.println("Introduzca una cadena de caracteres:");
		cadena = sctxt.nextLine();
		
		cont = numConsonantes(cadena);
		
		
		System.out.println("Nº de consonantes en su cadena: " + cont);
		
		sctxt.close();
	}

	// Método que cuenta consonantes en una cadena
	static int numConsonantes (String cadena) {
		
		int nConsonantes = 0;
		String Consonantes = "qwrtypsdfghjklñzxcvbnmQWRTYPSDFGHJKLÑZXCVBNM";
		
		
		for (int i = 0; i < cadena.length(); i++) {
			if (Consonantes.contains(String.valueOf(cadena.charAt(i)))) {
				nConsonantes++;
			}
		}

		
		return nConsonantes;
	}
}
