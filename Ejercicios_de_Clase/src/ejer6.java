import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String frase = "";
		char letra = 'a';
		
		
		System.out.println("Introduzca una frase:");
		frase = sctxt.nextLine();
		
		String[] palabras = frase.split(" ");
		int [] contadores = new int [palabras.length];
		
		System.out.println("Introduzca una letra:");
		letra = sctxt.nextLine().charAt(0);
		
		
		for (int i = 0; i < palabras.length; i++) {
			for (int j = 0; j < palabras[i].length(); j++) {
				if (palabras[i].charAt(j) == letra) {
					contadores [i]++;
				}
			}
		}
		
		
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Palabra " + (i+1) + ": " + contadores [i]);
		}
		
		sctxt.close();
	}

}
