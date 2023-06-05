import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String frase = "";
		
		
		System.out.println("Introduzca una frase:");
		frase = sctxt.nextLine();
		
		
		frase = frase.replace("a", "X");
		frase = frase.replace("e", "X");
		frase = frase.replace("i", "X");
		frase = frase.replace("o", "X");
		frase = frase.replace("u", "X");
		
		
		System.out.println(frase);
		
		sctxt.close();
	}

}
