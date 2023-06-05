import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String palabra = "";
		
		
		System.out.println("Introduza una palabra:");
		palabra = sctxt.nextLine();
		
		
		if (esPalindromo(palabra) == true) {
			System.out.println("La palabra ES palíndromo.");
		} else {
			System.out.println("La palabra NO es palíndromo.");
		}
		
		sctxt.close();
		
	}	
	
	//Método
	static boolean esPalindromo(String palabra) {
		boolean palindromo = false;
		String palabraInvertida = "";
		
		
		for (int i = palabra.length()-1; i >= 0; i--) {
			palabraInvertida = palabraInvertida + palabra.charAt(i);
		}
		
		
		if (palabra.equalsIgnoreCase(palabraInvertida)) {
			palindromo = true;
		} else {
			palindromo = false;
		}
		
		return palindromo;
	}

}
