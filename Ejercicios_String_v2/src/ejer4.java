import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String frase = "";

		
		System.out.println("Introduzca una frase:");
		frase = sctxt.nextLine();
		
		
		frase = frase.replace(" ", "");
		
		
		System.out.println(frase);
		
		sctxt.close();
	}

}
