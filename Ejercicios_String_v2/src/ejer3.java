import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String frase = "";
		
		
		System.out.println("Introduzca una frase:");
		frase = sctxt.nextLine();
		
		
		frase = frase.replace("a", "A");
		frase = frase.replace("e", "E");
		frase = frase.replace("i", "I");
		frase = frase.replace("o", "O");
		frase = frase.replace("u", "U");
		
		
		System.out.println(frase);
		
		sctxt.close();
	}

}
