import java.util.Scanner;

public class ejer3a {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String frase = "";
		
		
		System.out.println("Introduzca una frase:");
		frase = sctxt.nextLine();
		
		
		String[] subCadenas = frase.split(" ");
		
		
		System.out.println("Hay "  + subCadenas.length + " palabras en la frase.");
		
		sctxt.close();
	}

}
