import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String cadena = "";
		int cont = 0;
		
		
		System.out.println("Introduzca una cadena de caracteres:");
		cadena = sctxt.nextLine();
		
		cont = numMinusculas(cadena);
		
		
		System.out.println("Nº de minúsculas en su cadena: " + cont);
		
		sctxt.close();
	}

	// Método que cuenta consonantes
	static int numMinusculas (String cadena) {
		
		int nMinusculas = 0;
		String minusculas = "qwrtypsdfghjklñzxcvbnmaeiouáéíóú";
		
		
		for (int i = 0; i < cadena.length(); i++) {
			if (minusculas.contains(String.valueOf(cadena.charAt(i)))) {
				nMinusculas++;
			}
		}
		
		return nMinusculas;
	}
}