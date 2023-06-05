import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String frase = "";
		String letra = "a";
		
		
		System.out.println("Introduzca una frase:");
		frase = sctxt.nextLine();
		
		
		String[] palabras = frase.split(" ");
		
		
		System.out.println("Introduzca una letra:");
		letra = sctxt.nextLine();
		
		
		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].startsWith(letra) || palabras [i].endsWith(letra)) {
				System.out.print(palabras [i] + " ");
			}
		}
		
		sctxt.close();
	}

}