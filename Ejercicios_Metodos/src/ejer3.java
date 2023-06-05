import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String cadena = "";
		int cont = 0;
		
		
		System.out.println("Introduzca una cadena de caracteres:");
		cadena = sctxt.nextLine();
		
		cont = numMayusculas(cadena);
		
		
		System.out.println("Nº de mayúsculas en su cadena: " + cont);
		
		sctxt.close();
	}

	// Método que cuenta maýusculas en una cadena
	static int numMayusculas (String cadena) {
		
		int nMayusculas = 0;
		String mayusculas = "QWRTYPSDFGHJKLÑZXCVBNMAEIOUÁÉÍÓÚ";
		
		
		for (int i = 0; i < cadena.length(); i++) {
			if (mayusculas.contains(String.valueOf(cadena.charAt(i)))) {
				nMayusculas++;
			}
		}
		
		return nMayusculas;
	}
}
