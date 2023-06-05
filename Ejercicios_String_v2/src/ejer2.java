import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner sctxt = new Scanner (System.in);
		String frase = "";
		
		
		System.out.println("Introduzca una frase:");
		frase = sctxt.nextLine();
		
		
		System.out.println(frase.toUpperCase().charAt(0) + frase.substring(1, frase.length()-1) + frase.toUpperCase().charAt(frase.length()-1) );
		
		sctxt.close();
	}

}
